package week6;

import java.util.Scanner;

class Book{
	String title, author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}	
}
public class BookArray {
	public static void main(String[] args) {
		Book[] book = new Book[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.println("����>>");
			String title = sc.next();
			System.out.println("����>>");
			String author = sc.next();
			book[i] = new Book(title, author);			
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
		}
		sc.close();
	}
}
