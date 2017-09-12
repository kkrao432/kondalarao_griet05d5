import java.lang.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int id;
		String fullname;
		String birthdate;
		double avgmarks;
		Date date1;
		
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Student s[]=new Student[n];
		
		
		for(int i=0;i<n;i++)
		{
		id=sc.nextInt();
		fullname=sc.next();
		birthdate=sc.next();
		avgmarks=sc.nextDouble();
		date1=new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);  
		s[i]=new Student(id,fullname,date1,avgmarks);
		
		}
		
		
		
		
		/*
		StudentGroup sc=new StudentGroup();
		sc.Getstudents();
		*/
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}

