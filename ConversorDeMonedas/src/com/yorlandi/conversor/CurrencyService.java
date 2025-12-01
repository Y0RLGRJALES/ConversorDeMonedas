package com.yorlandi.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {

    private static final String API_KEY = "xxxxxxxxxxxxxxx";

    public String getConversionJson(String base, String target) {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + base + "/" + target;

        //Creaando el HttpClient
        HttpClient client = HttpClient.newHttpClient();

        //Creando la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Enviando la solicitud
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
            return null;
        }
    }
    public String getAllRatesJson(String base) {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
            return null;
        }
    }

}

