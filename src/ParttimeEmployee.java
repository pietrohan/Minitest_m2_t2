public class ParttimeEmployee extends Employee{
    private double wordTime;

    public ParttimeEmployee(){
    }

    public ParttimeEmployee(double wordTime) {
        this.wordTime = wordTime;
    }

    public ParttimeEmployee(int employeeCode, String name, String phoneNumber, String email, double wordTime) {
        super(employeeCode, name, phoneNumber, email);
        this.wordTime = wordTime;
    }

    public double getWordTime() {
        return wordTime;
    }

    public void setWordTime(double wordTime) {
        this.wordTime = wordTime;
    }

    @Override
    public double getSalary() {
        return 5*wordTime;
    }
}
