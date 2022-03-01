
import java.util.Scanner;

public class Journal  extends Document {
	// thuoc tinh
	private int issueNumber;
	private String monthIssue;

	// phuong thuc
	// ham khoi tao khong doi so
	public Journal() {
        super();
	}
	// ham khoi tao co doi so
	public Journal(  int issueNumber, String monthIssue) {
		super();
		this.issueNumber = issueNumber;
		this.monthIssue = monthIssue;
	}

	public Journal(int id, String publisher, int number, int price,String name,int issueNumber, String monthIssue ) {
		this.id = id;
		this.publisher = publisher;
		this.number = number;
        this.price = price;
        this.name = name;
		this.monthIssue = monthIssue;
	}
        
	public int getIssueNumber(){
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
	}

	public String getMonthIssue(){
        return monthIssue;
    }
    public void setMonthIssue(String monthIssue) {
        this.monthIssue = monthIssue;
	}
	// ham nhap
	public void enterDocument(){
		super.enterDocument();
        System.out.print("Enter issue number: ");
		issueNumber = scanner.nextInt();
		System.out.print("Enter issue month: ");
		monthIssue = scanner.next();
		scanner.nextLine();
    }

    @Override
    public String toString (){
        return super.toString() +"\n   Issue number: "+this.issueNumber+"\n   Issua month: "+this.monthIssue;
}
}
		
