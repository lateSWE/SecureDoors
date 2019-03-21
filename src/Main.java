import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true){
            String input = sc.nextLine();
            if (MabyInputCommandEntry(input)){
                list.add(InputCommandEntryRemove(input));
            }
        }
    }

    private static boolean MabyInputCommandEntry (String input ){
        boolean out = true;
        String text = "entry";
        for (int i = 0; i < text.length(); i++) {
            if (!(input.charAt(i) == text.charAt(i))){
                out = false;
            }
        }
        return out;
    }

    private static boolean MabyInputCommandExit (String input ){
        boolean out = true;
        String text = "exit";
        for (int i = 0; i < text.length(); i++) {
            if (!(input.charAt(i) == text.charAt(i))){
                out = false;
            }
        }
        return out;
    }

    private static String InputCommandEntryRemove (String input ){
        String[] parts = input.split("-");
        String out = parts[1];

        return out;
    }
    private static String InputCommandExitRemove (String input ){
        String[] parts = input.split("-");
        String out = parts[1];

        return out;
    }
}
