
import java.util.Scanner;

public class Book extends Document {
	// thuoc tinh
	private String author;
	private int pages;

	// phuong thuc
	// ham khoi tao khong doi so
	public Book() {
        super();
	}
	// ham khoi tao co doi so
	public Book(  String author, int pages) {
        super();
		this.author = author;
		this.pages = pages;
    }
    public Book(int id, String publisher, int number, int price,String name, String author, int pages) {
		this.id = id;
		this.publisher = publisher;
		this.number = number;
        this.price = price;
        this.name = name;
        this.author = author;
        this.pages = pages;
	}
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages(){
        return pages;

    }
    public void getPages (int pages){
        this.pages = pages;
    }
    public void enterDocument (){
        super.enterDocument();
        System.out.print("Enter the total number of pages: ");
        pages = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter author: ");
        author = scanner.nextLine();
        

    }
    @Override
    public String toString (){
        return super.toString()+"\n   Author: "+this.author+"\n   Total pages: "+pages;       
    }

}

