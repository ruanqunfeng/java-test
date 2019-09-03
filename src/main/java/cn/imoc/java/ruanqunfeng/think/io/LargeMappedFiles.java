package cn.imoc.java.ruanqunfeng.think.io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

import static net.mindview.util.Print.*;

public class LargeMappedFiles {
    static int length = 0x8FFFFFF;

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out = new RandomAccessFile("test.dat", "rw")
                .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length); // 必须指定映射文件的初始位置和映射区域的长度
        for (int i = 0; i < length; i++) {
            out.put((byte) 'x');
        }
        print("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; i++) {
            printnb((char) out.get(i));
        }
    }
}
