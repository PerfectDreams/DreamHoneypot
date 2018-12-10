<p align="center">
<img src="https://perfectdreams.net/assets/img/perfectdreams_logo.png">
<br>
<a href="https://perfectdreams.net/"><img src="https://perfectdreams.net/assets/img/perfectdreams_badge.png?v2"></a>
<a href="https://perfectdreams.net/loja"><img src="https://img.shields.io/badge/donate-perfectdreams-00CE44.svg"></a>
<a href="https://loritta.website/donate"><img src="https://img.shields.io/badge/donate-loritta-00CE44.svg"></a>
</p>
<p align="center">
<a href="https://perfectdreams.net/discord"><img src="https://discordapp.com/api/guilds/320248230917046282/widget.png"></a>
<a href="https://fb.me/perfectdreamsmc"><img src="https://img.shields.io/badge/👍 Curtir-PerfectDreams 🎮-3B5998.svg?longCache=true"></a>
<a href="https://twitter.com/intent/user?screen_name=perfectdreamsmc"><img src="https://img.shields.io/twitter/follow/perfectdreamsmc.svg?style=social&label=Seguir%20PerfectDreams"></a>
<a href="https://twitter.com/intent/user?screen_name=MrPowerGamerBR"><img src="https://img.shields.io/twitter/follow/mrpowergamerbr.svg?style=social&label=Seguir%20MrPowerGamerBR"></a>
<a href="https://mrpowergamerbr.com/"><img src="https://img.shields.io/badge/website-mrpowergamerbr-blue.svg"></a>
</p>
<p align="center">a
<a href="https://perfectdreams.net/open-source">
<img src="https://perfectdreams.net/assets/img/perfectdreams_opensource_iniciative_rounded.png">
</a>
</p>
<h1 align="center">DreamHoneypot</h1>
<p align="center">
<a href="https://jenkins.perfectdreams.net/job/DreamNetworkBans/"><img src="https://jenkins.perfectdreams.net/job/DreamNetworkBans/badge/icon"></a>
<a href="https://github.com/PerfectDreams/DreamNetworkBans/blob/master/LICENSE"><img src="https://img.shields.io/badge/license-AGPL%20v3-lightgray.svg"></a>
</p>
<p align="center">
<a href="https://github.com/PerfectDreams/DreamNetworkBans/watchers"><img src="https://img.shields.io/github/watchers/PerfectDreams/DreamNetworkBans.svg?style=social&label=Watch"></a>
<a href="https://github.com/PerfectDreams/{projectName}/stargazers"><img src="https://img.shields.io/github/stars/PerfectDreams/DreamNetworkBans.svg?style=social&label=Stars"></a>
</p>
<p align="center">Pegando de surpresa players aproveitadores</p>

