package nio.channel;

import java.io.IOException;
import java.io.RandomAccessFile;
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
            inChannel.truncate(1);
            inChannel.force(false);
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
