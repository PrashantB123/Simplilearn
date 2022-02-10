package com.prashant.training.PractiseProject3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice,cont = "s";
		while(cont.equalsIgnoreCase("s")) {
			System.out.println("\t\t Employee Information System\n\n");
			
			System.out.println("1 => Add New Employee Record ");
			 System.out.println("2 => View All Employee Record ");
			 System.out.println("3 => Delete Employee Record ");
			 System.out.println("4 => Search Record ");
			 System.out.println("5 => Update Record ");
			 
			 System.out.print("\n\n\n");
			 System.out.println("Enter your choice: ");
			 choice = sc.nextLine();
			 
			 if( choice.equals("1") ) {
				 try {
				AddRecord();
				} catch (IOException e) {
				e.printStackTrace();
				}
				 
			 } else if(choice.equals("2")) {
				 try {
					 ViewAllRecord();
					 } catch (IOException e) {
					 e.printStackTrace();
					 }
			 } else if(choice.equals("3")) {
				 try {
					 DeleteRecordByID();
					 } catch (IOException e) {
					 e.printStackTrace();
					 }
			 }  else if (choice.equals("4")) {
				 try {
					 SearchRecordbyID();
					 } catch (IOException e) {
					 e.printStackTrace();
					 }
			 }  else if (choice.equals("5")) {
				 try {
					 updateRecordbyID();
					 } catch (IOException e) { 
						 e.printStackTrace();
					 }
			 }
			 System.out.println("Do you want to continue? Yes or No");
			 cont = sc.nextLine();
		} 
		sc.close();
	} 
	
	public static void AddRecord() throws IOException {
		
		BufferedWriter bfwr = new BufferedWriter (new FileWriter("records.txt",true) );
		Scanner sc = new Scanner(System.in);
		
		String ID, name, age, gender, addr;
		
		System.out.println("enter employee ID:");
		ID = sc.nextLine();
		
		System.out.println("enter employee name:");
		name = sc.nextLine();
		
		System.out.println("enter employee age:");
		age = sc.nextLine();
		
		System.out.println("enter employee gender:");
		gender = sc.nextLine();
		
		System.out.println("enter employee address:");
		addr = sc.nextLine();
		
		bfwr.write(ID+","+name+","+age+","+gender+","+addr);
		bfwr.flush();
		bfwr.newLine();
	    bfwr.close();
	    sc.close();
		
		
	}
	
	public static void ViewAllRecord() throws IOException {
		 BufferedReader bfr = new BufferedReader( new FileReader("records.txt") );
		
		 String record;
		 System.out.println("______________________________________________________________");
		 
		 System.out.println("|    ID      name         age    gender     Address          |");
		 
		 System.out.println("______________________________________________________________");
		 
		 while ( ( record = bfr.readLine()) != null) {
			 
			 StringTokenizer st = new StringTokenizer(record,",");
			 
			 System.out.println("|    "+st.nextToken()+"   "+st.nextToken()+"  "+st.nextToken()+"   "+st.nextToken()+"   "+st.nextToken()+"       |");
			 
		 }
		 System.out.println("|                                                            |");
		 
		 System.out.println("_______________________________________________________________");
		 
		 bfr.close();
	}
	
	public static void DeleteRecordByID() throws IOException {
		Scanner scInput = new Scanner(System.in);
		String ID, record;
		
		File tempDB = new File("records_temp.txt");
		File db = new File("records.txt");
		
		BufferedReader bfr = new BufferedReader( new FileReader( db ) );
		BufferedWriter bfwr = new BufferedWriter( new FileWriter( tempDB ));
		
		System.out.println("\t\t Delete Employee Record\n");
		
		System.out.println("Enter the Employee ID: ");
		 ID = scInput.nextLine();
		 
		 
		 while( ( record = bfr.readLine() ) != null ) {
		 
		 
		 if( record.contains(ID) ) 
		 continue;
		 
		 
		
		 bfwr.write(record);
		 bfwr.flush();
		 bfwr.newLine();
		 }
		 
		scInput.close();
		 bfr.close();
         bfwr.close();
		 
		 db.delete();
		 
		 tempDB.renameTo(db);
		}
	public static void SearchRecordbyID() throws IOException {
		String ID, record;
		Scanner scInput = new Scanner(System.in);
		
		BufferedReader bfr = new BufferedReader( new FileReader("records.txt") );
		
		System.out.println("\t\t Search Employee Record\n");
		 
		 
		 System.out.println("Enter the Employee ID: ");
		 ID = scInput.nextLine();
		 
		 System.out.println("_______________________________________________________________________ ");
		 
		 System.out.println("|    ID          name         age          gender        Adddress      |");
		 
		 System.out.println("_______________________________________________________________________ ");
		 
		 while( ( record = bfr.readLine() ) != null ) {
			 
			 StringTokenizer st = new StringTokenizer(record,",");
			 
			 if( record.contains(ID) ) {
				 
			 System.out.println("|      "+st.nextToken()+"     "+st.nextToken()+"     "+st.nextToken()+"     "+st.nextToken()+"      "+st.nextToken()+"     |");
			 }
		 }
		 
		 System.out.println("|                                                                       |");
		 
		 System.out.println(" _______________________________________________________________________ ");
		 
		 scInput.close();
		 bfr.close();
		
	}
	
	public static void updateRecordbyID() throws IOException {
		
		String newName, newAge, newGender, newAddr, record, ID,record2;
		
		File db = new File("records.txt");
		
		File tempDB = new File("records_temp.txt");
		
		BufferedReader bfr = new BufferedReader( new FileReader(db) );
		 BufferedWriter bfwr = new BufferedWriter( new FileWriter(tempDB) );
		 
		 Scanner scInput = new Scanner(System.in);
		 System.out.println("\t\t Update Employee Record\n\n"); 
		 /**/
		 System.out.println("Enter the Employee ID: ");
		 
		 ID = scInput.nextLine();
		 
		 System.out.println(" __________________________________________________________________ ");
		 
		 System.out.println("|     ID       Name          Age         Gender       Address        |");
		 
		 System.out.println(" ___________________________________________________________________ ");
		 
		 while( ( record = bfr.readLine() ) != null ) {
			 
			 StringTokenizer st = new StringTokenizer(record,",");
			 
			 if( record.contains(ID) ) {
				 
			System.out.println("|    "+st.nextToken()+"     "+st.nextToken()+"    "+st.nextToken()+"      "+st.nextToken()+"     "+st.nextToken()+"   |");
				 
		    
				 
			 }
		 }
		  bfr.close();
		  bfwr.close();
		  scInput.close();
		 System.out.println("|                                                                                                                     ");
		 
			System.out.println(" _____________________________________________________________________________________________________________________");
			
			             
			              System.out.println("Enter the new Name: ");
			              newName = scInput.nextLine();
			              
			              System.out.println("Enter the new Age: ");
			              newAge = scInput.nextLine();
			              
			              System.out.println("Enter the new Gender: ");
			              newGender = scInput.nextLine();
			              
			              System.out.println("Enter the new Address: ");
			              newAddr = scInput.nextLine();
			              
			              BufferedReader bfr2 = new BufferedReader( new FileReader(db) );
			              
			              while( (record2 = bfr2.readLine() ) != null ) {
			            	  
			            	  if(record2.contains(ID)) {
			            		bfwr.write(ID+","+newName+","+newAge+","+newGender+","+newAddr); 
			            	  
			            	  } else {
			            		  bfwr.write(record2);
			            		  
			            	  }
			            	  
			            	  bfwr.flush();
			            	  bfwr.newLine();
			              
	                     }
			              
			               bfr2.close();
			              db.delete(); 
			              boolean success = tempDB.renameTo(db); 
			              System.out.println(success);
	
	
	
	}
	
}
