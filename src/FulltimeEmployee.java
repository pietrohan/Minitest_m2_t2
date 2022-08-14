public class FulltimeEmployee extends Employee {
    private double prizeMoney, fine, hardSalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(double prizeMoney, double fine, double hardSalary) {
        this.prizeMoney = prizeMoney;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public FulltimeEmployee(int employeeCode, String name, String phoneNumber, String email, double prizeMoney, double fine, double hardSalary) {
        super(employeeCode, name, phoneNumber, email);
        this.prizeMoney = prizeMoney;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(double prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public double getSalary() {
        return hardSalary + (prizeMoney - fine);
    }


}