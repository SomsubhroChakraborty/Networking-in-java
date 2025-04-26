import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of frames: ");
        int frames = sc.nextInt();
        System.out.print("Enter window size: ");
        int window = sc.nextInt();

        int i = 0;
        while (i < frames) {
            for (int j = 0; j < window && i < frames; j++, i++) {
                System.out.println("Sending frame: " + i);
            }

            System.out.println("Waiting for ACK...");
            System.out.println("All frames in window acknowledged!");
        }
        sc.close();
    }
}
