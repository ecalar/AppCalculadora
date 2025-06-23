import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        while (true) {
            System.out.println("**** App Calculadora ****");
            Scanner consola = new Scanner(System.in);
            //Mostrar menu
            mostrarMenu();


            try {
                var operacion = Integer.parseInt(consola.nextLine());

                //Revisar que este dentro de las opciones.
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutar operacion deseada.
                    ejecutarOperacion(operacion , consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion Erronea: " + operacion);
                }
                //Imprimir salto de linea antes de repetir ciclo
                System.out.println(".............................");

            }//fin try
            catch (Exception e){
                System.out.println("Ocurrio un Error: " + e.getMessage());
            }
        }//fin while
    }//fin main

    private static void mostrarMenu(){
        //menu.
        System.out.println("1.Suma. \n2.Resta. \n3.Multiplicacion. \n4.Division. \n5.Salir.");
        System.out.println("Operacion a realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Ingresa el primer valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Ingresa el segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {//Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {//Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> {//Division
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion Erronea: " + operacion);

        }

    }
}//fin class