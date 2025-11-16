package com.yorlandi.conversor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyService service = new CurrencyService();
        Scanner scanner = new Scanner(System.in);

        String[] codigos = {"COP", "USD", "ARS", "CLP", "BRL", "BOB"};
        String[] nombres = {
                "1 COP - Peso colombiano",
                "2 USD - Dólar estadounidense",
                "3 ARS - Peso argentino",
                "4 CLP - Peso chileno",
                "5 BRL - Real brasileño",
                "6 BOB - Boliviano boliviano"
        };

        System.out.println("*** Bienvenido al Yorlandi Conversor ***");
        System.out.println("*** Conversor de Monedas ***");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nListado de Monedas disponibles:");
            for (String nombre : nombres) {
                System.out.println(nombre);
            }

            System.out.print("\nSeleccione número de moneda base (o 0 para salir): ");
            int baseIndex = scanner.nextInt();
            if (baseIndex == 0) {
                continuar = false;
                break;
            }

            System.out.print("Seleccione número de moneda destino: ");
            int targetIndex = scanner.nextInt();

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();
            System.out.println("El monto ingresado de: ");

            if (baseIndex < 1 || baseIndex > codigos.length || targetIndex < 1 || targetIndex > codigos.length) {
                System.out.println("Selección inválida. Intente nuevamente.");
                continue;
            }

            String base = codigos[baseIndex - 1];
            String target = codigos[targetIndex - 1];

            // Consulta por pares
            String jsonPar = service.getConversionJson(base, target);
            Gson gson = new Gson();
            ConversionResult resultado = gson.fromJson(jsonPar, ConversionResult.class);

            double tasa = resultado.getConversion_rate();
            double convertido = monto * tasa;

            System.out.printf("\n%.2f %s equivale a %.2f %s%n%n",
                    monto, base, convertido, target);

            // Consulta general y filtrado
            System.out.println("=== Tasas de cambio desde " + base + " hacia todas las monedas ===");
            String jsonGeneral = service.getAllRatesJson(base);
            JsonObject objeto = JsonParser.parseString(jsonGeneral).getAsJsonObject();
            JsonObject tasas = objeto.getAsJsonObject("conversion_rates");

            for (String codigo : codigos) {
                if (tasas.has(codigo)) {
                    double valor = tasas.get(codigo).getAsDouble();
                    System.out.printf("1 %s equivale a %.2f %s%n", base, valor, codigo);
                }
            }

            System.out.println("\n¿Desea realizar otra conversión? (s/n): ");
            String respuesta = scanner.next().trim().toLowerCase();
            continuar = respuesta.equals("s");
        }

        System.out.println("\nGracias por usar el Yorlandi conversor. ¡Hasta pronto!");
    }
}