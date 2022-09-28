public class hilos implements Runnable {
    private int argumento;
    public hilos (int n){this.argumento = n;}
    @Override
    public void run() {
        int factorial = 1;
        for( int i = 1; i <= argumento; i++ ) {
            factorial *= i;
        }
        System.out.println(Thread.currentThread().getName() + ":" + factorial);
    }
}

