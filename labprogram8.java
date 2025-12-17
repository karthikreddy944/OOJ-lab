class BMS extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class CSE extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class labprogram8 {
    public static void main(String arr[]){
        BMS t1=new BMS();
        CSE t2=new CSE();
       
        t1.start();
        t2.start();
    }
    

}
