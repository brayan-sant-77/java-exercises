# Exercício 01 - Lista de Alunos

## 📌 Objetivo

Desenvolver um sistema simples de gerenciamento de alunos utilizando `List<String>` e `ArrayList`.

O objetivo deste exercício é praticar as operações básicas da interface `List`, reforçando conceitos de organização de código, encapsulamento, validação e boas práticas de programação.

---

## 📚 Conceitos Aplicados

- List
- ArrayList
- add()
- remove()
- contains()
- get()
- size()
- isEmpty()
- Collections.sort()
- Estrutura de repetição (`for` e `for-each`)
- Encapsulamento
- Organização em camadas
- Validação de dados

---

## ⚙️ Funcionalidades

O sistema deve permitir:

- Adicionar um aluno.
- Remover um aluno.
- Buscar um aluno.
- Listar todos os alunos cadastrados.
- Ordenar os alunos em ordem alfabética.
- Exibir o total de alunos cadastrados.
- Encerrar o programa.

---

## 📋 Regras de Negócio

- Não permitir nomes vazios.
- Não permitir nomes compostos apenas por espaços.
- Não permitir alunos duplicados.
- Só permitir remover alunos existentes.
- Caso a lista esteja vazia, informar ao usuário.
- A ordenação deve ser feita utilizando `Collections.sort()`.

---

## 📂 Estrutura do Projeto

```text
Exercise01-StudentList
│
├── application
│   └── Main.java
│
├── domain
│   └── StudentManager.java
│
└── README.md
```

---

## 🏗 Responsabilidades

### Main

Responsável por:

- Exibir o menu.
- Ler os dados do usuário.
- Chamar os métodos da classe de gerenciamento.

### StudentManager

Responsável por:

- Gerenciar a lista de alunos.
- Adicionar alunos.
- Remover alunos.
- Buscar alunos.
- Ordenar alunos.
- Exibir todos os alunos.
- Retornar a quantidade total de alunos.

---

## 🚫 Restrições

Neste exercício não é permitido utilizar:

- Set
- Map
- Streams
- Lambda
- Comparator
- Comparable

O foco é praticar exclusivamente os conceitos estudados até o momento.

---

## 🎯 Objetivos de Aprendizagem

Ao finalizar este exercício você deverá ser capaz de:

- Manipular listas utilizando `ArrayList`.
- Aplicar as principais operações da interface `List`.
- Separar responsabilidades entre classes.
- Validar entradas do usuário.
- Desenvolver aplicações simples utilizando boas práticas.

---

## ⭐ Dificuldade

**Fácil**

Tempo estimado: **1 hora**