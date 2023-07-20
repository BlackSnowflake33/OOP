package Lesson.Seminar1;

public class Goose extends Animal {
    public Goose (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }

    public Goose (){
        this("White",null,null, false);
    }
    @Override
    public void toGo(){
        System.out.println(" Я умею ходить, но медленно. Я ведь птица");
    }
    @Override
    public void swim(){
        System.out.println(" Я умею плавать. Я гусь");
    }
}
