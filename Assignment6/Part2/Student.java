package Assignment6.Part2;

public class Student implements Result
{
    private String name;
    private String rollNo;
    private String branch;

    private String subject;
    private int mark1;
    private int mark2;
    private String subject1;
    private String subject2;
    public Student(String name, String rollNo, String branch, String subject1, String subject2, int mark1, int mark2) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;

        this.subject1 = subject1;
        this.subject2 = subject2;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Name of Subject1 : " + subject1);
        System.out.println("Name of Subject2 : " + subject2);
        System.out.println("Marks in subject 1: " + mark1 + "\n" +"Marks in subject 2: " + mark2);
    }

    public double calculatePercentage()
    {
        return ((double) mark1 + mark2 )/ 200 * 100;
    }

}
