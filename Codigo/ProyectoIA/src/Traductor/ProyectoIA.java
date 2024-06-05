package Traductor;

public class ProyectoIA {

    public static void main(String[] args) {
        // Crear un objeto de la clase Traductor
        Traductor traductor = new Traductor();

        // Traducir un texto a braille y a español
        //String textoTraducidoABraille = traductor.traducirTexto("12");
        String textoTraducidoAEspañol = traductor.traducirTexto("⠍ ⠼⠛⠚⠛⠛ ⠍");

        // Imprimir el texto traducido en braille y en español
        //System.out.println("Texto traducido a braille: " + textoTraducidoABraille);
        System.out.println("\n\nTexto traducido a español: " + textoTraducidoAEspañol);

        
        String texto = "Hola Mundo 123";
        String traducidoABraille = traductor.traducirTexto(texto);
        System.out.println(traducidoABraille);
        // Crear un objeto de la clase Impresión
        //Impresión impresion = new Impresión();
        // Imprimir el texto traducido tanto en la consola como en una imagen
        //impresion.imprimirTexto(textoTraducidoABraille);
        //impresion.imprimirTexto(textoTraducidoABraille);
    }
}
