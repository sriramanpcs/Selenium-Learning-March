package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Sriram");
		names.add("Sangeetha");
		names.add("barath");
		names.add("rushika");
		names.add("Sangeetha");
		names.add("ram");
		names.add("geetha");
		names.add("badri");
		names.add("rukmani");
		names.add("hrudayashri");
		//System.out.println(names);
		
		for (String family : names) {
			System.out.println(family);
		}
		names.add(3, "Rushika");
		System.out.println(names);
		
		for (int i = 0; i<5; i++) {
			
			names.remove(0);
			
		}
		System.out.println(names);
		
		//Delete duplicate from list
		
	Set<String> fnames = new HashSet<>();
	fnames.addAll(names);
	System.out.println("HashSet");
	System.out.println(fnames.size());
	

		

		}
	}
	
	

