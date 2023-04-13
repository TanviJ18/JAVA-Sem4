package Assignment6.Part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student("Tanvi Jatkar", "21070126043","AIML","Maths", "Physics", 90, 85 );
        student.display();
        ResultPrinter printer = new ResultPrinter((Result) student);
        printer.show();
}

}
