package day11_nestedForLoop;

public class ReadCellValue {

	public static void main(String[] args) {
		int rowCount = 6;
		int columnCount = 7;
		for (int row  = 1 ; row <= rowCount ; row++) {
            //System.out.println("Row #"+row);
            for (int column = 1 ; column<= columnCount ; column++) {
                
                System.out.print("cell("+row+","+column+") ");
                
//                if (cell(row,column).getValue() == "BitCoin") {
//                    System.out.println("get24 Volumns");
                    
//                cell(row,6).getValue()
//                }
            }
            System.out.println();
    
        }

	}

}
