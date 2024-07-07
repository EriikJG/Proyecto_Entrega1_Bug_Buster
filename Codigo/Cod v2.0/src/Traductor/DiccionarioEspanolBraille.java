/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alejo
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

    @Override
    public void traducir(String palabra, StringBuilder resultado) {
        boolean enModoNumero = false;
        boolean enModoSimbolo = false;

        for (int i = 0; i < palabra.length(); i++) {
            char caracterActual = palabra.charAt(i);

            if (caracteresSimbolosEspBraile.containsKey(caracterActual)) {
                enModoSimbolo = true;
            }

            if (Character.isDigit(caracterActual)) {
                if (!enModoNumero) {
                    resultado.append(CARACTER_NUMERO);
                    enModoNumero = true;
                }

                resultado.append(caracteresNumerosEspBraille.get(caracterActual));
            } else {
                if (enModoNumero && !enModoSimbolo) {
                    resultado.append(CARACTER_LETRA);
                    enModoNumero = false;
                }
                if (Character.isUpperCase(caracterActual)) {
                    resultado.append(CARACTER_MAYUSCULAS);
                    resultado.append(caracteresEspBraille.get(Character.toLowerCase(caracterActual)));
                } else if (enModoSimbolo) {
                    resultado.append(caracteresSimbolosEspBraile.get(caracterActual));
                } else {
                    resultado.append(caracteresEspBraille.get(caracterActual));
                }
                enModoSimbolo = false;
            }
        }
    }

}
