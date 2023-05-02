package UF4.ActivitatHerencia;

public class Cat extends Animal{
    private void meow(){
        System.out.println("Cat " +getId() +" is meow");
    }

    @Override
    public void sound(){meow();}
}
