import java.util.*;
class UserDetails{
    Scanner sc=new Scanner(System.in);
    ArrayList<String> attractions = new ArrayList<>();

    void details(){
        
    }
    void register(){

    }
    void login()
    //Existing User
    {
     System.out.println("Enter your Name : ");
     String Name=sc.nextLine();
     System.out.println("Your Name is : "+ Name);
     System.out.println("Enter your Country : ");
     String Country=sc.nextLine();
     System.out.println("Your Country is : "+ Country);
     System.out.println("Enter your Pincode : ");
     int pincode=sc.nextInt();
     System.out.println("Your Pincode is : "+ pincode);
     System.out.println("Enter your mobile number : ");
     long MNo=sc.nextLong();
     System.out.println("Your mobile number is : "+MNo);
    }
   

}
public class Main {
    public static void main(String[] args) {
        
    }
}
