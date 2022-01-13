package week3.day2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ss = {"HCL","Wipro","Aspire Systems","CTS"};
		int length=ss.length;
		System.out.println(length);	
		List<String> list = new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		Collections.sort(list);
		System.out.println("Sorting list=" +list);
		Collections.reverse(list);
		System.out.println("Reversing" +list);
	
	
	
	
	
	}

}
