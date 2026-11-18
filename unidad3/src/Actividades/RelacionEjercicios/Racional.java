package Actividades.RelacionEjercicios;
public class Racional {
    private int numerador;
    private int denominador;

    public Racional(){}

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //SUMA DE DOS RACIONALES
    public void sumar(Racional r){
        int den=mcm(this.denominador,r.getDenominador());
        int num=((den/this.denominador)*this.numerador)+((den/r.getDenominador())*r.getNumerador());
        System.out.println("El resultado de la suma es: "+num+"/"+den);
    }
    public boolean esIgual(Racional r){
        return numerador==r.getNumerador() && denominador==r.getDenominador();
    }

    public int mcm(int num1,int num2){
        return num1*num2;
    }
    public void imprimirRacional(){
        System.out.println(numerador+"/"+denominador);
    }

    public static void main(String[] args) {
        Racional uno=new Racional();
        uno.setNumerador(3);
        uno.setDenominador(5);
        Racional dos=new Racional();
        dos.setNumerador(3);
        dos.setDenominador(5);
        if(uno.esIgual(dos)){
            System.out.println("SON IGUALES");
        }
        else{
            System.out.println("NO SON IGUALES");
        }


        uno.sumar(dos);
    }
}
