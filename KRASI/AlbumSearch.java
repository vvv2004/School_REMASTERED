package School_REMASTERED.KRASI;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlbumSearch {



    //MAIN
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Defining HashMap
        HashMap <String, String> myDict = new HashMap<>();

        //filling HashMap
        myDict = fillDict(myDict);

        String command = "";
        String input = "";

        System.out.print("Input the command: ");


        //This code reads and executes commands
        while(!command.equals("stop")){
            command = scan.next();

            //checks what the command is
            switch (command){
                case "artist":
                    System.out.print("Input the artist: ");
                    searchAlbumInDict(myDict);
                    System.out.println();
                    break;

                case "album":
                    System.out.print("Input the album: ");
                    searchArtistInDict(myDict);
                    System.out.println();
                    break;

                case "stop":
                    //Does nothing
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        }
    }
    //END OF MAIN




    //Filling array
    public static HashMap<String, String> fillDict (HashMap<String, String> myDict){

        myDict.put("Eminem", "Music to be murdered by");
        myDict.put("Dua Lipa", "Future Nostalgia");
        myDict.put("Juice Wrld", "Legends never die");
        myDict.put("Logic", "No pressure");
        myDict.put("The Weeknd", "After hours");

        return myDict;
    }




    //Searches by album by artist
    public static void searchAlbumInDict(HashMap<String, String> Dict){
        try {
            Scanner scan = new Scanner(System.in);

            String key = scan.nextLine();
            String result = Dict.get(key);

            System.out.println("The latest album of %s is \"%s\" ");
        }catch (Exception e){
            System.out.println("This album is not in the data base");
        }


    }




    //Searches artist by album
    public static void searchArtistInDict(HashMap<String, String> Dict){
        Scanner scan = new Scanner(System.in);


        try {
            String album = scan.nextLine();

            String result = "";


            //For-each loop
            for (Map.Entry<String, String> items : Dict.entrySet()) {

                //IF the value of the key is equal to the input, print the key
                if (album.equals(items.getValue())) {
                    result = items.getKey();
                }
            }

            System.out.printf("The album \"%s\" is made by %s ", album, result);


        }catch (Exception e){
            System.out.println("The album %s isn't contained in the list");
        }
    }
}