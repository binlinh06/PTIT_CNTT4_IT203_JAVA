package SESSION07.HW04;

public class SS07_04 {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom sv2 = new ClassRoom("Trần Thị B");
        ClassRoom sv3 = new ClassRoom("Lê Văn C");

        sv1.contribute(100_000);
        sv2.contribute(150_000);
        sv3.contribute(200_000);

        // Gọi phương thức static
        ClassRoom.showClassFund();
    }
}
