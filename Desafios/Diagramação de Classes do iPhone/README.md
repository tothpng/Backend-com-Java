```mermaid
classDiagram
    Iphone --|> Ipod
    Iphone --|> Phone
    Iphone --|> Internet

    class Ipod{
        +tocar()
        +pausar()
        +selecionarMusica(musica)
    }
    class Phone {
        +ligar()
        +atender()
        +iniciarCorreioVoz()
    }
    class Internet {
        +exibirPagina(url)
        +adicionarNovaAba(url)
        +atualizarPagina()
    }
```