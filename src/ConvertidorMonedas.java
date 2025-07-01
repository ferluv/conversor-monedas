public class ConvertidorMonedas {
    private ServicioCambio servicioCambio;

    public ConvertidorMonedas(){
        this.servicioCambio = new ServicioCambio();
    }

    public double convertir(String monedaOrigen, String monedaDestino, double cantidad){
        double tasa = servicioCambio.obtenerTasaCambio(monedaOrigen, monedaDestino);
        if (tasa > 0){
            return cantidad * tasa;
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
            return -1;
        }
    }
}
