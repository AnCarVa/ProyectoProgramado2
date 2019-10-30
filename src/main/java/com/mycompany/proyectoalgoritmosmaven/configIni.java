package com.mycompany.proyectoalgoritmosmaven;

/**
 * Configuracion Inicial
 *
 * @author Andrey y Julian
 */
//imports
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class configIni extends javax.swing.JFrame {

    //atributos
    String viaje0 = "Japon";
    String viaje1 = "Alemania";
    String viaje2 = "Los Angeles";
    String viaje3 = "España";
    String viaje4 = "Holanda";
    String viaje5 = "Haiti";
    static int cont = 0;
    //arreglos
    public static ArrayList<Puertas> espe = new ArrayList<>();
    public static ArrayList<Puertas> oro = new ArrayList<>();
    public static ArrayList<Puertas> plati = new ArrayList<>();
    public static ArrayList<Puertas> eco = new ArrayList<>();
    public static ArrayList<Puertas> puertas = new ArrayList<>();

    /**
     * Constructor por defecto
     */
    public configIni() {
        initComponents();
        //Esto hace que se ponga centrado y con titulo
        this.setTitle("TecPlane");
        this.setLocationRelativeTo(null);
        //GrupoViajes
        grupoBtn1.add(btn0);
        grupoBtn1.add(btn1);
        grupoBtn1.add(btn2);
        grupoBtn1.add(btn3);
        grupoBtn1.add(btn4);
        grupoBtn1.add(btn5);
        //GrupoTipo
        grupoBtn2.add(btn6);
        grupoBtn2.add(btn7);
        grupoBtn2.add(btn8);
        grupoBtn2.add(btn9);
        //Establece el texto 
        labelConta.setText(Integer.toString(cont));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn1 = new javax.swing.ButtonGroup();
        grupoBtn2 = new javax.swing.ButtonGroup();
        btn0 = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();
        btn6 = new javax.swing.JRadioButton();
        btn7 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn8 = new javax.swing.JRadioButton();
        btn9 = new javax.swing.JRadioButton();
        btnCrear = new javax.swing.JButton();
        labelConta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn0.setText("Japón");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setText("Alemania");

        btn2.setText("Los Ángeles");

        btn3.setText("España");

        btn4.setText("Holanda");

        btn5.setText("Haiti");

        btn6.setText("Oro");

        btn7.setText("Platino");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel1.setText("Generando la puerta número");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel2.setText("Ingrese el destino");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de prioridad ");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel4.setText("Generador de Puertas");

        btn8.setText("Especial");

        btn9.setText("Económico");

        btnCrear.setText("Crear Puerta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn6)
                                        .addComponent(btn1)
                                        .addComponent(btn0)
                                        .addComponent(btn2)
                                        .addComponent(btn8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelConta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9)
                                    .addComponent(btn5)
                                    .addComponent(btn3)
                                    .addComponent(btn4)
                                    .addComponent(btn7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(14, 14, 14)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 276, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btn3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8)
                            .addComponent(btn9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

    }//GEN-LAST:event_btn0ActionPerformed
    /**
     * Boton que crea las puertas
     *
     * @param evt
     */
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String viaje = "";
        int tipo = 0;
        if (btn0.isSelected()) {
            viaje = viaje0;
        }
        if (btn1.isSelected()) {
            viaje = viaje1;
        }
        if (btn2.isSelected()) {
            viaje = viaje2;
        }
        if (btn3.isSelected()) {
            viaje = viaje3;
        }
        if (btn4.isSelected()) {
            viaje = viaje4;
        }
        if (btn5.isSelected()) {
            viaje = viaje5;
        }
        if (btn6.isSelected()) {
            tipo = 1;
        }
        if (btn7.isSelected()) {
            tipo = 2;
        }
        if (btn8.isSelected()) {
            tipo = 3;
        }
        if (btn9.isSelected()) {
            tipo = 4;
        }
        if ("".equals(viaje)) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un viaje", "Error", HEIGHT);
        }
        if (tipo == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una prioridad", "Error", HEIGHT);
        }
        if (!"".equals(viaje) && tipo != 0) {
            creacion(viaje, tipo);
        }

    }//GEN-LAST:event_btnCrearActionPerformed
    /**
     * Boton de volver
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acomodo();
        this.setVisible(false);
        principal tmp = new principal();
        tmp.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Crea la puerta
     *
     * @param viaje
     * @param tipo
     */
    public void creacion(String viaje, int tipo) {
        Puertas newPuerta = new Puertas(viaje, cont, tipo);
        System.out.println(newPuerta.tipoPriori);
        switch (newPuerta.tipoPriori) {
            case (3):
                espe.add(newPuerta);
                break;
            case (1):
                oro.add(newPuerta);
                break;
            case (2):
                plati.add(newPuerta);
                break;
            case (4):
                eco.add(newPuerta);
                break;
        }
        cont++;
        JOptionPane.showMessageDialog(rootPane, "Puerta generada de manera exitosa", "Progreso", HEIGHT);
        this.setVisible(false);
        configIni tmp = new configIni();
        tmp.setVisible(true);
    }

    /**
     * Agrega al arreglo el acceso a las puertas
     *
     * @return
     */
    public ArrayList<Puertas> acceso() {
        return puertas;
    }

    /**
     * Ordena en prioridad
     */
    public void acomodo() {
        puertas.clear();
        for (int i = 0; i < espe.size(); i++) {
            puertas.add(espe.get(i));
        }
        for (int i = 0; i < oro.size(); i++) {
            puertas.add(oro.get(i));
        }
        for (int i = 0; i < plati.size(); i++) {
            puertas.add(plati.get(i));
        }
        for (int i = 0; i < eco.size(); i++) {
            puertas.add(eco.get(i));
        }
    }

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
            java.util.logging.Logger.getLogger(configIni.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configIni.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configIni.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configIni.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new configIni().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn0;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JRadioButton btn6;
    private javax.swing.JRadioButton btn7;
    private javax.swing.JRadioButton btn8;
    private javax.swing.JRadioButton btn9;
    private javax.swing.JButton btnCrear;
    private javax.swing.ButtonGroup grupoBtn1;
    private javax.swing.ButtonGroup grupoBtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelConta;
    // End of variables declaration//GEN-END:variables
}
