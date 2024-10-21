class MyThread extends Thread {
    public MyThread() {
        super("MyThread");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running");
        }
    }
}
