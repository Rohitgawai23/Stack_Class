package Collection_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Search_method_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<String> ob=new Stack<>();

        System.out.println("Enter Stack Element :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            ob.add(s);
        }
        System.out.println(ob);

        int location=ob.search("HR");
        System.out.println(location);

    }
}
