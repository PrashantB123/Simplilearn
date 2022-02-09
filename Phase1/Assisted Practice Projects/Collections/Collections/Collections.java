package com.java.prashant.Collections;

import java.util.*;



public class Collections {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Rushi");//Adding object in arraylist  
		list.add("Sam");  
		list.add("Rushi");  
		list.add("Mady");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		//creating vector
	public class Vector1 {  
	       public static void main(String args[]) {  
	          //Create a vector  
	          Vector<String> vec = new Vector<String>();  
	          //Adding elements using add() method of List  
	          vec.add("Tiger");  
	          vec.add("Lion");  
	          vec.add("Dog");  
	          vec.add("Elephant");  
	          //Adding elements using addElement() method of Vector  
	          vec.addElement("Rat");  
	          vec.addElement("Cat");  
	          vec.addElement("Deer");  
	            
	          System.out.println("Elements are: "+vec);  
	       }  
	}  
		
		//creating linkedlist
	      class LikedList{
	      public static void main(String args[]){  
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
	       //creating Linkedhashset
	      class LinkedHashSet1{  
	    	  public static void main(String args[]){  
	    	  //Creating HashSet and adding elements  
	    	         LinkedHashSet<String> set=new LinkedHashSet<String>();  
	    	                set.add("One");    
	    	                set.add("Two");    
	    	                set.add("Three");   
	    	                set.add("Four");  
	    	                set.add("Five");  
	    	                Iterator<String> i=set.iterator();  
	    	                while(i.hasNext())  
	    	                {  
	    	                System.out.println(i.next());  
	    	                }  
	    	  }  
	    	 }  
	       
	       //creating hashset
	       public class HashSetDemo {

	    		public static void main(String[] args) {
	    			
	    			HashSet<String> setOfNames = new HashSet<>();
	    			
	    			setOfNames.add("Ram");
	    			setOfNames.add("Raju");
	    			setOfNames.add("MRam");//Not added to the set
	    			setOfNames.add("Nikhil");
	    			
	    			setOfNames.forEach(System.out::println);
	    		}
	       }
	      }


}
