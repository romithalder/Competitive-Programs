package test;

import java.util.Scanner;

public class PositiveString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.toLowerCase();
		System.out.println(chechPositive(str));
		
	}

	private static boolean chechPositive(String s) {
		// TODO Auto-generated method stub
		boolean flag=true;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if((int)ch[i]<(int)ch[i+1]) {
				continue;
			}
			else {
				flag=false;
			}
		}
		return flag;
	}
}
