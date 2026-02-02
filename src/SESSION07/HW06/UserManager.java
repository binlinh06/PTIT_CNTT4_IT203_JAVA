package SESSION07.HW06;

public class UserManager {
    private static User[] listUsers;
    private static final int max =100;
    private static int totalUsers;

    static {
        listUsers = new User[max];
        totalUsers = 0;
    }
    public static void addUser(User user){
        if(totalUsers>=max){
            System.out.println("Danh sach day!");
            return;
        }
        listUsers[totalUsers++] = user;
    }
    public static boolean checkLogin(String username, String password) {
        for (int i = 0; i < totalUsers; i++) {
            User u = listUsers[i];

            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {
                return true; // đăng nhập thành công
            }
        }
        return false; // duyệt hết mà không khớp
    }
    public static void displayUsers() {
        for (int i = 0; i < listUsers.length; i++) {
            System.out.println((i + 1) + ". " + listUsers[i]);
        }
    }
}
