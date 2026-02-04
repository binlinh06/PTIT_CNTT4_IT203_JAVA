package SESSION09.HW04;

public class SS09_04 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
//        animal.wagTail();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
