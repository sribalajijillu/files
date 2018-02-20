import java.util.Scanner;
class Multiplication
{
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
System.out.print("enter number");
int n=s.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}
