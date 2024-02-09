package OCP;

public class Discount {
   public double calculateDiscount(String type){
        double discount=0.0;
        switch (type) {
            case "Senior":
                 discount=30.0;
                break;

            case "Super Senior":
                discount=40.0;
               break;

            case "Junior":
               discount=10.0;
              break;

            case "New Students":
              discount=50.0;
             break;
             
            default:
                break;
        }
    return discount;
   } 
}
