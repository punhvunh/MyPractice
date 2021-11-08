package by.epam.learn.threads.synchronizedmy.synchronizedmethod;

public class UseFileThread  extends Thread{
    private CommonResource resource;

    public UseFileThread(String name , CommonResource resource){
        super(name);
        this.resource = resource;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            resource.writing(this.getName(),i);
        }
    }
}
