import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertidorMonedas convertidor = new ConvertidorMonedas();

        while (true){
            System.out.println("****************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("****************************************");

            int opcion = scanner.nextInt();
            double cantidad;
            double resultado;

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad en Dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("USD", "ARS", cantidad);
                    System.out.println("Resultado: " + resultado + "ARS");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en Pesos Argentinos: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("ARS", "USD", cantidad);
                    System.out.println("Resultado: " + resultado + "USD");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("USD", "BRL", cantidad);
                    System.out.println("Resultado: " + resultado + "BRL");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en Reales: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("BRL", "USD", cantidad);
                    System.out.println("Resultado: " + resultado + "USD");
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("USD", "COP", cantidad);
                    System.out.println("Resultado: " + resultado + "COP");
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en Pesos colombianos: ");
                    cantidad = scanner.nextDouble();
                    resultado = convertidor.convertir("COP", "USD", cantidad);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        }
    }
}
