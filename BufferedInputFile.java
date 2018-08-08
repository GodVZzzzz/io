package iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description
 */
public class BufferedInputFile {
    public static void main(String[] args) throws IOException{
        System.out.print(read("./out/production/iotest/BufferedInputFile.class"));
    }

    public static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s+"\n");
        in.close();
        return sb.toString();
    }
}
