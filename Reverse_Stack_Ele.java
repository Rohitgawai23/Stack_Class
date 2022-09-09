package Collection_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Stack_Ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack ob=new Stack();

        System.out.println("Enter Stack Element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println(ob);

        System.out.println("we are working on data structure :");
        while(!ob.isEmpty())
        {
            System.out.println(ob.peek());
            ob.pop();

        }


    }
}

/*
Output :

        Enter Stack Element :
        1 2 3 4 5
        [1, 2, 3, 4, 5]
        we are working on data structure :
        5
        4
        3
        2
        1

 */
