import java.lang.*;
import java.util.*;
import java.io.*;

class Test 
{
    public static void main(String args[])
    {
        // ArrayList<String> list = new ArrayList<String>(); 
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        String[] stringList = {"A","B","C","D","E","F","G"};

        // ListIterator iterator = list.listIterator(); 

        ListIterator iterator = list.listIterator();

        System.out.println("The list contents are: " + list);

        System.out.println(

        );


        System.out.println("The list contents in order are: ");
        int counter = 0;
        while (iterator.hasNext()){
            System.out.println(counter + ": " + iterator.next() + " ");
            counter ++;
        }

        System.out.println("The list contents in reverse order are: ");
        counter = list.size();
        while (iterator.hasPrevious()){
            System.out.println(counter + ": " + iterator.previous() + " ");
            counter --;
        }



    }
}