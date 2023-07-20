package Lesson.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal ("Барсик", "Ольга", "простуда", false);
        
        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();
        

        System.out.println(cat);

         Animal musya = new Cat();
         Dog pes = new Dog();
         List<Animal> animals = new ArrayList<>();
         animals.add(cat);
         animals.add(barsik);
         animals.add(pes);
        //System.out.println(animals); 

        //System.out.println(musya.getType());
        //System.out.println(musya.getType("C arg "));
        cat.hunt();
// ДЗ
       //Кошка
        cat.toGo(); // вызывается из родительского класса
        cat.fly(); // вызывается из переопределенного метода внутри класса Сat
        cat.swim(); // вызывается из переопределенного метода внутри класса Сat
        System.out.println("___________________________");

       // Карп
        Animal Carp = new Carp();
        Carp.fly();
        Carp.toGo();
        Carp.swim();
        System.out.println("___________________________");


       //Гусь
        Animal white = new Goose();
        white.fly();
        white.toGo();
        white.swim();
        String ownerEagle = white.ownerName = " Я белый гусь, жил у бабуси. ";
        System.out.println(ownerEagle);
        System.out.println("___________________________");
    }       
}


