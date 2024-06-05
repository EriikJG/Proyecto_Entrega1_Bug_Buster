package Traductor;

import java.awt.image.BufferedImage;

public class Traductor {

    private Diccionario diccionario;
    private Impresion impresion;

    public Traductor() {
        diccionario = new Diccionario();
        impresion = new Impresion();
    }

    public String traducirTexto(String textoATraducir) {
        if (textoATraducir == null || textoATraducir.isEmpty()) {
            return "";
        }

        char primerCaracter = textoATraducir.charAt(0);
        int indiceIdioma = esBraille(primerCaracter) ? 0 : 1;

        return diccionario.traducirCaracterACaracter(textoATraducir, indiceIdioma);
    }

    public boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }

    public BufferedImage generarImagen(String texto) {
        String traduccionBraille = traducirTexto(texto);
        return impresion.generarImagen(texto);
    }

    public BufferedImage generarImagenEspejo(BufferedImage imagen) {
        return impresion.generarImagenEspejo(imagen);
    }

    public void guardarImagen(BufferedImage imagen, String nombreBase) {
        impresion.guardarImagen(imagen, nombreBase);
    }
}
