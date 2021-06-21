import java.util.Scanner;

class FInalTestClass extends MenuItems {
    // MAIN METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contnue;
        char cont = 'y';
        //int sum = 0;
        while (cont == 'y') {
            ShowMenu();
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
            case 1:
                AddStudent();
                System.out.println(" ");
                System.out.println("Do you want to continue(y/n): ");
                contnue = input.nextLine();
                cont = contnue.charAt(0);
                System.out.println("Thank You!!");
                break;

            case 2:
                RegisterSemester();
                System.out.println(" ");
                System.out.println("Do you want to continue(y/n): ");
                contnue = input.nextLine();
                cont = contnue.charAt(0);
                System.out.println("Thank You!!");
                break;

            case 3:
                FindGpa();
                System.out.println(" ");
                System.out.println("Do you want to continue(y/n): ");
                contnue = input.nextLine();
                cont = contnue.charAt(0);
                System.out.println("Thank You!!");
                break;

            case 4:
                StudentinSystem();
                System.out.println(" ");
                System.out.println("Do you want to continue(y/n): ");
                contnue = input.nextLine();
                cont = contnue.charAt(0);
                System.out.println("Thank You!!");
                break;

            case 5:
                WriteToFile();
                System.out.println(" ");
                System.out.println("Do you want to continue(y/n): ");
                contnue = input.nextLine();
                cont = contnue.charAt(0);
                System.out.println("Thank You!!");
                break;

            case 6:
                System.out.println("Thank you!!");
                System.exit(0);
                
            default:
                System.out.println("Invalid input");
                System.out.println(" ");
            }
        }
    }
}
