package Traductor;

import java.awt.image.BufferedImage;

/**
 * La clase Traductor proporciona métodos para traducir texto entre Braille y
 * texto normal, así como para generar y manipular imágenes de texto traducido.
 */
public class Traductor {
    private final DiccionarioBrailleEspanol diccionarioBrailleEsp;
    private final DiccionarioEspanolBraille diccionarioEspBraille;

    /**
     * Constructor de la clase Traductor. Inicializa el diccionario y la
     * instancia de impresión.
     */
    public Traductor() {
        diccionarioBrailleEsp = new DiccionarioBrailleEspanol();
        diccionarioEspBraille = new DiccionarioEspanolBraille();
    }

    /**
     * Traduce un texto entre español y Braille, o viceversa.
     *
     * @param textoATraducir El texto que se desea traducir.
     * @param indiceIdioma El índice que indica el idioma de origen: 1 para
     * español a Braille, otro valor para Braille a español.
     * @return El texto traducido.
     */
    public String traducir(String textoATraducir, int indiceIdioma) {
        boolean esEspanol = esIdiomaEspanol(indiceIdioma);
        String resultado;
        
        if (esEspanol) {
            resultado = diccionarioEspBraille.procesarTexto(textoATraducir);
        } else {
            resultado = diccionarioBrailleEsp.procesarTexto(textoATraducir);
        }

        return resultado;
    }

    private boolean esIdiomaEspanol(int indiceIdioma) {
        return indiceIdioma == 1;
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
//        String traduccionBraille = traducir(texto, 1);
        return Impresion.generarImagen(texto);
    }

    /**
     * Genera una imagen en espejo de la imagen proporcionada.
     *
     * @param imagen La imagen original.
     * @return Un objeto BufferedImage que es la imagen en espejo de la
     * original.
     */
    public BufferedImage generarImagenEspejo(BufferedImage imagen) {
        return Impresion.generarImagenEspejo(imagen);
    }

    /**
     * Guarda la imagen proporcionada en un archivo en el sistema de archivos.
     * El usuario seleccionará el directorio donde se guardará la imagen.
     *
     * @param imagen La imagen a guardar.
     * @param nombreBase El nombre base del archivo. Se le añadirá un timestamp
     * para asegurar unicidad.
     */
    public void guardarImagen(BufferedImage imagen, String nombreBase) {
        Impresion.guardarImagen(imagen, nombreBase);
    }

}
