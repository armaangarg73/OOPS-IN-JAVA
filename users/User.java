// package users;

// public class User {
//     String name = "Armaan" ; // default 
//     private String password  = "secret2345"; // private access modifier

//     void displayPassword() {
//         System.out.println("Password: " + password);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         User user = new User();
        
//         // System.out.println(user.password);
//         System.out.println(user.name);
//     }
// }

package users ;

public class User {

    protected String role = "User" ;
    public String name = "Armaan" ;
}
