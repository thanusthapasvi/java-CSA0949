class MultiplicationTable implements Runnable {
    private int number;

    MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);

        Thread thread5 = new Thread(table5);
        Thread thread10 = new Thread(table10);

        thread5.start();
        try {
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread10.start();
    }
}
