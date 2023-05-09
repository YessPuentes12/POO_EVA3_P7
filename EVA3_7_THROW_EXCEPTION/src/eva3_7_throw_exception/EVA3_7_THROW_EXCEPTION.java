/*

 */
package eva3_7_throw_exception;

import java.util.Scanner;

public class EVA3_7_THROW_EXCEPTION {

    
    public static void main(String[] args) {
       Prueba obj = new Prueba();
       
       try{
        //Checked exception
         Scanner input=new Scanner(System.in); 
         int valor=input.nextInt();
         obj.CapturaMCero(valor);
       } catch(Exception e){
         //exception superclase de las excepciones
         System.out.println(e.getMessage());    
       }
       
       
       //arithmetic exception es unchecked
       obj.division(100, 0);
        
    }
    
}


class Prueba{
    
 public void CapturaMCero(int valor) throws Exception{
    if (valor<=0){ //Se lanza la excepción
       throw new Exception(valor+" es negativo o 0."); 
    }
     System.out.println("Valor: " +valor);
}   
    
 //Unchecked
 
public int division(int x, int y) throws ArithmeticException{
       if (y==0){
         throw new ArithmeticException("Valor a dividir no debe de ser 0.");     
       }
 return x/y;   
} 
 

 
}