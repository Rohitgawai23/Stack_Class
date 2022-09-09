package Collection_Stack;

import java.util.Stack;

public class Capacity_Stack_ex {
    public static void main(String[] args) {
        Stack ob=new Stack();
        System.out.println(ob.capacity());
        ob.ensureCapacity(12);

        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);

        ob.trimToSize();
        System.out.println(ob.capacity());
        System.out.println(ob);

        System.out.println("we are working on data structure :");
        while(! ob.isEmpty())
        {
            System.out.println(ob.peek());
            ob.pop();
        }

    }
}
