package test;

import java.util.Scanner;

public class DecimalSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double n=sc.nextDouble();
		
		DecimalSum Ds=new DecimalSum();
		System.out.println(Ds.getSum(n));
	}
	
	public String getSum(Double n) {
		String num=Double.toString(n);
	String k[]=num.split("[.]");
		
		int FirstNumber=Integer.parseInt(k[0]);
		int secondNumber=Integer.parseInt(k[1]);
		int beforedecimalSum=0;
		int afterDecimalSum=0;
		while(FirstNumber>0) {
			beforedecimalSum=beforedecimalSum+ (FirstNumber%10);
			FirstNumber=FirstNumber/10;
		}
		
		while(secondNumber>0) {
			afterDecimalSum=afterDecimalSum+ (secondNumber%10);
			secondNumber=secondNumber/10;
		}
		return beforedecimalSum+":"+afterDecimalSum;
	}
}
