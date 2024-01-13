import java.util.Scanner;

public class AttendanceDemo {
    public static void main(String[] args) {
            Scanner inputx = new Scanner(System.in);
            System.out.print("\nenter number of students to add: ");
            int add_student = inputx.nextInt();
            AttendanceDatabase[] demo = new AttendanceDatabase[add_student];

            for (int n = 0; n < add_student; n++) {
                demo[n] = new AttendanceDatabase();
                System.out.println(demo[n].results());
            }

//            for (int n = 0; n < add_student; n++) {
//
//            }

    }
    }


