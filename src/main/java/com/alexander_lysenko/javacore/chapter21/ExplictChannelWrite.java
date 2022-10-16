package main.java.com.alexander_lysenko.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplictChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("WriteTest.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte)('A' + i));
                mBuf.rewind();
                fChan.write(mBuf);
                mBuf.rewind();
            }
        } catch (InvalidPathException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
