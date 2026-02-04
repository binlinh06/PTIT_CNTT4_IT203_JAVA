package SESSION09.HW05;

public class SS09_05 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("An", 8000000);
        employees[1] = new ProductionEmployee("Bình", 300, 20000);
        employees[2] = new OfficeEmployee("Chi", 9000000);

        double totalSalary = 0;

        for (Employee e : employees) {
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tổng lương: " + totalSalary);
    }
}
