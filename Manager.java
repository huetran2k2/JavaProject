
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Manager {
    static ArrayList <Book> arrSach = new ArrayList<>(){
        {
            add(new Book(1111,"tre",10,89,"cho toi xin mot ve di tuoi tho","nguyen nhat anh",105));
            add(new Book(2222,"tre",12,110,"toi thay hoa vang tren co xanh","nguyen nhat anh",200));
        }
    };
    static ArrayList <Newspaper> arrBao = new ArrayList<>(){
        {
            add(new Newspaper(3333,"nhi dong",8,7,"tim guong mat than quen","14/5/2021"));
        }
    };
    
    static ArrayList <Journal> arrTapChi = new ArrayList<>(){
        {
            add(new Journal(4444,"elle",5,140,"thoi trang elle",7,"9"));
        }
    };
    static ArrayList<Employee> arrEmployee = new ArrayList<>(){
        {
            add(new Employee("5555","Nguyễn Thị Hoa","Nữ","0928470010","Bán hàng","30/07/2021",300,1.5f));
        }
    };
    
    static Scanner scanner = new Scanner (System.in);
    static int totalBook, totalNewspaper, totalJournal=0;
    
    public static void input (String key){
        int soSach, soBao, soTapChi;
        switch (key){
            case "1" :{
                System.out.println("---------------------------------------");
                System.out.print("Enter total number of books: ");
                soSach= scanner.nextInt();
                for (int i = 0; i<soSach; i++){
                    System.out.println("Enter the information of the "+(i+1)+" book: ");
                    Book sach = new Book();
                    sach.enterDocument();
                    arrSach.add(sach);
                }
                break;
            }

            case "2":{
                System.out.println("---------------------------------------");
                
                System.out.print("Enter total number of newspapers: ");
                soBao = scanner.nextInt();
                for (int i = 0; i<soBao; i++){
                    System.out.println("Enter the information of the "+(i+1)+" newspaper:");
                    Newspaper bao = new Newspaper();
                    bao.enterDocument();
                    arrBao.add(bao);
                }
                break;

            }
            case "3":{
                System.out.println("---------------------------------------");
                System.out.print("Enter total number of journal: ");
                soTapChi = scanner.nextInt();
                for (int i = 0; i<soTapChi; i++){
                    System.out.println("Enter the information of the "+(i+1)+" journal: ");
                    Journal tapchi = new Journal ();
                    tapchi.enterDocument();
                    arrTapChi.add(tapchi);
                }
                break;
            }
        }
    }   

    

    public static void output(String chon){
        switch (chon) {
            case "1": {
                System.out.println("----- Books information -----");
                for (int i = 0; i < arrSach.size(); i++) {
                    System.out.println(arrSach.get(i).toString());
                }
                break;
            }
            case "2": {
                System.out.println("----- Newspapers information -----");
                for (int i = 0; i < arrBao.size(); i++) {
                    System.out.println(arrBao.get(i).toString());
                }   
                break;
            }
            case "3":{
                System.out.println("----- Journal information -----");
                for (int i = 0; i < arrTapChi.size(); i++) {
                    System.out.println(arrTapChi.get(i).toString());
                }
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }  

    public static void tinhTong(String chooses){
        switch (chooses){
            case "1":{
                for (int i = 0; i < arrSach.size(); i++) {
                    totalBook += arrSach.get(i).getNumber() * arrSach.get(i).getPrice();
                }
                System.out.println("total cost of books = " + totalBook+"$");
                break;  
            }
            case "2":{
                for (int i = 0; i < arrSach.size(); i++) {
                    totalNewspaper += arrBao.get(i).getNumber() * arrBao.get(i).getPrice();
                }
                System.out.println("total cost of newspapers = " + totalNewspaper+"$");
                break; 
            }
            case "3":{
                for (int i = 0; i< arrTapChi.size();i++){
                    totalJournal += arrTapChi.get(i).getNumber() * arrTapChi.get(i).getPrice();
                }
                System.out.println("total cost of journals = "+ totalJournal+"$");
                break;
            }
        }
    }

    public static void timkiem(String choose1){
        switch (choose1){
            case "1":{
                int count =0;
                System.out.print("Enter author: ");
		        String authorName= scanner.nextLine();
                System.out.println("Information about books by author");
                for (int i = 0; i < arrSach.size(); i++) {
                    if (arrSach.get(i).getAuthor().equalsIgnoreCase(authorName)) {
                        System.out.println(arrSach.get(i).toString());
                        count =1;   
                    }
                }
                if (count==0){
                    System.out.println("There are no books with the requested author's name");
                }
                break;
            }
           
            case "2":{
                int counti =0;
                System.out.print("Enter day:");
                String day = scanner.nextLine();
                System.out.println("Newspaper published on "+day);
                for (int i = 0; i < arrBao.size(); i++) {
                    if (arrBao.get(i).getDayIssue().equalsIgnoreCase(day)) {
                        System.out.println(arrBao.get(i).toString());
                        counti=1;
                    }
                }
                if (counti ==0){
                    System.out.println("No newspaper has a requested release date");}
                break;
                }
            case "3":{
                System.out.print("Enter month:");
                String month = scanner.nextLine();
                int count=0;
                System.out.println("Information of magazines published in the month you requested");
                for (int i = 0; i < arrTapChi.size(); i++) {
                    if (arrTapChi.get(i).getMonthIssue().equalsIgnoreCase(month)) {
                        System.out.println(arrTapChi.get(i).toString());
                        count= 1;
                    }
                }
                if (count ==0){
                    System.out.println("No magazines published in the month you requested");}        
                break;
            }
        }
    }        

    public static void sapxep(String luaChon){
        switch (luaChon){
            case "1":{
                Collections.sort(arrSach, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        if (o1.getId() < o2.getId()) {
                            return 1;
                        }
                        
                        return -1;
                    }
                });
                System.out.println("\n---- Book information after sorting by id ----");
                for (int i = 0; i < arrSach.size(); i++) {
                    System.out.println(arrSach.get(i));
                }
                break;
            }
            case "2":{
                Collections.sort(arrBao, new Comparator<Newspaper>() {
                    @Override
                    public int compare(Newspaper o1, Newspaper o2) {
                        if (o1.getPrice() < o2.getPrice()) {
                            return 1;
                        } 
                        return -1;
                    }
                });
                System.out.println("\n---- Newspaper information after sorting by price ----");
                for (int i = 0; i < arrBao.size(); i++) {
                    System.out.println(arrBao.get(i));
                }
                break;
            }
            case "3":{
                Collections.sort(arrTapChi, new Comparator<Journal>() {
                    @Override
                    public int compare(Journal o1, Journal o2) {
                        if (o1.getIssueNumber() < o2.getIssueNumber()) {
                            return 1;
                        } 
                        return -1;
                    }
                });
                System.out.println("\n---- Information of the magazine after sorting by issue number ---");
                for (int i = 0; i < arrTapChi.size(); i++) {
                    System.out.println(arrTapChi.get(i));
                }
                break;
            }
        }
    }

    public static void inputEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of employees to enter: ");
        int numberEmp = scanner.nextInt();
        for (byte i = 0; i < numberEmp; i++){
            Employee employee = new Employee();
            scanner.nextLine();
            System.out.println("Enter employee information number: " + (i + 1) + ":");
            employee.inputEmployee();
            arrEmployee.add(employee);
        }
    }


    public static void outputEmployee(){
        System.out.println("-------Textbooks Information-------");
            for (int i = 0; i < arrEmployee.size(); i++) {
                System.out.println("\n" + arrEmployee.get(i));
            }
    }
    
    
        public static void removeEmployees() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the employee id to delete: ");
            String id = scanner.nextLine();
            for (int i = 0; i<arrEmployee.size(); i++) {
                if (arrEmployee.get(i).getemployeeID().equals(id)) {
                    arrEmployee.remove(i);
                    System.out.println("Employee with ID " + id + " removed" );
                    return;
                }
            }
            System.err.println("Employee id entered does not exist!");
        };


        
        public static void updateEmployees() {
            System.out.print("Enter the employee ID to update: ");
            String employee2 = scanner.nextLine();
            //int check = 0;
            for (Employee nv :arrEmployee) {
                if (nv.getemployeeID().equals(employee2)) {
                    if (nv.getClass().getName().equals("Employee")) {
                        System.out.println("-----INFORMATION YOU CAN EDIT:-----");
                        System.out.println("1. Employee ID: ");
                        System.out.println("2. Employee name: ");
                        System.out.println("3. Employee Salary: ");
                        System.out.println("Please select the information you need to correct: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        if (choose == 1) {
                            System.out.println("Update employee ID: ");
                            nv.setemployeeID(scanner.nextLine());
                        } else if (choose == 2) {
                            System.out.println("Update employee Name: ");
                            nv.setname(scanner.nextLine());
                        } else if (choose == 3) {
                            System.out.println("Update employee Salary: ");
                            nv.setbasicSalary(scanner.nextInt());
                        } else {
                            System.out.println("Enter the wrong choosen!");
                        }
                    }
                    //arrEmployee.set(arrEmployee.indexOf(nv), nv);
                } else {
                    System.out.println("No employee id like above!!!\n");
                }
            }
        }
    }

