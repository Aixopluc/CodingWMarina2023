import java.util.Scanner;


public class Calculanotafuncions2 {
    
    private boolean fi = false;
    private boolean max = false;
    private boolean min = false;
    private boolean mit = false;
    private int maximo;
    private int minimo;
    private double media;
    private int entersNota;
    private int[] enters = new int[5];
    
    public static void main(String[] args) {
        Calculanotafuncions2 programa = new Calculanotafuncions2();
        programa.inici();
        
    }
    
    
    public void inici(){
        while(!fi){
            mostrarMenu();
        }     
    }
    
    
    public void mostrarMenu(){
        System.out.println("\nBienvenido a mi Programa!");
        System.out.println("-----------------------------------------");
        System.out.println("[MAX] Calcular nota máxima.");
        System.out.println("[MIN] Calcular nota mínima.");
        System.out.println("[MIT] Calcular nota media.");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: "); 
        
        Scanner lector = new Scanner(System.in);
        String menu = lector.nextLine();
        
        switch(menu){
            case "max":
                llegirDades();
                calculaMax();
                imprimir();
                
                case "MAX":  
                    llegirDades();
                    calculaMax();
                    imprimir();
                    
            case "min": 
                llegirDades();
                calculaMin();
                imprimir();
                
                case "MIN":  
                    llegirDades();
                    calculaMin();
                    imprimir();
                    
            case "mit":  
                llegirDades();
                calculaMitj();
                imprimir();
                
                case "MIT":
                    llegirDades();
                    calculaMitj();
                    imprimir();
                
            case "fi":              
                fi = true;
                System.exit(0);
                   
                case "FI":              
                    fi = true;
                    System.exit(0);
                       
            default:
                System.out.print("Opció Incorrecta ");
                break;
        }   
        
        
    }
    
    
    public void llegirDades(){
        System.out.println("");
        System.out.println("Escriu la nota:");
        Scanner lector = new Scanner(System.in);     
        
        for (int i = 0; i < enters.length;){
            entersNota = lector.nextInt();
            enters[i] = entersNota;
            i++;          
                    
        }
 
    }
    
    
    public void calculaMax(){
        max = true;
        maximo = enters[0];

        for(int i = 0; i < enters.length; i++) {
            if(enters[i] > maximo) {
                maximo = enters[i];
            }
        }

    }
    
    
    public void calculaMin(){
        min = true;        
        minimo = enters[0];
        
        for(int i = 0; i < enters.length; i++) {
            if(enters[i] < minimo) {
                minimo = enters[i];
            }
        }
    }
    
    
    public void calculaMitj(){
        mit = true;        
        media = enters[0];
        
        for (int i = 0; i < enters.length; i++){
            media = media + enters[i];
        }
        
        media = media / enters.length;
        
    }
    
    
    public void imprimir(){  //Si no ponia las variables en falso al acabar cuando ponía otra opción se quedada guardaa la última que use.
        if(max){
            System.out.println("");
            System.out.println(">> La nota maxima es " + maximo + ".");
            System.out.println("");
            System.out.println("Vuelva cuando quieras!");
            System.out.println("-----------------------------------------");
            System.out.println("");
            System.out.println("");
            max = false;
            inici();
        }
        else if(min){
            System.out.println("");
            System.out.println(">> La nota minima es " + minimo + ".");
            System.out.println("");
            System.out.println("Vuelva cuando quieras!");
            System.out.println("-----------------------------------------");
            System.out.println("");
            System.out.println("");
            min=false;
            inici();
        }
        else if(mit){
            System.out.println("");
            System.out.println(">> La nota media es " + media + ".");
            System.out.println("");
            System.out.println("Vuelva cuando quieras!");
            System.out.println("-----------------------------------------");
            System.out.println("");
            System.out.println("");
            mit=false;
            inici();
        }

        
        

    }
    
 
}
