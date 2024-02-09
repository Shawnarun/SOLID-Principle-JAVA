package ISP;

public class Manager implements Workable,Eatable,Sleepable{

    @Override
    public void work() {
     System.out.println("Working");
    }

    @Override
    public void eat() {
        System.out.println("Eating");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");

    }
    
}
