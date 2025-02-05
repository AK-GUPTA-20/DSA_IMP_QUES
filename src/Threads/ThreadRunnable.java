package Threads;
// creation of thread using runnable interface
class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Runnable Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        MyThread2 obj = new MyThread2();
        Thread th = new Thread(obj);
        th.start();
        System.out.println("My thread name is: "+th.getName());
        System.out.println("My thread is aive or not:"+th.isAlive());

    }

}
