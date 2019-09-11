
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
        tom.color = Color.PURPUR.toString();
        System.out.println(tom.getStatus());
        Cat.showCount();

        one.meow();


        System.out.println("Кошка еще не пила");
        System.out.println(two.getStatus());
        System.out.println("Вес до выпивания: " + two.getWeight());
        two.drink(1000.00);
        System.out.println("Кошка напилась: " + two.getStatus());
        System.out.println("Вес после выпивания: " + two.getWeight());
        System.out.println("Кошка сожрала: " + two.getWasted());
        System.out.println("Кошка 3 хочет пипи ");
        System.out.println("Вес до туалета: " + three.getWeight());
        three.wentToToilet(three.getWeight());
        System.out.println("Вес после туалета: " + three.getWeight());
        System.out.println("Вес котиков");
        System.out.println("Вес тома: " + tom.getWeight());
        System.out.println("Вес бара: " + bar.getWeight());
        System.out.println("Вес первого: " + one.getWeight());
        System.out.println("Вес второго: " + two.getWeight());
        System.out.println("Вес третьего: " + three.getWeight());
        System.out.println("Вес четвертого: " + four.getWeight());
        System.out.println("Сколько кошек: " + Cat.count);

        System.out.println("Взрываем Тома");
        while (tom.isAlive)
        {
            tom.feed(tom.getWeight());
            System.out.println(tom.getWeight());
            System.out.println(tom.getStatus());
        }
        Cat.showCount();

        System.out.println("Первый домяукает до смерти");
        while (one.isAlive)
        {
            one.meow();
            System.out.println(one.getStatus());
        }
        Cat.showCount();

     //   while (bar.getStatus() != "Dead")
  //      {
    //        bar.meow();
    //    }
    //    System.out.println(bar.getStatus());


      creation();
    }

    public static void creation()
    {
        //Создаем кошку через новый конструктор
        Cat newCat = new Cat(4000);
        System.out.println("Новая кошка весит: " + newCat.getWeight());
    }
}