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
public class Diccionario {

    private static final Map<Character, String> mapaEspBraille = new HashMap<>();
    private static final Map<String, Character> mapaBrailleEsp = new HashMap<>();

    static {
        mapaEspBraille.put('a', "⠁");
        mapaEspBraille.put('b', "⠃");
        mapaEspBraille.put('c', "⠉");
        mapaEspBraille.put('d', "⠙");
        mapaEspBraille.put('e', "⠑");
        mapaEspBraille.put('f', "⠋");
        mapaEspBraille.put('g', "⠛");
        mapaEspBraille.put('h', "⠓");
        mapaEspBraille.put('i', "⠊");
        mapaEspBraille.put('j', "⠚");
        mapaEspBraille.put('k', "⠅");
        mapaEspBraille.put('l', "⠇");
        mapaEspBraille.put('m', "⠍");
        mapaEspBraille.put('n', "⠝");
        mapaEspBraille.put('o', "⠕");
        mapaEspBraille.put('p', "⠏");
        mapaEspBraille.put('q', "⠟");
        mapaEspBraille.put('r', "⠗");
        mapaEspBraille.put('s', "⠎");
        mapaEspBraille.put('t', "⠞");
        mapaEspBraille.put('u', "⠥");
        mapaEspBraille.put('v', "⠧");
        mapaEspBraille.put('w', "⠺");
        mapaEspBraille.put('x', "⠭");
        mapaEspBraille.put('y', "⠽");
        mapaEspBraille.put('z', "⠵");
        mapaEspBraille.put('1', "⠼⠁");
        mapaEspBraille.put('2', "⠼⠃");
        mapaEspBraille.put('3', "⠼⠉");
        mapaEspBraille.put('4', "⠼⠙");
        mapaEspBraille.put('5', "⠼⠑");
        mapaEspBraille.put('6', "⠼⠋");
        mapaEspBraille.put('7', "⠼⠛");
        mapaEspBraille.put('8', "⠼⠓");
        mapaEspBraille.put('9', "⠼⠊");
        mapaEspBraille.put('0', "⠼⠚");
        mapaEspBraille.put('.', "⠲");
        mapaEspBraille.put(',', "⠂");
        mapaEspBraille.put('?', "⠦");
        mapaEspBraille.put('!', "⠖");
        mapaEspBraille.put(';', "⠆");
        mapaEspBraille.put(':', "⠒");
        mapaEspBraille.put('-', "⠤");
        mapaEspBraille.put(' ', " ");
    }

    static {
        mapaBrailleEsp.put("⠁", 'a');
        mapaBrailleEsp.put("⠃", 'b');
        mapaBrailleEsp.put("⠉", 'c');
        mapaBrailleEsp.put("⠙", 'd');
        mapaBrailleEsp.put("⠑", 'e');
        mapaBrailleEsp.put("⠋", 'f');
        mapaBrailleEsp.put("⠛", 'g');
        mapaBrailleEsp.put("⠓", 'h');
        mapaBrailleEsp.put("⠊", 'i');
        mapaBrailleEsp.put("⠚", 'j');
        mapaBrailleEsp.put("⠅", 'k');
        mapaBrailleEsp.put("⠇", 'l');
        mapaBrailleEsp.put("⠍", 'm');
        mapaBrailleEsp.put("⠝", 'n');
        mapaBrailleEsp.put("⠕", 'o');
        mapaBrailleEsp.put("⠏", 'p');
        mapaBrailleEsp.put("⠟", 'q');
        mapaBrailleEsp.put("⠗", 'r');
        mapaBrailleEsp.put("⠎", 's');
        mapaBrailleEsp.put("⠞", 't');
        mapaBrailleEsp.put("⠥", 'u');
        mapaBrailleEsp.put("⠧", 'v');
        mapaBrailleEsp.put("⠺", 'w');
        mapaBrailleEsp.put("⠭", 'x');
        mapaBrailleEsp.put("⠽", 'y');
        mapaBrailleEsp.put("⠵", 'z');
        mapaBrailleEsp.put("⠼⠁", '1');
        mapaBrailleEsp.put("⠼⠃", '2');
        mapaBrailleEsp.put("⠼⠉", '3');
        mapaBrailleEsp.put("⠼⠙", '4');
        mapaBrailleEsp.put("⠼⠑", '5');
        mapaBrailleEsp.put("⠼⠋", '6');
        mapaBrailleEsp.put("⠼⠛", '7');
        mapaBrailleEsp.put("⠼⠓", '8');
        mapaBrailleEsp.put("⠼⠊", '9');
        mapaBrailleEsp.put("⠼⠚", '0');
        mapaBrailleEsp.put("⠲", '.');
        mapaBrailleEsp.put("⠂", ',');
        mapaBrailleEsp.put("⠦", '?');
        mapaBrailleEsp.put("⠖", '!');
        mapaBrailleEsp.put("⠆", ';');
        mapaBrailleEsp.put("⠒", ':');
        mapaBrailleEsp.put("⠤", '-');
        mapaBrailleEsp.put(" ", ' ');
    }

    public String traducirCaracterACaracter(String textoATraducir, int indiceIdioma) {
        StringBuilder textoTraducido = new StringBuilder();

        if (indiceIdioma == 1) {

            for (char ch : textoATraducir.toLowerCase().toCharArray()) {
                textoTraducido.append(mapaEspBraille.getOrDefault(ch, " "));
            }

        } else {

            for (int i = 0; i < textoATraducir.length(); i++) {
                if (textoATraducir.charAt(i) == '⠼') {
                    textoTraducido.append(mapaBrailleEsp.getOrDefault(textoATraducir.substring(i, i + 2), ' '));
                    i++;
                } else {
                    textoTraducido.append(mapaBrailleEsp.getOrDefault(String.valueOf(textoATraducir.charAt(i)), ' '));
                }
            }
        }
        return textoTraducido.toString();

    }

}
