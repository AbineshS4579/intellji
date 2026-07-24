class th extends Thread{
   public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A");
             // 1 second
            try {
                Thread.sleep(100);        } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
public class tr {
    public static void main(String[] args){
        th t=new th();
        t.start();


        System.out.println("Main thread finished");
        for(int i=0;i<5;i++){
            System.out.println("B");
        }
    }
}
