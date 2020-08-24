package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class Crear_servicio extends javax.swing.JFrame {

    /**
     * Creates new form Crear_servicio
     */
    public Crear_servicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Confir_servicio.setSize(450, 155);
        this.Aviso_servicio_creado.setSize(450, 155);
        this.Confir_servicio.setLocationRelativeTo(null);
        this.Aviso_servicio_creado.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confir_servicio = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        Costo_servicio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Sí_crear_servicio = new javax.swing.JButton();
        No_crear_servicio = new javax.swing.JButton();
        Aviso_servicio_creado = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        Fin_crear_servicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dir_servicio = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descri_servicio = new javax.swing.JTextArea();
        Crear_servicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Num_doc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Volver_menu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        Confir_servicio.setTitle("En desarrollo");

        jLabel8.setText("El servicio tiene un costo de $");

        jLabel10.setText("¿Desea proceder con la creación del servicio?");

        Sí_crear_servicio.setText("Sí");
        Sí_crear_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sí_crear_servicioActionPerformed(evt);
            }
        });

        No_crear_servicio.setText("No");
        No_crear_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_crear_servicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Confir_servicioLayout = new javax.swing.GroupLayout(Confir_servicio.getContentPane());
        Confir_servicio.getContentPane().setLayout(Confir_servicioLayout);
        Confir_servicioLayout.setHorizontalGroup(
            Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Confir_servicioLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Confir_servicioLayout.createSequentialGroup()
                        .addGroup(Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Confir_servicioLayout.createSequentialGroup()
                                .addComponent(Sí_crear_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(No_crear_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Confir_servicioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Confir_servicioLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Costo_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        Confir_servicioLayout.setVerticalGroup(
            Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Confir_servicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Costo_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Confir_servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sí_crear_servicio)
                    .addComponent(No_crear_servicio))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Aviso_servicio_creado.setTitle("En desarrollo");

        jLabel11.setText("Servicio creado exitosamente, en breve se le asignara un mensajero");

        Fin_crear_servicio.setText("Continuar");
        Fin_crear_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fin_crear_servicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Aviso_servicio_creadoLayout = new javax.swing.GroupLayout(Aviso_servicio_creado.getContentPane());
        Aviso_servicio_creado.getContentPane().setLayout(Aviso_servicio_creadoLayout);
        Aviso_servicio_creadoLayout.setHorizontalGroup(
            Aviso_servicio_creadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aviso_servicio_creadoLayout.createSequentialGroup()
                .addGroup(Aviso_servicio_creadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Aviso_servicio_creadoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11))
                    .addGroup(Aviso_servicio_creadoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Fin_crear_servicio)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Aviso_servicio_creadoLayout.setVerticalGroup(
            Aviso_servicio_creadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aviso_servicio_creadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(Fin_crear_servicio)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("En desarrollo");

        jLabel1.setText("<html>Para crear un servicio, llene los siguientes datos.\n<br>Recuerde el formato de la hora es el de 24h y el de la fecha DD/MM/YYYY, p. ej. 18:15 y 24/08/2020.");

        jLabel2.setText("Tipo de paquete:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Dirección(es):");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documento", "Paquete pequeño", "Paquete mediano", "Paquete grande" }));

        Dir_servicio.setColumns(20);
        Dir_servicio.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Dir_servicio.setRows(5);
        jScrollPane2.setViewportView(Dir_servicio);

        Descri_servicio.setColumns(20);
        Descri_servicio.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Descri_servicio.setRows(5);
        jScrollPane1.setViewportView(Descri_servicio);

        Crear_servicio.setText("Crear");
        Crear_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_servicioActionPerformed(evt);
            }
        });

        jLabel5.setText("Ida y Vuelta:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de ciudadanía", "Cédula de extranjería", "Tarjeta de identidad" }));

        jLabel6.setText("Número documento:");

        jLabel7.setText("Tipo documento:");

        Volver_menu.setText("Volver");
        Volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_menuActionPerformed(evt);
            }
        });

        jLabel9.setText("Ciudad:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Tunja" }));

        jLabel12.setText("Fecha:");

        jLabel13.setText("Hora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 180, Short.MAX_VALUE)
                            .addComponent(Num_doc)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(49, 49, 49))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Volver_menu)
                                    .addGap(7, 7, 7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(Crear_servicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_menu)
                    .addComponent(Crear_servicio))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crear_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_servicioActionPerformed
        
        //Poner el costo del servicio en el JLabel de la otra ventana
        Costo_servicio.setText("Aqui poner el costo del servicio");
        
        Confir_servicio.setVisible(true);
        
    }//GEN-LAST:event_Crear_servicioActionPerformed

    private void Volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_menuActionPerformed
        
        this.setVisible(false);
        new Menu_Cliente().setVisible(true);
        
    }//GEN-LAST:event_Volver_menuActionPerformed

    private void Sí_crear_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sí_crear_servicioActionPerformed
        
        //Poner en blanco el JLabler del costo
        Costo_servicio.setText("");
        
        //Poner en blanco los JTextField
        Num_doc.setText("");
        Dir_servicio.setText("");
        Descri_servicio.setText("");
        
        this.setVisible(false);
        Confir_servicio.setVisible(false);
        Aviso_servicio_creado.setVisible(true);
        
    }//GEN-LAST:event_Sí_crear_servicioActionPerformed

    private void No_crear_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_crear_servicioActionPerformed
        
        //Poner en blanco el JLabler del costo
        Costo_servicio.setText("");
        
        Confir_servicio.setVisible(false);
        
    }//GEN-LAST:event_No_crear_servicioActionPerformed

    private void Fin_crear_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fin_crear_servicioActionPerformed
        
        this.setVisible(false);
        Aviso_servicio_creado.setVisible(false);
        new Menu_Cliente().setVisible(true);
        
    }//GEN-LAST:event_Fin_crear_servicioActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Crear_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Crear_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Crear_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Crear_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Crear_servicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Aviso_servicio_creado;
    private javax.swing.JDialog Confir_servicio;
    private javax.swing.JLabel Costo_servicio;
    private javax.swing.JButton Crear_servicio;
    private javax.swing.JTextArea Descri_servicio;
    private javax.swing.JTextArea Dir_servicio;
    private javax.swing.JButton Fin_crear_servicio;
    private javax.swing.JButton No_crear_servicio;
    private javax.swing.JTextField Num_doc;
    private javax.swing.JButton Sí_crear_servicio;
    private javax.swing.JButton Volver_menu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}