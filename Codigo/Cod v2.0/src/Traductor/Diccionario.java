package Traductor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * La clase Diccionario proporciona métodos para traducir texto entre español y
 * Braille. También maneja la visualización de caracteres en Braille y la
 * conversión entre caracteres en español y Braille.
 */
public class Diccionario {

    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();
    private static final Map<String, Character> caracteresNumerosBrailleEsp = new HashMap<>();
    private static final Map<Character, String> caracteresNumerosEspBraille = new HashMap<>();

    private static final String CARACTER_NUMERO = "⠼";
    private static final String CARACTER_SIMBOLO = "⠸";
    private static final String CARACTER_MAYUSCULAS = "⠨";
    private static final String CARACTER_LETRA = "⠰";

    static {
        // Mapeo de caracteres en español a Braille
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

        caracteresEspBraille.put(',', "⠂");
        caracteresEspBraille.put('?', "⠦");
        caracteresEspBraille.put('!', "⠖");
        caracteresEspBraille.put(';', "⠆");
        caracteresEspBraille.put(':', "⠒");
        caracteresEspBraille.put('-', "⠤");
        caracteresEspBraille.put(' ', " ");

        caracteresEspBraille.put('á', "⠷");
        caracteresEspBraille.put('é', "⠿");
        caracteresEspBraille.put('í', "⠌");
        caracteresEspBraille.put('ó', "⠾");
        caracteresEspBraille.put('ú', "⠜");
        caracteresEspBraille.put('ü', "⠳");
        caracteresEspBraille.put('@', "⠈");

        // Mapeo de caracteres en mayúsculas en español a Braille
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

        // Mapeo de caracteres en Braille a español
        caracteresBrailleEsp.put("⠁", 'a');
        caracteresBrailleEsp.put("⠃", 'b');
        caracteresBrailleEsp.put("⠉", 'c');
        caracteresBrailleEsp.put("⠙", 'd');
        caracteresBrailleEsp.put("⠑", 'e');
        caracteresBrailleEsp.put("⠋", 'f');
        caracteresBrailleEsp.put("⠛", 'g');
        caracteresBrailleEsp.put("⠓", 'h');
        caracteresBrailleEsp.put("⠊", 'i');
        caracteresBrailleEsp.put("⠚", 'j');
        caracteresBrailleEsp.put("⠅", 'k');
        caracteresBrailleEsp.put("⠇", 'l');
        caracteresBrailleEsp.put("⠍", 'm');
        caracteresBrailleEsp.put("⠝", 'n');
        caracteresBrailleEsp.put("⠻", 'ñ');
        caracteresBrailleEsp.put("⠕", 'o');
        caracteresBrailleEsp.put("⠏", 'p');
        caracteresBrailleEsp.put("⠟", 'q');
        caracteresBrailleEsp.put("⠗", 'r');
        caracteresBrailleEsp.put("⠎", 's');
        caracteresBrailleEsp.put("⠞", 't');
        caracteresBrailleEsp.put("⠥", 'u');
        caracteresBrailleEsp.put("⠧", 'v');
        caracteresBrailleEsp.put("⠺", 'w');
        caracteresBrailleEsp.put("⠭", 'x');
        caracteresBrailleEsp.put("⠽", 'y');
        caracteresBrailleEsp.put("⠵", 'z');

        caracteresNumerosBrailleEsp.put("⠁", '1');
        caracteresNumerosBrailleEsp.put("⠃", '2');
        caracteresNumerosBrailleEsp.put("⠉", '3');
        caracteresNumerosBrailleEsp.put("⠙", '4');
        caracteresNumerosBrailleEsp.put("⠑", '5');
        caracteresNumerosBrailleEsp.put("⠋", '6');
        caracteresNumerosBrailleEsp.put("⠛", '7');
        caracteresNumerosBrailleEsp.put("⠓", '8');
        caracteresNumerosBrailleEsp.put("⠊", '9');
        caracteresNumerosBrailleEsp.put("⠚", '0');

        caracteresBrailleEsp.put("⠲", '.');
        caracteresBrailleEsp.put("⠂", ',');
        caracteresBrailleEsp.put("⠦", '¿');
        caracteresBrailleEsp.put("⠖", '!');
        caracteresBrailleEsp.put("⠆", ';');
        caracteresBrailleEsp.put("⠒", ':');
        caracteresBrailleEsp.put("⠤", '-');
        caracteresBrailleEsp.put(" ", ' ');

        caracteresBrailleEsp.put("⠷", 'á');
        caracteresBrailleEsp.put("⠿", 'é');
        caracteresBrailleEsp.put("⠌", 'í');
        caracteresBrailleEsp.put("⠾", 'ó');
        caracteresBrailleEsp.put("⠜", 'ú');
        caracteresBrailleEsp.put("⠳", 'ü');
        caracteresBrailleEsp.put("⠈", '@');

        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠁", 'A');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠃", 'B');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠉", 'C');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠙", 'D');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠑", 'E');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠋", 'F');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠛", 'G');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠓", 'H');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠊", 'I');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠚", 'J');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠅", 'K');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠇", 'L');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠍", 'M');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠝", 'N');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠻", 'Ñ');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠕", 'O');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠏", 'P');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠟", 'Q');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠗", 'R');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠎", 'S');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠞", 'T');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠥", 'U');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠧", 'V');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠺", 'W');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠭", 'X');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠽", 'Y');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠵", 'Z');
    }

    /**
     * Traduce un texto entre español y Braille, o viceversa.
     *
     * @param textoATraducir El texto que se desea traducir.
     * @param indiceIdioma El índice que indica el idioma de origen: 1 para
     * español a Braille, otro valor para Braille a español.
     * @return El texto traducido.
     */
    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        boolean esEspanol = esIdiomaEspanol(indiceIdioma);
        String[] lineas = dividirPorLineas(textoATraducir);

        return traducirLineas(lineas, esEspanol);
    } 

    private String[] dividirPorLineas(String texto) {
        return texto.split("\n");
    }

    private boolean esIdiomaEspanol(int indiceIdioma) {
        return indiceIdioma == 1;
    }

    private String traducirLineas(String[] lineas, boolean esEspanol) {
        StringBuilder resultado = new StringBuilder();

        for (String linea : lineas) {
            String[] palabras = extraerPalabras(linea);
            resultado.append(traducirPalabras(palabras, esEspanol));
            limpiarUltimoEspacio(resultado);
            resultado.append("\n");
        }

        limpiarUltimoSaltoDeLinea(resultado);

        return resultado.toString();
    }

    private void limpiarUltimoEspacio(StringBuilder resultado) {
        if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == ' ') {
            resultado.setLength(resultado.length() - 1);
        }
    }

    private void limpiarUltimoSaltoDeLinea(StringBuilder resultado) {
        if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == '\n') {
            resultado.setLength(resultado.length() - 1);
        }
    }

    /*
    MUESTRA PEQUEÑA PARA PREGUNTAR A CHATGPT
    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();

    private static final String CARACTER_NUMERO = "⠼";
    private static final String CARACTER_SIMBOLO = "⠸";
    private static final String CARACTER_LETRA = "⠰";
    private static final String CARACTER_MAYUSCULA = "⠨";

static {
        // Mapeo de caracteres en español a Braille
        caracteresEspBraille.put('a', "⠁");
        caracteresEspBraille.put('0', "⠚");
        caracteresEspBraille.put('A', CARACTER_MAYUSCULAS + "⠁");
        caracteresEspBraille.put('!', "⠖");

        // Mapeo de caracteres en español a Braille
        caracteresBrailleEsp.put("⠁", 'a');
        caracteresBrailleEsp.put("⠚", '0');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠁", 'A');
        caracteresBrailleEsp.put("⠖", '!');
    }*/
    private StringBuilder traducirPalabras(String[] palabras, boolean esEspanol) {
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {

            StringBuilder palabraTraducida = traducirPalabra(palabra, esEspanol);
            resultado.append(palabraTraducida);

            resultado.append(" ");
        }

        limpiarUltimoEspacio(resultado);

        return resultado;
    }

    private StringBuilder traducirPalabra(String palabra, boolean esEspanol) {
        StringBuilder palabraTraducida = new StringBuilder();

        if (esEspanol) {
            traducirEspanolABraille(palabra, palabraTraducida);
        } else {
            traducirBrailleAEspanol(palabra, palabraTraducida);
        }

        return palabraTraducida;
    }

    private void traducirBrailleAEspanol(String palabra, StringBuilder resultado) {
        //Traducción a español
        boolean esNumero = false;
        boolean esMayuscula = false;

        for (int i = 0; i < palabra.length(); i++) {
            String simboloActual = Character.toString(palabra.charAt(i));

            if (simboloActual.equals(CARACTER_NUMERO)) {
                esNumero = true;
                continue;
            } else if (simboloActual.equals(CARACTER_LETRA)) {
                esNumero = false;
                continue;
            } else if (simboloActual.equals(CARACTER_MAYUSCULAS)) {
                esMayuscula = true;
                continue;
            }

            if (esNumero) {
                // En modo número, interpretamos los símbolos como números
                resultado.append(caracteresNumerosBrailleEsp.get(simboloActual));
            } else {
                char caracter = caracteresBrailleEsp.get(simboloActual);
                if (esMayuscula) {
                    caracter = Character.toUpperCase(caracter);
                    esMayuscula = false;
                }
                resultado.append(caracter);
            }
        }

    }

    private void traducirEspanolABraille(String palabra, StringBuilder resultado) {
        boolean enModoNumero = false;

        for (int i = 0; i < palabra.length(); i++) {
            char caracterActual = palabra.charAt(i);

            if (Character.isDigit(caracterActual)) {
                if (!enModoNumero) {
                    resultado.append(CARACTER_NUMERO);
                    enModoNumero = true;
                }
                resultado.append(caracteresNumerosEspBraille.get(caracterActual));
            } else {
                if (enModoNumero) {
                    resultado.append(CARACTER_LETRA);
                    enModoNumero = false;
                }
                if (Character.isUpperCase(caracterActual)) {
                    resultado.append(CARACTER_MAYUSCULAS);
                    resultado.append(caracteresEspBraille.get(Character.toLowerCase(caracterActual)));
                } else {
                    resultado.append(caracteresEspBraille.get(caracterActual));
                }
            }
        }
    }

    private String[] extraerPalabras(String cadena) {
        return cadena.split("\\s+");
    }

    /**
     * Verifica si una cadena contiene números.
     *
     * @param str La cadena a verificar.
     * @return true si la cadena contiene números, de lo contrario false.
     */
    /**
     * Obtiene el carácter correspondiente en español para un carácter Braille
     * dado.
     *
     * @param caracterPalabra El carácter Braille.
     * @return El carácter correspondiente en español.
     */
    /**
     * Obtiene el carácter correspondiente en Braille para un carácter en
     * español dado.
     *
     * @param caracterPalabra El carácter en español.
     * @return El carácter correspondiente en Braille.
     */
    /**
     * Extrae las palabras de una cadena dada.
     *
     * @param cadena La cadena de entrada.
     * @return Un arreglo de palabras.
     */
    /**
     * Divide una cadena en subcadenas de números y palabras.
     *
     * @param palabrasATraducir Las palabras a traducir.
     * @return Un arreglo de subcadenas divididas.
     */
    /**
     * Agrega el carácter numérico a una cadena de caracteres y números.
     *
     * @param stringSeparadoCaracterNumero La cadena separada.
     * @return La cadena con el carácter numérico agregado.
     */
    /**
     * Separa una cadena de caracteres Braille en números Braille.
     *
     * @param stringSeparadoCaracterNumero La cadena separada.
     * @return Un arreglo de números Braille.
     */
}
