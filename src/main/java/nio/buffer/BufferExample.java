package nio.buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/25
 */

public class BufferExample {

    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("/Users/xiang/IdeaProjects/coding-interview/test.txt", "rw");
            FileChannel inChannel = file.getChannel();

            // create buffer with capacity of 48 bytes
            ByteBuffer buf = ByteBuffer.allocate(48);

            // read into buffer.
            int bytesRead = inChannel.read(buf);

            while (bytesRead != -1) {

                // make buffer ready for read
                buf.flip();

                // read 1 byte at a time
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                // make buffer ready for writing
                buf.clear();

                bytesRead = inChannel.read(buf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
