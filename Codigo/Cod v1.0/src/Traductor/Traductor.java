package Traductor;

import java.awt.image.BufferedImage;
/**
 * La clase Traductor proporciona métodos para traducir texto entre Braille y texto normal,
 * así como para generar y manipular imágenes de texto traducido.
 */
public class Traductor {

    private Diccionario diccionario;
    private Impresion impresion;

    /**
     * Constructor de la clase Traductor.
     * Inicializa el diccionario y la instancia de impresión.
     */
    public Traductor() {
        diccionario = new Diccionario();
        impresion = new Impresion();
    }

    /**
     * Traduce el texto proporcionado entre Braille y texto normal.
     *
     * @param textoATraducir El texto a traducir.
     * @return El texto traducido.
     */
    public String traducirTexto(String textoATraducir) {
        if (textoATraducir == null || textoATraducir.isEmpty()) {
            return "";
        }

        char primerCaracter = textoATraducir.charAt(0);
        int indiceIdioma = esBraille(primerCaracter) ? 0 : 1;

        return diccionario.traducirCaracterACaracter(textoATraducir, indiceIdioma);
    }

    /**
     * Determina si el primer carácter de un texto está en Braille.
     *
     * @param primerCaracter El primer carácter del texto.
     * @return true si el carácter está en Braille, false en caso contrario.
     */
    public boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }
    /**
     * Genera una imagen con el texto traducido proporcionado.
     *
     * @param texto El texto a traducir y generar la imagen.
     * @return Un objeto BufferedImage con el texto traducido.
     */
    public BufferedImage generarImagen(String texto) {
        String traduccionBraille = traducirTexto(texto);
        return impresion.generarImagen(texto);
    }

    /**
     * Genera una imagen en espejo de la imagen proporcionada.
     *
     * @param imagen La imagen original.
     * @return Un objeto BufferedImage que es la imagen en espejo de la original.
     */
    public BufferedImage generarImagenEspejo(BufferedImage imagen) {
        return impresion.generarImagenEspejo(imagen);
    }
    /**
     * Guarda la imagen proporcionada en un archivo en el sistema de archivos.
     * El usuario seleccionará el directorio donde se guardará la imagen.
     *
     * @param imagen     La imagen a guardar.
     * @param nombreBase El nombre base del archivo. Se le añadirá un timestamp para asegurar unicidad.
     */
    public void guardarImagen(BufferedImage imagen, String nombreBase) {
        impresion.guardarImagen(imagen, nombreBase);
    }
}
