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
public class ControladorTexto {
    /**
     * Divide un texto en líneas.
     *
     * @param texto El texto a dividir.
     * @return Un array de líneas.
     */
    protected String[] dividirEnLineas(String texto) {
        return texto.split("\n");
    }
    /**
     * Divide una cadena en palabras.
     *
     * @param cadena La cadena a dividir.
     * @return Un array de palabras.
     */
    protected String[] dividirEnPalabras(String cadena) {
        if (cadena.trim().isEmpty()) {
            return new String[0]; // Si la cadena está vacía, devolver un array vacío
        } else {
            String[] palabras = cadena.split("\\s+");
            if (palabras.length == 1 && !cadena.contains(" ")) {
                return new String[]{cadena}; // Si solo hay una palabra, devolverla en un array
            } else {
                return palabras; // Devolver el array normalmente
            }
        }
    }
    /**
     * Limpia el último espacio en blanco de un StringBuilder si existe.
     *
     * @param resultado El StringBuilder del que se limpiará el último espacio.
     */
    protected void limpiarUltimoEspacio(StringBuilder resultado) {
        if (resultado.charAt(resultado.length() - 1) == ' ') {
            resultado.setLength(resultado.length() - 1);
        }
    }
    /**
     * Limpia el último salto de línea en un StringBuilder si existe.
     *
     * @param resultado El StringBuilder del que se limpiará el último salto de línea.
     */
    protected void limpiarUltimoSaltoDeLinea(StringBuilder resultado) {
        if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == '\n') {
            resultado.setLength(resultado.length() - 1);
        }
    }

}
