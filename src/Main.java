import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times; i++) {
            String input = sc.nextLine();
            if (MabyInputCommandEntry(input)) {
                if (!list.contains(InputCommandEntryRemove(input))) {
                    list.add(InputCommandEntryRemove(input));
                    System.out.println(InputCommandEntryRemove(input) + " entered");
                } else {
                    System.out.println( InputCommandEntryRemove(input)+ " entered (ANOMALY)");
                }
                System.out.println("MabyInputCommandEntry(input) = true");
            }else if (MabyInputCommandExit(input)) {
                if (list.contains(InputCommandExitRemove(input))) {
                    list.remove(list.indexOf(InputCommandExitRemove(input)));
                    System.out.println(InputCommandExitRemove(input) + " exited");
                } else {
                    System.out.println(InputCommandExitRemove(input) + " exited (ANOMALY)");
                }
                System.out.println("MabyInputCommandExit(input)");
            }else System.out.println("Error not exit or entry!");

        }
    }

    private static boolean MabyInputCommandEntry (String Input ){
        boolean out;
        String[] parts = Input.split(" ");
        if (parts[0].equals("entry")){
            out = true;
        }else out = false;
        return out;
    }

    private static boolean MabyInputCommandExit (String Input ){
        boolean out;
        String[] parts = Input.split(" ");
        if (parts[0].equals("exit")){
            out = true;
        }else out = false;
        return out;
    }

    private static String InputCommandEntryRemove (String Input ){
        String[] parts = Input.split(" ");
        String out = parts[1];
        return out;
    }
    private static String InputCommandExitRemove (String Input ){
        String[] parts = Input.split(" ");
        String out = parts[1];
        return out;
    }
}