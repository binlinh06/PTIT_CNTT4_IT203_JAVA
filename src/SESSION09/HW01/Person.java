package SESSION09.HW01;

public class Person {
    protected String fullName;
    protected int age;
    public Person(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void display(){
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}

