package iotest;

import java.nio.ByteBuffer;

/**
 * @author Zhang
 * @date 2018/8/9
 * @Description
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < bb.limit())
            if(bb.get() != 0)
                System.out.print("nonzero");

        System.out.println(" i = " +i);
        bb.rewind();
        bb.asCharBuffer().put("Hoedy!");
        char c;
        while ((c = bb.getChar()) != 0)
            System.out.print(c+" ");
        bb.rewind();
        System.out.println();

        bb.asShortBuffer().put((short) 471142);
        System.out.println(bb.getShort());
        bb.rewind();

        bb.asIntBuffer().put(99471142);
        System.out.print(bb.getInt());
        bb.rewind();

    }
}
