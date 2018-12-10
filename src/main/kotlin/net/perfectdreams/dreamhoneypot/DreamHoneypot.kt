package net.perfectdreams.dreamhoneypot

import com.github.salomonbrys.kotson.fromJson
import net.perfectdreams.dreamcore.utils.*
import net.perfectdreams.dreamcore.utils.extensions.isWithinRegion
import net.perfectdreams.dreamhoneypot.commands.DreamHoneypotCommand
import net.perfectdreams.dreamhoneypot.utils.Honeypot
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import java.io.File


class DreamHoneypot : KotlinPlugin(), Listener {

    //Bloco que será usado como Honeypot
    companion object {
        val HONEYPOT_BLOCK = Material.DIAMOND_BLOCK
    }

    var Honeypots= mutableListOf<Honeypot>()
    val saveFile = File(dataFolder, "honeypots.json")


    override fun softEnable() {
        super.softEnable()

        //Registrando os eventos/comandos
        registerCommand(DreamHoneypotCommand(this))
        registerEvents(this)

        dataFolder.mkdirs()

        //Verificando se o arquivo existe e importando os nomes das regiões de Honeypot.
        if (saveFile.exists()) {
            Honeypots = DreamUtils.gson.fromJson(saveFile.readText())
        }
    }


    override fun softDisable() {
        super.softDisable()
    }


    fun saveHoneypots(){
        //Salvando o que está escrito dentro da array Honeypots no arquivo JSON.
        saveFile.writeText(DreamUtils.gson.toJson(Honeypots))
    }


    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent){

        val isHoneypotBlock = e.block.type

        //Caso o bloco quebrado não seja um bloco de Honeypot, vamos ignorar.
        if(isHoneypotBlock != HONEYPOT_BLOCK)
            return

        //Verificando se algum nome em nossa array é igual à região do WorldGuard em que o player está.
        for(potRegion in Honeypots){

            val honeypotRegion = e.block.location.isWithinRegion(potRegion.honeypot)

            if(honeypotRegion){

                //Caso o player que quebrou o bloco seja alguém com mais permissões que um player normal vamos ignorar.
                if(e.player.hasPermission("honeypot.load")){
                    e.player.sendMessage("§cVocê quebrou um Honeypot block!, mas esta região ainda continua sendo uma região de Honeypot!, caso queira remover ela, utilize §6/honeypot remove §8<region>")
                    return
                }

                //Agora vamos cancelar o evento do player quebrou o Honeypot block e punir ele.
                e.isCancelled = true

                //TODO: Banir player

                broadcast("§e${e.player.displayName} §cfoi banido por roubo/grieffing por quebrar um bloco de Honeypot!")
            }
        }
    }


    @EventHandler
    fun onBlockPlace(e: BlockPlaceEvent){

        val isHoneypotBlock = e.block.type

        if(isHoneypotBlock != HONEYPOT_BLOCK)
            return

        for(potRegion in Honeypots){

            val honeypotRegion = e.block.location.isWithinRegion(potRegion.honeypot)

            //Apenas informando ao player que ele colcou um Honeypot block na região que ele setou.
            if(honeypotRegion) {

                //Se o player não tiver permissão, ele não conseguirá colocar o bloco na região do Hopneypot!
                if(!e.player.hasPermission("honeypoot.load")){
                    e.isCancelled = true
                    e.player.sendMessage("§cVocê não tem permissão para fazer isto!")
                    return
                }

                e.player.sendMessage("§8Você colocou um bloco de Honeypot nesta região, o player que quebrar este bloco será §9banido por roubo§8/§9grieffing!")
            }
        }
    }
}