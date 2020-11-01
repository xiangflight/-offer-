package nio.pipe;

import java.io.IOException;
import java.nio.channels.Pipe;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/10/22
 */

public class PipeExample {

    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
