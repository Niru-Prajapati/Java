import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your balance:");
            double balance = scanner.nextDouble();
            System.out.println("Enter withdrawal amount:");
            double withdrawal = scanner.nextDouble();
            if (withdrawal>balance){
                throw new MyCustomerException ("Insufficient balance");
            }
            double remBalance = balance - withdrawal;
            System.out.println("Remaining balance:" + remBalance);
        } catch (MyCustomerException ex) {
            System.out.println("Error:" + ex.getMessage());
        } catch (Exception ex){
            System.out.println("An error occured:" + ex.getMessage());
        }finally{
            scanner.close();
        }
    }
}
class MyCustomerException extends Exception{
    public MyCustomerException(String message){
        super(message);
    }
}