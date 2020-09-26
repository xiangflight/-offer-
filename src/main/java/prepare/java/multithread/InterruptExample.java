package prepare.java.multithread;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/14
 */

public class InterruptExample {

    private static class MyThread1 extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class MyThread2 extends Thread {

        @Override
        public void run() {
            while (!interrupted()) {
                System.out.println("myThread2 is running");
            }
            System.out.println("Thread end");
        }
    }

    public static void main(String[] args) {
//        Thread thread1 = new MyThread1();
//        thread1.start();
//        thread1.interrupt();
//        System.out.println("Main run");

        Thread thread2 = new MyThread2();
        thread2.start();
        thread2.interrupt();
    }

}
