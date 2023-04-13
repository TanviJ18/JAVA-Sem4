package Assignment6.Part1;

import java.util.ArrayList;

public class Growable_stk implements Interface_stk {
    private final ArrayList<Integer> stack;
    private int top;

    public Growable_stk() {
        stack = new ArrayList<Integer>();
    }

    public Growable_stk(ArrayList<Integer> stack) {
        this.stack = stack;
    }

    public void push(int a) {
        stack.add(top++, a);
    }

    public int pop() {
        if (top == -1) {
            return -1;
        } else {
            top--;
            return stack.get(top);
        }
    }

    public void displaySTK() {
        System.out.println("Stack elements:\n");
        for (int i = 0; i < top; i++) {
            System.out.println(stack.get(i));
        }
    }

    public void displayStkTop() {
        System.out.println("Stack Top: " + stack.get(top - 1));

    }

    @Override
    public void displayStk() {

    }
}
