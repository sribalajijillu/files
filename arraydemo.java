import java.util.*;
class Arraydemo
{
public  static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int [] marks=new int[5];
for(int i=0;i<marks.length;i++)
{
marks [i]=s.nextInt();
}
for (int j=0;j<marks.length;j++)
{
System.out.println(marks[j]);
}
}
}
