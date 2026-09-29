
import java.time.LocalDateTime;
import java.util.Scanner;

import utilidades.Matematicas;

/**
 * @author Domingo López Oller
 * @
 * Unidad2: fundamentos de la programación
 */
public class Unidad2 {

    /**
     * Función main para ejecutar código java
     * @param args es un argumento
     */
    public static void main(String[]args) {
        //CLASE 1
        // //variable del lado del cuadrado
        // double edad;
        // edad=400000000;
        // boolean logico=(7<5);
        // String caracter="Domingo";

        // // System.out.println("Hola mundo");
        // // System.out.println(edad);
        // // System.out.println(logico);
        // int numerador = (1+2+3+1);
        // double denominador=3;
        // System.out.println("HOLA MUNDO "+edad+", "+logico);
        // System.out.println((1+2+3+1)/3);
        // System.out.println((1+2+3+1)/3.0);
        // System.out.println(numerador/denominador);

        // int a='A';
        // a='b';
        // System.out.println(a);

        // int[]b={4,0,-1};
        // System.out.println(b);
        // System.out.println(b[1]);
        // a='c';

        // final int VALOR;
        // VALOR=5;



        // int variable=0;
        // System.out.println(variable);
        // // Declarar varias variables en una línea
        // int uno=1,dos=2,tres=3;

        // /*
        // este párrafo es un comentario
        // asdfadsf
        // asdfasdf
        // asdfasdf
        // */
        // System.out.println("=========================================");
        // System.out.println("| Qué contento estoy que es viernes!! || 🗻♌ |");
        // System.out.println("=========================================");
        
        //CLASE 2
        //Ejemplo de introducir un valor por teclado
        // Scanner sc=new Scanner(System.in);
        // int numero;
        // //Ejemplo de pedir un número y mostrarlo
        // System.out.println("Introduce un número entre 5 y 25:");
        // numero=Integer.parseInt(sc.nextLine());
        // System.out.println("Introduce un nombre:");
        // String nombre=sc.nextLine();
        // System.out.println("El número introducido es: "+numero+" y tu nombre es "+nombre);
        
        // System.out.println("Introduce tu apellido: ");
        // String apellido=sc.nextLine();
        // System.out.println("Tu apellido es: "+apellido);

        // System.out.println("Dame tu nombre, edad, profesion");
        // // String resultado=sc.nextLine();
        // String nombre=sc.next();
        // int edad=sc.nextInt();
        // String profesion=sc.nextLine();
        // System.out.println(nombre+" "+edad+" "+profesion);

        // //Versión 25 JDK
        // edad=Integer.parseInt(IO.readln("Introduce un número"));
        // IO.println(edad);

        // sc.close();

        // LocalDateTime hoy = LocalDateTime.now();

        // System.out.println("Hoy es: " + hoy.getDayOfWeek());   // nombre del día
        // System.out.println("El día es: " + hoy.getDayOfMonth());
        // System.out.println("El mes es: " + hoy.getMonth());    // nombre del mes
        // System.out.println("El año es: " + hoy.getYear());
        // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        // int max=26;
        // int min=0;
        // char letra='a';
        // int aleatorio=(int)(Math.random()*(max-min+1)+min);
        // System.out.println((char)(letra+aleatorio));
        
        //CLASE 3
        //Utilizar las funciones sumar y multiplicar de la clase Matemáticas
        // int numero1=3;
        // int numero2=5;
        // System.out.println("La suma es: "+Matematicas.sumar(numero1,numero2));
        // System.out.println("La multiplicación es: "+Matematicas.multiplicar(numero1,numero2));

        // System.out.println("El resto de la division 5/2 es: "+(5%2));
        // int variable=2;
        // System.out.println("La variable vale: "+variable);
        // variable--; // variable=variable+1;
        // System.out.println("La variable vale: "+variable);

        // int valor1=3;
        // int valor2=5;
        // valor1+=valor2;//valor1=valor1+valor2;

        //Condiciones IF-ELSE
        // int numero=3;
        // int numero2=5;
        // int resultado;

        // if(numero>numero2){
        //     //Si se cumple hará esto
        //     resultado=numero+numero2;
        // }
        // else{
        //     //Si se no se cumple hará esto
        //     resultado=numero-numero2;
        // }
        // System.out.println(numero+" "+numero2+" "+resultado );
        
        // //Usando el operador ternario
        // resultado=(numero>numero2) ? numero+numero2:numero-numero2;
        // System.out.println(numero+" "+numero2+" "+resultado );
        // System.out.println("POR AQUÍ VOY");

        //IF-ELSE ENCADENADO
        int dia=3;
        if(dia==1)
            System.out.println("LUNES");
        
        else if (dia==2){
            System.out.println("MARTES");
            System.out.println("asdfadf");
        }
        else if (dia==6){
            System.out.println("SÁBADO");
        }
        else{
            System.out.println("DOMINGO");
        }

        //SWITCH
        int valor=3;
        switch(valor){
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("MARTES"); break;
            case 3: 
                System.out.println("MIÉRCOLES"); 
                System.out.println("Hola qué tal!!");
                break;
            case 4: System.out.println("JUEVES"); break;
            case 5: System.out.println("VIERNES"); break;
            case 6: System.out.println("SÁBADO"); break;
            case 7: System.out.println("DOMIngo"); break;
            default:System.out.println("Valor incrorrecto"); break;
        }
        System.out.println("POR AQUí");
    }
}
