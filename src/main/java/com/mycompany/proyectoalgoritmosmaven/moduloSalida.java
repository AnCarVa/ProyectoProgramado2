package com.mycompany.proyectoalgoritmosmaven;
/**
 * Salida de las personas
 * @author Andrey y Julian
 */
//imports
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class moduloSalida extends javax.swing.JFrame {
    //arreglos
    public ArrayList<RegistroPersonas> perSalida = new ArrayList<>();
    /**
     * Constructor de la clase
     */
    public moduloSalida() {
        initComponents();
        //Esto hace que se ponga centrado y con titulo
        this.setTitle("TecPlane");
        this.setLocationRelativeTo(null);
        atencionPersonas tmp = new atencionPersonas();
        this.perSalida = tmp.registroSalida();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel1.setText("Puestos de Migración");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Encuesta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Japón", "España", "Alemania", "Holanda", "Los Ángeles", "Haiti" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boton que redirige a las encuestas
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        encuestas tmp = new encuestas();
        this.setVisible(false);
        tmp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Almacena los destinos
     * @param evt 
     */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
    /**
     * Genera los datos de las personas con viajes finalizados
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int index=jComboBox1.getSelectedIndex();
        if(index==0){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("Japon".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);
                }
            }
            jList1.setModel(modelo);
        }
        if(index==1){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("España".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);   
                }
            }  
            jList1.setModel(modelo);
        }
        if(index==2){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("Alemania".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);   
                }
            }  
            jList1.setModel(modelo);
        }
        else if(index==3){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("Holanda".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);   
                }
            }  
            jList1.setModel(modelo);
        }
        else if(index==4){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("Los Angeles".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);   
                }
            }  
            jList1.setModel(modelo);
        }
        else if(index==5){
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for(int i=0;i<perSalida.size();i++){
                if("Haiti".equals(perSalida.get(i).destino)){
                    String pack=perSalida.get(i).nombre+","+perSalida.get(i).priori;
                    modelo.addElement(pack);   
                }
            }  
            jList1.setModel(modelo);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Boton de volver
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        principal tmp = new principal();
        tmp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(moduloSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moduloSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moduloSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moduloSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new moduloSalida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
