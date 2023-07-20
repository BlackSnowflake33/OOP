package Lesson.Seminar1;

public class Carp extends Animal {
    public Carp (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }

    public Carp (){
        this("Red",null,null, false);
    }
    @Override
    public void  toGo(){
        System.out.println("Я не умею ходить!");
    }
    public void fly() {
    System.out.println("Я не умею летать!"); 
    }
}