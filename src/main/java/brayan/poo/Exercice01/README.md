# Exercício 01 - Sistema de Controle de Estoque

## 📖 Objetivo

Desenvolver um sistema simples de controle de estoque utilizando Programação Orientada a Objetos.

O sistema deverá permitir cadastrar um único produto, controlar sua quantidade em estoque e consultar suas informações através de um menu no terminal.

O foco do exercício é praticar a modelagem de classes, encapsulamento e organização do código.

---

# 🎯 Conceitos aplicados

Durante este exercício serão praticados os seguintes conceitos:

- Classes e Objetos
- Encapsulamento
- Atributos
- Métodos
- Construtores
- Sobrescrita do método `toString()`
- Modificadores de acesso (`private` e `public`)
- Organização em pacotes
- Separação de responsabilidades
- Regras de negócio
- Instanciação de objetos
- Interação entre objetos
- Entrada de dados utilizando `Scanner`

---


# 📦 Classe Produto

A classe `Produto` será responsável por representar um produto do estoque.

## Atributos

Implemente os seguintes atributos:

- nome
- preço
- quantidade em estoque

Todos os atributos devem possuir modificador de acesso `private`.

---

# 🔨 Métodos obrigatórios

A classe deverá possuir os seguintes métodos:

### Construtor

Inicializar o produto com os dados informados pelo usuário.

---

### adicionarEstoque()

Recebe uma quantidade e adiciona ao estoque.

---

### removerEstoque()

Recebe uma quantidade e remove do estoque.

---

### calcularValorTotal()

Retorna o valor total do estoque.

Fórmula:

```
preço × quantidade
```

---

### toString()

Retorna uma representação completa do produto.

Exemplo:

```text
==============================

Produto: Notebook

Preço: R$ 3500.00

Quantidade: 8

Valor total em estoque: R$ 28000.00

==============================
```

---

# 📋 Regras de negócio

O sistema deverá impedir as seguintes situações:

- preço menor que zero;
- quantidade inicial menor que zero;
- adicionar quantidade negativa;
- remover quantidade negativa;
- remover uma quantidade maior que o estoque disponível.

Será permitido:

- remover exatamente toda a quantidade disponível.

---

# 🖥️ Classe Main

A classe `Main` será responsável apenas pela interação com o usuário.

Ela deverá:

- criar o objeto `Scanner`;
- exibir o menu;
- ler a opção escolhida;
- solicitar os dados ao usuário;
- chamar os métodos da classe `Produto`;
- exibir os resultados.

Toda a lógica relacionada ao produto deverá permanecer dentro da classe `Produto`.

---

# 📌 Menu esperado

```text
========= CONTROLE DE ESTOQUE =========

1 - Cadastrar produto

2 - Adicionar estoque

3 - Remover estoque

4 - Mostrar informações do produto

0 - Sair

Escolha uma opção:
```

---

# 🔄 Fluxo esperado

```text
Usuário

↓

Main

↓

Produto

↓

Atualiza o estado do objeto

↓

Main exibe o resultado
```

---

# 📈 Exemplo de execução

```text
========= CONTROLE DE ESTOQUE =========

1 - Cadastrar produto
2 - Adicionar estoque
3 - Remover estoque
4 - Mostrar produto
0 - Sair

Escolha uma opção: 1

Nome: Notebook

Preço: 3500

Quantidade: 5

Produto cadastrado com sucesso!

--------------------------------

Escolha uma opção: 2

Quantidade a adicionar: 10

Estoque atualizado com sucesso!

--------------------------------

Escolha uma opção: 4

Produto: Notebook

Preço: R$ 3500.00

Quantidade: 15

Valor total em estoque: R$ 52500.00
```

---

# 🎯 Objetivos de aprendizagem

Ao concluir este exercício você deverá ser capaz de:

- modelar uma classe simples;
- criar objetos utilizando construtores;
- proteger atributos utilizando encapsulamento;
- implementar métodos responsáveis por alterar o estado do objeto;
- separar corretamente a responsabilidade entre a classe `Main` e a classe de domínio;
- utilizar o método `toString()` para representar um objeto;
- aplicar regras de negócio dentro da própria classe.

---

# ⭐ Desafio (Opcional)

Após finalizar o exercício, implemente algumas melhorias:

- adicionar código do produto;
- adicionar categoria;
- adicionar fabricante;
- adicionar data de cadastro utilizando `LocalDate`;
- criar um método que informe se o estoque está:
    - baixo;
    - normal;
    - alto.

Essas melhorias devem manter o mesmo objetivo do exercício: praticar Programação Orientada a Objetos.