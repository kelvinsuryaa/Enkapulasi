
package enkapulasi_user;

public class Enkapulasi_User {
  
    public static void main(String[] args) {
        
    User vin = new User("ha","hay",1, false);

    vin.setUsername("vinsurya");
    vin.setPassword("ikan");
    vin.setID(1);
    vin.setStatus(false);
    
    System.out.println("Username: " + vin.getUsername());
    System.out.println("Password: " + vin.getPassword()); 
    System.out.println("ID: " + vin.getID());
    System.out.println("Status: " + vin.isStatus());
    }
    
}
