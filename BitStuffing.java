import java.util.Scanner;

public class BitStuffing {
    public static String bitStuff(String data) {
        StringBuilder stuffed = new StringBuilder();
        int count = 0;
        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                count++;
                stuffed.append(bit);
                if (count == 5) {
                    stuffed.append('0');
                    count = 0;
                }
            } else {
                stuffed.append(bit);
                count = 0;
            }
        }
        return stuffed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bit string: ");
        String input = sc.next();
        String output = bitStuff(input);
        System.out.println("Stuffed bit string: " + output);
        sc.close();
    }
}
