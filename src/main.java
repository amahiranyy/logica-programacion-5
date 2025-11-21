import java.util.*;

public class main {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
        // Utilizar un objeto HashMap para almacenar los pares de palabras.
        HashMap<String, String> diccionario = new HashMap<>();

        // Añadir las 20 palabras al dicionario
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("negro", "black");
        diccionario.put("blanco", "white");
        diccionario.put("cafe", "brown");
        diccionario.put("naranja", "orange");
        diccionario.put("morado", "purple");
        diccionario.put("amarillo", "yellow");
        diccionario.put("rosa", "pink");
        diccionario.put("gris", "gray");
        diccionario.put("dorado", "gold");
        diccionario.put("plateado", "silver");
        diccionario.put("burdeos", "burgundy");
        diccionario.put("cobre", "copper");
        diccionario.put("violeta", "violet");
        diccionario.put("marino", "navy");
        diccionario.put("bronce", "bronze");
        diccionario.put("cian", "cyan");
        diccionario.put("turquesa", "turquoise");


        // Escoger al azar 5 palabras en español del mini diccionario.
        // Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
        System.out.println("Traduce las siguientes palabras a ingles: ");

        // Convertir claves a lista para generar indices y poder acceder a cada registro del diccionario
        List<String> listaDePalabras = new ArrayList<>(diccionario.keySet());

        // Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
        int correctas = 0;
        int incorrectas = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i=1; i<=5; i++){
            // Genera un numero random entre 0 y 19
            int numero = random.nextInt(20);

            // Recuperar la palabra con el index del numero random de la lista de palabras y la imprime
            String palabra = listaDePalabras.get(numero);
            System.out.print(" * "+ i + " . " + palabra + " ->  ");

            // Leer la respuesta del usuario
            String traduccion = scanner.nextLine();

            // Verificar si es correcto o no
            if (traduccion.equalsIgnoreCase(diccionario.get(palabra))){
                correctas++;
                System.out.println("      " + diccionario.get(palabra) + " -> " + palabra + " ✅ +1");
            } else {
                incorrectas++;
                System.out.println("      " + diccionario.get(palabra) + " -> " + palabra + " ❗");
            }
        }
        // Imprimir los resultados
        System.out.println("\n====== Resultados: ======\n * Correctas: " + correctas + "\n * Incorrectas: " + incorrectas);

    }
}
