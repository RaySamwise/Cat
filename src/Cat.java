
public class Cat
{

    private double originWeight;
    private double weight;
    public String color;
    public Boolean isAlive = false;
    public static int count = 0;
    public static final int LEGS_COUNT = 4;
    public static final int MAX_WEIGHT = 9000;
    public static final int MIN_WEIGHT = 1000;
    public static final int EYES_COUNT = 4;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        isAlive = true;
        color =  Color.RED.toString();
        count = count + 1;
    }

    public Cat(double weight)
    {
     this();
     this.weight = weight;
    }

    public void wentToToilet(double weight)
    {
        this.weight = weight - 100 ;
        if (this.weight < MIN_WEIGHT)
        {
            isAlive = false;
            count = count - 1;
        }
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
        if (isAlive)
        {
            weight = weight - 500;
            if (weight < MIN_WEIGHT)
            {
                isAlive = false;
                count = count - 1;
                System.out.println("Перемяукола");
            }
            else System.out.println("Meow");
        } else System.out.println("Мёртвые кошки не говорят Meow");
    }

    public void feed(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
            if (weight > MAX_WEIGHT)
            {
                isAlive = false;
                count = count - 1;
            }
        }
        else  System.out.println("Кошка" +  getStatus() + " , ее нельзя покормить!");
    }

    public void drink(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                isAlive = false;
                count = count - 1;
            }
        }
        else System.out.println("Кошка " +  getStatus() + " ее нельзя поить!");
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
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