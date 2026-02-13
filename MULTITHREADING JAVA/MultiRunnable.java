class process implements Runnable {
    public void run() {
        int i;
        int j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }
    }
}

class EvenNumber implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("All Even Eumber From 1 To 100 ->" + "\n" + i);

            }
        }
    }
}

public class MultiRunnable {
    public static void main(String[] args) {
        EvenNumber E = new EvenNumber();
        process p = new process();
        Thread t1 = new Thread(E);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();

    }

}
