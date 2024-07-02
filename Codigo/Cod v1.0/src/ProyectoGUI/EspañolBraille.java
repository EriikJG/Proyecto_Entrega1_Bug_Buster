/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoGUI;

import Traductor.Traductor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Clase principal para la traducción de texto en español a Braille.
 * Proporciona una interfaz gráfica para ingresar texto en español,
 * traducirlo a Braille, y guardar la traducción como una imagen.
 *
 * @author pilco
 */
public class EspañolBraille extends javax.swing.JFrame {

    private Traductor traductor;
    private boolean imagenSenalGuardada = false;
    private boolean imagenEspejoGuardada = false;
    /**
     * Constructor de la clase EspañolBraille.
     * Inicializa los componentes de la interfaz gráfica.
     */
    public EspañolBraille() {
        initComponents();
        setTitle("Traducir de Español a Braille");
        traductor = new Traductor();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        pack();
    }

    /**
     * Este método es llamado desde el constructor para inicializar el formulario.
     * ADVERTENCIA: No modificar este código. El contenido de este método es siempre
     * regenerado por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTASalida = new javax.swing.JTextArea();
        jBTraducir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAEntrada = new javax.swing.JTextArea();
        jBGuardarImg = new javax.swing.JButton();
        jBGuardarImgEsp = new javax.swing.JButton();
        jBLimpiarPanta = new javax.swing.JButton();
        jBRegMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el texto en Español:");

        jTASalida.setColumns(20);
        jTASalida.setRows(5);
        jScrollPane1.setViewportView(jTASalida);

        jBTraducir.setText("Traducir ");
        jBTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTraducirActionPerformed(evt);
            }
        });

        jLabel2.setText("Texo traducido en Braille:");

        jTAEntrada.setColumns(20);
        jTAEntrada.setRows(5);
        jScrollPane2.setViewportView(jTAEntrada);

        jBGuardarImg.setText("Guardar señalización en Braille");
        jBGuardarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarImgActionPerformed(evt);
            }
        });

        jBGuardarImgEsp.setText("Guardar en modo Espejo");
        jBGuardarImgEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarImgEspActionPerformed(evt);
            }
        });

        jBLimpiarPanta.setText("Limpiar Pantalla");
        jBLimpiarPanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarPantaActionPerformed(evt);
            }
        });

        jBRegMenu.setText("Regresar al menú");
        jBRegMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jBTraducir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardarImg)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardarImgEsp)
                            .addComponent(jBLimpiarPanta)
                            .addComponent(jBRegMenu))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(jBTraducir)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGuardarImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGuardarImgEsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpiarPanta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRegMenu)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción al hacer clic en el botón de guardar imagen en modo espejo.
     * Genera y guarda la imagen de la señalización en Braille en modo espejo.
     */
    private void jBGuardarImgEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarImgEspActionPerformed
        if(imagenEspejoGuardada) {
            JOptionPane.showMessageDialog(null, "Ya guardaste la imagen espejo", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String textoBraille = jTASalida.getText();

        // Generar la imagen espejo a partir del texto Braille
        BufferedImage senial = traductor.generarImagenEspejo(traductor.generarImagen(textoBraille));

        // Guardar la imagen espejo
        traductor.guardarImagen(senial, jTAEntrada.getText()+"_espejo");

        imagenEspejoGuardada = true; // Marcar que la imagen espejo ha sido guardada
    }//GEN-LAST:event_jBGuardarImgEspActionPerformed
    /**
     * Acción al hacer clic en el botón de traducir.
     * Traduce el texto ingresado en español a Braille.
     */
    private void jBTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTraducirActionPerformed
        String textoEsp = jTAEntrada.getText();
        String textoBraille = traductor.traducirTexto(textoEsp);
        jTASalida.setText(textoBraille);
        
        imagenSenalGuardada = false;
    }//GEN-LAST:event_jBTraducirActionPerformed

    /**
     * Acción al hacer clic en el botón de guardar imagen.
     * Genera y guarda la imagen de la señalización en Braille.
     */
    private void jBGuardarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarImgActionPerformed
        if(imagenSenalGuardada)
        {
            JOptionPane.showMessageDialog(null, "Ya guardaste la imagen", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String textoBraille = jTASalida.getText();
        BufferedImage senial = traductor.generarImagen(textoBraille);
        traductor.guardarImagen(senial, jTAEntrada.getText());
        imagenSenalGuardada = true;
    }//GEN-LAST:event_jBGuardarImgActionPerformed
    /**
     * Acción al hacer clic en el botón de limpiar pantalla.
     * Limpia los campos de entrada y salida de texto.
     */
    private void jBLimpiarPantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarPantaActionPerformed
        jTAEntrada.setText("");
        jTASalida.setText("");
    }//GEN-LAST:event_jBLimpiarPantaActionPerformed
    /**
     * Acción al hacer clic en el botón de regresar al menú.
     * Cierra la ventana actual y regresa al menú principal.
     */
    private void jBRegMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBRegMenuActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Crea una instancia de la clase EspañolBraille y la hace visible.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspañolBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspañolBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspañolBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspañolBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspañolBraille().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarImg;
    private javax.swing.JButton jBGuardarImgEsp;
    private javax.swing.JButton jBLimpiarPanta;
    private javax.swing.JButton jBRegMenu;
    private javax.swing.JButton jBTraducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAEntrada;
    private javax.swing.JTextArea jTASalida;
    // End of variables declaration//GEN-END:variables
}
