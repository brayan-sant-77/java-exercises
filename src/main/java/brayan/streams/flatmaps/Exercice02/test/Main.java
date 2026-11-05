package brayan.streams.flatmaps.Exercice02.test;

import brayan.streams.flatmaps.Exercice02.domain.Department;
import brayan.streams.flatmaps.Exercice02.domain.Employee;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // cadastrando três funcionários de cada departamento
        List<Employee> employeesTI = List.of(
                new Employee("Carlos", 4500),
                new Employee("Ana", 2800),
                new Employee("Pedro", 3500)
        );

        List<Employee> employeesRH = List.of(
                new Employee("Maria", 3200),
                new Employee("João", 2500),
                new Employee("Lucas", 3800)
        );

        List<Employee> employeesFinancial = List.of(
                new Employee("Gabriel", 4000),
                new Employee("Júlia", 2900),
                new Employee("Rafael", 3600)
        );

        // criando três departamentos
        Department departmentTI = new Department("T.I", employeesTI);
        Department departmentRH = new Department("RH", employeesRH);
        Department financialDepartment = new Department("Financial", employeesFinancial);

        // criando uma lista de departamento em geral
        List<Department> departmentList = List.of(departmentTI, departmentRH, financialDepartment);

        System.out.println("--- TODOS FUNCIONÁRIOS CADASTRADOS ---");
        // obtendo os funcionários em uma única sequência e exibindo o nome de todos os funcionários cadastrados
        departmentList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("--- SALÁRIOS ACIMA DE R$3000 ---");
        departmentList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() > 3000)
                .forEach(System.out::println);


        System.out.println("--- TOTAL DE SALÁRIO ---");
        // obtendo a soma de todos os salários
        double sum = departmentList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .mapToDouble(Employee::getSalary)
                .sum();

        // exibindo o total dos salários juntos
        System.out.println(sum);
    }
}

