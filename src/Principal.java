import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertidorMonedas convertidor = new ConvertidorMonedas();

        System.out.println("Moneda origen: ");
        String origen = scanner.nextLine().toUpperCase();

        System.out.println("Moneda destino: ");
        String destino = scanner.nextLine().toUpperCase();

        System.out.println("Cantidad: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertidor.convertir(origen, destino, cantidad);

        if (resultado != -1){
            System.out.println("Resultado: " + resultado + "" + destino);
        }
        scanner.close();
    }
}
