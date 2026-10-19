import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona2 {
    //atributos
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    static int hijos;
    Persona2 pareja;

    public Persona2(String DNI,String fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
    }

    //métodos
    public void setHijos(int hijos){
        this.hijos=hijos;
    }


    public static void main(String[] args) {
        Persona2 p=new Persona2("12345678A","15/08/1985");

        Persona2 p2=new Persona2("12345678B","01/07/1987");
        

    }
}
