package Collection_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Removing_Element_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> ob=new Stack();

        System.out.println("Enter stack element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.push(n);

        }
        System.out.println("Initial stack : "+ob);

        System.out.println("popped element :"+ob.pop());
        System.out.println("popped element :"+ob.pop());

        System.out.println("Stack after pop operation :"+ob);

    }
}
/*
Output :

        Enter stack element :
        12 34 56 75 35
        Initial stack : [12, 34, 56, 75, 35]
        popped element35
        popped element75
        Stack after pop operation :[12, 34, 56]

 */