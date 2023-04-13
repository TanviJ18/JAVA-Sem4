package Assignment6.Part1;

public class Fixed_stk implements Interface_stk{
    int stack[]=new int[MAX];
    int top=0;
    @Override
    public void push(int a) {
        if (top == MAX) {
            System.out.println("Can't insert, the stack is full.");
        }
        else {
            stack[top++] = a;
        }
    }


    @Override
    public int pop() {
        if(top==-1) {
            return -1;
        }
        else {
            top--;
            return stack[top];
        }
    }

    @Override
    public void displayStkTop() {
        System.out.println("Stack top "+stack[top-1]);
    }

    @Override
    public void displayStk() {
        System.out.println("Stack elements");
        for(int i=0;i<top;i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("\n");
    }
}
