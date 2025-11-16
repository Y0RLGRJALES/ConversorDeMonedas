# ConversorDeMonedas
Conversor de monedas en Java usando API y Gson
Proyecto Java que permite consultar tasas de cambio entre monedas latinoamericanas utilizando la API de ExchangeRate. Incluye entrada por consola, filtrado de monedas específicas, cálculo de conversiones y visualización de tasas desde una moneda base.

📌 Características
•	Consulta de conversión entre dos monedas seleccionadas
•	Cálculo del monto convertido (ej. 100 USD → COP)
•	Visualización de tasas hacia monedas específicas
•	Menú interactivo por consola
•	Bucle de múltiples consultas con opción de salida
•	Integración con la API ExchangeRate-API

🛠️ Tecnologías utilizadas
•	Java 17
•	IntelliJ IDEA
•	Gson 2.13.2
•	API HTTP con HttpClient y HttpRequest
•	Deserialización JSON con Gson y JsonObject

📂 Estructura del proyecto ConversorDeMonedas/ ├── lib/ │ └── gson-2.13.2.jar └── src/ └── com/ └── yorlandi/ └── conversor/ ├── Main.java ├── CurrencyService.java └── ConversionResult.java
🧪 Monedas disponibles
1 COP - Peso colombiano 
2 USD - Dólar estadounidense 
3 ARS - Peso argentino 
4 CLP - Peso chileno 
5 BRL - Real brasileño 
6 BOB - Boliviano boliviano

🚀 Cómo ejecutar
•	Clona el repositorio o copia los archivos en IntelliJ
•	Asegúrate de tener Java 17 instalado
•	Agrega gson-2.13.2.jar como dependencia en IntelliJ (lib → Project Structure → Dependencies)
•	Ejecuta Main.java
•	Sigue las instrucciones en consola para seleccionar monedas y monto

📌 Sección recomendada: Demostración
Adjunto capturas de la ejecucion y funcionamiento del conversor de monedas
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/1%20inicio.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/2%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/3%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/4%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/6%20inicio%20y%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/7%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/8%20consulta.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/9%20exit.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/10%20Excepciones.png
https://github.com/Y0RLGRJALES/ConversorDeMonedas/blob/main/ConversorDeMonedas/img/11%20manejo%20de%20excepciones.png



🔐 Clave de API
Este proyecto utiliza una clave gratuita de ExchangeRate-API. Puedes obtener la tuya en https://www.exchangerate-api.com y reemplazarla en CurrencyService.java: private static final String API_KEY = "TU_API_KEY";

📘 Documentación por fases El proyecto está dividido en fases didácticas:
•	Configuración del entorno
•	Conexión con la API
•	Integración de Gson
•	Uso de HttpClient y HttpRequest
•	Deserialización del JSON
•	Filtrado de monedas
•	Entrada por consola y cálculo
•	Bucle de consultas y salida

🧠 Aprendizajes clave
•	Cómo consumir una API REST en Java
•	Cómo deserializar JSON con Gson
•	Cómo estructurar un proyecto backend didáctico
•	Cómo documentar y visualizar el flujo completo de una aplicación


