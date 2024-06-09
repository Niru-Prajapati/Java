public class App {
    public static void main(String[] args) throws Exception {
     Calculation cal=new Calculation(5,6);
     System.out.println(cal.calculateArea());
     System.out.println(cal.calculatePerimeter());
    }
}
interface Area{
    double calculateArea();
}
interface Perimeter{
    double calculatePerimeter();
}
class Calculation implements Area,Perimeter{
    private double length,breadth;
    public Calculation(double l,double b)
    {
        this.length=l;
        this.breadth=b;
    }
    public double calculateArea(){
        return length*breadth;
    }
    public double calculatePerimeter(){
        return 2*(length+breadth);
    }
}