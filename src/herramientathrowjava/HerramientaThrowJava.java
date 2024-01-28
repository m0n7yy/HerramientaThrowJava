package herramientathrowjava;

import java.util.Scanner;

/**
 *
 * @author Edgar Sebastian Montalvo Duran
 */
class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("No se permiten numeros negativos");
    }
}

class Calculadora{
    public int dividir(int dividendo,int divisor) throws NumeroNegativoException{
        if(divisor<0){
            throw new NumeroNegativoException();
        }
        return dividendo / divisor;
    }
}

public class HerramientaThrowJava {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner s= new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = s.nextInt();
        System.out.print("Numero 2: ");
        int n2 = s.nextInt();
        try{
            int resultado = calculadora.dividir(n1,n2);
            System.out.println("El resultado de la division es: " + resultado);
        } catch (NumeroNegativoException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
