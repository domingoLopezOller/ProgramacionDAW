import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        /*
            Actividad: Realiza un programa que genera 2 números (a,b) 
            y nos diga el cociente (a/b), la media ((a+b)/2), la potencia (a^b) 
            y la raíz cuadrada de cada uno
        */
       //Generar dos números de manera aleatoria
    //    int min=1,max=10;
    //    int aleatorio1=(int)(Math.random()*(max-min+1)+min);
    //    double aleatorio2=(int)(Math.random()*(max-min+1)+min);

    //    double division=aleatorio1/aleatorio2;
    //    double media=(aleatorio1+aleatorio2)/2.0;
    //    //Realizar las operaciones
    //    System.out.println("Los números generados son: "+aleatorio1+" y "+aleatorio2);
    //    System.out.println("La división es: "+division);
    //    System.out.println("La media es: "+media);
    //    System.out.println("La potencia vale: "+Math.pow(aleatorio1,aleatorio2));
    //    System.out.println("Las raices cuadrados son: "+Math.sqrt(aleatorio1)+ " y "+Math.sqrt(aleatorio2));
    
    /*
        Actividad: ¿Cómo sabemos si un número es divisible por 2 y por 3?
    */
    // int numero=6;
    // // if(numero%2==0 && !numero%3==0){
    // //     System.out.println("Es divisible por 2 y 3");
    // // }
    // // else{
    // //     System.out.println("NO es divisible por 2 y 3");
    // // }
    // if(numero%2==0){
    //     if(numero%3==0){
    //         System.out.println("Si es divisible por 2 y 3");
    //     }
    //     else{
    //         System.out.println("NO es divisible por 2 y 3");
    //     }
    // }
    // else{
    //     System.out.println("NO es divisible por 2 y 3");
    // }

    // /*
    // Actividad: Ecuación de segundo grado
    //  */
    // //Declaro las variables a  b y c
    // int a, b, c;
    // //Declaro las varible de las soluciones
    // double x1,x2;
    // //Definir la lectura de las variables
    // Scanner sc = new Scanner(System.in);
    // a=Integer.parseInt(sc.nextLine());
    // b=Integer.parseInt(sc.nextLine());
    // c=Integer.parseInt(sc.nextLine());

    // int variable=b*b-4*a*c;

    // if(variable<0){
    //     System.out.println("No hay soluciones");
    // }
    // else if(variable==0){
    //     x1=-b/(2.0*a);
    //     System.out.println("La única solución es: "+x1);
    // }
    // else{
    //     x1=(-b + Math.sqrt(variable))/(2.0*a);
    //     x2=(-b - Math.sqrt(variable))/(2.0*a);
    //     System.out.println("La primera solución es: "+x1);
    //     System.out.println("La segunda solución es: "+x2);
    // }

    /*
    Actividad calificaciones 
    */
    //Leer la calificación
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce la nota: ");
    double numero=Double.parseDouble(sc.nextLine());
    // //Comprobar calificación CON IF-ELSE
    // if(numero<5){
    //     System.out.println("SUSPENSO");
    // }
    // else if (numero>=5 && numero <6){
    //     System.out.println("APPROBADO");
    // }
    // else if( numero>=6 && numero <7){
    //     System.out.println("BIEN");
    // }
    // else if( numero>=7 && numero <9){
    //     System.out.println("NOTABLE");
    // }
    // else{
    //     System.out.println("SOBRESALIENTE");
    // }
    //Comprobar calificación con SWITCH
    switch((int)numero){//Tiene que comprobar un valor. Verás que no siempre se podrá usar switch
        case 0: 
        case 1:
        case 2:
        case 3:
        case 4: System.out.println("SUSPENSO"); break;
        case 5: System.out.println("APROBADO"); break;
        case 6: System.out.println("BIEN"); break;
        case 7:
        case 8: System.out.println("NOTABLE"); break;
        case 9:
        case 10: System.out.println("SOBRESALIENTE"); break;
        default: System.out.println("Valor incorrecto"); break;
    }
    }
}
