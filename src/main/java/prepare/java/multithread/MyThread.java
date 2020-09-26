package prepare.java.multithread;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/14
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        throw new RuntimeException("t1");
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + "; error=" + e.getMessage());
            }
        });
        mt.start();
    }
}
