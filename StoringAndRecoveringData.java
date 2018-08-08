package iotest;

import java.io.*;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException{
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That is Pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble()+"\n"+in.readUTF()+"\n"+in.readDouble()+"\n"+in.readUTF());
    }
}
