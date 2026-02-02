package SESSION07.HW06;

public class User {
    private final int id;
    private  String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}
