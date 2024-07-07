/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProyectoGUI;

import Traductor.Traductor;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 *
 * @author pilco
 */
public class FormEspBra extends javax.swing.JPanel {

    private Traductor traductor;
    private boolean imagenSenalGuardada = false;
    private boolean imagenEspejoGuardada = false;
    
    public FormEspBra() {
        initComponents();
        traductor = new Traductor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("1. Ingrese el texto en Español:");

        jTASalida.setEditable(false);
        jTASalida.setBackground(new java.awt.Color(255, 255, 255));
        jTASalida.setColumns(20);
        jTASalida.setRows(5);
        jScrollPane1.setViewportView(jTASalida);

        jBTraducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/language_translator_icon_150921.png"))); // NOI18N
        jBTraducir.setText("Traducir");
        jBTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTraducirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("2. Texto traducido en Braille:");

        jTAEntrada.setColumns(20);
        jTAEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTAEntrada.setRows(5);
        jTAEntrada.setToolTipText("");
        jScrollPane2.setViewportView(jTAEntrada);

        jBGuardarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1904659-arrow-backup-down-download-save-storage-transfer_122509.png"))); // NOI18N
        jBGuardarImg.setText("Guardar señalización en Braille");
        jBGuardarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarImgActionPerformed(evt);
            }
        });

        jBGuardarImgEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1904659-arrow-backup-down-download-save-storage-transfer_122509.png"))); // NOI18N
        jBGuardarImgEsp.setText("Guardar en modo Espejo");
        jBGuardarImgEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarImgEspActionPerformed(evt);
            }
        });

        jBLimpiarPanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restart-48_46609.png"))); // NOI18N
        jBLimpiarPanta.setText("Limpiar Pantalla");
        jBLimpiarPanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarPantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBGuardarImg)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBGuardarImgEsp)
                                .addComponent(jBLimpiarPanta)))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jBTraducir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGuardarImg)
                .addGap(24, 24, 24)
                .addComponent(jBGuardarImgEsp)
                .addGap(24, 24, 24)
                .addComponent(jBLimpiarPanta)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTraducirActionPerformed
        String textoEsp = jTAEntrada.getText();
        if(textoEsp.isEmpty()){
            // Mostrar mensaje de advertencia si no hay caracteres a ser traducidos
            JOptionPane.showMessageDialog(null, "No hay texto a ser traducido!", "Advertencia", JOptionPane.WARNING_MESSAGE);            
        } else {
            String textoBraille = traductor.traducir(textoEsp, 1);
            jTASalida.setText(textoBraille);
        }
        imagenSenalGuardada = false;
    }//GEN-LAST:event_jBTraducirActionPerformed

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

    private void jBLimpiarPantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarPantaActionPerformed
        jTAEntrada.setText("");
        jTASalida.setText("");
    }//GEN-LAST:event_jBLimpiarPantaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarImg;
    private javax.swing.JButton jBGuardarImgEsp;
    private javax.swing.JButton jBLimpiarPanta;
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
