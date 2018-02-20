import java.util.*;
import java.io.*;
class Question1
{
	public static void main(String[] aa)
	{
		try
		{ 
			FileWriter fw=new FileWriter("E:\\Program\\StudentDetails.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			FileReader fr=new FileReader("E:\\Program\\StudentDetails.txt");
			BufferedReader br=new BufferedReader(fr);
			ArrayList<String> al= new ArrayList<>();
			Scanner scn=new Scanner(System.in);
			String stdID,stdName,stdCity,stdCountry,str;
			int stdAge,j=0,count=0;
			System.out.println("Enter number of students");
			int n=scn.nextInt();
			scn.nextLine();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Student ID");
				stdID=scn.nextLine();
		if((stdID.charAt(0)=='S') &&(stdID.length()==4)&&(stdID.charAt(1)>='0' && stdID.charAt(1)<='9')&&(stdID.charAt(2)>='0' && stdID.charAt(2)<='9')&&(stdID.charAt(3)>='0' && stdID.charAt(3)<='9'))
				{
				bw.write(stdID);
				bw.append(",");
				}
				else
				{
				System.out.println("Enter Correct ID format");
				stdID=scn.nextLine();
				bw.write(stdID);
				bw.append(",");
				}
				System.out.println("Enter Student Name");
				stdName=scn.nextLine();
				bw.write(stdName);
				bw.append(",");
				System.out.println("Enter Student Age");
				stdAge=scn.nextInt();
				scn.nextLine();
				if(stdAge<100) {
					bw.write(new Integer(stdAge).toString());
					bw.append(",");
				}
				else {
					System.out.println("Enter Age less than 100");
					stdAge=scn.nextInt();
					scn.nextLine();
					bw.write(new Integer(stdAge).toString());
					bw.append(",");
				}
				System.out.println("Enter Student City");
				stdCity=scn.nextLine();
				bw.write(stdCity);
				bw.append(",");
				System.out.println("Enter Student Country");
				stdCountry=scn.nextLine();
				if(stdCountry.equalsIgnoreCase("India")) {
					
					bw.write(stdCountry);
					bw.newLine();
				}
				else {
					System.out.println("Enter country as India only");
					stdCountry=scn.nextLine();
					bw.write(stdCountry);
					bw.newLine();
				}
			}
			bw.close();
			fw.close();
			System.out.println("Written Successfully");
			while((str=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(str,",");
				while(st.hasMoreTokens()) {
				al.add(st.nextToken());
				}
			}
			System.out.println(al);
			while(j<n)
			{
				int age=Integer.parseInt(al.get((5*j)+2));
				if(age>21)
				{
				count++;
				}
				String name=al.get((5*j)+1);
				System.out.println(name);
				if((name.substring(1,1)).equalsIgnoreCase("A"))
				{
				System.out.println("Student Name starting with A "+name);
				}
				j++;
			}
			System.out.println("Number of Students greater than 21:"+count);
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occured");
		}
	}
}