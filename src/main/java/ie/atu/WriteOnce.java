package ie.atu;

import java.io.*;
import java.util.Scanner;

public class WriteOnce {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: (e.g. student.txt");
        String fileName = sc.nextLine().trim();

        System.out.println("Enter a name to save:");
        String name = sc.nextLine().trim();

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(name);
            System.out.println("Saved to: " + fileName);
        } catch (IOException ex) {
            System.out.println("Could not write to: " + ex.getMessage());
        }
    }
}