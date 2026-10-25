package users;

public class Admin {
    public void printRole() {
        User user = new User() ;
        System.out.println(user.role) ;
    }

    public static void main(String[] args) {
        new Admin().printRole() ;
    }
}
