package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class Registro_Cliente extends javax.swing.JFrame {


    public Registro_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Aviso_registro_cli.setLocationRelativeTo(null);
        this.Aviso_registro_cli.setSize(450, 155);
    }
    
    Menu_Cliente menu = new Menu_Cliente();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aviso_registro_cli = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        Conti_aviso_cli = new javax.swing.JButton();
        Panel_cliente = new javax.swing.JTabbedPane();
        Basicos_cliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pri_ape_cli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Seg_ape_cli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tipo_doc_cli = new javax.swing.JComboBox<>();
        Pri_nom_cli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Seg_nom_cli = new javax.swing.JTextField();
        Num_doc_cli = new javax.swing.JTextField();
        Conti_panel_cli = new javax.swing.JButton();
        Salir_panel_cli = new javax.swing.JButton();
        Contacto_cliente = new javax.swing.JPanel();
        Tipo_dir_cli = new javax.swing.JComboBox<>();
        Num1_dir_cli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Num2_dir_cli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tel_cli = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        Cor_cli = new javax.swing.JTextField();
        Regis_cli = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Barrio_cli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Ciu_cli = new javax.swing.JTextField();
        Atras_panel1 = new javax.swing.JButton();

        Aviso_registro_cli.setTitle("En desarrollo");
        Aviso_registro_cli.setMinimumSize(new java.awt.Dimension(400, 105));

        jLabel10.setText("Registro exitoso, habilitada opción de solicitar servicio");

        Conti_aviso_cli.setText("Continuar");
        Conti_aviso_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conti_aviso_cliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Aviso_registro_cliLayout = new javax.swing.GroupLayout(Aviso_registro_cli.getContentPane());
        Aviso_registro_cli.getContentPane().setLayout(Aviso_registro_cliLayout);
        Aviso_registro_cliLayout.setHorizontalGroup(
            Aviso_registro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aviso_registro_cliLayout.createSequentialGroup()
                .addGroup(Aviso_registro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Aviso_registro_cliLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10))
                    .addGroup(Aviso_registro_cliLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Conti_aviso_cli)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        Aviso_registro_cliLayout.setVerticalGroup(
            Aviso_registro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aviso_registro_cliLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(Conti_aviso_cli)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("En desarrollo");

        Panel_cliente.setMinimumSize(new java.awt.Dimension(400, 334));

        jLabel3.setText("Primer apellido:");

        jLabel4.setText("Segundo apellido:");

        jLabel5.setText("Tipo documento:");

        jLabel1.setText("Primer nombre:");

        Tipo_doc_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de ciudadanía", "Cédula de extranjería", "Tarjeta de identidad" }));

        jLabel6.setText("Número documento:");

        jLabel2.setText("Segundo nombre:");

        Conti_panel_cli.setText("Continuar");
        Conti_panel_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conti_panel_cliActionPerformed(evt);
            }
        });

        Salir_panel_cli.setText("Salir");
        Salir_panel_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_panel_cliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Basicos_clienteLayout = new javax.swing.GroupLayout(Basicos_cliente);
        Basicos_cliente.setLayout(Basicos_clienteLayout);
        Basicos_clienteLayout.setHorizontalGroup(
            Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Basicos_clienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Basicos_clienteLayout.createSequentialGroup()
                        .addComponent(Salir_panel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Conti_panel_cli))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Basicos_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Num_doc_cli))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Basicos_clienteLayout.createSequentialGroup()
                        .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Basicos_clienteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pri_ape_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Basicos_clienteLayout.createSequentialGroup()
                                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pri_nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seg_nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Basicos_clienteLayout.createSequentialGroup()
                                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Seg_ape_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tipo_doc_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        Basicos_clienteLayout.setVerticalGroup(
            Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Basicos_clienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Pri_nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Seg_nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pri_ape_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Seg_ape_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tipo_doc_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Num_doc_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Basicos_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conti_panel_cli)
                    .addComponent(Salir_panel_cli))
                .addGap(14, 14, 14))
        );

        Panel_cliente.addTab("Basicos", Basicos_cliente);

        Tipo_dir_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Carrera" }));

        jLabel7.setText("#");

        jLabel8.setText("Teléfono(s):");

        Tel_cli.setColumns(20);
        Tel_cli.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Tel_cli.setLineWrap(true);
        Tel_cli.setRows(3);
        jScrollPane1.setViewportView(Tel_cli);

        jLabel9.setText("Correo electronico:");

        Regis_cli.setText("Registrar");
        Regis_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regis_cliActionPerformed(evt);
            }
        });

        jLabel11.setText("Barrio:");

        jLabel12.setText("Ciudad:");

        Atras_panel1.setText("Atras");
        Atras_panel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_panel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Contacto_clienteLayout = new javax.swing.GroupLayout(Contacto_cliente);
        Contacto_cliente.setLayout(Contacto_clienteLayout);
        Contacto_clienteLayout.setHorizontalGroup(
            Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contacto_clienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Contacto_clienteLayout.createSequentialGroup()
                        .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(Contacto_clienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Cor_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                                .addComponent(Atras_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Regis_cli)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Contacto_clienteLayout.createSequentialGroup()
                                        .addComponent(Tipo_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(Num1_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Num2_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Contacto_clienteLayout.createSequentialGroup()
                                        .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(74, 74, 74))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(69, 69, 69)))
                                        .addGap(4, 4, 4)
                                        .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Ciu_cli, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Barrio_cli, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(80, 80, 80))))))
        );
        Contacto_clienteLayout.setVerticalGroup(
            Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contacto_clienteLayout.createSequentialGroup()
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Contacto_clienteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Tipo_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num2_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Num1_dir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Barrio_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Ciu_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Contacto_clienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contacto_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)))
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(Contacto_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regis_cli)
                    .addComponent(Atras_panel1))
                .addGap(14, 14, 14))
        );

        Panel_cliente.addTab("Contacto", Contacto_cliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Regis_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regis_cliActionPerformed
        
        
        //Si el registro es exitoso, poner esto :3
        Aviso_registro_cli.setVisible(true);
        //Dejar en blanco todos los JTextField
        Pri_nom_cli.setText("");
        Seg_nom_cli.setText("");
        Pri_ape_cli.setText("");
        Seg_ape_cli.setText("");
        Num_doc_cli.setText("");
        Num1_dir_cli.setText("");
        Num2_dir_cli.setText("");
        Barrio_cli.setText("");
        Ciu_cli.setText("");
        Tel_cli.setText("");
        Cor_cli.setText("");
        
        
    }//GEN-LAST:event_Regis_cliActionPerformed

    private void Conti_aviso_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conti_aviso_cliActionPerformed
        
        this.setVisible(false);
        Aviso_registro_cli.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_Conti_aviso_cliActionPerformed

    private void Conti_panel_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conti_panel_cliActionPerformed
        
        Panel_cliente.setSelectedIndex(1);
        
    }//GEN-LAST:event_Conti_panel_cliActionPerformed

    private void Atras_panel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_panel1ActionPerformed
        
        Panel_cliente.setSelectedIndex(0);
        
    }//GEN-LAST:event_Atras_panel1ActionPerformed

    private void Salir_panel_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_panel_cliActionPerformed
        
        this.setVisible(false);
        new Inicio().setVisible(true);
        
    }//GEN-LAST:event_Salir_panel_cliActionPerformed

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
//            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro_Cliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_panel1;
    private javax.swing.JDialog Aviso_registro_cli;
    private javax.swing.JTextField Barrio_cli;
    private javax.swing.JPanel Basicos_cliente;
    private javax.swing.JTextField Ciu_cli;
    private javax.swing.JPanel Contacto_cliente;
    private javax.swing.JButton Conti_aviso_cli;
    private javax.swing.JButton Conti_panel_cli;
    private javax.swing.JTextField Cor_cli;
    private javax.swing.JTextField Num1_dir_cli;
    private javax.swing.JTextField Num2_dir_cli;
    private javax.swing.JTextField Num_doc_cli;
    private javax.swing.JTabbedPane Panel_cliente;
    private javax.swing.JTextField Pri_ape_cli;
    private javax.swing.JTextField Pri_nom_cli;
    private javax.swing.JButton Regis_cli;
    private javax.swing.JButton Salir_panel_cli;
    private javax.swing.JTextField Seg_ape_cli;
    private javax.swing.JTextField Seg_nom_cli;
    private javax.swing.JTextArea Tel_cli;
    private javax.swing.JComboBox<String> Tipo_dir_cli;
    private javax.swing.JComboBox<String> Tipo_doc_cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
