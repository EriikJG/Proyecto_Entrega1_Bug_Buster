/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.awt.image.BufferedImage;

/**
 *
 * @author alejo
 */
public class Traductor {

    private Diccionario diccionario;
    private Impresion impresion;

    public Traductor() {
        diccionario = new Diccionario();
        impresion = new Impresion();
    }

    /*
    public String traducirTexto(String textoATraducir) {
        char primerCaracter = '\0';
        String textoTraducido;

        if (!textoATraducir.isEmpty()) {
            primerCaracter = textoATraducir.charAt(0);
        }

        if (esBraille(primerCaracter)) {
            textoTraducido = diccionario.traducirCaracterACaracter(textoATraducir, 0);
        } else {
            textoTraducido = diccionario.traducirCaracterACaracter(textoATraducir, 1);
        }

        return textoTraducido;
    }

    public static boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }*/

    public String traducirTexto(String textoATraducir) {
        if (textoATraducir == null || textoATraducir.isEmpty()) {
            return "";
        }

        char primerCaracter = textoATraducir.charAt(0);
        int indiceIdioma = esBraille(primerCaracter) ? 0 : 1;

        return diccionario.traducirCaracterACaracter(textoATraducir, indiceIdioma);
    }

    public static boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }

    public static BufferedImage generarImagen(String texto) {
        return Impresion.generarImagen(texto);
    }

    public static BufferedImage generarImagenEspejo(BufferedImage imagen) {
        return Impresion.generarImagenEspejo(imagen);
    }

    public static void guardarImagen(BufferedImage imagen, String outputPath) {
        Impresion.guardarImagen(imagen, outputPath);
    }
}
