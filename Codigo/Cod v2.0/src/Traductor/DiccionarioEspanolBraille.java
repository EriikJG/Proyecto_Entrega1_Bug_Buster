/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que extiende Diccionario para proporcionar la traducción entre español y Braille.
 * Maneja la visualización de caracteres en español y su conversión a caracteres en Braille.
 */
public class DiccionarioEspanolBraille extends Diccionario {

    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<Character, String> caracteresNumerosEspBraille = new HashMap<>();
    private static final Map<Character, String> caracteresSimbolosEspBraile = new HashMap<>();

    static {
        caracteresEspBraille.put('a', "⠁");
        caracteresEspBraille.put('b', "⠃");
        caracteresEspBraille.put('c', "⠉");
        caracteresEspBraille.put('d', "⠙");
        caracteresEspBraille.put('e', "⠑");
        caracteresEspBraille.put('f', "⠋");
        caracteresEspBraille.put('g', "⠛");
        caracteresEspBraille.put('h', "⠓");
        caracteresEspBraille.put('i', "⠊");
        caracteresEspBraille.put('j', "⠚");
        caracteresEspBraille.put('k', "⠅");
        caracteresEspBraille.put('l', "⠇");
        caracteresEspBraille.put('m', "⠍");
        caracteresEspBraille.put('n', "⠝");
        caracteresEspBraille.put('ñ', "⠻");
        caracteresEspBraille.put('o', "⠕");
        caracteresEspBraille.put('p', "⠏");
        caracteresEspBraille.put('q', "⠟");
        caracteresEspBraille.put('r', "⠗");
        caracteresEspBraille.put('s', "⠎");
        caracteresEspBraille.put('t', "⠞");
        caracteresEspBraille.put('u', "⠥");
        caracteresEspBraille.put('v', "⠧");
        caracteresEspBraille.put('w', "⠺");
        caracteresEspBraille.put('x', "⠭");
        caracteresEspBraille.put('y', "⠽");
        caracteresEspBraille.put('z', "⠵");

        caracteresNumerosEspBraille.put('1', "⠁");
        caracteresNumerosEspBraille.put('2', "⠃");
        caracteresNumerosEspBraille.put('3', "⠉");
        caracteresNumerosEspBraille.put('4', "⠙");
        caracteresNumerosEspBraille.put('5', "⠑");
        caracteresNumerosEspBraille.put('6', "⠋");
        caracteresNumerosEspBraille.put('7', "⠛");
        caracteresNumerosEspBraille.put('8', "⠓");
        caracteresNumerosEspBraille.put('9', "⠊");
        caracteresNumerosEspBraille.put('0', "⠚");

        caracteresSimbolosEspBraile.put('.', CARACTER_SIMBOLO + "⠄");
        caracteresSimbolosEspBraile.put(',', CARACTER_SIMBOLO + "⠂");
        caracteresSimbolosEspBraile.put(';', CARACTER_SIMBOLO + "⠆");
        caracteresSimbolosEspBraile.put(':', CARACTER_SIMBOLO + "⠒");
        caracteresSimbolosEspBraile.put('_', CARACTER_SIMBOLO + "⠤");
        caracteresSimbolosEspBraile.put('¡', CARACTER_SIMBOLO + "⠖");
        caracteresSimbolosEspBraile.put('!', CARACTER_SIMBOLO + "⠖");
        caracteresSimbolosEspBraile.put('¿', CARACTER_SIMBOLO + "⠢");
        caracteresSimbolosEspBraile.put('?', CARACTER_SIMBOLO + "⠢");
        caracteresSimbolosEspBraile.put('(', CARACTER_SIMBOLO + "⠣");
        caracteresSimbolosEspBraile.put(')', CARACTER_SIMBOLO + "⠜");
        caracteresSimbolosEspBraile.put('x', CARACTER_SIMBOLO + "⠦");
        caracteresSimbolosEspBraile.put('=', CARACTER_SIMBOLO + "⠶");
        caracteresSimbolosEspBraile.put('/', CARACTER_SIMBOLO + "⠌");
        caracteresSimbolosEspBraile.put('-', CARACTER_SIMBOLO + "⠤");
        caracteresSimbolosEspBraile.put('÷', CARACTER_SIMBOLO + "⠲");
        caracteresSimbolosEspBraile.put('+', CARACTER_SIMBOLO + "⠐");

        caracteresEspBraille.put('á', "⠷");
        caracteresEspBraille.put('é', "⠿");
        caracteresEspBraille.put('í', "⠌");
        caracteresEspBraille.put('ó', "⠾");
        caracteresEspBraille.put('ú', "⠞");
        caracteresEspBraille.put('ü', "⠳");
        caracteresEspBraille.put('@', "⠈");

        caracteresEspBraille.put('A', CARACTER_MAYUSCULAS + "⠁");
        caracteresEspBraille.put('B', CARACTER_MAYUSCULAS + "⠃");
        caracteresEspBraille.put('C', CARACTER_MAYUSCULAS + "⠉");
        caracteresEspBraille.put('D', CARACTER_MAYUSCULAS + "⠙");
        caracteresEspBraille.put('E', CARACTER_MAYUSCULAS + "⠑");
        caracteresEspBraille.put('F', CARACTER_MAYUSCULAS + "⠋");
        caracteresEspBraille.put('G', CARACTER_MAYUSCULAS + "⠛");
        caracteresEspBraille.put('H', CARACTER_MAYUSCULAS + "⠓");
        caracteresEspBraille.put('I', CARACTER_MAYUSCULAS + "⠊");
        caracteresEspBraille.put('J', CARACTER_MAYUSCULAS + "⠚");
        caracteresEspBraille.put('K', CARACTER_MAYUSCULAS + "⠅");
        caracteresEspBraille.put('L', CARACTER_MAYUSCULAS + "⠇");
        caracteresEspBraille.put('M', CARACTER_MAYUSCULAS + "⠍");
        caracteresEspBraille.put('N', CARACTER_MAYUSCULAS + "⠝");
        caracteresEspBraille.put('Ñ', CARACTER_MAYUSCULAS + "⠻");
        caracteresEspBraille.put('O', CARACTER_MAYUSCULAS + "⠕");
        caracteresEspBraille.put('P', CARACTER_MAYUSCULAS + "⠏");
        caracteresEspBraille.put('Q', CARACTER_MAYUSCULAS + "⠟");
        caracteresEspBraille.put('R', CARACTER_MAYUSCULAS + "⠗");
        caracteresEspBraille.put('S', CARACTER_MAYUSCULAS + "⠎");
        caracteresEspBraille.put('T', CARACTER_MAYUSCULAS + "⠞");
        caracteresEspBraille.put('U', CARACTER_MAYUSCULAS + "⠥");
        caracteresEspBraille.put('V', CARACTER_MAYUSCULAS + "⠧");
        caracteresEspBraille.put('W', CARACTER_MAYUSCULAS + "⠺");
        caracteresEspBraille.put('X', CARACTER_MAYUSCULAS + "⠭");
        caracteresEspBraille.put('Y', CARACTER_MAYUSCULAS + "⠽");
        caracteresEspBraille.put('Z', CARACTER_MAYUSCULAS + "⠵");
    }
    /**
     * Traduce una palabra a Braille español y la agrega al StringBuilder proporcionado.
     *
     * @param palabra   La palabra a traducir.
     * @param resultado El StringBuilder donde se agregará la traducción en Braille.
     */
    @Override
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
     * @param resultado      El StringBuilder donde se agrega la traducción.
     */
    private void agregarSimbolo(char caracterActual, StringBuilder resultado) {
        resultado.append(caracteresSimbolosEspBraile.get(caracterActual));
    }

    /**
     * Agrega el número en Braille español correspondiente al StringBuilder.
     *
     * @param caracterActual El caracter actual a traducir (debe ser un dígito).
     * @param resultado      El StringBuilder donde se agrega la traducción.
     * @param enModoNumero   Indica si ya estamos en modo número.
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
     * @param resultado      El StringBuilder donde se agrega la traducción.
     * @param enModoNumero   Indica si estamos en modo número.
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
