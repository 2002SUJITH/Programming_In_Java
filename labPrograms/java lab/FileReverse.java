
import java.io.*;
import java.util.Scanner;

public class FileReverse {
    public static void main(String[] args) {
        BufferedWriter bw1 = null;
        BufferedWriter bw2 = null;
        FileWriter fw1 = null;
        FileWriter fw2 = null;
        try {
            Scanner sc = new Scanner(System.in);
            fw1 = new FileWriter("writeNormal.txt");
            bw1 = new BufferedWriter(fw1);
            fw2 = new FileWriter("writeReverse.txt");
            bw2 = new BufferedWriter(fw2);
            int number = 0;
            int i = 0;
            System.out.println("Enter the number(enter -1 for stop ) : ");
            int numbers[] = new int[50];
            while (true) {
                number = sc.nextInt();
                if (number == -1)
                    break;
                bw1.write(" " + number);
                bw1.newLine();
                numbers[i++] = number;
            }

            for (int j = i - 1; j >= 0; j--) {
                bw2.write(" " + numbers[j]);
                bw2.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                bw1.close();
                bw2.close();
                fw1.close();
                fw2.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
