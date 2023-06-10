package day14_String;

public class Task05 {

	public static void main(String[] args) {
String name = " techcircle school";
/* write a program that can return the initials of the user

ex:
    techcircle school

output:
    T.S

Note: Pay attention to the example output
*/
//first method  if you have one  string

String str = " techcircle school";
str = str.trim();

str = str.toUpperCase();

System.out.println(str);

System.out.println(str.charAt(0)+".");

int index2 = str.indexOf(' ') +1;
System.out.println(index2);



System.out.println(str.charAt(0)+"."+str.charAt(index2));

//Second Method if you have two string 

String str2 = "techcircle";
String str3 = "school";

str2 = str2.toUpperCase();
str3 = str3.toUpperCase();

char letter1 = str2.charAt(0);
char letter2 = str3.charAt(0);

System.out.println(letter1+"."+letter2);


		
	}

}
