/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoGUI;
import Traductor.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author alejo
 */
public class TraductorGUI extends javax.swing.JFrame {
    
    
    /**
     * Creates new form TraductorGUI
     */
    public TraductorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private static boolean imagenSenalGuardada = false;
    private static boolean imagenEspejoGuardada = false;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Transcripción Braille");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField inputField = new JTextField();
        panel.add(new JLabel("Ingrese texto en español:"));
        panel.add(inputField);

        JButton transcribirButton = new JButton("Transcribir a Braille");
        panel.add(transcribirButton);

        panel.add(new JLabel("Texto en Braille:"));
        JTextArea outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        panel.add(new JScrollPane(outputArea));

        panel.add(new JLabel("Modo Espejo:"));
        JTextArea espejoArea = new JTextArea(5, 20);
        espejoArea.setEditable(false);
        panel.add(new JScrollPane(espejoArea));

        JButton guardarSenalButton = new JButton("Guardar Señalización Braille");
        panel.add(guardarSenalButton);

        JButton guardarEspejoButton = new JButton("Guardar Texto en Espejo");
        panel.add(guardarEspejoButton);

        JButton limpiarButton = new JButton("Limpiar Pantalla");
        panel.add(limpiarButton);

        JButton salirButton = new JButton("Salir");
        panel.add(salirButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        Usuario usuario = new Usuario();

        Traductor traductor = new Traductor();
        
        transcribirButton.addActionListener(e -> {
            String textoEspaniol = inputField.getText();
            String textoBraille = traductor.traducirTexto(textoEspaniol);
            outputArea.setText(textoBraille);
            
            /*

            String textoBrailleEspejo = new StringBuilder(textoBraille).reverse().toString();
            espejoArea.setText(textoBrailleEspejo);

            imagenSenalGuardada = false;
            imagenEspejoGuardada = false;*/
        });

        guardarSenalButton.addActionListener(e -> {
            if (imagenSenalGuardada) {
                JOptionPane.showMessageDialog(null, "Ya guardaste la imagen", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String textoBraille = outputArea.getText();
            BufferedImage senal = usuario.generarSenalizacion(textoBraille);
            guardarImagen(senal, "senal", "Señalización Braille guardada exitosamente.");
            imagenSenalGuardada = true;
        });
        
        

        guardarEspejoButton.addActionListener(e -> {
            if (imagenEspejoGuardada) {
                JOptionPane.showMessageDialog(null, "Ya guardaste la imagen", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String textoBraille = outputArea.getText();
            BufferedImage espejo = usuario.imprimirTextoEspejo(textoBraille);
            guardarImagen(espejo, "espejo", "Texto en Espejo guardado exitosamente.");
            imagenEspejoGuardada = true;
        });

        limpiarButton.addActionListener(e -> {
            inputField.setText("");
            outputArea.setText("");
            espejoArea.setText("");
        });

        salirButton.addActionListener(e -> {
            frame.dispose();
        });
    }
    
    public BufferedImage generarSenialetica(){
        BufferedImage imagen = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagen.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Braille", Font.PLAIN, 40));
        g2d.drawString(texto, 10, 50);
        g2d.dispose();
        return imagen;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
