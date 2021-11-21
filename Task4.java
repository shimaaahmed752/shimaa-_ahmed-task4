
package Task4;
import java.util.Scanner;
public class Task4 {

    
    
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        StaffFactor s=new StaffFactor();
        System.out.println("enter the staff type");
        String stafftype=input.nextLine();
        Staff ss=StaffFactor.getStaff(stafftype);
 
    }
    
}
