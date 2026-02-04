package SESSION09.HW06;

import java.util.ArrayList;

public class SS09_06 {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle());
        shapes.add(new Rectangle(3));

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Tổng diện tích: " + totalArea);
    }
}
