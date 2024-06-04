package Traductor;

public class ProyectoIA {

    public static void main(String[] args) {
        // Crear un objeto de la clase Traductor
        Traductor traductor = new Traductor();

        // Traducir un texto a braille y a español
        String textoTraducidoABraille = traductor.traducirTexto("hola");
        String textoTraducidoAEspañol = traductor.traducirTexto("⠏⠁⠵");

        // Imprimir el texto traducido en braille y en español
        System.out.println("Texto traducido a braille: " + textoTraducidoABraille);
        System.out.println("Texto traducido a español: " + textoTraducidoAEspañol);

        // Crear un objeto de la clase Impresión
        //Impresión impresion = new Impresión();

        // Imprimir el texto traducido tanto en la consola como en una imagen
        //impresion.imprimirTexto(textoTraducidoABraille);
        //impresion.imprimirTexto(textoTraducidoABraille);
        
    }
}
