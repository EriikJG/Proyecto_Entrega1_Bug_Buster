/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejo
 */
public class Diccionario {

    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();

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
        caracteresEspBraille.put('.', "⠲");
        caracteresEspBraille.put(',', "⠂");
        caracteresEspBraille.put('?', "⠦");
        caracteresEspBraille.put('!', "⠖");
        caracteresEspBraille.put(';', "⠆");
        caracteresEspBraille.put(':', "⠒");
        caracteresEspBraille.put('-', "⠤");
        caracteresEspBraille.put(' ', " ");
    }

    static {
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
    }

    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        StringBuilder textoTraducido = new StringBuilder();

        String[] palabrasATraducir = extraerPalabras(textoATraducir);

        String[] stringsSeparadosCaracterNumero = dividirNumerosDePalabras(palabrasATraducir);

        Pattern pattern = Pattern.compile("\\d");
        /*
        for (int i = 0; i < stringsSeparadosCaracterNumero.length; i++) {
            if (stringsSeparadosCaracterNumero[i].charAt(0) == '⠼') {
                //para números
                String[] numerosBrailleSeparados = separarNumerosBraille(stringsSeparadosCaracterNumero[i]);
                for (int j = 0; j < numerosBrailleSeparados.length; j++) {
                    caracterTraducido += traducirAEspaniol(numerosBrailleSeparados[j]);
                }
            }
        }*/
        
        String caracterTraducido = null;

        for (int i = 0; i < stringsSeparadosCaracterNumero.length; i++) {
            if (idiomaEsEspaniol(indiceIdioma)) {
                caracterTraducido += traducirABraille(stringsSeparadosCaracterNumero[i].charAt(i));
                
            } else {

                String[] numerosBrailleSeparados = null;

                if (stringsSeparadosCaracterNumero[i].charAt(0) == '⠼') {
                    //para números
                    stringsSeparadosCaracterNumero[i] = agregarCaracterNumerico(stringsSeparadosCaracterNumero[i]);

                    numerosBrailleSeparados = separarNumerosBraille(stringsSeparadosCaracterNumero[i]);
                    for (int j = 0; j < numerosBrailleSeparados.length; j++) {
                        
                        caracterTraducido += traducirAEspaniol(numerosBrailleSeparados[j]);
                    }
                } else {
                    for (int j = 0; j < stringsSeparadosCaracterNumero[i].length(); j++) {
                        caracterTraducido += traducirAEspaniol(String.valueOf(stringsSeparadosCaracterNumero[i].charAt(j)));
                        System.out.println("caracter" + caracterTraducido);
                    }
                }

            }
            
            textoTraducido.append(caracterTraducido);
        }
        
        return textoTraducido.toString();
    }

    private String traducirAEspaniol(String caracterPalabra) {
        char caracterTraducidoEspaniol = caracteresBrailleEsp.get(caracterPalabra);
        return String.valueOf(caracterTraducidoEspaniol);
    }

    private String traducirABraille(char caracterPalabra) {
        String caracterTraducidoBraille = caracteresEspBraille.get(caracterPalabra);
        return caracterTraducidoBraille;
    }

    private boolean idiomaEsEspaniol(int indiceIdioma) {
        return indiceIdioma == 1;
    }

    public String[] extraerPalabras(String cadena) {
        // Dividir una oración en palabras basadas en espacios en blanco (" ") y saltos de línea ("\n").
        String[] palabras = cadena.split(" ");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            String[] temp = palabra.split("\n");
            for (String item : temp) {
                resultado.add(item);
            }
        }
        return resultado.toArray(new String[0]);
    }

    private String[] dividirNumerosDePalabras(String[] palabrasATraducir) {
        Pattern pattern = Pattern.compile("\\d+|\\D+");

        // Lista para almacenar todos los substrings encontrados
        List<String> substrings = new ArrayList<>();

        // Iterar sobre el arreglo y dividir las cadenas en partes numéricas y no numéricas
        for (String palabraATraducir : palabrasATraducir) {
            Matcher matcher = pattern.matcher(palabraATraducir);

            while (matcher.find()) {
                String fragmento = matcher.group();
                substrings.add(fragmento);
            }
        }

        // Convertir la lista a un arreglo de strings
        String[] resultadoFinal = substrings.toArray(new String[0]);

        return resultadoFinal;
    }

    private String agregarCaracterNumerico(String stringSeparadoCaracterNumero) {
        /*
        StringBuilder sb = new StringBuilder(stringSeparadoCaracterNumero);

        // Insertar el carácter dinámicamente en cada posición válida
        for (int i = 2; i < sb.length(); i += 2) {
            sb.insert(i, "⠏");
        }

        return sb.toString();*/
        StringBuilder result = new StringBuilder();
        char[] charArray = stringSeparadoCaracterNumero.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            result.append(charArray[i]);
            // Insert the 'a' if it's not between index 0 and 1
            if (i != 0) {
                result.append('⠼');
            }
        }
        // Eliminar la última "a" adicional
        result.setLength(result.length() - 1);

        return result.toString();
    }

    private String[] separarNumerosBraille(String stringSeparadoCaracterNumero) {
        // Calcula el número de subcadenas de dos caracteres
        if (stringSeparadoCaracterNumero.length() == 2) {
            String[] result = {stringSeparadoCaracterNumero};
            return result;
        }
        int numPairs = stringSeparadoCaracterNumero.length() / 2;
        String[] result = new String[numPairs];

        // Recorre la cadena y extrae subcadenas de dos caracteres
        for (int i = 0; i < numPairs; i++) {
            result[i] = stringSeparadoCaracterNumero.substring(i * 2, i * 2 + 2);
        }

        return result;
    }
}
