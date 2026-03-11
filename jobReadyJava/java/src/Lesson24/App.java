package Lesson24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // try ( PrintWriter out = new PrintWriter(new
        // FileWriter("d:\\code_creation\\Book\\jobReadyJava\\java\\src\\Lesson24\\OutFile.txt"))))
        // {
        // out.println("this is a line in my file…");
        // out.println("a second line in my file…");
        // out.println("a third line in my file…");
        // out.flush();
        // out.close();
        // }

        Scanner sc = new Scanner(new BufferedReader(new FileReader("D:\\code_creation\\Book\\jobReadyJava\\java\\src\\Lesson24\\OutFile.txt"))); // ← note the semicolon
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
