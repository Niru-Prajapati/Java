import java.util.*;
public class apps{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first digit");
    int a=sc.nextInt();
    System.out.println("Enter second digit");
    int b=sc.nextInt();
    Calculation obj=new Calculation();
    int c=obj.Add(a,b);
    System.out.println("the sum is :"+c);
    sc.close();
  }
}
class Calculation{
  public int Add(int x,int y){
    return x+y;
  }
}