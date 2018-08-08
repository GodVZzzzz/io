package iotest;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(Paths.get("F:\\myfile.txt"),"UTF-8");
        PrintWriter out = new PrintWriter("F:\\myfile.txt");
        out.write("dajsdkasdjk");
        out.println("dkwadm");
        out.print("mdk");
        out.close();
        System.out.print(in.nextLine());
    }
}
