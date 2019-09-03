package cn.imoc.java.ruanqunfeng.think.io;

import java.nio.*;
import static net.mindview.util.Print.*;

public class UsingBuffers {
    private static void symmetricScramble(CharBuffer buffer) {
        int i = buffer.length() / 2;
        int j = 0;
        while (buffer.hasRemaining() && j++ < i) {
            buffer.mark();// 获取当前position
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();// Resets this buffer's position to the previously-marked position.
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffer".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        print(cb.rewind());
        symmetricScramble(cb);
        print(cb.rewind());
        symmetricScramble(cb);
        print(cb.rewind());
    }
}
