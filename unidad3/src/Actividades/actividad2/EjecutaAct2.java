package Actividades.actividad2;

public class EjecutaAct2 {
    public static void main(String[] args) {
        Proveedor p=new Proveedor();
        Pieza pieza=new Pieza();
        
        Suministro sum=new Suministro();
        sum.setProveedor(p);


        Suministro sum2=new Suministro(15,"28/10/2026",p,pieza);

    }
}