## 💁 Como Ajudar?
Existem vários repositórios [na nossa organização](https://github.com/PerfectDreams) de várias partes do PerfectDreams, caso você queria contribuir em outras partes do PerfectDreams, siga as instruções no `README.md` de cada repositório!

### 💵 Como Doar?

Mesmo que você não saiba programar, você pode ajudar no desenvolvimento do PerfectDreams comprando vantagens em nossos servidores! https://perfectdreams.net/loja

Você também pode doar para a [Loritta](https://loritta.website/support), a mascote do PerfectDreams! 😊

### 🙌 Como Usar?

#### 👨‍💻 Como Compilar?

Você também pode usar este projeto e usar em outros lugares, mas lembrando...
* Nós deixamos o código-fonte de nossos projetos para que outras pessoas possam se inspirar e aprender com nossos projetos, o objetivo é que pessoas que são fãs do PerfectDreams aprendam como o servidor funciona e, caso queiram, podem ajudar o servidor com bug fixes e novas funcionalidades.
* Eu não irei dar suporte caso você queria usar o nosso projeto no seu servidor sem dar nada em troca para o PerfectDreams, lembre-se, a licença do projeto é [AGPL v3](https://github.com/PerfectDreams/{projectName}/blob/master/LICENSE), você é **obrigado a deixar todas as suas alterações no projeto públicas**!
* Eu não irei ficar explicando como arrumar problemas no seu projeto se você apenas quer pegar o código-fonte para outra coisa não relacionada com o PerfectDreams, **você está por sua conta e risco**.
* Lembrando que nossos projetos precisam de setups e workflows específicos, você **não irá conseguir usar** nossos projetos apenas compilando e usando!
* Existem várias coisas "hard coded" no projeto, ou seja, você terá que editar o código-fonte dela e recompilar, afinal, o projeto foi criado apenas para ser utilizado no PerfectDreams então você terá que fazer algumas modificações no código-fonte dela para funcionar. 😉
* Caso você irá usar a sua versão em um lugar que não seja no PerfectDreams ou em seu servidor de desenvolvimento, você não poderá utilizar o nome "PerfectDreams", o nome do projeto ou "Loritta".

Mas se você quiser mesmo compilar o projeto, siga os seguintes passos:
1. Tenha o MongoDB instalado na sua máquina.
2. Tenha o JDK 8 (ou superior) na sua máquina.
3. Tenha o Git Bash instalado na sua máquina.
4. Tenha o Maven instalado na sua máquina com o `PATH` configurado corretamente. (para que você possa usar `mvn install` em qualquer pasta e o `JAVA_HOME`, para que o `mvn install` funcione)
5. Tenha o IntelliJ IDEA instalado na sua máquina.
6. Tenha um servidor de Minecraft rodando [Paper](https://github.com/PaperMC/Paper) na última versão disponível, para transformar sonhos em realidade, nossos projetos sempre utilizam a última versão disponível no momento que o projeto foi criado.
7. Faça ```git clone https://github.com/PerfectDreams/DreamNetworkBans.git``` em alguma pasta no seu computador.
8. Agora, usando o PowerShell (ou o próprio Git Bash), entre na pasta criada e utilize `mvn install`
9. Após terminar de compilar, vá na pasta `target` e pegue a JAR do projeto.
10. Pronto, agora é só utilizar o projeto e se divertir! 🎉

### 🔀 Pull Requests
No seu Pull Request, você deverá seguir o meu estilo de código bonitinho que eu faço, é recomendado que você coloque comentários nas partes do seu código para que seja mais fácil na hora da leitura.

Caso o seu código possua texto, você é obrigado a utilizar o sistema de localização da Loritta, para que o seu Pull Request possa ser traduzido para outras linguagens, ou seja, após criar o seu Pull Request, crie um Pull Request no repositório de linguagens da Loritta com as keys necessárias.

O seu código não pode ser algo "gambiarra", meu código pode ter algumas gambiarras mas isto não significa que você também deve encher o PerfectDreams com mais gambiarras no seu Pull Request.

Você precisa pensar "será que alguém iria utilizar isto?", se você criar um comando que só seja útil para você, provavelmente eu irei negar o seu Pull Request.

## 📦 Dependências

Nós utilizamos várias [dependências no código-fonte](https://github.com/PerfectDreams/{projectName}/blob/master/pom.xml) deste projeto, obrigado a todos os mantenedores das dependências! Sem vocês, talvez nosso projeto não iria existir (ou teria várias funcionalidades reduzidas ou talvez até inexistentes!)

| Nome  | Mantenedor |
| ------------- | ------------- |
| [Kotlin](https://kotlinlang.org/) | JetBrains  |
| [Paper](https://github.com/PaperMC/Paper) | Mojang ([Minecraft Vanilla](https://minecraft.net/pt-br/download/server)), SpigotMC ([Spigot](https://www.spigotmc.org/)), Paper |
| [DreamCoreBungee](https://github.com/PerfectDreams/DreamCoreBungee) | MrPowerGamerBR  |

## 📄 Licença

O código-fonte deste projeto está licenciado sob a [GNU Affero General Public License v3.0](https://github.com/LorittaBot/Loritta/blob/master/LICENSE)

PerfectDreams é © MrPowerGamerBR — Todos os direitos reservados

A personagem Loritta é © MrPowerGamerBR & PerfectDreams — Todos os direitos reservados

Ao utilizar o projeto você aceita os [termos de uso da Loritta](https://loritta.website/privacy) e os [termos de uso do PerfectDreams](https://perfectdreams.net/privacy).
