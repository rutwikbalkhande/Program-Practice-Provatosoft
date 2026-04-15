package multithreding;

public class EvenOddPrint {

    int num = 1;
    int max = 10;

    synchronized void printOdd() {
        while (num <= max) {
            if (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (num <= max) {
            if (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        EvenOddPrint evenOdd = new EvenOddPrint();

        Thread t1 = new Thread(() -> evenOdd.printOdd(), "OddThread");
        Thread t2 = new Thread(() -> evenOdd.printEven(), "EvenThread");

        t1.start();
        t2.start();
    }
}