public class operaciones {

    public static void main(String[] args){

        //valores
        int num1 = 23;
        int num2 = 18;

        //operaciones
        int suma = num1 + num2; //suma
        int resta = num1 - num2; //resta
        double multiplicacion = num1 * num2; //multiplicación
        double division = num1 / num2; //division
        double modulo = num1 % num2; //modulo

        //coversión de ope a cadenas de texto
        String valor_x = "Valor X: " + String.valueOf(num1);
        String valor_y = "Valor Y: "+ String.valueOf(num2);

        String sumita = "Suma: "+ String.valueOf(suma);
        String resti = "Resta: " + String.valueOf(resta);
        String multi = "Multiplicación: " + String.valueOf(multiplicacion);
        String divi = "División: " + String.valueOf(division);
        String modu = "Módulo: " + String.valueOf(modulo);;


        //Muestra de resultados
        System.out.println(valor_x);
        System.out.println(valor_y);
        System.out.println(sumita);
        System.out.println(resti);
        System.out.println(multi);
        System.out.println(divi);
        System.out.println(modu);
    }
}
