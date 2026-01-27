package SESSION03.HW03;

public class SS03_03 {
    static void main(String[] args) {
        String[] names = {
                "Python Pro",
                "Web Design",
                "Data Structure",
                "Java Core",
                "AI Basic"
        };

        int[] quantities = {50, 50, 5, 20, 10};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i]>max){
                max = quantities[i];
            }
        }
        System.out.println("Sach co so luong nhieu nhat (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i]<min){
                min = quantities[i];
            }
        }
        System.out.println("\n-------------------");
        System.out.println("Sach co so luong it nhat (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }
}
