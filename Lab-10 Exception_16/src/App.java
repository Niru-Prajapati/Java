import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter first digit:");
            int a=scanner.nextInt();
            System.out.println("enter the second digit:");
            int b=scanner.nextInt();
            if (b==0){
                throw new ArithmeticException("cannot divide by zero");
            }
            int result=a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.err.println("Error:" + e.getMessage());
        }finally{
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}
