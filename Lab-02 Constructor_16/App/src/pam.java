public class pam {
  private int length;
  private int breadth;
  public pam(int l,int b)
{
  this.length=l;
  this.breadth=b;
}
public void Area()
{
  System.out.println(length*breadth);
}
public static void main(String[] args)throws Exception{
  pam ap=new pam(2,3);
  ap.Area();
}
}
