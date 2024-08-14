/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que extiende Diccionario para proporcionar la traducción entre español
 * y Braille. Maneja la visualización de caracteres en español y su conversión a
 * caracteres en Braille.
 */
public class DiccionarioEspanolBraille extends Diccionario {

    /**
     * Traduce una palabra a Braille español y la agrega al StringBuilder
     * proporcionado.
     *
     * @param palabra La palabra a traducir.
     * @param resultado El StringBuilder donde se agregará la traducción en
     * Braille.
     */
    public void traducir(String palabra, StringBuilder resultado) {
        boolean enModoNumero = false; // Indica si estamos traduciendo números
        // Recorremos cada caracter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char caracterActual = palabra.charAt(i);

            // Si el caracter es un símbolo en Braille español
            if (caracteresSimbolosEspBraile.containsKey(caracterActual)) {
                agregarSimbolo(caracterActual, resultado); // Agregamos el símbolo correspondiente
            } else if (Character.isDigit(caracterActual)) {
                agregarNumero(caracterActual, resultado, enModoNumero); // Agregamos el número correspondiente
                enModoNumero = true; // Entramos en modo número
            } else {
                agregarCaracter(caracterActual, resultado, enModoNumero); // Agregamos el caracter correspondiente
                enModoNumero = false; // Salimos del modo número
            }
        }
    }

    /**
     * Agrega el símbolo en Braille español correspondiente al StringBuilder.
     *
     * @param caracterActual El caracter actual a traducir.
     * @param resultado El StringBuilder donde se agrega la traducción.
     */
    private void agregarSimbolo(char caracterActual, StringBuilder resultado) {
        resultado.append(caracteresSimbolosEspBraile.get(caracterActual));
    }

    /**
     * Agrega el número en Braille español correspondiente al StringBuilder.
     *
     * @param caracterActual El caracter actual a traducir (debe ser un dígito).
     * @param resultado El StringBuilder donde se agrega la traducción.
     * @param enModoNumero Indica si ya estamos en modo número.
     */
    private void agregarNumero(char caracterActual, StringBuilder resultado, boolean enModoNumero) {
        // Si no estamos en modo número, agregamos el indicador de número
        if (!enModoNumero) {
            resultado.append(CARACTER_NUMERO);
        }
        // Agregamos el número en Braille correspondiente
        resultado.append(caracteresNumerosEspBraille.get(caracterActual));
    }

    /**
     * Agrega el caracter en Braille español correspondiente al StringBuilder.
     *
     * @param caracterActual El caracter actual a traducir.
     * @param resultado El StringBuilder donde se agrega la traducción.
     * @param enModoNumero Indica si estamos en modo número.
     */
    private void agregarCaracter(char caracterActual, StringBuilder resultado, boolean enModoNumero) {
        // Si estábamos en modo número y no es un símbolo, agregamos el indicador de letra
        if (enModoNumero) {
            resultado.append(CARACTER_LETRA);
        }
        // Si el caracter es mayúscula, agregamos el indicador de mayúscula antes del caracter en Braille correspondiente
        if (Character.isUpperCase(caracterActual)) {
            resultado.append(CARACTER_MAYUSCULAS);
            resultado.append(caracteresEspBraille.get(Character.toLowerCase(caracterActual)));
        } else {
            // Agregamos el caracter en Braille correspondiente
            resultado.append(caracteresEspBraille.get(caracterActual));
        }
    }

}
