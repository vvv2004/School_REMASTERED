package School_REMASTERED.KRASI;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionaries {
    public static void main(String[] args) {
        Dictionary<Integer, String> myDictionary = new Hashtable<Integer, String>();


        //Putting elements in dictionary
        myDictionary.put(1, "Strawberry");
        myDictionary.put(2, "Banana");
        myDictionary.put(3, "Orange");

        //Printing dictionary and dict size
        System.out.println(myDictionary);
        System.out.println();
        System.out.println("Num of el : " + myDictionary.size());
        System.out.println();

        //Printing with for
        for (int i = 1; i < myDictionary.size() + 1; i++) {
            System.out.printf("The %d element is %s", i, myDictionary.get(i));
            System.out.println();
        }

        //Removing element
        myDictionary.remove(2);

        //Printing new dictionary
        System.out.println();
        System.out.println(myDictionary);
        System.out.println();

        //Printing with for

        //Only keys
        for (Enumeration<Integer> items = myDictionary.keys(); items.hasMoreElements();){
            System.out.println("Dict key : " + items.nextElement());
        }

        //Only values
        for (Enumeration<String> items = myDictionary.elements(); items.hasMoreElements();){
            System.out.println("Dict value : " + items.nextElement());
        }

        System.out.println("\nNew size of dict : " + myDictionary.size());
    }
}
