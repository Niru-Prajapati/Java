public class App {
  public static void main(String[] args)throws Exception{
    Drawable circle=new Cir();
    circle.draw();
  }
}
interface Drawable{
  void draw();
}
class Cir implements Drawable{
  public void draw(){
    System.out.println("Drawing Circle");
  }
}
class Rectangle implements Drawable{
  public void draw(){
    System.out.println("Drawing Recatangle");
  }
}