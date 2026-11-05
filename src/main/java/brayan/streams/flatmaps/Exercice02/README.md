# Exercício 02 — Gerenciamento de Departamentos

**Nível:** Fácil / Intermediário  
**Conteúdo:** Java Streams, FlatMap, POO e Collections.

## 1. Contextualização

Uma empresa possui diversos departamentos, e cada departamento possui seus próprios funcionários.

O setor de Recursos Humanos precisa consultar informações de todos os funcionários, independentemente do departamento ao qual pertencem.

Seu objetivo é desenvolver uma aplicação que permita reunir e processar essas informações utilizando Java Streams e, principalmente, o método `flatMap()`.

## 2. Estrutura das classes

Desenvolva as seguintes classes:

### Classe Funcionario

Atributos:
- `String nome`
- `double salario`

Implemente os construtores e getters necessários.

### Classe Departamento

Atributos:
- `String nome`
- `List<Funcionario> funcionarios`

Implemente os construtores e getters necessários.

## 3. Requisitos funcionais

1. Crie pelo menos três departamentos.
2. Cadastre pelo menos três funcionários em cada departamento.
3. Utilize Streams para obter todos os funcionários em uma única sequência.
4. Exiba o nome de todos os funcionários cadastrados.
5. Obtenha uma lista contendo somente funcionários com salário superior a R$ 3.000,00.
6. Calcule a soma dos salários de todos os funcionários da empresa.

## 4. Dados para implementação

| Departamento | Funcionário | Salário |
|---|---|---:|
| TI | Carlos | R$ 4.500,00 |
| TI | Ana | R$ 2.800,00 |
| TI | Pedro | R$ 3.500,00 |
| RH | Maria | R$ 3.200,00 |
| RH | João | R$ 2.500,00 |
| RH | Lucas | R$ 3.800,00 |
| Financeiro | Gabriel | R$ 4.000,00 |
| Financeiro | Julia | R$ 2.900,00 |
| Financeiro | Rafael | R$ 3.600,00 |

## 5. Restrições técnicas

- Utilize `flatMap()` para percorrer os funcionários de todos os departamentos.
- Utilize `filter()` para realizar as filtragens solicitadas.
- Utilize `mapToDouble()` para trabalhar com os salários.
- Não utilize estruturas de repetição (`for`, `while` ou `forEach`) para percorrer as coleções.
- Não crie listas auxiliares manualmente para armazenar os resultados das operações.

## 6. Objetivos de aprendizagem

Ao concluir o exercício, você deverá ser capaz de:

- Trabalhar com objetos que possuem coleções de outros objetos.
- Aplicar `flatMap()` em estruturas aninhadas.
- Combinar operações intermediárias e terminais do Stream API.
- Utilizar `mapToDouble()` para realizar operações numéricas.
- Processar informações de diferentes departamentos em uma única sequência.

## 7. Critérios de conclusão

O exercício será considerado concluído quando todos os requisitos funcionais forem implementados e os resultados apresentados estiverem corretos.

**Desafio adicional:** implemente uma consulta que retorne somente os funcionários de um departamento específico, sem utilizar estruturas de repetição.