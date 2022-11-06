import java.util.Stack;

public class stack1 {
    public static void main(String args[]){
        Stack stk=new Stack();                   //creates a stack
        System.out.println(stk.empty());//check if it is empty
        stk.push(2);        //inserting element into an stack
        stk.push(3);
        stk.push(4);

        stk.pop();//deleting an elemment from stack
       stk.peek();//return the top most element from the stack
      stk.search(2);//search fo r an element in the stack
      System.out.println(stk);//prints all the element in stacl

    }
}
