package net.perfectdreams.dreamhoneypot.commands


import net.perfectdreams.dreamcore.utils.commands.AbstractCommand
import net.perfectdreams.dreamcore.utils.commands.annotation.Subcommand
import net.perfectdreams.dreamcore.utils.extensions.isWithinRegion
import net.perfectdreams.dreamcore.utils.generateCommandInfo
import net.perfectdreams.dreamhoneypot.DreamHoneypot
import net.perfectdreams.dreamhoneypot.DreamHoneypot.Companion.HONEYPOT_BLOCK
import net.perfectdreams.dreamhoneypot.utils.Honeypot
import org.bukkit.entity.Player


class DreamHoneypotCommand(val m: DreamHoneypot) : AbstractCommand(label = "honeypot", permission = "honeypot.setup") {

    @Subcommand
    fun root(player: Player) {
        player.sendMessage(generateCommandInfo("honeypot",
                mutableMapOf("set" to "§3Transforme uma região do WorldGuard em uma região de Honeypot!"),
                listOf("§7Você pode remover um honeypot usando §6/honeypot remove <region>§7!")
        ))
    }

    @Subcommand(["set"])
    fun set(player: Player, honeypotRegion: String){

        val regionName = Honeypot(honeypotRegion)
        val region = m.Honeypots.firstOrNull { it.honeypot == honeypotRegion }

        if(!player.location.isWithinRegion(honeypotRegion)) {
            player.sendMessage("§cNão existe nenhuma região com o nome de §4$honeypotRegion§c!, verifique se você está dentro da região ou se o nome inserido está correto!")
            return
        }

            player.sendMessage("§eVocê setou a região §c$honeypotRegion como uma Honeypot§e!. O player que quebrar um §9$HONEYPOT_BLOCK §edentro dessa região será automaticamente §cbanido§e!")
            m.Honeypots.remove(region)
            m.Honeypots.add(regionName)
            m.saveHoneypots()
    }

    @Subcommand(["remove"])
    fun remove(player: Player, honeypotRegion: String){

        val region = m.Honeypots.firstOrNull { it.honeypot == honeypotRegion }

        if(region == null){
            player.sendMessage("§cRegião de Honeypot não encontrada!")
        }else{
            m.Honeypots.remove(region)
            player.sendMessage("§cRegião de Honeypot removida com sucesso!")
        }
    }
}