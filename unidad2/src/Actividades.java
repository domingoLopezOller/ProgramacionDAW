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
    int numero=6;
    // if(numero%2==0 && numero%3==0){
    //     System.out.println("Es divisible por 2 y 3");
    // }
    // else{
    //     System.out.println("NO es divisible por 2 y 3");
    // }
    if(numero%2==0){
        if(numero%3==0){
            System.out.println("Si es divisible por 2 y 3");
        }
        else{
            System.out.println("NO es divisible por 2 y 3");
        }
    }
    else{
        System.out.println("NO es divisible por 2 y 3");
    }
    }
}
