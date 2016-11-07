public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread2 ThreadId: "
                + Thread.currentThread().getId());
// do our thing
        ThreadDemo.printNumbers();
    }

   
}