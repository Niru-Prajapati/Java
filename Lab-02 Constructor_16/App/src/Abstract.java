public class Abstract {
  public static void main(String[] args)throws Exception{
    Shape shape=new Circle();
    shape.draw();
  }
}
abstract class Shape {
abstract void draw();
}
class Circle extends Shape{
  void draw(){
    System.out.println("Drawing Circle");
  }
}
class Rectangle extends Shape{
  void draw(){
    System.out.println("Drawing Rectangle");
  }
}

