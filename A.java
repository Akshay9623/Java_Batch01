public class A
{

{
System.out.println("Block.....!");
}
public A(int a)
{
System.out.println("parameter----constructor...!");
}
public A(String b)
{
System.out.println("parameter----");
}
 public static void main(String args[])
{
	System.out.println("Hello");
A a = new A(10);
A a1 = new A("abc");
}

}