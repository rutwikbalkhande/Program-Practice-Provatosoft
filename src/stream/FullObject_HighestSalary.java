package stream;

import java.util.Comparator;
import java.util.List;

public class FullObject_HighestSalary {

    public static void main(String[] args) {

        List<Employee> emp = List.of(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Raj", 60000),
                new Employee(3, "Sita", 80000),
                new Employee(4, "Gita", 70000),
                new Employee(4, "Gita", 55000)
        );

        //1st Highest salary
       Employee employee = emp.stream()
               .sorted(Comparator.comparing(Employee::getSalary).reversed())
               .skip(0)
               .findFirst()
               .orElse(null);

       System.out.println("1st highest salary :");
        System.out.println(employee);


        // top 3 highest Salary
        List<Employee> list= emp.stream()
                .sorted(Comparator.comparing(Employee:: getSalary).reversed())
                .limit(3)
                .toList();

        System.out.println("\n top 3 highest Salary :");
        System.out.println(list);

        //find by name and top salary
        Employee empl=
                emp.stream().filter(e->e.getName().equalsIgnoreCase("gita"))
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .findFirst()
                        .orElse(null);

        System.out.println("\n filter by name & highest salary :");
        System.out.println(empl);
    }

}

