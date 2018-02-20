              ARRAY LIST
Java ArrayList class uses a dynamic array for storing the elements.
 It inherits AbstractList class and implements List interface.


           PROGRAM
import java.util.*;  
class TestCollection1
{  
 public static void main(String args[])
{  
  ArrayList<String> list=new ArrayList<String>();  
  list.add("Ravi");  
  list.add("Vijay");  
 list.add("Ravi");
      list.add("Ajay"); Iterator itr=list.iterator(); 
      while(itr.hasNext()){  
   System.out.println(itr.next());  
  } 
 }
} 


              Java LinkedList
Class uses doubly linked list to store the elements.
It provides a linked-list data structure. 
It inherits the AbstractList class and implements List and Deque interfaces
 

import java.util.*;  
public class TestCollection7
{  
 public static void main(String args[])
{ 
 LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
 Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}


                HASH  SET
create a collection that uses a hash table for storage. 
It inherits the AbstractSet class and implements Set interface.

import java.util.*;  
class TestCollection9{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay"); 
  set.add("Ravi");  
  set.add("Ajay"); 
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next()); 
}  
 }  
} 