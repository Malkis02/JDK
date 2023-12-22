package Homeworks.ls4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonalBook directory = new PersonalBook();

        // Добавление сотрудников
        directory.addPersona(new Persona(1, "1234567890", "John Doe", 5));
        directory.addPersona(new Persona(2, "9876543210", "Jane Doe", 3));
        directory.addPersona(new Persona(3, "1112233445", "Bob Smith", 7));

        // Поиск сотрудников по стажу
        List<Persona> employeesWithExperience5 = directory.findPersonasByExperience(5);
        System.out.println("Employees with experience 5:");
        for (Persona employee : employeesWithExperience5) {
            System.out.println(employee.getName());

            // Поиск номеров телефонов по имени
            List<String> phoneNumbersForJane = directory.findPhoneNumbersByName("Jane Doe");
            System.out.println("Phone numbers for Jane Doe:");
            for (String phoneNumber : phoneNumbersForJane) {
                System.out.println(phoneNumber);
            }

            // Поиск сотрудника по табельному номеру
            Persona employeeWithId2 = directory.findPersonaByPersonaId(2);
            if (employeeWithId2 != null) {
                System.out.println("Employee with ID 2: " + employeeWithId2.getName());
            } else {
                System.out.println("Employee with ID 2 not found");
            }
        }
    }
}
