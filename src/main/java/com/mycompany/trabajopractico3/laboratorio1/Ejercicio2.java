package com.mycompany.trabajopractico3.laboratorio1;

import javax.swing.JOptionPane;

public class Ejercicio2 extends javax.swing.JFrame {

    double nroIngresado;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ejercicio2.class.getName());

    public Ejercicio2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        textFieldGradosIngresados = new javax.swing.JTextField();
        toFahrenheit = new javax.swing.JRadioButton();
        toKelvin = new javax.swing.JRadioButton();
        jButtonConvertir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingresa los grados Celsius");

        textFieldGradosIngresados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldGradosIngresadosKeyReleased(evt);
            }
        });

        buttonGroup1.add(toFahrenheit);
        toFahrenheit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        toFahrenheit.setText("A Fahrenheit");

        buttonGroup1.add(toKelvin);
        toKelvin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        toKelvin.setText("A Kelvin");

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(this::jButtonConvertirActionPerformed);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Unispace", 3, 36)); // NOI18N
        jLabel2.setText("Conversor de temperatura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textFieldGradosIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toFahrenheit)
                                    .addComponent(toKelvin)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonConvertir)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textFieldGradosIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(toFahrenheit)
                .addGap(29, 29, 29)
                .addComponent(toKelvin)
                .addGap(48, 48, 48)
                .addComponent(jButtonConvertir)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldGradosIngresadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldGradosIngresadosKeyReleased
        String textField = this.textFieldGradosIngresados.getText().trim();
        if (textField.isEmpty()) {
            return;
        }
        try {
            this.nroIngresado = Double.parseDouble(textField);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese s\u00f3lo n\u00fameros");
        }
    }//GEN-LAST:event_textFieldGradosIngresadosKeyReleased

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        if (this.textFieldGradosIngresados.getText().length() > 0) {
            if (this.buttonGroup1.getSelection() != null) {
                if (this.toFahrenheit.isSelected()) {
                    double fahrenheit = this.nroIngresado * 9.0 / 5.0 + 32.0;
                    JOptionPane.showMessageDialog(this, "La temperatura en grados fahrenheit es: " + fahrenheit);
                }
                if (this.toKelvin.isSelected()) {
                    double kelvin = (this.nroIngresado - 32.0) * 5.0 / 9.0 + 273.15;
                    JOptionPane.showMessageDialog(this, "La temperatura en grados kelvin es: " + kelvin);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar una escala");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes ingresar los grados a convertir");
        }
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Ejercicio2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldGradosIngresados;
    private javax.swing.JRadioButton toFahrenheit;
    private javax.swing.JRadioButton toKelvin;
    // End of variables declaration//GEN-END:variables
}
