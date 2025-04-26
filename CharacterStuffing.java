import java.util.Scanner;

public class CharacterStuffing {
    public static String characterStuff(String data) {
        return "DLE" + data.replace("DLE", "DLEDLE") + "DLE";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String input = sc.nextLine();
        String output = characterStuff(input);
        System.out.println("Stuffed message: " + output);
        sc.close();
    }
}
