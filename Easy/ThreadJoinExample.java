class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(500);  // Start after 500ms
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
