# Diagrama de Classes UML

```mermaid
---
title: Agenda Telefônica
---

classDiagram
    App "1" --> "1" Agenda
    App ..> Contato
    Agenda "0..*" *-- Contato
    Contato "1..*" *-- "1" Telefone
    Contato "1..*" *-- "1" Email
    class App {
        - Agenda agenda
        + main()$
        + menu()
    }
    class Agenda {
        - ArrayList~Contato~ contatos
        + void addContato(Contato contato)
        + void deleteContato(int index)
        + void updateContato(int index, Contato contato)
        + Contato getContato(int index)
        + Sring getTodosContatos()
    }
    class Contato {
        - String nome
        - String sobrenome
        - String dataDeNascimento
        - ArrayList~Telefone~ telefones
        - ArrayList~Email~ emails
        + void addTelefone(Telefone telefone)
        + void addEmail(Email email)
        + void deleteTelefone(int index)
        + void deleteEmail(int index)
        + String getTelefones()
        + String getEmails()
        
    }
    class Telefone {
        - HashMap~rotulo,valor~
        + toSring()
    }
    class Email {
        - HashMap~rotulo,valor~
        + boolean validaEmail(String valor)
    }
    
```