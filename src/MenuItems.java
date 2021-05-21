import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class MenuItems {
    private static final char[] Students = null;
    static ArrayList<String> StudentList = new ArrayList<String>();

    // INDIVIDUAl MENU METHODS
    public static void ShowMenu() {
        System.out.println("-------------------------------");
        System.out.println(" CHOOSE AN OPTION ");
        System.out.println(" 1.ADD A STUDENT ");
        System.out.println(" 2.REGISTER A SEMESTER ");
        System.out.println(" 3.CALCULATE GPA ");
        System.out.println(" 4.VIEW STUDENT IN SYSTEM ");
        System.out.println(" 5.WRTE TO FILE ");
        System.out.println(" 6.EXIT ");
        System.out.println("-------------------------------");
    }

    // ADDING STUDENT METHOD
    public static void AddStudent() {
        Scanner input = new Scanner(System.in);
        Student obj1 = new Student(null, null, null, 0, null, null);
        System.out.println("-------------------------");
        System.out.println("Enter first name:");
        String fname = input.nextLine();
        System.out.println("Enter middle name:");
        String mname = input.nextLine();
        System.out.println("Enter last name:");
        String lname = input.nextLine();
        System.out.println("Enter your age:");
        int s_age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your gender (M or F)");
        String s_gender = input.nextLine();
        // char gnd = s_gender.charAt(0);
        System.out.println("Enter your address:");
        String s_address = input.nextLine();
        obj1.setFirstname(fname);
        obj1.setMiddlename(mname);
        obj1.setLastname(lname);
        obj1.setAge(s_age);
        obj1.setGender(s_gender);
        obj1.setAddres(s_address);
        System.out.println(" ");
        System.out.println("Name: " + obj1.getFirstname() + " " + obj1.getMiddlename() + " " + obj1.getLastname());
        System.out.println("Gender: " + obj1.getGender());
        System.out.println("Address: " + obj1.getAddres());
        // ADDING TO ARRAYLIST13
        StudentList.add(obj1.getFirstname() + " " + obj1.getMiddlename() + " " + obj1.getLastname());
        System.out.println(obj1.getFirstname() + " added to the list");
    }

    // REGISTERING SEMESTER METHOD
    public static void RegisterSemester() {
        Courses obj2 = new Courses(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("What year are you: ");
        System.out.println("--------------------");
        System.out.println(" 1.first year ");
        System.out.println(" 2.second year ");
        System.out.println(" 3.third year ");
        System.out.println("---------------------");
        int year_choice = input.nextInt();
        obj2.setYear(year_choice);
        if (year_choice <= 3) {
            System.out.println("What semester are you? ");
            int sem_numb = input.nextInt();
            obj2.setSemester(sem_numb);
        }
    }

    // GPA METHOD
    public static void FindGpa() {
        Grades obj3 = new Grades(0, 0);
        String grade = "";
        double credit;
        double gradeValue = 0;
        double totPtsClass = 0;
        double totPts = 0;
        double totalCredits = 0;
        double gpa = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("How many classes do you have: ");
        int class_num = console.nextInt();
        for (int x = 0; x < class_num; x++) {
            System.out.println("Enter the number of credits of the class " + (x + 1) + " (A number)");
            credit = console.nextDouble();
            System.out.println("Enter your grades for the class " + (x + 1) + "(Capital letters e.g A,B+, C-)");
            grade = console.next();
            if (grade.equals("A"))
                gradeValue = 4.00;
            else if (grade.equals("A-"))
                gradeValue = 3.67;
            else if (grade.equals("B+"))
                gradeValue = 3.33;
            else if (grade.equals("B"))
                gradeValue = 3.00;
            else if (grade.equals("B-"))
                gradeValue = 2.67;
            else if (grade.equals("C+"))
                gradeValue = 2.33;
            else if (grade.equals("C"))
                gradeValue = 2.00;
            else if (grade.equals("D+"))
                gradeValue = 1.33;
            else if (grade.equals("D"))
                gradeValue = 1.00;
            else if (grade.equals("F"))
                gradeValue = 0;
            else if (grade.equals("FX"))
                gradeValue = 0;
            else
                System.out.println("Invalid Grade");
            totPtsClass = gradeValue * credit;
            totPts = totPts + totPtsClass;
            totalCredits = totalCredits + credit;
            gpa = totPts / totalCredits;
            obj3.setGpa(gpa);
        }
        System.out.println("Your gpa is " + obj3.getGpa());
    }

    public static void StudentinSystem() {
        System.out.println(" ");
        System.out.println("Students in the system are: ");
        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println(StudentList.get(i));
        }

    }

    // WRITTING TO FILE METHOD
    public static void WriteToFile() {
        Scanner input = new Scanner(System.in);
        Student obj_1 = new Student(null, null, null, 0, null, null);
        System.out.println("-----------------------------");
        System.out.println("Enter first name:");
        String fname = input.nextLine();
        System.out.println("Enter middle name:");
        String mname = input.nextLine();
        System.out.println("Enter last name:");
        String lname = input.nextLine();
        System.out.println("Enter your age:");
        int s_age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your gender (M or F)");
        String s_gender = input.nextLine();
        // char gnd = s_gender.charAt(0);
        System.out.println("Enter your address:");
        String s_address = input.nextLine();
        // writting semester to file
        Courses obj_2 = new Courses(0, 0);
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("What year are you: ");
        int year_choice = input.nextInt();
        obj_2.setYear(year_choice);
        if (year_choice <= 3) {
            System.out.println("What semester are you? ");
            int sem_numb = input.nextInt();
            obj_2.setSemester(sem_numb);
        }
        System.out.println("what course are you(bita,bff etc): ");
        String course_name = input.nextLine();
        // Writting gpa to file
        Grades obj_3 = new Grades(0, 0);
        String grade = "";
        double credit;
        double gradeValue = 0;
        double totPtsClass = 0;
        double totPts = 0;
        double totalCredits = 0;
        double gpa = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("How many classes do you have: ");
        int class_num = console.nextInt();
        for (int x = 0; x < class_num; x++) {
            System.out.println("Enter the number of credits of the class " + (x + 1) + " (A number)");
            credit = console.nextDouble();
            System.out.println("Enter your grades for the class " + (x + 1) + "(Capital letters e.g A,B+, C-)");
            grade = console.next();
            if (grade.equals("A"))
                gradeValue = 4.00;
            else if (grade.equals("A-"))
                gradeValue = 3.67;
            else if (grade.equals("B+"))
                gradeValue = 3.33;
            else if (grade.equals("B"))
                gradeValue = 3.00;
            else if (grade.equals("B-"))
                gradeValue = 2.67;
            else if (grade.equals("C+"))
                gradeValue = 2.33;
            else if (grade.equals("C"))
                gradeValue = 2.00;
            else if (grade.equals("D+"))
                gradeValue = 1.33;
            else if (grade.equals("D"))
                gradeValue = 1.00;
            else if (grade.equals("F"))
                gradeValue = 0;
            else if (grade.equals("FX"))
                gradeValue = 0;
            else
                System.out.println("Invalid Grade");
            totPtsClass = gradeValue * credit;
            totPts = totPts + totPtsClass;
            totalCredits = totalCredits + credit;
            gpa = totPts / totalCredits;
            obj_3.setGpa(gpa);
        }
        
        // Converting to capital letters
        String c_fname = fname.toUpperCase();
        String c_mname = mname.toUpperCase();
        String c_lname = lname.toUpperCase();
        String c_gender = s_gender.toUpperCase();
        String c_address = s_address.toUpperCase();
        String c_course_name = course_name.toUpperCase();
        // setters
        obj_1.setFirstname(c_fname);
        obj_1.setMiddlename(c_mname);
        obj_1.setLastname(c_lname);
        obj_1.setAge(s_age);
        obj_1.setGender(c_gender);
        obj_1.setAddres(c_address);
        try {
            File file = new File("Students Information.txt");
            if (!file.exists()) {
                file.createNewFile();
            } 
            // append the content to file18
            FileWriter Std_file = new FileWriter(file, true);
            BufferedWriter StdWrtFile = new BufferedWriter(Std_file);
            StdWrtFile.write("\n");
            StdWrtFile.write(obj_1.getFirstname() + "'s file" + "\n");
            StdWrtFile.write("-------------------------------" + "\n");
            StdWrtFile.write("FIRST NAME: " + obj_1.getFirstname() + "\n");
            StdWrtFile.write("MIDDLE NAME: " + obj_1.getMiddlename() + "\n");
            StdWrtFile.write("LAST NAME: " + obj_1.getLastname() + "\n");
            StdWrtFile.write("AGE: " + obj_1.getAge() + "\n");
            StdWrtFile.write("GENDER: " + obj_1.getGender() + "\n");
            StdWrtFile.write("ADDRESS: " + obj_1.getAddres() + "\n");
            StdWrtFile.write("COURSE: " + c_course_name + "\n");
            StdWrtFile.write("YEAR: " + obj_2.getYear() + "\n");
            StdWrtFile.write("SEMESTER: " + obj_2.getSemester() + "\n");
            StdWrtFile.write("GPA: " + obj_3.getGpa() + "\n");
            StdWrtFile.write("-------------------------------" + "\n");
            StdWrtFile.write("\n");
            // Closing BufferedWriter Stream
            StdWrtFile.close();
            System.out.println("");
            System.out.println("Data Inserted Successfully.......!");
        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

}
