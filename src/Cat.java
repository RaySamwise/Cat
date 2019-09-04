
public class Cat
{
    private double originWeight;
    private double weight;
    public String color;
    public static final int LEGS_COUNT = 4;
    public static final int MAX_WEIGHT = 9000;
    public static final int MIN_WEIGHT = 1000;
   // private double minWeight;
   // public double maxWeight;

    public static int count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
       // minWeight = 1000.0;
        //maxWeight = 9000.0;
        color =  Color.RED.toString();
        count = count + 1;


    }

    public double wentTotoilet(double weight123)
    {
        double reWeight = weight123 - 100 ;
        weight = reWeight;             //Написал наугад, не понял почему
        System.out.println("Ups, poopies....");
        return reWeight;
    }

    public double getWasted(double weight)
    {
     double wastedAmt = weight - originWeight;
     return wastedAmt;
    }

    public static void  showCount()
    {
        System.out.println("Всего кошек: " + Cat.count);
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            Cat.count = count - 1;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            Cat.count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}