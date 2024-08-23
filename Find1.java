import java.util.*;
class Find1
{
int i,n;
Scanner s=new Scanner(System.in);
public void get()
{
System.out.println("Enter the value:");
n=s.nextInt();
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
public static void main(String args[])
{
Find1 f1=new Find1();
f1.get();
}
}

