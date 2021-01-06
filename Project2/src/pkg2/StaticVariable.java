package pkg2;

public class StaticVariable
{
  static int batchtiming;
  int endtiming=1;
  
  public static void main(String[] args) {
	  
	  StaticVariable.batchtiming=12;
	  
	  StaticVariable obj=new StaticVariable();
	  System.out.println("batchtimg for saurabh is "+obj.batchtiming);
	  System.out.println("endtiming for saurabh is "+obj.endtiming);
	  
	  StaticVariable obj2=new StaticVariable();
	  System.out.println("batchtiming for deepak is "+obj.batchtiming);
	  System.out.println("endtiming for deepak is "+obj.endtiming);
  }
}
