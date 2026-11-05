# 🛒 Exercício 01: Filtragem e Verificação Básica (Fácil)

## 📌 Objetivo
Praticar a criação de `Streams` em Java para realizar verificações condicionais com `anyMatch` e encontrar elementos específicos usando `findFirst`.

---

## 💻 Cenário
Você está desenvolvendo um módulo para uma loja virtual. A sua aplicação recebe uma lista de produtos, onde cada **Produto** contém os seguintes atributos:
* `String nome`
* `double preco`
* `String categoria`

---

## 🎯 Requisitos da Aplicação

### 1. Verificação de Preço (`anyMatch`)
* Verifique se existe **pelo menos um** produto na lista cujo preço seja **superior a R$ 1.500,00**.
* Imprima no console o resultado booleano (`true` ou `false`).

### 2. Busca Inicial (`findFirst`)
* Encontre o **primeiro** produto cadastrado da categoria `"Eletrônicos"`.
* Como a operação `findFirst()` retorna um `Optional<Produto>`, utilize um tratamento adequado no `Optional` (ex: `orElse` ou `ifPresentOrElse`) para:
    * Imprimir o nome do produto encontrado.
    * Exibir uma mensagem padrão (ex: `"Nenhum eletrônico encontrado."`) caso a lista não possua essa categoria.

---

## 🛠️ Conceitos Exercitados
- [x] `Stream.of()` / `Collection.stream()`
- [x] `Stream.anyMatch()`
- [x] `Stream.filter()`
- [x] `Stream.findFirst()`
- [x] Tratamento básico de `java.util.Optional`