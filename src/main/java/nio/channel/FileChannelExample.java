package nio.channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/24
 */

public class FileChannelExample {

    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("/Users/xiang/IdeaProjects/coding-interview/test.txt", "rw");
            FileChannel inChannel = file.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(3);

            int byteRead = inChannel.read(buf);
            while (byteRead != -1) {
                System.out.println("Read " + byteRead);
                buf.flip();

                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get());
                }

                buf.clear();
                byteRead = inChannel.read(buf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
