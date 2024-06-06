/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejo
 */
public class Diccionario 
{

    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();

    private static final String CARACTER_NUMERO = "⠼";
    private static final Pattern PATRON_NUMERO_NO_NUMERO=  Pattern.compile("\\d+|\\D+");
    private static final String CARACTER_MAYUSCULAS = "⠨"; // Indicador de mayúscula

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

        caracteresEspBraille.put('á', "⠷");
        caracteresEspBraille.put('é', "⠿");
        caracteresEspBraille.put('í', "⠽");
        caracteresEspBraille.put('ó', "⠾");
        caracteresEspBraille.put('ú', "⠷");
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
        caracteresBrailleEsp.put("⠽", 'í');
        caracteresBrailleEsp.put("⠾", 'ó');
        caracteresBrailleEsp.put("⠷", 'ú');
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

    /*
    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        ArrayList<String> textoTraducido = new ArrayList<>();

        String[] palabrasATraducir = extraerPalabras(textoATraducir);
        String[] stringsSeparadosCaracterNumero = dividirNumerosDePalabras(palabrasATraducir);

        for (String palabra : stringsSeparadosCaracterNumero) {
            StringBuilder caracterTraducido = new StringBuilder();

            if (idiomaEsEspaniol(indiceIdioma)) {
                if (contieneNumeros(palabra)) {
                    caracterTraducido.append("⠼");
                }
                for (char c : palabra.toCharArray()) {
                    caracterTraducido.append(traducirABraille(c));
                }
            } else {
                if (palabra.charAt(0) == '⠼') {
                    // Traducción de números
                    palabra = agregarCaracterNumerico(palabra);
                    String[] numerosBrailleSeparados = separarNumerosBraille(palabra);
                    for (String numero : numerosBrailleSeparados) {
                        caracterTraducido.append(traducirAEspaniol(numero));
                    }
                } else {
                    // Traducción de letras
                    for (char c : palabra.toCharArray()) {
                        caracterTraducido.append(traducirAEspaniol(String.valueOf(c)));
                    }
                }
            }

            textoTraducido.add(caracterTraducido.toString());
        }

        return concatenarConEspacios(textoTraducido);
    }

    

    public static String concatenarConEspacios(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                sb.append(str).append(" ");
            }
        }

        // Eliminar el último espacio en blanco
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
    
    public static boolean contieneNumeros(String str) {
        return str.matches(".*\\d.*");
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

        List<String> substrings = new ArrayList<>();

        // Iterar sobre el arreglo y dividir las cadenas en partes numéricas y no numéricas
        for (String palabraATraducir : palabrasATraducir) {
            Matcher matcher = pattern.matcher(palabraATraducir);

            while (matcher.find()) {
                String fragmento = matcher.group();
                substrings.add(fragmento);
            }
        }

        String[] resultadoFinal = substrings.toArray(new String[0]);

        return resultadoFinal;
    }

    private String agregarCaracterNumerico(String stringSeparadoCaracterNumero) {
        StringBuilder result = new StringBuilder();
        char[] charArray = stringSeparadoCaracterNumero.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            result.append(charArray[i]);
            if (i != 0) {
                result.append('⠼');
            }
        }
        result.setLength(result.length() - 1);

        return result.toString();
    }

    private String[] separarNumerosBraille(String stringSeparadoCaracterNumero) {
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
    }*/
 
    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        boolean esEspanol = indiceIdioma == 1;
        StringBuilder resultado = new StringBuilder();

        String[] lineas = textoATraducir.split("\n");

        for (String linea : lineas) {
            Arrays.stream(dividirNumerosDePalabras(extraerPalabras(linea)))
                    .forEach(palabra -> {
                        StringBuilder caracterTraducido = new StringBuilder();

                        if (esEspanol) {
                            if (contieneNumeros(palabra)) {
                                caracterTraducido.append(CARACTER_NUMERO);
                            }
                            palabra.chars().forEach(c -> {
                                char caracter = (char) c;
                                // Solo agrega el indicador de mayúscula si el carácter está en mayúscula
                                if (Character.isUpperCase(caracter)) {
                                    caracterTraducido.append(CARACTER_MAYUSCULAS);
                                }
                                caracterTraducido.append(obtenerCaracterEnBraille(Character.toLowerCase(caracter)));
                            });
                        } else {
                            // Implementación para otros idiomas
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
                                    } else {
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

    private boolean contieneNumeros(String str) {
        return str.matches(".*\\d.*");
    }

    private String obtenerCaracterEnEspaniol(String caracterPalabra) {
        return String.valueOf(caracteresBrailleEsp.get(caracterPalabra));
    }

    private String obtenerCaracterEnBraille(char caracterPalabra) {
        return caracteresEspBraille.getOrDefault(caracterPalabra, String.valueOf(caracterPalabra));
    }

    private String[] extraerPalabras(String cadena) {
        return cadena.split("\\s+");
    }

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

    private String[] separarNumerosBraille(String stringSeparadoCaracterNumero) {
        int numPairs = stringSeparadoCaracterNumero.length() / 2;
        String[] result = new String[numPairs];
        for (int i = 0; i < numPairs; i++) {
            result[i] = stringSeparadoCaracterNumero.substring(i * 2, i * 2 + 2);
        }
        return result;
    }
}
