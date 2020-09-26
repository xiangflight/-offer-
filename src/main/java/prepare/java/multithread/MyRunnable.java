package prepare.java.multithread;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/14
 */

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is run");
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}
