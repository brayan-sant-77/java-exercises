package brayan.parametrizacaoDeComportamentos.level3.test;

import brayan.parametrizacaoDeComportamentos.level3.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    private static void printReport(List<Employee> employees, Function<Employee, String> formater) {
        for (Employee employee : employees) {
            String result = formater.apply(employee); // Aplica a transformação que iremos passar no Lambda
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee("Raul", "compositor", 15000),
            new Employee("Brayan",  "developer", 10000)));

        // nesse exemplo informamos apenas o Nome e o Cargo do funcionário
        printReport(employees, employee -> employee.getName() + " - " + employee.getPosition());

        System.out.println("------");

        // já nesse exemplo imprimimos apenas o nome e o salário
        printReport(employees, employee -> "Funcionário: " + employee.getName() + ", Salário: R$" + employee.getSalary());
    }
}
