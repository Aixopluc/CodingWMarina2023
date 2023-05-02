package UF2.predicciopersona;

import java.util.Scanner;
public class predicciopersona {
private String nom = "";
private String  equipFutbol = "";
private int numSort =  0;
private String llenguatgeProgramacio = "";

private String m ="";
private int a = 0;

private String [] meses = {"Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"};
    public static void main(String[] args){
        predicciopersona programa = new predicciopersona();
        programa.inici();

    }

    public void inici(){
        preguntas();
        respuesta();

    }

    public void preguntas() {
        Scanner lector = new Scanner(System.in);
        boolean mescont = false;
            do {
                System.out.println("Escriu el mes en què vas nèixer.");
                m = lector.nextLine();
                for(String me :meses){
                    if(m.equalsIgnoreCase(me)){
                        mescont=true;
                    }
                }
            }
            while (!mescont);

            System.out.println("Com et dius?");
            boolean nomcont = false;
            while (!nomcont) {
                nomcont = lector.hasNextLine();
                if (nomcont) {
                    nom = lector.nextLine();
                }
            }

            System.out.println("Per acabar, quants anys tens?");
            boolean anyscont = false;
            while (!anyscont) {
                anyscont = lector.hasNextInt();
                if (anyscont) {
                    a = lector.nextInt();

                }
            }
            calcula(m, a);
        }

    public void calcula(String mes, int edat){

        if (mes.equalsIgnoreCase(meses[0])){
            numSort = edat * 3/2;
            equipFutbol = "Bayern de Munich";
            llenguatgeProgramacio = "C++";
        }
        else if (mes.equalsIgnoreCase(meses[1])){
            numSort = edat - 4;
            equipFutbol = "Atlético de Madrid";
            llenguatgeProgramacio = "Python";
        }
        else if (mes.equalsIgnoreCase(meses[2])){
            numSort = edat / 2;
            equipFutbol = "Chelsea";
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mes.equalsIgnoreCase(meses[3])){
            numSort = edat % 4;
            equipFutbol = "Manchester city";
            llenguatgeProgramacio = "Node.js";
        }
        else if (mes.equalsIgnoreCase(meses[4])){
            numSort = edat * 3/6;
            equipFutbol = "Liverpool";
            llenguatgeProgramacio = "React";
        }
        else if (mes.equalsIgnoreCase(meses[5])){
            numSort = edat + edat;
            equipFutbol = "Real Madrid";
            llenguatgeProgramacio = "C#";
        }
        else if (mes.equalsIgnoreCase(meses[6])){
            numSort = edat * edat / 5;
            equipFutbol = "BVB";
            llenguatgeProgramacio = "Swift";
        }
        else if (mes.equalsIgnoreCase(meses[7])){
            numSort = edat * 1/2 * edat;
            equipFutbol = "FCB";
            llenguatgeProgramacio = "Java";
        }
        else if (mes.equalsIgnoreCase(meses[8])){
            numSort = edat / edat;
            equipFutbol = "Juve";
            llenguatgeProgramacio = "PHP";
        }
        else if (mes.equalsIgnoreCase(meses[9])){
            numSort = edat * 4 / 3;
            equipFutbol = "PSG";
            llenguatgeProgramacio = "R";
        }
        else if (mes.equalsIgnoreCase(meses[10])){
            numSort = edat % 2 + 23;
            equipFutbol = "Sevilla CF";
            llenguatgeProgramacio = "Go";
        }
        else if (mes.equalsIgnoreCase(meses[11])){
            numSort = (edat + edat) / 2;
            equipFutbol = "Manchester United";
            llenguatgeProgramacio = "Ruby";
        }


    }

    public void respuesta(){
        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }

}
