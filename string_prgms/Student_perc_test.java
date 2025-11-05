package string_prgms;

import java.util.Scanner;

public class Student_perc_test {

    static Student_perc getHighestScorer(Student_perc[] students) {
        Student_perc hstd = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getperc() > hstd.getperc()) {
                hstd = students[i];
            }
        }
        return hstd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many students");
        int n = sc.nextInt();
        Student_perc[] stds = new Student_perc[n];

        for (int i = 0; i < stds.length; i++) {
            System.out.println("Enter id, name and percentage");
            int id = sc.nextInt();
            String name = sc.next();
            double perc = sc.nextDouble();
            stds[i] = new Student_perc(name, id, perc); 
        }

        System.out.println("user entered students information");
        for (int i = 0; i < stds.length; i++) {
            System.out.println(stds[i]);
        }

        Student_perc hs = getHighestScorer(stds);
        System.out.println("highest scorer " + hs);


    }
}
