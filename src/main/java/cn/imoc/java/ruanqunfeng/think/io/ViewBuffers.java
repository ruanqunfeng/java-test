package cn.imoc.java.ruanqunfeng.think.io;

import java.nio.*;
import static net.mindview.util.Print.*;

public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 'a'});
        bb.rewind();
        printnb("Byte Buffer ");
        while (bb.hasRemaining()) {
            printnb(bb.position() + " -> " + bb.get() + ", ");;
        }
        print();
        CharBuffer cb = ((ByteBuffer) bb.rewind()).asCharBuffer();
        printnb("Char Buffer ");
        while (cb.hasRemaining()) {
            printnb(cb.position() + " -> " + cb.get() + ", ");
        }
        print();
        FloatBuffer fb = ((ByteBuffer) bb.rewind()).asFloatBuffer();
        printnb("Float Buffer ");
        while (fb.hasRemaining()) {
            printnb(fb.position()+ " -> " + fb.get() + ", ");
        }
        print();
        IntBuffer ib = ((ByteBuffer) bb.rewind()).asIntBuffer();
        printnb("Int Buffer ");
        while (ib.hasRemaining()) {
            printnb(ib.position()+ " -> " + ib.get() + ", ");
        }
    }
}
