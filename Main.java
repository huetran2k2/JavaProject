import java.util.*;
public class Main {
    public static void choose(String line){
        Scanner scanner= new Scanner(System.in);
        switch (line) {
            case "1":{
                System.out.println("===================================================");
                System.out.println("| Enter 1: To insert more book information        |");
                System.out.println("| Enter 2: To insert more newspaper information   |");
                System.out.println("| Enter 3: To insert more journal information     |");
                System.out.println("===================================================\n");
                System.out.print("Enter choice: ");
                String key = scanner.next();
                Manager.input( key);
                break;}

            case "2": {
                System.out.println("===============================================");
                System.out.println("| Enter 1: To search book's information       |");
                System.out.println("| Enter 2: To search newspaper's information  |");
                System.out.println("| Enter 3: To search journal's information    |");
                System.out.println("===============================================\n");
                System.out.print("Enter choice: ");
                String chon = scanner.next();
                Manager.output(chon);
                break;}
            case "3":{
                System.out.println("===========================================================");
                System.out.println("| Enter 1: To calculate the total cost of the books       |");
                System.out.println("| Enter 2: To calculate the total cost of the newspapers  |");
                System.out.println("| Enter 3: To calculate the total cost of the journals    |");
                System.out.println("===========================================================\n");
                System.out.print("Enter choice: ");
                String chooses = scanner.next();
                Manager.tinhTong(chooses);
               
                break;
            } 
            case "4":{
                System.out.println("=====================================================================");
                System.out.println("| Enter 1: To find book information by author name                  |");
                System.out.println("| Enter 2: To find newspapers information by the issue of the day   |");
                System.out.println("| Enter 3: To find journal information by the issue of the month    |");
                System.out.println("=====================================================================\n");
                System.out.print("Enter choice: ");
                String choose1 = scanner.next();
                Manager.timkiem(choose1);
                break;
            }    
            case "5":{    
                System.out.println("==============================================================");
                System.out.println("| Enter 1: To sort the book's information by id              |");
                System.out.println("| Enter 2: To sort the newspaper's information by price      |");
                System.out.println("| Enter 3: To sort the journal's information by issue number |");
                System.out.println("==============================================================\n");
                System.out.print("Enter choice: ");
                String luaChon =scanner.next();
                Manager.sapxep(luaChon);
                break;
            }

            case "6":{
                int choosee;
                while (true){
                    showMenuOfEmployees();
                    System.out.print("Enter your selection: ");
                    choosee = scanner.nextInt();
                    switch (choosee) {
                    case 1: {
                        System.out.println("---------------------------------------------------------------");
                        Manager.inputEmployee();
                        break;
                    } 

                    case 2: {
                        System.out.println("---------------------------------------------------------------");
                        Manager.outputEmployee();
                        break;
                    } 

                    case 3: {
                        System.out.println("---------------------------------------------------------------");
                        Manager.removeEmployees();
                        break;
                    } 

                    case 4: {
                        System.out.println("---------------------------------------------------------------");
                        Manager.updateEmployees();
                        break;
                    } 

                    case 5: {
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("Goodbye!!");
                        return;
                        
                    } 

                    default:
                        System.out.println("---------------------------------------------------------------");
                        System.err.println("You have entered the wrong number. \nPlease re-enter.");
                        break;
                    }
                }
            }
                
            case "7": {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Goodbye!!");
                System.exit(0);
            } 

            default:
                System.out.println("---------------------------------------------------------------");
                System.err.println("You have entered the wrong number. \nPlease re-enter.");
                break;
                }
            }
                       
        
    
    static void showMenuOfEmployees() {
        System.out.println();
        System.out.println("********************* EMPLOYEE MANAGER *************************");
        System.out.println("| Enter 1: Enter the information of the staffs in the store.   |");
        System.out.println("| Enter 2: Display employees information.                      |");
        System.out.println("| ENter 3: Delete employee.                                    |");
        System.out.println("| Enter 4: Update employee information.                        |");
        System.out.println("| Enter 5: Exit the program with employees.                    |");
        System.out.println("----------------------------------------------------------------\n");
    }
    public static void display(){

        System.out.println("===================================================");
        System.out.println("--- WELCOME TO THE DOCUMENT MANAGEMENT PROGRAM --- ");
        System.out.println("===================================================");
        System.out.println("|                            Made by TRAN THI HUE |");
        System.out.println("|                                                 |");
        System.out.println("|********************--MENU--*********************|");
        System.out.println("| Enter 1: Input document information             |");
        System.out.println("| Enter 2: Export document information            |");
        System.out.println("| Enter 3: Calculate the total amount             |");
        System.out.println("| Enter 4: Search documents                       |");
        System.out.println("| Enter 5: Arange document                        |");
        System.out.println("| Enter 6: Manage employee                        |");
        System.out.println("| Enter 7: Exit                                   |");
        System.out.println("===================================================");
        System.out.print("Enter choice: ");
        Scanner scanner = new Scanner (System.in);
        String line = scanner.next();
        choose(line);
    }
public static void main(String[] args) {
    while(true){
        display();     
    }
}
}
