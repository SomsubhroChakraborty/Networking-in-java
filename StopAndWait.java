import java.util.Scanner;

public class StopAndWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of frames to send: ");
        int frames = sc.nextInt();

        for (int i = 0; i < frames; i++) {
            System.out.println("Sending frame: " + i);
            System.out.println("Waiting for ACK...");
            System.out.println("ACK received for frame: " + i);
        }
        sc.close();
    }
}
