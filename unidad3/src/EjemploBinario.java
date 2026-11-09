import java.io.*;
import java.util.Scanner;
 
class EjemploBinario{
public static void main(String [] args)
   throws FileNotFoundException, IOException{
   Scanner sc=new Scanner(System.in);
   String entrada=sc.nextLine();
   FileInputStream in = new FileInputStream(entrada);
   FileOutputStream out = new FileOutputStream("./salida.txt");
 
   int n=0,c;
   System.out.print ("\nCopiando ...");
   while( (c = in.read()) != -1){
      out.write(c);
      n++;
   }
   in.close();
   out.close();
   System.out.print ("\nSe han copiado "+n+" Bytes\n");
}}