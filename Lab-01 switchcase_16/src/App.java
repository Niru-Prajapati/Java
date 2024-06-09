import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first digit");
        int a=sc.nextInt();
        System.out.println("Enter the second digit");
        int b=sc.nextInt();
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for sub");
        System.out.println("enter 3 for mul");
        System.out.println("enter 4 for div");
        int option=sc.nextInt();
        Calculation obj=new Calculation();
        switch (option){
            case 1:
            int add=obj.Add(a,b);
            System.out.println(add);
            break;
            case 2:
            int sub=obj.Sub(a,b);
            System.out.println(sub);
            break;
            case 3:
            int mul=obj.Mul(a,b);
            System.out.println(mul);
            break;
            case 4:
            int div=obj.Div(a,b);
            System.out.println(div);
            break;
        }
        sc.close();
    }
}
class Calculation{
    public int Add(int x,int y){
    return x+y;
}
public int Sub(int x,int y){
    return x-y;
}
public int Mul(int x,int y){
    return x*y;
}
public int Div(int x,int y){
    return x/y;
}
}
