package SESSION09.HW03;

public class Manager extends Employee{
    private String room;
    public Manager(String name,double money,String room){
        super(name,money);
        this.room = room;
    }
    @Override
    public void display() {
        super.display(); // dùng lại code lớp cha
        System.out.println("Phòng ban: " + room);
    }
}
