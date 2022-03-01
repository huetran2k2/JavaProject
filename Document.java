
import java.util.Scanner;

public class Document {
    // thuoc tinh
	protected int id;
	protected String publisher;
	protected int number;
    protected int price;
    protected String name;
    Scanner scanner = new Scanner(System.in);

	// phuong thuc
	// ham khoi tao khong doi so
	public Document() {
        super();
	}


    // ham khoi tao co doi so
	public Document(int id, String publisher, int number, int price) {
		this.id = id;
		this.publisher = publisher;
		this.number = number;
        this.price = price;
	}
    public int getId(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getPublisher(){
        return publisher;

    }
    public void setTenNXB(String publisher){
        this.publisher = publisher;
    }
    public int getNumber(){
        return number;

    }
    public void setNumber(int number){
        this.number = number;

    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enterDocument() {
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter publisher: ");
        publisher= scanner.nextLine();
        System.out.print("Enter the number of copies issued: ");
        number = scanner.nextInt();
        System.out.print("Enter price: ");
        price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name document: ");
        name = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Thông tin:" +
                "\n   ID: "+id +
                "\n   Publisher: " + publisher +
                "\n   The number of copies issued: " + number+
                "\n   Price: "+ price+" $"+
                "\n   Name: "+ name;

    }
}
	