package Matematicas;

public class Varias {

    public static boolean esPrimo(int num) {

        // recibe un numero y busca si tiene algun divisor que no sea mismo o 1
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean esCapicua(int num) {

        int num2 = 0;
        int num3 = num;

        while (num != 0) {
            num2 = num % 10 + num2 * 10;
            num = num / 10;

        }
        return num3 == num2;
    }

    public static int siguientePrimo(int num) {

        num++;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                num++;
                i = 1;
            }
        }

        return num;
    }

    public static int potencia(int base, int exponente) {
        int resultado = base;

        for (int i = 1; i < exponente; i++) {

            resultado = base * resultado;

        }

        return resultado;
    }

    public static int digitos(int num) {
        int cont = 0;
        while (num != 0) {

            num = num / 10;
            cont++;
        }
        return cont;
    }
    
    
    public static int voltea(int num){
        
        int num2=0;
        while (num != 0) {
            num2 = num % 10 + num2 * 10;
            num = num / 10;

        }
        return num2;
    }
    
    
    public static int digitoN(int num, int pos){
        double num2;
        int cont=1;
        num2=(double)num;
        
        while (num!=0){
            num2=num2/10;
            num=(int) num2;
            cont=cont*10;
        }

        num=(int)(num2*cont);
       
       return num%10;
    }

}
