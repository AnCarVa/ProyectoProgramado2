package com.mycompany.proyectoalgoritmosmaven;
/**
 * Gestion del aeropuerto
 * @author Andrey y Julian
 */
//imports
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class gestion extends javax.swing.JFrame {
    //arreglos
    public ArrayList<RegistroPersonas> personas = new ArrayList<>();
    public ArrayList<Puertas> puertas = new ArrayList<>();
    public ArrayList<RegistroPersonas> salida = new ArrayList<>();
    public ArrayList<String> asientos = new ArrayList<>();
    /**
     * Constructor de la clase
     */
    public gestion() {
        initComponents();
        //Esto hace que se ponga centrado y con titulo
        this.setTitle("TecPlane");
        this.setLocationRelativeTo(null);
        //actualizacion de datos
        atencionPersonas tmp = new atencionPersonas();
        RegistroPersonas tmpo = new RegistroPersonas();
        this.personas = tmp.personas;
        this.puertas = tmp.puertas;
        this.salida = tmp.registroSalida();
        this.asientos = tmpo.asientos();
        for (int i = 0; i < puertas.size(); i++) {
            String info = puertas.get(i).identi + " " + puertas.get(i).viaje + "(" + puertas.get(i).namePriori + ")";
            this.jComboBox2.addItem(info);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButton2.setText("jButton2");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puertas existentes", "Tipo de cola por persona", "Personas por cola", "Siguiente cliente", "Asientos utilizados" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Acceder a estado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Puerta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo de espera promedio", "Tiempo promedio de salida", "Total de personas atendidas", "Total de asientos dispensados" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton5.setText("Acceder a estadística");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton1))))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Almacena los estados
     * @param evt 
     */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
    /**
     * Actualiza la informacion de los estados
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for (int i = 0; i < puertas.size(); i++) {
                String info = puertas.get(i).identi + " " + puertas.get(i).viaje + "(" + puertas.get(i).namePriori + ")";
                modelo.addElement(info);
            }
            jList1.setModel(modelo);
        }
        if (jComboBox1.getSelectedIndex() == 1) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            for (int i = 0; i < personas.size(); i++) {
                String a = "Nombre: " + personas.get(i).nombre + "/Tipo de prioridad " + personas.get(i).priori;
                modelo.addElement(a);
            }
            jList1.setModel(modelo);
        }
        if (jComboBox1.getSelectedIndex() == 2) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            int cont = 0;
            int index = 0;
            String[] base = {"Oro", "Platino", "Especial", "Económico"};
            while (index < 4) {
                modelo.addElement("     " + base[index]);
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).priori == base[index]) {
                        cont++;
                    }
                }
                modelo.addElement(cont);
                cont = 0;
                index++;
            }
            jList1.setModel(modelo);
        }
        if (jComboBox1.getSelectedIndex() == 3) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            if (personas.size() != 0) {
                String a = "La siguiente persona en atender es: " + personas.get(0).nombre + "/Con destino a: " + personas.get(0).destino;
                modelo.addElement(a);
            } else {
                modelo.addElement("No hay más personas");
            }
            jList1.setModel(modelo);
        }
        if (jComboBox1.getSelectedIndex() == 4) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            modelo.addElement("     Asientos utilizados");
            for (int i = 0; i < personas.size(); i++) {
                int num = random();
                if (num % 2 == 0) {
                    String info = "V" + num;
                    modelo.addElement(info);
                } else {
                    String info = "P" + num;
                    modelo.addElement(info);
                }
            }
            jList1.setModel(modelo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Genera un numero random
     * @return 
     */
    public int random() {
        int numero = ThreadLocalRandom.current().nextInt(1, 99);
        return numero;
    }
    /**
     * Boton de volver
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        principal temporito = new principal();
        temporito.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Elimina la puerta seleccionada
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int index = jComboBox2.getSelectedIndex();
        puertas.remove(index);
        JOptionPane.showMessageDialog(rootPane, "La puerta se ha eliminado de manera correcta", "AVISO", HEIGHT);
        this.setVisible(false);
        gestion temporito = new gestion();
        temporito.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * Actualiza la informacion de las estadisticas
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jComboBox4.getSelectedIndex() == 0) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            int index = 0;
            String[] base = {"Oro", "Platino", "Especial", "Económico"};
            int conta = 0;
            while (index < 4) {
                modelo.addElement("     " + base[index]);
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).priori == base[index]) {
                        conta = random();
                    }
                }
                modelo.addElement(conta + " segundos");
                index++;
            }
            jList1.setModel(modelo);
        }
        if (jComboBox4.getSelectedIndex() == 1) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            int a = random() + salida.size();
            modelo.addElement("El tiempo promedio de salida es de " + a + " segundos");
            jList1.setModel(modelo);
        }
        if (jComboBox4.getSelectedIndex() == 2) {
            System.out.println(salida.size());
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            int index = 0;
            int cont = 0;
            String[] base = {"Oro", "Platino", "Especial", "Económico"};
            while (index < 4) {
                modelo.addElement("     " + base[index]);
                for (int i = 0; i < salida.size(); i++) {
                    if (salida.get(i).priori == base[index]) {
                        cont++;
                    }
                }
                modelo.addElement(cont);
                cont = 0;
                index++;
            }
            modelo.addElement("                         ");
            for (int i = 0; i < puertas.size(); i++) {
                int conti = 0;
                String info = puertas.get(i).identi + " " + puertas.get(i).viaje + "(" + puertas.get(i).namePriori + ")";
                modelo.addElement("     " + info);
                String a = puertas.get(i).viaje;
                for (int j = 0; j < salida.size(); j++) {
                    if (a == salida.get(j).destino) {
                        conti++;
                    }
                }
                modelo.addElement(conti);
                conti = 0;
            }
            jList1.setModel(modelo);
        }
        if (jComboBox4.getSelectedIndex() == 3) {
            System.out.println(salida.size());
            DefaultListModel modelo = new DefaultListModel();
            modelo.removeAllElements();
            int index = 0;
            int cont = 0;
            String[] base = {"Oro", "Platino", "Especial", "Económico"};
            while (index < 4) {
                modelo.addElement("     " + base[index]);
                for (int i = 0; i < salida.size(); i++) {
                    if (salida.get(i).priori == base[index]) {
                        cont++;
                    }
                }
                modelo.addElement(cont);
                cont = 0;
                index++;
            }
            jList1.setModel(modelo);
        }

    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Almacena las estadisticas
     * @param evt 
     */
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed
    /**
     * Almacena las puertas
     * @param evt 
     */
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
 
    }//GEN-LAST:event_jComboBox2ActionPerformed
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
            java.util.logging.Logger.getLogger(gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gestion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
