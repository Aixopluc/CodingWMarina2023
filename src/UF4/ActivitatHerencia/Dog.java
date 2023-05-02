package UF4.ActivitatHerencia;

public class Dog extends Animal{

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}