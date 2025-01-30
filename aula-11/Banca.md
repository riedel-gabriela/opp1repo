```mermaid
classDiagram
    direction BT
    Hq --|> Livro
    Revista --|> Jornal
    Livro --|> MaterialImpresso
    Jornal --|> MaterialImpresso
    class MaterialImpresso {
        - Integer NrPaginas
        - String Título
        - Integer Edição
        - String Editora
    }
    class Livro {
        - String Tema
        - Integer Volumes
        - String Autor
    }
    class Jornal {
        - String Anuncio
        - DateTime DataPublicação
    }
    class Revista {
        - String Tema
    }
    class Hq {
        - ArrayList~Desenhos~
    }
```