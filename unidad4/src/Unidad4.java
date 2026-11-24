public class Unidad4{
    public static void main(String[] args) {
        //Creación de vector de enteros
        // int[] numeros={4,7,3,9}; // Es lo mismo que int array[];
        // //Puedo acceder a posiciones desde 0 a su longitud
        // numeros[0]=3;//Array[4] dará fallo

        // //Puedo recorrer su contenido e imprimirlo. Fijaros que empieza en 0 y termina en longitud
        // System.out.println("Vector inicial: ");
        // for(int i=0;i<4;i++){
        //     System.out.print(numeros[i]+", ");
        // }
        // System.out.println();
        // //Y si quiero cambiar el contenido?
        // System.out.println("Vector RESULTADO: ");
        // for(int i=0;i<numeros.length;i++){//Fíjate que es mejor recorrerlo según el tamaño del vector
        //     numeros[i]=(int) (Math.random()*(10)+1);
        //     System.out.print(numeros[i]+", ");
        // }
        // System.out.println();
        
        // /**
        //  * Sólo pueden ser vectores de tipos básicos como int, double?? 
        //  * NO, también se pueden vectores de objetos
        // */
        // Persona p1= new Persona("David",33);
        // Persona p2= new Persona("María",25);
        // p1.setPareja(p2);
        // //Vector personas que tiene dos valores nulos y que se asignará la referencia a los dos anteriores
        // Persona[] personas={null,null};
        // personas[0]=p1;
        // personas[1]=p2;
        // //Mostrar contenido de p1
        // p1.infoPersona();
        // p2.infoPersona();

        // //USO de un vector como parámetro de una función
        // int[] numeros={4,7,3,9}; // Es lo mismo que int array[];
        // int[] resultado=null;
        // resultado=multiplica2(numeros);
        // //Sacar resultado
        // System.out.print("Resultado: ");
        // for(int i=0;i<resultado.length;i++){
        //     System.out.print(resultado[i]+", ");
        // }
        // System.out.println();
 
        // //Salida cuando se usa el propio parámetro dentro de la función
        // multiplica2bis(numeros);
        // //Sacar resultado
        // System.out.print("Resultado: ");
        // for(int i=0;i<numeros.length;i++){
        //     System.out.print(numeros[i]+", ");
        // }
        // System.out.println();


        // int valor=5;
        // mutliplica3(valor);
        // System.out.println(valor);

        // //USO DE MATRICES
        // String[][] comidas = {
        //     {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
        //     {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones"},
        //     {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
        // };
        // String[] b = comidas[1];
        // System.out.println(comidas[1][2]);
        // System.out.println(b[2]);

        // //RECORRER una matriz
        // //DE ARRIBA ABAJO Y DE IZQUIERDA DERECHA
        // //Recorrer filas
        // for(int i=0;i<comidas.length;i++){
        //     //Recorrer columnas
        //     for(int j=0;j<comidas[i].length;j++){
        //         System.out.print(comidas[i][j]+"- ");
        //     }
        //     System.out.println();
        // }

        //PRÁCTICA
        int[] practica={4,5,1,8,5};
        // int[] copia={0,0,0,0,0};
        // int[] copia2=null;
        // copia2=copiaVector(practica);

        //ACTIVIDAD: Función que devuelve la posición donde está el número en un vector
        System.out.println(buscaNumero(practica, 4));
        System.out.println(buscaNumero(practica, 7));
        System.out.println(buscaNumero(practica, 5));
        System.out.println(buscaNumero2(practica, 5));

    }
    public static int buscaNumero(int[] vector, int numero){
        int encontrado=-1;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==numero) encontrado=i;
        }
        return encontrado;
    }
    //Opción 2 hacer que sólo saque la primera vez que encuentra el número con ejemplo {4,5,1,8,5}
    public static int buscaNumero2(int[] vector, int numero){
        int encontrado=-1;
        boolean salida=false;
        // int i=0;
        // while(!salida){
        //     if(vector[i]==numero){ 
        //         encontrado=i;
        //         salida=true;
        //     }
        //     i++;
        // }
        // for(int i=0;i<vector.length && !salida;i++){
        //     if(vector[i]==numero){ 
        //         encontrado=i;
        //         salida=true;
        //     }
        // }
        for(int i=0;i<vector.length;i++){
            if(vector[i]==numero){ 
                encontrado=i;
                break;
            }
        }
        return encontrado;
    }

    //Función para multiplicar por 2 cada valor en la posición del vector
    public static int[] multiplica2(int[] vector){
        int[] salida={0,0,0,0};
        for(int i=0;i<vector.length;i++){
            salida[i]=2*vector[i];
        }
        return salida;
    }
    //¡OJO! con esto si se hace sobre el vector como parámetro!!!
    public static void multiplica2bis(int[] vector){
        
        for(int i=0;i<vector.length;i++){
            vector[i]=3*vector[i];
        }
    }
    //Explicación de lo que pasa cuando se pasa un vector frente a un parámetro "normal"
    public static void mutliplica3(int valor){
        valor=3*valor;
    }

    public static int[] copiaVector(int[] vector){
        int[] copia={0,0,0,0,0};
        for(int i=0;i<vector.length;i++){
            copia[i]=vector[i];
        }
        return copia;
    }
}