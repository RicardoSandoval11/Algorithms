package Recursion;

public class Main {
    
    public static void main(String[] args) {    
        System.out.println("Result: "+power(2,8)); 
    }

    public static int power(int base, int exponent){

        System.out.println(base+", "+ exponent);

        if(exponent < 1) return 1; // Detiene la recursividad
        return base * power(base, exponent - 1); // llama nuevamente a la funcion
    }

}
