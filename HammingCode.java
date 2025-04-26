import java.util.Scanner;

public class HammingCode {
    static int[] calculateParityBits(int[] data) {
        int[] result = new int[data.length + 4];
        int j = 0;
        for (int i = 1; i < result.length; i++) {
            if (i == 1 || i == 2 || i == 4 || i == 8) {
                result[i] = 0;
            } else {
                result[i] = data[j++];
            }
        }

        result[1] = result[3] ^ result[5] ^ result[7] ^ result[9] ^ result[11];
        result[2] = result[3] ^ result[6] ^ result[7] ^ result[10] ^ result[11];
        result[4] = result[5] ^ result[6] ^ result[7];
        result[8] = result[9] ^ result[10] ^ result[11];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[7];
        System.out.println("Enter 7 bits of data (0 or 1): ");
        for (int i = 0; i < 7; i++) {
            data[i] = sc.nextInt();
        }

        int[] encoded = calculateParityBits(data);
        System.out.print("Hamming code: ");
        for (int i = 1; i < encoded.length; i++) {
            System.out.print(encoded[i]);
        }
        sc.close();
    }
}
