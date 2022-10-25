package composition_example.client;

import composition_example.Company;
import composition_example.Employee;

public class CompanyClient {
    public static void main(String[] args) {
        Company company1 = new Company("Amazon");
        Employee employee1 = new Employee("Brandon", 110000);
        Employee employee2 = new Employee("Bryan", 110000);
        company1.setEmployees(new Employee[] {employee1, employee2});

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println("Total company salaries: " + company1.computeTotalSalaryOfAllEmployees());
    }
}
