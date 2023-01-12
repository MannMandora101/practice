package stack;/* 
  @created 03/09/22
  @author  manish.mandora
*/

import java.util.Stack;

public class SpecialStack {
    Stack<Integer> actualStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int data) {
        if (actualStack.isEmpty()) {
            actualStack.push(data);
            minStack.push(data);
        } else {
            actualStack.push(data);
            Integer pop = minStack.pop();
            minStack.push(pop);
            if (data < pop) {
                minStack.push(data);
            } else {
                minStack.push(pop);
            }
        }
    }

    public Integer pop() {
        Integer pop = actualStack.pop();
        minStack.pop();
        return pop;
    }

    public Integer getMin() {
        Integer pop = minStack.pop();
        minStack.push(pop);
        return pop;
    }


    public static void main(String args[]) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(10);
        specialStack.push(20);
        specialStack.push(30);
        specialStack.push(40);
        System.out.println(specialStack.pop());
        System.out.println(specialStack.getMin());
        specialStack.push(50);

    }
}
