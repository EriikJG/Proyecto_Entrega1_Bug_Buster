/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que extiende Diccionario para proporcionar la traducción entre Braille y español.
 * Maneja la visualización de caracteres en Braille y su conversión a caracteres en español.
 */
public class DiccionarioBrailleEspanol extends Diccionario {

    // Mapeos de caracteres Braille a caracteres españoles
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();
    private static final Map<String, Character> caracteresNumerosBrailleEsp = new HashMap<>();
    private static final Map<String, Character> caracteresSimbolosBraileEsp = new HashMap<>();

    // Flags para manejar los símbolos de interrogación y exclamación
    private boolean aparecioInterrogacion = false;
    private boolean aparecioExclamacion = false;

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

        caracteresSimbolosBraileEsp.put("⠄", '.');
        caracteresSimbolosBraileEsp.put("⠂", ',');
        caracteresSimbolosBraileEsp.put("⠆", ';');
        caracteresSimbolosBraileEsp.put("⠒", ':');
        caracteresSimbolosBraileEsp.put("⠤", '_');
        caracteresSimbolosBraileEsp.put("⠦", 'x');
        caracteresSimbolosBraileEsp.put("⠶", '=');
        caracteresSimbolosBraileEsp.put("⠌", '/');
        caracteresSimbolosBraileEsp.put("⠉", '-');
        caracteresSimbolosBraileEsp.put("⠲", '÷');
        caracteresSimbolosBraileEsp.put("⠣", '(');
        caracteresSimbolosBraileEsp.put("⠜", ')');
        caracteresSimbolosBraileEsp.put("⠐", '+');
        
        caracteresSimbolosBraileEsp.put("⠵", '&');
        caracteresSimbolosBraileEsp.put("⠴", '%');
        caracteresSimbolosBraileEsp.put("⠎", '$');
        caracteresSimbolosBraileEsp.put("⠼", '#');
        caracteresSimbolosBraileEsp.put("⠔", '*');
        caracteresSimbolosBraileEsp.put("⠓", '{');
        caracteresSimbolosBraileEsp.put("⠚", '}');
        caracteresSimbolosBraileEsp.put("⠯", '[');
        caracteresSimbolosBraileEsp.put("⠽", ']');
        caracteresSimbolosBraileEsp.put("⠑", '^');
        caracteresSimbolosBraileEsp.put("⠘", '~');
        caracteresSimbolosBraileEsp.put("⠅", '¬');
        caracteresSimbolosBraileEsp.put("⠇", '|');
        

        caracteresSimbolosBraileEsp.put("⠢", 'I'); // interrogación 1
        caracteresSimbolosBraileEsp.put("⠖", 'E'); // exclamacion1
        caracteresSimbolosBraileEsp.put("⠛", 'C'); // COMILLAS con puntos aleatorios PARA QUE NO SE REPITA1

        caracteresBrailleEsp.put("⠷", 'á');
        caracteresBrailleEsp.put("⠿", 'é');
        caracteresBrailleEsp.put("⠌", 'í'); // RAMDOM
        caracteresBrailleEsp.put("⠾", 'ó');
        caracteresBrailleEsp.put("⠞", 'ú'); // ramdom
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
     * Traduce una palabra específica de Braille a español y la agrega a un StringBuilder.
     *
     * @param palabra La palabra en Braille a traducir.
     * @param resultado El StringBuilder donde se almacenará la palabra traducida.
     */
    protected void traducir(String palabra, StringBuilder resultado) {
        boolean esNumero = false;
        boolean esMayuscula = false;
        boolean esSimbolo = false;

        for (int i = 0; i < palabra.length(); i++) {
            String simboloActual = Character.toString(palabra.charAt(i));

            if (esCaracterEspecial(simboloActual)) {
                esNumero = simboloActual.equals(CARACTER_NUMERO);
                esMayuscula = simboloActual.equals(CARACTER_MAYUSCULAS);
                esSimbolo = simboloActual.equals(CARACTER_SIMBOLO);
                continue;
            }

            if (esSimbolo) {
                manejarSimbolo(simboloActual, resultado);
                esSimbolo = false;
            } else if (esNumero) {
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
    /**
     * Verifica si un símbolo es un carácter especial en Braille.
     *
     * @param simboloActual El símbolo a verificar.
     * @return true si es un carácter especial, false en caso contrario.
     */
    private boolean esCaracterEspecial(String simboloActual) {
        return switch (simboloActual) {
            case CARACTER_NUMERO, CARACTER_LETRA, CARACTER_MAYUSCULAS, CARACTER_SIMBOLO -> true;
            default -> false;
        };
    }
    /**
     * Agrega el símbolo de interrogación correspondiente al resultado.
     *
     * @param resultado El StringBuilder donde se agregará el símbolo de interrogación.
     */
    private void agregarSimboloInterrogacion(StringBuilder resultado) {
        if (aparecioInterrogacion) {
            resultado.append('?');
            aparecioInterrogacion = false;
        } else {
            resultado.append('¿');
            aparecioInterrogacion = true;
        }
    }
    /**
     * Agrega el símbolo de exclamación correspondiente al resultado.
     *
     * @param resultado El StringBuilder donde se agregará el símbolo de exclamación.
     */
    private void agregarSimboloExclamacion(StringBuilder resultado) {
        if (aparecioExclamacion) {
            resultado.append('!');
            aparecioExclamacion = false;
        } else {
            resultado.append('¡');
            aparecioExclamacion = true;
        }
    }
    /**
     * Agrega comillas al resultado.
     *
     * @param resultado El StringBuilder donde se agregarán las comillas.
     */
    private void agregarComillas(StringBuilder resultado) {
        resultado.append('"');

    }
    /**
     * Maneja la traducción de símbolos especiales en Braille a español.
     *
     * @param simboloActual El símbolo en Braille a traducir.
     * @param resultado El StringBuilder donde se almacenará el símbolo traducido.
     */
    public void manejarSimbolo(String simboloActual, StringBuilder resultado) {
        char aux = caracteresSimbolosBraileEsp.get(simboloActual);

        switch (aux) {
            case 'I' -> agregarSimboloInterrogacion(resultado);
            case 'E' -> agregarSimboloExclamacion(resultado);
            case 'C' -> agregarComillas(resultado);
            default -> resultado.append(aux);
        }
    }
}
