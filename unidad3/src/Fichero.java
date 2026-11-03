import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Fichero {
    public static void main(String[] args) {
        //Búsqueda del directorio desde comienza la lectura de archivos en mi proyecto
        // System.out.println("Directorio actual: " + new File(".").getAbsolutePath());
        //Vamos a leer un archivo y mostrar su contenido
        System.out.println("Leyendo el fichero con BufferedReader y procesando con Scanner");
        try{
            //Opción 1
            // File archivo=new File("./FicheroEjemplo.txt");
            // FileReader lectura=new FileReader(archivo);
            // BufferedReader leer = new BufferedReader(lectura);
            //Opción 2
            BufferedReader leer = new BufferedReader(new FileReader("./FicheroEjemplo.txt"));
            String linea;
            while((linea=leer.readLine())!=null){
                System.out.println(linea);
                Scanner sc = new Scanner(linea);//Pasamos a procesar la línea leída
                int numero1=sc.nextInt();
                int numero2=sc.nextInt();
                int numero3=sc.nextInt();
                //sc.nextLine(); provoca el fallo de clase
                System.out.println(numero1+"-"+numero2+"-"+numero3);
            }
            leer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Leyendo el fichero con Scanner y procesando con Scanner");
        try{
            Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
            String linea;
            while(leer.hasNextInt()){
                int numero1=leer.nextInt();
                int numero2=leer.nextInt();
                int numero3=leer.nextInt();
                //sc.nextLine(); provoca el fallo de clase
                System.out.println(numero1+"-"+numero2+"-"+numero3);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
