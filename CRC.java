import java.util.Scanner;

public class CRC {
    static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    static String mod2div(String divident, String divisor) {
        int pick = divisor.length();
        String tmp = divident.substring(0, pick);

        while (pick < divident.length()) {
            if (tmp.charAt(0) == '1') {
                tmp = xor(divisor, tmp) + divident.charAt(pick);
            } else {
                tmp = xor("0".repeat(divisor.length()), tmp) + divident.charAt(pick);
            }
            tmp = tmp.substring(1); // Always shift left after XOR
            pick++;
        }

        // For the last bits
        if (tmp.charAt(0) == '1') {
            tmp = xor(divisor, tmp);
        } else {
            tmp = xor("0".repeat(divisor.length()), tmp);
        }
        tmp = tmp.substring(1); // Final shift after last XOR

        return tmp;
    }

    static void encodeData(String data, String key) {
        int l_key = key.length();
        String appendedData = data + "0".repeat(l_key - 1);
        String remainder = mod2div(appendedData, key);
        String codeword = data + remainder;
        System.out.println("Encoded Data (Data + Remainder): " + codeword);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        String data = sc.next();
        System.out.print("Enter key (divisor): ");
        String key = sc.next();
        encodeData(data, key);
        sc.close();
    }
}
