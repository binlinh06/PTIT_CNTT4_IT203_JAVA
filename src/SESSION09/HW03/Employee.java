package SESSION09.HW03;

public class Employee {
    protected String name;
    protected double money;

    public Employee(String name,double money){
        this.name = name;
        this.money = money;
    }
    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + money);
    }
}
