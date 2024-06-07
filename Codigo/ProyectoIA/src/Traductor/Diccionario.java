/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

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
 * La clase Diccionario proporciona métodos para traducir texto entre español y Braille.
 * También maneja la visualización de caracteres en Braille y la conversión entre caracteres en español y Braille.
 */
public class Diccionario {

    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();

    private static final String CARACTER_NUMERO = "⠼";
    private static final String CARACTER_SIMBOLO = "⠸";
    private static final String CARACTER_MAYUSCULAS = "⠨"; // Indicador de mayúscula
    private static final Pattern PATRON_NUMERO_NO_NUMERO = Pattern.compile("\\d+|\\D+");

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
        caracteresEspBraille.put('1', "⠁");
        caracteresEspBraille.put('2', "⠃");
        caracteresEspBraille.put('3', "⠉");
        caracteresEspBraille.put('4', "⠙");
        caracteresEspBraille.put('5', "⠑");
        caracteresEspBraille.put('6', "⠋");
        caracteresEspBraille.put('7', "⠛");
        caracteresEspBraille.put('8', "⠓");
        caracteresEspBraille.put('9', "⠊");
        caracteresEspBraille.put('0', "⠚");


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
    }

    static {
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

        caracteresBrailleEsp.put("⠼⠁", '1');
        caracteresBrailleEsp.put("⠼⠃", '2');
        caracteresBrailleEsp.put("⠼⠉", '3');
        caracteresBrailleEsp.put("⠼⠙", '4');
        caracteresBrailleEsp.put("⠼⠑", '5');
        caracteresBrailleEsp.put("⠼⠋", '6');
        caracteresBrailleEsp.put("⠼⠛", '7');
        caracteresBrailleEsp.put("⠼⠓", '8');
        caracteresBrailleEsp.put("⠼⠊", '9');
        caracteresBrailleEsp.put("⠼⠚", '0');

        caracteresBrailleEsp.put("⠲", '.');
        caracteresBrailleEsp.put("⠂", ',');
        caracteresBrailleEsp.put("⠦", '?');
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
     * @param indiceIdioma   El índice que indica el idioma de origen: 1 para español a Braille, otro valor para Braille a español.
     * @return El texto traducido.
     */
    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        boolean esEspanol = indiceIdioma == 1;
        StringBuilder resultado = new StringBuilder();

        String[] lineas = textoATraducir.split("\n");

        for (String linea : lineas) {
            Arrays.stream(dividirNumerosDePalabras(extraerPalabras(linea)))
                    .forEach(palabra -> {
                        StringBuilder caracterTraducido = new StringBuilder();

                        if (esEspanol) {
                            //Traducción a braille
                            if (contieneNumeros(palabra)) {
                                caracterTraducido.append(CARACTER_NUMERO);
                            }
                            palabra.chars().forEach(c -> {
                                char caracter = (char) c;
                                
                                if (Character.isUpperCase(caracter)) {
                                    caracterTraducido.append(CARACTER_MAYUSCULAS);
                                }
                                caracterTraducido.append(obtenerCaracterEnBraille(Character.toLowerCase(caracter)));
                            });
                        } else {
                            // Traducción a español
                            if (palabra.charAt(0) == CARACTER_NUMERO.charAt(0)) {
                                String[] numerosBrailleSeparados = separarNumerosBraille(agregarCaracterNumerico(palabra));
                                for (String numero : numerosBrailleSeparados) {
                                    caracterTraducido.append(obtenerCaracterEnEspaniol(numero));
                                }
                            } else {
                                // Manejo de mayúsculas en la traducción de braille a español
                                boolean nextIsUppercase = false;
                                
                                for (int i = 0; i < palabra.length(); i++) {
                                    String caracter = String.valueOf(palabra.charAt(i));
                                    if (caracter.equals(CARACTER_MAYUSCULAS)) {
                                        nextIsUppercase = true;
                                    } else if (caracter.equals(CARACTER_SIMBOLO) && i + 1 < palabra.length()) {
                                        // Concatenar símbolo con el siguiente carácter
                                        String simboloYCaracter = caracter + String.valueOf(palabra.charAt(i + 1));
                                        // Verificar si la combinación existe en el mapa
                                        if (caracteresBrailleEsp.containsKey(simboloYCaracter)) {
                                            char traducido = caracteresBrailleEsp.get(simboloYCaracter);
                                            caracterTraducido.append(traducido);
                                            // Saltar el siguiente carácter ya que ha sido manejado como parte de la combinación
                                            i++;
                                        } else {
                                            caracterTraducido.append(caracter);
                                        }
                                    } else {
                                        // Manejo de traducción de caracteres
                                        char traducido = obtenerCaracterEnEspaniol(caracter).charAt(0);
                                        if (nextIsUppercase) {
                                            traducido = Character.toUpperCase(traducido);
                                            nextIsUppercase = false;
                                        }
                                        caracterTraducido.append(traducido);
                                    }
                                }

                            }
                        }

                        resultado.append(caracterTraducido).append(" ");
                    });

            // Eliminar el último espacio en blanco
            if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == ' ') {
                resultado.setLength(resultado.length() - 1);
            }

            resultado.append("\n");
        }

        // Eliminar el último salto de línea
        if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == '\n') {
            resultado.setLength(resultado.length() - 1);
        }

        return resultado.toString();
    }

    /**
     * Verifica si una cadena contiene números.
     *
     * @param str La cadena a verificar.
     * @return true si la cadena contiene números, de lo contrario false.
     */
    private boolean contieneNumeros(String str) {
        return str.matches(".*\\d.*");
    }
    /**
     * Obtiene el carácter correspondiente en español para un carácter Braille dado.
     *
     * @param caracterPalabra El carácter Braille.
     * @return El carácter correspondiente en español.
     */
    private String obtenerCaracterEnEspaniol(String caracterPalabra) {
        return String.valueOf(caracteresBrailleEsp.get(caracterPalabra));
    }
    /**
     * Obtiene el carácter correspondiente en Braille para un carácter en español dado.
     *
     * @param caracterPalabra El carácter en español.
     * @return El carácter correspondiente en Braille.
     */
    private String obtenerCaracterEnBraille(char caracterPalabra) {
        return caracteresEspBraille.getOrDefault(caracterPalabra, String.valueOf(caracterPalabra));
    }
    /**
     * Extrae las palabras de una cadena dada.
     *
     * @param cadena La cadena de entrada.
     * @return Un arreglo de palabras.
     */
    private String[] extraerPalabras(String cadena) {
        return cadena.split("\\s+");
    }
    /**
     * Divide una cadena en subcadenas de números y palabras.
     *
     * @param palabrasATraducir Las palabras a traducir.
     * @return Un arreglo de subcadenas divididas.
     */
    private String[] dividirNumerosDePalabras(String[] palabrasATraducir) {
        List<String> substrings = new ArrayList<>();
        for (String palabra : palabrasATraducir) {
            Matcher matcher = PATRON_NUMERO_NO_NUMERO.matcher(palabra);
            while (matcher.find()) {
                substrings.add(matcher.group());
            }
        }
        return substrings.toArray(new String[0]);
    }
    /**
     * Agrega el carácter numérico a una cadena de caracteres y números.
     *
     * @param stringSeparadoCaracterNumero La cadena separada.
     * @return La cadena con el carácter numérico agregado.
     */
    private String agregarCaracterNumerico(String stringSeparadoCaracterNumero) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringSeparadoCaracterNumero.length(); i++) {
            result.append(stringSeparadoCaracterNumero.charAt(i));
            if (i != 0) {
                result.append(CARACTER_NUMERO);
            }
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
    /**
     * Separa una cadena de caracteres Braille en números Braille.
     *
     * @param stringSeparadoCaracterNumero La cadena separada.
     * @return Un arreglo de números Braille.
     */
    private String[] separarNumerosBraille(String stringSeparadoCaracterNumero) {
        int numPairs = stringSeparadoCaracterNumero.length() / 2;
        String[] result = new String[numPairs];
        for (int i = 0; i < numPairs; i++) {
            result[i] = stringSeparadoCaracterNumero.substring(i * 2, i * 2 + 2);
        }
        return result;
    }
}
