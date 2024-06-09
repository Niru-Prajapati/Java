public class getset {
  public static void main(String[] args)throws Exception{
    Rectngle rect=new Rectngle();
    rect.setLength(5);
    rect.setBreadth(5);
    System.out.println(rect.getLength()*rect.getBreadth());
  }
}
class Rectngle
{
  private int length;
  private int breadth;
  public int getLength(){
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public int getBreadth() {
    return breadth;
  }
  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }
  
}
