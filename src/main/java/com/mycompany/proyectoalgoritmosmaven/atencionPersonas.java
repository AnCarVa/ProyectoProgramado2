package com.mycompany.proyectoalgoritmosmaven;
/**
 * Atencion de personas
 * @author Andrey y Julian
 */
//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class atencionPersonas extends javax.swing.JFrame {
    //arreglos
    public ArrayList<RegistroPersonas> personas = new ArrayList<>();
    public ArrayList<Puertas> puertas = new ArrayList<>();
    protected ArrayList<RegistroPersonas> tmp = new ArrayList<>();
    protected ArrayList<RegistroPersonas> colita = new ArrayList<>();
    static public ArrayList<RegistroPersonas> salida = new ArrayList<>();
    //tenporizador
    private Timer timer;
    /**
     * Constructor de la clase
     */
    public atencionPersonas() {
        initComponents();
        //Esto hace que se ponga centrado y con titulo
        this.setTitle("TecPlane");
        this.setLocationRelativeTo(null);
        // Actualizacion y permanencia de los datos
        registro lol = new registro();
        this.personas = lol.acceso();
        configIni lol2 = new configIni();
        this.puertas = lol2.acceso();
        //Actualiza puertas
        for (int i = 0; i < puertas.size(); i++) {
            String info = puertas.get(i).identi + " " + puertas.get(i).viaje + "(" + puertas.get(i).namePriori + ")";
            this.comBoxPuertas.addItem(info);
        }
        this.jButton3.setVisible(false);
        this.jProgressBar1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jList1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comBoxPuertas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLista = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        comBoxPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxPuertasActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar Puerta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel1.setText("Seleccione la puerta que desea atender");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLista.setViewportView(jList1);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atender");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Atendiendo...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLista, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jLabel1)
                                    .addComponent(comBoxPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comBoxPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Barra de control para el progreso del viaje
     */
    public class progreso implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int n = jProgressBar1.getValue();
            if (n < 100) {
                n++;
                jProgressBar1.setValue(n);
            } else {
                timer.stop();
                JOptionPane.showMessageDialog(rootPane, colita.get(0).info());
                setVisible(false);
                atencionPersonas tmpo = new atencionPersonas();
                tmpo.setVisible(true);
            }
        }
    }
    /**
     * Boton que selecciona las puertas disponibles
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jList1.setVisible(true);
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Actualiza la informacion de la persona al finalizar el viaje
     */
    public void actualizar() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        colita.clear();
        tmp.clear();
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(this.comBoxPuertas.getSelectedItem().toString());
            System.out.println(personas.get(i).destino);
            if (encontrar(this.comBoxPuertas.getSelectedItem().toString(), personas.get(i).destino)) {
                tmp.add(personas.get(i));
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println(this.comBoxPuertas.getSelectedItem().toString());
            System.out.println(tmp.get(i).priori);
            if (encontrar(this.comBoxPuertas.getSelectedItem().toString(), tmp.get(i).priori)) {
                colita.add(tmp.get(i));
            }
        }
        if (colita.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "La puerta seleccionada está vacía", "AVISO", HEIGHT);
        } else {
            for (int i = 0; i < colita.size(); i++) {
                modelo.addElement(colita.get(i).infoLis());
            }
            jList1.setModel(modelo);
            this.jButton3.setVisible(true);
        }
    }
    /**
     * Busca las puertas y personas disponibles
     * @param cadenaDondeBuscar
     * @param loQueQuieroBuscar
     * @return 
     */
    public boolean encontrar(String cadenaDondeBuscar, String loQueQuieroBuscar) {
        String[] palabras = loQueQuieroBuscar.split("\\s+");
        for (String palabra : palabras) {
            if (cadenaDondeBuscar.contains(palabra)) {
                System.out.println("Encontrado");
                return true;
            }
        }
        return false;
    }
    /**
     * Almacena las puertas
     * @param evt 
     */
    private void comBoxPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxPuertasActionPerformed

    }//GEN-LAST:event_comBoxPuertasActionPerformed
    /**
     * Boton de volver
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        principal temporito = new principal();
        temporito.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Boton de actualizar
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.jProgressBar1.setVisible(true);
        this.jLabel2.setVisible(true);
        timer.start();
        for (int i = 0; i < personas.size(); i++) {
            if (colita.get(0).nombre.equals(personas.get(i).nombre)) {
                salida.add(personas.get(i));
                personas.remove(i);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Barra de progreso
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(50, new progreso());

    }//GEN-LAST:event_formWindowOpened
    /**
     * Registra en el arreglo la salida
     * @return 
     */
    public ArrayList<RegistroPersonas> registroSalida() {
        return salida;
    }
    /**
     * Registra en el arreglo la persona
     * @return 
     */
    public ArrayList<RegistroPersonas> registroPersonas() {
        return personas;
    }
    /**
     * Registra en el arreglo la puerta
     * @return 
     */
    public ArrayList<Puertas> registroPuertas() {
        return puertas;
    }
     /**
     * Agrega a la cola la persona
     */
    public void agregarACola() {
        ColaPriori cola = new ColaPriori();
        for (int i = 0; i < personas.size(); i++) {
            cola.enqueue(personas.get(i), personas.get(i).tipoPriori);
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
            java.util.logging.Logger.getLogger(atencionPersonas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atencionPersonas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atencionPersonas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atencionPersonas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new atencionPersonas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comBoxPuertas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jLista;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
