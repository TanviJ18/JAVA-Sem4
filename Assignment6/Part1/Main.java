package Assignment6.Part1;

public class Main {
    public static void main(String[] args) {
        Fixed_stk fixed = new Fixed_stk();
        fixed.push(1);
        fixed.push(2);
        fixed.push(3);
        fixed.push(4);
        fixed.push(5);
        fixed.push(6);
        fixed.displayStk();
        fixed.displayStkTop();
        fixed.pop();
        fixed.displayStk();
        fixed.displayStkTop();

        System.out.println("\n* * * * * * * * *\n");

        System.out.println("Growable Stack:\n");
        Growable_stk gstk = new Growable_stk();
        gstk.push(1);
        gstk.push(2);
        gstk.push(3);
        gstk.push(4);
        gstk.push(5);
        gstk.push(6);
        gstk.displaySTK();
        gstk.displayStkTop();
        gstk.pop();
        gstk.displaySTK();
        gstk.displayStkTop();
    }
}

