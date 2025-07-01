import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioCambio {
    private static final String API_KEY = "cb05551159bdf6d449d35953";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasaCambio(String monedaOrigen, String monedaDestino){
        String url = BASE_URL + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                String body = response.body();
                if (body == null || body.isEmpty()) {
                    System.out.println("La respuesta de la API está vacía.");
                    return -1;
                }

                Gson gson = new Gson();

                RespuestaCambio datos = gson.fromJson(body, RespuestaCambio.class);

                if ("success".equals(datos.getResult())) {
                    return datos.getConversion_rate();
                } else {
                    System.out.println("Error en la respuesta de la API. Mensaje recibido: " + body);
                }
            } else {
                System.out.println("Error HTTP: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e){
            System.out.println("Excepción al hacer la solicitud: " + e.getMessage());
        }
        return -1;
    }
}
