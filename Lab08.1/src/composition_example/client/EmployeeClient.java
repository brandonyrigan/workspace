package composition_example.client;

import composition_example.Address;
import composition_example.Employee;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Brandon", 110000);
        employee1.setAddress(new Address("Las Vegas", "USA"));

        System.out.println(employee1);
        System.out.println(employee1.getEmployeeInfo());

    }
}
