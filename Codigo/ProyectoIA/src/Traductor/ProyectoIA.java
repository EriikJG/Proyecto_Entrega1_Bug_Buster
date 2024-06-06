package Traductor;

import ProyectoGUI.MENU;

public class ProyectoIA {

    public static void main(String[] args) {
        //MENU menu = new MENU();
        //menu.setVisible(true);

        Traductor t = new Traductor();

        String textoTraducido = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠕⠇⠸⠾");//(Arbol)
        String textoTraducido1 = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠾⠇⠸⠾");//(Arból)
        String textoTraducido2 = t.traducirTexto("⠸⠷⠷ ⠿ ⠽⠷⠾⠸⠾"); //(áéíúó)
        //String textoTraducido = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠾⠇⠾ ⠸⠪⠒⠨⠙⠸⠻");
        
        System.out.println(textoTraducido);
        System.out.println(textoTraducido1);
        System.out.println(textoTraducido2);
    }

}
