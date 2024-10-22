import java.util.Random;
class HandleExc
{
public static void main(String args[])
{
Random r=new Random();
int a=0,b=0,c=0;
for(int i=1;i<=10;i++)
{
try
{
a=r.nextInt();
b=r.nextInt();
c=12345/(a/b);
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero error:"+e);
c=0;
}
System.out.println("c="+c);
}
}
}