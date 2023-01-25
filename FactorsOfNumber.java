package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getFactors(n));
	}

	private static List<Integer> getFactors(int n) {
		
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		return list;
		// TODO Auto-generated method stub
		
	}
}
