package School_REMASTERED.OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class mostCommonNumber {

    //MAIN
    public static void main(String[] args) {
        String userInput = "12 31 22 45 | 6 17 21 | 45";

        String[] splitText = userInput.split("\\|");

        ArrayList<Integer> finalArray = stringToInteger(splitText);

        System.out.println(finalArray);
    }//END OF MAIN



    public static ArrayList<Integer> stringToInteger(String[] splitText){
        ArrayList<String> finalSplit = new ArrayList<>();
        ArrayList<Integer> intArray = new ArrayList<>();

        //
        for (int i = 0; i < splitText.length; i++) {
            finalSplit.addAll(Arrays.asList(splitText[i].split(" ")));
        }

        for (int i = finalSplit.size() - 1; i >= 0; i--) {
            try{
                intArray.add(Integer.parseInt(finalSplit.get(i)));
            }catch(Exception e){
                finalSplit.remove(i);
            }
        }

        return intArray;
    }
}
