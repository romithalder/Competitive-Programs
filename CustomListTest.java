package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomListTest {
	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		st.add(new Student("Romit",35));
		st.add(new Student("Ranjan",30));
		st.add(new Student("Romit", 25));
		
		System.out.println(st);
		
		Collections.sort(st);
		System.out.println(st);
		
		Collections.sort(st,Comparator.reverseOrder());
		
		System.out.println(st);
		
	}
}
