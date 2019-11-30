import javax.swing.*;
/**
 * Esta clase define si un número dado por el usuario es positivo,negativo o cero
 * @author: Parada Martinez Erwin Eli
 * @version: 29/11/2019
 */
public class Signo{  
    /**
     * Método que define si un numero en positivo,negativo o cero
     * @param n n sera el numero a verificar
     */
    public static void negativo(double n){
        if(n>0){ /** inicio de if que conprueba si es positivo*/
            System.out.println("positivo");/**impresion de ser positivo*/
        }else if(n==0){ /** else que conprueba si es cero*/
            System.out.println("cero");/**impresion de ser cero*/
        }else{ /** else que conprueba si es negativo*/
            System.out.println("negativo");/**impresion de ser negativo*/
        } /**fin del if-else*/
    }//cierre del método
    /**
     * Método que pide desde el teclado un numero y si es valido lo permite
     * @return El número ingresado por el usuario
     * @throw NumberFormatException
     */
    public static double leerdobles(){
        boolean interruptor=true; /**una variable para la verificación   */
        double a=0.0; /**variable en la que se guarda el número dado por el usuario*/
        do{ /**inicio del do while */
            try{ /** inicio del try-catch*/
                a=Double.parseDouble(JOptionPane.showInputDialog("dame solo numeros flotantes"));/** pedido al usuario*/
                interruptor=false;
                
            }catch(NumberFormatException miException){/** catch de la excepción Numebr Format*/
                interruptor=true;
                System.out.println("nmms wey ponle un numero"); /**aviso al usuario de que no es un entero*/
            }/** fin del try catch*/
        }while(interruptor==true);/**fin del do while*/
        return a;
    }//cierre de método
    /**
     * Método main para probar los demas métodos de la clase
     * @param Array String de argumentos
     */
    public static void main(String [] args){
        negativo(leerdobles()); /**prueba de los métodos*/
    }//cierre de método
}//cierre de clase
