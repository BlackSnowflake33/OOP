package Lesson.Seminar1;


// Животное для вет. клиники
public class Animal {
    protected String nameAnimal; // Кличка животного поля
    protected String ownerName; // Имя хозяина поля
    protected String diagnosis; // диагностика  поля
    protected Boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName(); // класс названия 

    // конструктор, коструировать животного надо все 4 параметра, заполнить абстракцию конккретным значениями 
    public Animal(String animal, String ownerName, String diagnosis, Boolean isVaccinated) {
        this.nameAnimal = animal; // ссылка на на объект паменти (тот же)
        this.ownerName = ownerName;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;
    }
    public Animal() {

    }
    public boolean isVaccinated() { // геттер для получения доступа к полю
        return this.isVaccinated;
    }
    /*public String nameAnimal() { // геттер для получения доступа к полю
        return this.nameAnimal;
    }
    public String ownerName() { // геттер для получения доступа к полю
        return this.ownerName;
    }
    public String diagnosis() { // геттер для получения доступа к полю
        return this.diagnosis;
    }*/

    public void setVaccinated(Boolean isVaccinated) { // сеттер для изменения поля
        this.isVaccinated = isVaccinated;
    }
    
    public String getType(){
        return TYPE;
    }
    @Override
    public String toString (){
        return String.format("%s{name = %s, owner = %s}", TYPE, nameAnimal, ownerName);
    }
    public String getType(String arg){
        return arg + TYPE;
    }
    protected void toGo (){
        System.out.println("Я умею ходить " +  TYPE);
    }
    protected void fly (){
        System.out.println("Я умею летать " +  TYPE);

    }
     protected void swim (){
        System.out.println("Я умею плавать " + TYPE);
    }
}
