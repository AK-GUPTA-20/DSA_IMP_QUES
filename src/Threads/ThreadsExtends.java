package Threads;
// creation of thread using Extend
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Extend Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class ThreadsExtends {
    public static void main(String[] args) {
        MyThread1 th = new MyThread1();
        MyThread1 t = new MyThread1();
        th.start();
        t.start();
        th.setName("i am 1st thread using extend");
        t.setName("I am 2nd Thread using thread");
        t.setPriority(Thread.MIN_PRIORITY);
        th.setPriority(Thread.MAX_PRIORITY);
    }
}
