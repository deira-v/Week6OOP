package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteOnce {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name. (e.g., students.txt)");
        String fileName = sc.nextLine().trim();

        System.out.println("Enter a name to save");
        String name = sc.nextLine();

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {

            out.println(name);
            System.out.println("Saved to: " + fileName);
            //out.close();    //close the file and writ ethe information
        } catch (IOException ex) {
            System.out.println("Could not save file." + ex.getMessage());
        }
    }
}
