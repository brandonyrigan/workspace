package composition_example;

public class Employee {
    private String name;
    private double salary;
    private Address address;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this();
        setName(name);
        setSalary(salary);
    }

    public Employee(String name, double salary, Address address) {
        this(name, salary);
        setAddress(address);
    }

    public String getEmployeeInfo() {
        return "name: " + getName() + ", salary: " + getSalary() + ", address: " + getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address.getAddressInfo();
    }

    public void setAddress(Address address) {
       this.address = address;
    }

    public String toString() {
        return "com.entertainment.Television" +
                ": name=" + getName() +
                ", salary=" + getSalary() +
                ", address=" + getAddress();
    }
}
