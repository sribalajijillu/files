import java.util.*;
public class Sorting  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("India");
	   listofcountries.add("US");
	   listofcountries.add("China");
	   listofcountries.add("Denmark");
                     System.out.println("Before Sorting:");
	   for(String counter: listofcountries)
                    {
	   System.out.println(counter);
	  }
                      Collections.sort(listofcountries);
                      System.out.println("After Sorting:");
	   for(String counter: listofcountries)
                     {
	   System.out.println(counter);
	}}}

