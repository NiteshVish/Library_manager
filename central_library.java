							//  ***** Project ***** //

			    //----------------Online library ----------------------- //


import java.util.Scanner;	
class library{
	String[]books;
	int no_of_books;
	
	library(){
		this.books=new String[50];
		this.no_of_books=0;


	}void addbook(String book){ //this is use for add books
		this.books[no_of_books]=book;
		no_of_books++;
		System.out.println(book+" ...add");

	}

	void availableBooks(){ //this is use for display how many books available in library.
		System.out.println(")))))Available books((((((");
		for(int i=0;i<books.length;i++){
			String book=books[i];
			if(book==null){
			continue;
		}
			System.out.println("*"+books[i]);
		}
		
	}
		
	void issuebook(String book){//this is use for issue books.
		for(int i=0;i<books.length;i++)
		{
			if(books[i]!=null && this.books[i].equals(book)){
				System.out.println("this book issue");
				this.books[i]=null;
				return;
		}			}System.out.println("this book not available");

	}
	void returnbook(String book){//this is use for return books.
		this.books[no_of_books]=book;
		no_of_books++;
		System.out.println(book+" ...return");

	}
	
}
public class central_library{
	public static void main(String[]args)
	{
	int num;
	boolean isExit=false;
	String book;

	Scanner sc=new Scanner(System.in); 
	library central_library=new library();
		
		while(!isExit){
			System.out.println("\t\t\t-----CENTRAL LIBRARY-----\n\n\t\t\t1:- add book \n\t\t\t2:- issue book \n\t\t\t3:- available Books\n\t\t\t4:- return book\n\t\t\t5:- Exit");
			
			num=sc.nextInt();
			switch(num){
				case 1:
					System.out.println("Enter book name to be added");
					book=sc.next();
					central_library.addbook(book);
					break;
				
				case 2:
					System.out.println("Enter book name to be issue");
					book=sc.next();
					central_library.issuebook(book);
					break;
				
				case 3:
					// System.out.println("Enter book name to be added");
					central_library.availableBooks();
					break;
				
				case 4:
					System.out.println("Enter book name to be return");
				 	book=sc.next();
				 	central_library.returnbook(book);
				 	break;
				
				case 5:
				
					isExit=true;
					break;
				
				
			
			default:
				System.out.println("WRONG INPUT try again");
			}

		}
		/*central_library.addbook("perfect love");
		central_library.addbook("rich");
		central_library.addbook("NIG");
		central_library.issuebook("rich");
		//central_library.returnbook();
		central_library.availableBooks();*/


	}
}