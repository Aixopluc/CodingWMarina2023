package UF4.Societat;

import UF4.Persona.Persona;

public class MainSocietat {
    public static void main(String[] args) {

        Persona p1 = new Persona("987654321A","Alex",26);

        Persona p2 = new Persona("123456789B","Aleix");
        p2.setEdat(23);

        Persona p3 = new Persona();
        p3.setEdat(1);
        p3.setDni("11111111T");
        p3.setNom("Marina");

        Persona p4 = new Persona("1232123R");
        p4.setNom("Uri");
        p4.setEdat(22);

        Persona p5 = new Persona((short) 34);
        p5.setNom("Pablo");
        p5.setDni("56676543E");

        Persona p6 = new Persona("22222222r",(short) 45);
        p6.setNom("Joan");

        Persona p7 = new Persona((short) 22,"Moha");
        p7.setDni("00909909M");
    }
}