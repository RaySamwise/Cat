
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

        System.out.println("Вес котиков");
        System.out.println("Вес тома: " + tom.getWeight());
        System.out.println("Вес бара: " + bar.getWeight());
        System.out.println("Вес первого: " + one.getWeight());
        System.out.println("Вес второго: " + two.getWeight());
        System.out.println("Вес третьего: " + three.getWeight());
        System.out.println("Вес четвертого: " + four.getWeight());
        System.out.println("Вес пятого: " + five.getWeight());


        System.out.println("Взрываем Тома");
        while (tom.getWeight() < tom.maxWeight)
        {
            tom.feed(tom.getWeight());
            System.out.println(tom.getWeight());
            System.out.println(tom.getStatus());
        }

        while (bar.getStatus() != "Dead")
        {
            bar.meow();
        }
        System.out.println(bar.getStatus());



    }
}