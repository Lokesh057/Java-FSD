package practice.com;

import java.util.ArrayList;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        ArrayList<Book> bookList = new ArrayList<>();

		        bookList.add(new Book("Java Programming", "John Doe"));
		        bookList.add(new Book("Python Basics", "Jane Smith"));
		        bookList.add(new Book("C# ", "Sam Johnson"));
		        System.out.println("Book Collection:");
		        for (Book book : bookList) {
		            System.out.println(book);
		        }
		    }
		}

		class Book {
		    private String title;
		    private String author;

		    public Book(String title, String author) {
		        this.title = title;
		        this.author = author;
		    }

		    @Override
		    public String toString() {
		        return "Book{Title='" + title + "', Author='" + author + "'}";
	}

}
