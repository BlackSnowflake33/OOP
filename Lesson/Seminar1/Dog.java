package Lesson.Seminar1;

public class Dog extends Animal {
    public Dog (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }

    public Dog (){
        this("Pes",null,null, false);
    }
}
