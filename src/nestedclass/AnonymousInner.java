package nestedclass;

public class AnonymousInner {

    public static void main(String[] args) {
/*    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i = 0; i< 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    });
    t.start();*/

    ThreadDemo td = new ThreadDemo();
   // td.run();

    ThreadDem tdem = new ThreadDem();
    tdem.start();
    }
}

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i< 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class ThreadDem extends Thread{
    @Override
    public void run() {
        for(int i = 0; i< 10; i++){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}


