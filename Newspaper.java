
import java.util.Scanner;
public class Newspaper extends Document {
	// thuoc tinh
	private String dayIssue;

	// phuong thuc
	// ham khoi tao khong doi so
	public Newspaper() {
        super();
	}
	// ham khoi tao co doi so
	public Newspaper(String dayIssue) {
		super();
		this.dayIssue = dayIssue;
	}

	public Newspaper(int id, String publisher, int number, int price,String name, String dayIssue) {
		this.id = id;
		this.publisher = publisher;
		this.number = number;
        this.price = price;
        this.name = name;
        this.dayIssue= dayIssue;
	}
	public String getDayIssue(){
        return dayIssue;
    }
    public void setDayIssue(String dayIssue) {
        this.dayIssue = dayIssue;

	}
    public void enterDocument(){
		super.enterDocument();
        System.out.print("Enter issue day: ");
        dayIssue = scanner.next();
    }
    @Override
    public String toString() {
        return super.toString ()+"\n   Issue day: "+this.dayIssue;
}
}