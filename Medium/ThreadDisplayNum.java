class NaturalNumbers extends Thread {
    private int start;

    public NaturalNumbers(int start) {
        this.start = start;
    }

    public void run() {
        for (int i = start; i <= 10; i += 3) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NaturalNumbers thread1 = new NaturalNumbers(1);
        NaturalNumbers thread2 = new NaturalNumbers(2);
        NaturalNumbers thread3 = new NaturalNumbers(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
