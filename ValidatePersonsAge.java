package test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ValidatePersonsAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String DOB=sc.nextLine();
		String Date[]=DOB.split("-");
		String date="";
		for(int i=Date.length-1;i>=0;i--) {
			if(i==0) {
				date=date+Date[i];
			}
			else {
				date=date+Date[i]+"-";
			}
		}
		
		System.out.println(validateAge(date));
				
	}
	
	public static Boolean validateAge(String DOB) {
		LocalDate dob=LocalDate.parse(DOB);
		LocalDate curDate=LocalDate.now();
		int age=0;
		if((dob!=null) && (curDate!=null)){
			age= Period.between(dob, curDate).getYears();
		}
		
		if(age>21) {
			return true;
		}
		else {
			return false;
		}
	}

}
