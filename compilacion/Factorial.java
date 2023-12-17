
import java.util.Scanner;
public  class Factorial{
static class lector{
        static Scanner sc = new Scanner(System.in); 
        public static int leer(String texto, int variable) {
System.out.println(texto);
 return sc.nextInt();
}
        public static String leer(String texto, String variable) {
 System.out.println(texto);
 return sc.next();
 }
        public static Double leer(String texto, Double variable) {
 System.out.println(texto);
 return sc.nextDouble();
 }
    }
public static void main(String[] args) { 
Integer numero,factorial,contador,aux;
  
numero=0;
factorial=0;
contador=0;
aux=0;

System.out.println("Progama que calcula el factorial de un numero"); 
numero=5;

if(numero<0){

System.out.println("No se puede calcular el factorial de un numero negativo"); 

} 

if(numero==0){

System.out.println("El factorial de 0 es 1"); 

} 

if(numero>0){
factorial=1;
contador=1;
aux=numero+1;

while( contador<aux){
factorial=factorial*contador;
contador=contador+1;

 

} 

System.out.println("El factorial de "+numero+" es "+factorial); 
}
}
}
