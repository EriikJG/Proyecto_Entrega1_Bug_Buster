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

    // Flags para manejar los símbolos de interrogación y exclamación
    private boolean aparecioInterrogacion = false;
    private boolean aparecioExclamacion = false;

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
