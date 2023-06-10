package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_DuplicateElement {

	public static void main(String[] args) {
	
		
		 
        ArrayList<String> list = new ArrayList<>();

        list.add("Bea");
        list.add("Abdusamat");
        list.add("Trookie");
        list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan", "Ananas"));
        list.add("Bea");
        list.add("Abdusamat");
        
        System.out.println(list);
        
        
        System.out.println(list.contains("Trookie"));
        
        System.out.println(list.contains("Payz"));
        
        
        
        //[Bea, Abdusamat, Trookie, Trookie, Maria, Sharuhan, Ananas]
        
        
        
//        list2
        
        
        ArrayList<String> list2 = new ArrayList<>();
        
        for (int i = 0 ; i < list.size() ; i++) {
            
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }else {
                System.out.println(list.get(i) + " is duplicated");
            }
            
            
        }
        
        
//        Task16
//        Write a program to extract distinct character from a string input: abcabcabcabc output:abc

        String str = "abcabcabcabc";
        
        String distinctChars = "";
        
        for (int i = 0 ; i < str.length() ; i++) {
            if (!distinctChars.contains(Character.toString(str.charAt(i)))) {
                distinctChars += str.charAt(i);
            }
        }
        
        System.out.println(distinctChars);
        
        
        
        
        
        
        
       
        
        
        
    }
}
