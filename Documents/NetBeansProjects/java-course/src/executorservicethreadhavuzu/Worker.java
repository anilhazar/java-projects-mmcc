package executorservicethreadhavuzu;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable{
    private String isim;
    private int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("Worker " + isim + " " + taskId + ". islem basladi..");
            
            
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("Worker " + isim + " " + taskId + ". islem bitti..");
           
    }
  
   
}
