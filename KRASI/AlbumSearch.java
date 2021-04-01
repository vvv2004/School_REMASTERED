package School_REMASTERED.KRASI;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlbumSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap <String, String> myDict = new HashMap<>();

        myDict.put("Eminem", "Music to be murdered by");
        myDict.put("Dua Lipa", "Future Nostalgia");
        myDict.put("Juice Wrld", "Legends never die");
        myDict.put("Logic", "No pressure");
        myDict.put("The Weeknd", "After hours");

        String command = "";
        String input = "";

        while(!command.equals("stop")){
            command = scan.next();


            switch (command){
                case "performer":
                    System.out.print("Input the performer: ");
                    input = scan.nextLine();
                    System.out.printf("The latest album of %s is %s", input, searchPerformerInDict(input, myDict));
                    break;

                case "album":
                    System.out.print("Input the album: ");
                    input = scan.nextLine();
                    System.out.printf("The album \"%s\" is made by %s", input, searchAlbumInDict(input, myDict));
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static String searchPerformerInDict(String key, HashMap<String, String> Dict){
        try {
            String result = Dict.get(key);

            return result;
        }catch (Exception e){
            System.out.println("This album is not in the data base");
        }

        return "";
    }

    public static String searchAlbumInDict(String album, HashMap<String, String> Dict){
        String result = "";

        for(Map.Entry<String, String> items : Dict.entrySet()){
            if(album.equals(items.getValue())){
                result = items.getValue();
            }
        }


        return result;
    }
}
