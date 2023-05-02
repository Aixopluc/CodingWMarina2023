package UF2.segon;

public class segon {

    private int[] array = {47,12,57,1,1230,54,23,67,5,23};

    public static void main (String[]args){
        segon programa = new segon();
        programa.inici();
    }

    public void inici(){
        mostrararray();
        ordenar();
        imprimir();
    }

   public void mostrararray(){
       System.out.print("Array: [");
        for (int a : array){
            System.out.print(a + ", ");
        }
       System.out.print("]");
    }

    public void ordenar(){
        int aux = 0;
        for (int i = 0; i < array.length - 1; i++) {

            for(int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public void imprimir(){
        System.out.println(" ");
        System.out.print("El segundo número mas grande es: " + array[1]);
    }



}
