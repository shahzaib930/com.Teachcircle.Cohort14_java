package day26_Constructors;

public class Book {

	
	
		  String author,title,isbn;
		  int year,page;
		  
		  
		  public Book(String title1) {
			  title = title1;
		      
		  }
		  
		  
		  
		public Book(String author, String title, String isbn, int year, int page) {
			super();
			this.author = author;
			this.title = title;
			this.isbn = isbn;
			this.year = year;
			this.page = page;
			
		}
		       
		  
		  

	}


