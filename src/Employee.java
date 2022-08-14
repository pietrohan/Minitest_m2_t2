public abstract class Employee implements Comparable<Employee>{
    private int employeeCode;
    private String name;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(int employeeCode, String name, String phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getSalary();


    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
       int a = (int) (this.getSalary() -o.getSalary());
        return a;
    }
}

