
public class Loader
{
    public static void main(String[] args)
    {
        Cat tom = new Cat();
        Cat bar = new Cat();
        Cat one = new Cat();
        Cat two = new Cat();
        Cat three = new Cat();
        Cat four = new Cat();
        Cat five = new Cat();

        System.out.println(tom.getStatus());
        one.meow();
        System.out.println("Кошка еще не пила");
        System.out.println(two.getStatus());
        two.drink(two.getWeight());
        System.out.println("Кошка напилась: " + two.getStatus());

        System.out.println("Взрываем Тома");
        while (tom.getWeight() < tom.maxWeight)
        {
            tom.feed(tom.getWeight());
            System.out.println(tom.getWeight());
            System.out.println(tom.getStatus());
        }

       // while (bar.getStatus() != "Dead")
    //    {
    //        bar.meow();
   //         System.out.println(bar.getStatus());
   //     }

    }
}