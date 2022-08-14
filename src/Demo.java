import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Employee nv1 = new FulltimeEmployee(1, "Hân Híp", "0962088749", "petphamhandc@gmail.com", 1000, 100, 500);
        Employee nv2 = new FulltimeEmployee(2, "Tuấn", "0962088749", "petphamhandc@gmail.com", 100, 400, 500);
        Employee nv3 = new FulltimeEmployee(3, "Phong Chó", "0962088749", "petphamhandc@gmail.com", 500, 300, 500);
        Employee nv4 = new FulltimeEmployee(4, "Huy Gà", "0962088749", "petphamhandc@gmail.com", 200, 400, 500);
        Employee nv5 = new FulltimeEmployee(5, "Hằng Hâm", "0962088749", "petphamhandc@gmail.com", 500, 100, 500);
        Employee nv6 = new ParttimeEmployee(6, "Vinh", "0398575794", "vinhlactroi@gmail.com", 52);
        Employee nv7 = new ParttimeEmployee(7, "Hiếu", "0398575794", "vinhlactroi@gmail.com", 76);
        Employee nv8 = new ParttimeEmployee(8, "Hoàng", "0398575794", "vinhlactroi@gmail.com", 32);
        Employee nv9 = new ParttimeEmployee(9, "Trung", "0398575794", "vinhlactroi@gmail.com", 92);
        Employee nv10 = new ParttimeEmployee(10, "Quân", "0398575794", "vinhlactroi@gmail.com", 112);

        Employee[] listEmployee = {nv1, nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9, nv10};

        double averageSalary = 0;
        int sum = 0;
        int court = 0;
        for (Employee l : listEmployee
        ) {
            sum += l.getSalary();
            if (court < listEmployee.length) {
                court++;
            }
            averageSalary = sum / court;
        }
        System.out.println("trung bình lương của nhân viên công ty là: " + averageSalary);

        int count2 = 0;
        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i] instanceof FulltimeEmployee) {
                FulltimeEmployee p = (FulltimeEmployee) listEmployee[i];
                double salary = p.getSalary();
                if (salary < averageSalary) {
                    count2++;
                    System.out.println(" nhân viên fulltime lương thấp hơn lương trung bình thứ " + count2 + " là: " + p.getName());
                }
            }
        }
        int sumParttimeSalary = 0;

        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i] instanceof ParttimeEmployee) {
                ParttimeEmployee p = (ParttimeEmployee) listEmployee[i];
                double salary = p.getSalary();
                sumParttimeSalary += p.getSalary();

            }
        }

        System.out.println("tổng số tiền công ty phải trả cho nhân viên parttime là: " + sumParttimeSalary);
        System.out.println("-------------");

        Arrays.sort(listEmployee);

  System.out.println("danh sách nhân viên làm fullTime lương tăng dần trong tháng là: ");
        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i] instanceof FulltimeEmployee) {
                FulltimeEmployee p = (FulltimeEmployee) listEmployee[i];
                System.out.println(p);
            }
    }

}
}