package composition_example;

public class Company {
    private String companyName;
    private Employee[] employees = new Employee[100];
    private int employeeCount;

    public Company() {
    }

    public Company(String companyName) {
        this();
        setCompanyName(companyName);
    }

    public Company(String companyName, Employee[] employees) {
        this(companyName);
        setEmployees(employees);
    }

    public void addEmployee(Employee employee) {
       this.employees[this.employeeCount] = employee;
    }

    public double computeTotalSalaryOfAllEmployees() {
        double totalSalaries = 0;
        for (int i = 0; i < employeeCount; i++) {
            totalSalaries += employees[i].getSalary();
        }
        return totalSalaries;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            this.employees[this.employeeCount] = employee;
            this.employeeCount++;
        }
    }
}
