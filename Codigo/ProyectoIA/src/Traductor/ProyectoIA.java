package Traductor;

import ProyectoGUI.MENU;

public class ProyectoIA {

    public static void main(String[] args) {
        //MENU menu = new MENU();
        //menu.setVisible(true);

        Traductor t = new Traductor();

        String textoTraducido = t.traducirTexto("⠸⠴");
        
        System.out.println(textoTraducido);
    }

}
