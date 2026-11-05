# 📦 Exercício 02: Validações de Negócio com Múltiplas Condições (Médio)

## 📌 Objetivo
Aprofundar o uso dos métodos de matching (`allMatch`, `noneMatch`) e busca (`findAny`), combinando filtros e validações de regras de negócio.

---

## 💻 Cenário
O sistema agora gerencia os pedidos de compra da plataforma. Cada **Pedido** possui os seguintes atributos:
* `Long id`
* `String status` *(valores possíveis: `"PENDENTE"`, `"PAGO"`, `"CANCELADO"`)*
* `double valorTotal`

---

## 🎯 Requisitos da Aplicação

### 1. Validação de Pagamento (`allMatch`)
* Escreva uma verificação utilizando Streams para confirmar se **todos** os pedidos que possuem o status `"PAGO"` têm o `valorTotal` estritamente **maior que zero**.
> **Atenção à regra:** Pedidos com outros status (ex: `"PENDENTE"`) não devem tornar a validação falsa se o seu valor for zero. Filtre primeiro ou aplique a lógica condicional correta!

### 2. Auditoria de Segurança (`noneMatch`)
* Garanta que **nenhum** pedido na lista esteja com o status `"CANCELADO"` **e** com `valorTotal` superior a **R$ 500,00**.
* O resultado esperado é `true` (sistema seguro) ou `false` (inconsistência encontrada).

### 3. Recuperação de Amostra (`findAny`)
* Recupere **qualquer** pedido que esteja atualmente com o status `"PENDENTE"`.
* Utilize o método `ifPresent` da classe `Optional` para imprimir o **ID** do pedido recuperado, caso ele exista.

---

## 🛠️ Conceitos Exercitados
- [x] `Stream.allMatch()`
- [x] `Stream.noneMatch()`
- [x] `Stream.findAny()`
- [x] Composição de predicados no `.filter()`
- [x] `Optional.ifPresent()`