package day21_Method;

public class TwoDString {

	public static void main(String[] args) {
		 String row1[] = {"TinyPekka", "Irfan","Shreerin","Abdusement"};
//       0          1      2      3
String row2[] = {"Merhaba","Syed","Pari","Payz"};
String[] row3  = {"Muatter","Camiran","KAlbinur","Waranya"};
String names[][] = {row1, row2, row3 , {"Aytursun","Arezoo" , "Hakim", "Bea"}};
//          0     1      2       3
System.out.println(row2[2]);
System.out.println(names[1][2]);

System.out.println(names[3][1]);

System.out.println("-----------------------------");
for (int i = 0 ; i < names.length ; i++) {
//System.out.println(i); // index position
//
//System.out.println(names[i]);
//
//System.out.println(Arrays.toString(names[i]));


for (int j = 0 ; j < names[i].length ; j++ ) {
System.out.println(names[i][j]);
}


}


System.out.println("-----------------------------");

for(String[] row : names) {
for (String name : row) {
System.out.println(name);



}
}



	}

}
