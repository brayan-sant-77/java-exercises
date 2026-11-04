Contexto: você está desenvolvendo um sistema que recebe listas de números provenientes de diferentes fontes.

Considere a seguinte estrutura:

List<List<Integer>> numbers = List.of(

List.of(1, 2, 3, 4, 5),

List.of(6, 7, 8, 9, 10),

List.of(11, 12, 13, 14, 15)
);


Requisitos:
1. Transforme todas as listas internas em um único Stream.
2. Obtenha uma lista contendo todos os números.
3. Exiba somente os números pares.
4. Calcule a soma dos números ímpares.


Objetivo: compreender como transformar um Stream de listas em um Stream de elementos individuais.