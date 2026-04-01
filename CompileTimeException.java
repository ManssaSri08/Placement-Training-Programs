public class CompileTimeException {
    public static void main(String[] args) {
        Thread T=new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(2000);
                System.out.println("thread wake");
            }
            catch(InterruptedException e){
                //TODO: handle exception
                System.out.println("sleep interrupted");
            }
        });
        T.start();
        try{
            Thread.sleep(4000);
        }
        catch(Exception e){
            //TODO: handle exception
            System.out.println("Not T");
        }
        T.interrupt();
    }
}