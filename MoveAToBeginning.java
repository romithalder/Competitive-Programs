package test;

import java.util.Scanner;

public class MoveAToBeginning {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(rearrangeCharacters(str));
		
	}
	
	private static String rearrangeCharacters(String str) {
		// TODO Auto-generated method stub
		char[] st=str.toCharArray();
		String s = "";
		int count=0;
		for(int i=0;i<st.length;i++) {
			if(st[i]=='a') {
				count++;
				continue;
			}
			else {
			 s=s+st[i];
			}
		}
		String a="";
		for(int j=0;j<count;j++) {
			a=a+"a";
		}
		return a.trim()+s.trim();
	}

	
}
