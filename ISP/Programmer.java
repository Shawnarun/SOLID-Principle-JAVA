package ISP;

public class Programmer implements Eatable,Workable {

    @Override
    public void work() {
        System.out.println("Working");

    }

    @Override
    public void eat() {
        System.out.println("Eating");

    }

    
}
