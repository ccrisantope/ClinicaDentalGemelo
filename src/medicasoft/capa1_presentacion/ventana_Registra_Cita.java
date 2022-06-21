package medicasoft.capa1_presentacion;

import medicasoft.capa2_aplicacion.RegistraCitaServicio;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.Capa3_Dominio.Dentista;
import medicasoft.Capa3_Dominio.Cita;
import medicasoft.Capa3_Dominio.TipoCita;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import medicasoft.Capa3_Dominio.TipoCita;

public class ventana_Registra_Cita extends javax.swing.JFrame {

    private Cita cita;
    private RegistraCitaServicio registrarCitaServicio;
    
    public ventana_Registra_Cita(java.awt.Frame parent, boolean modal) {
       //  super(parent, modal);
        initComponents();
        //Carga de Combobox
       
        inicializarNuevoCita();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        cbodescuento = new javax.swing.JComboBox<>();
        cbotipocita = new javax.swing.JComboBox<>();
        txtobservacion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        cdfecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        txtdnipaciente = new javax.swing.JTextField();
        btnbuuscarpaciente = new javax.swing.JButton();
        txtnombrepaciente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtnombredentista = new javax.swing.JTextField();
        btnbuscardentista = new javax.swing.JButton();
        txtcodigodentista = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("REGISTRAR CITA");

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO:"));

        txtcosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO:"));

        cbodescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCUENTO", "20", "25" }));
        cbodescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodescuentoActionPerformed(evt);
            }
        });

        cbotipocita.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE CITA:"));
        cbotipocita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipocitaActionPerformed(evt);
            }
        });

        txtobservacion.setBorder(javax.swing.BorderFactory.createTitledBorder("OBSERVACION:"));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        cdfecha.setBorder(javax.swing.BorderFactory.createTitledBorder("CALENDARIO:"));

        txtdnipaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI DEL PACIENTE:"));

        btnbuuscarpaciente.setText("BUSCAR PACIENTE");
        btnbuuscarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuuscarpacienteActionPerformed(evt);
            }
        });

        txtnombrepaciente.setEditable(false);
        txtnombrepaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE DEL PACIENTE:"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtdnipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnbuuscarpaciente)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdnipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuuscarpaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        txtnombredentista.setEditable(false);
        txtnombredentista.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE DEL DENTISTA:"));

        btnbuscardentista.setText("BUSCAR DENTISTA");
        btnbuscardentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardentistaActionPerformed(evt);
            }
        });

        txtcodigodentista.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO DEL DENTISTA:"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnombredentista, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtcodigodentista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscardentista)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscardentista)
                    .addComponent(txtcodigodentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(txtnombredentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txthora.setBorder(javax.swing.BorderFactory.createTitledBorder("HORA:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtobservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(btnmodificar)
                                            .addGap(139, 139, 139)
                                            .addComponent(btnguardar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnsalir))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 105, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cdfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cbotipocita, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbodescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)))))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cbotipocita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtobservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbodescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmodificar)
                            .addComponent(btnguardar))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsalir)
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void inicializarNuevoCita() {
        registrarCitaServicio = new RegistraCitaServicio();
         try {
            System.out.println("PRE");
            registrarCitaServicio.listarTipoCita(cbotipocita);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar combobox", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        cita = new Cita();
        txtcodigo.requestFocus();
        txtcodigo.setText("");
        txtcosto.setText("");
        cbodescuento.setSelectedIndex(0);
        cbotipocita.setSelectedIndex(0);
        txtobservacion.setText("");
        txtdnipaciente.setText("");
        txtnombrepaciente.setText("");
        btnbuuscarpaciente.setEnabled(true);
        txtnombredentista.setText("");
        btnbuscardentista.setEnabled(true);
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            capturarDatosDeCita();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarCita();
            inicializarNuevoCita();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        inicializarNuevoCita();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuuscarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuuscarpacienteActionPerformed
        String dni = txtdnipaciente.getText().trim();
        try {
            Paciente paciente = registrarCitaServicio.BuscarPaciente(dni);
            cita.setM_Paciente(paciente);
            txtnombrepaciente.setText(paciente.getNombre());
            activarBotonGuardarpaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtnombrepaciente.setText("");
            txtdnipaciente.requestFocus();
        }
    }//GEN-LAST:event_btnbuuscarpacienteActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnbuscardentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardentistaActionPerformed
        String codigo = txtcodigodentista.getText().trim();
        try {
            Dentista dentista = registrarCitaServicio.BuscarDentista(codigo);
            cita.setM_Dentista(dentista);
            txtnombredentista.setText(dentista.getNombre());
            activarBotonGuardarDentista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtnombredentista.setText("");
            txtcodigodentista.requestFocus();
        }
    }//GEN-LAST:event_btnbuscardentistaActionPerformed

    private void cbodescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbodescuentoActionPerformed

    private void cbotipocitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipocitaActionPerformed
        if(cbotipocita.getSelectedIndex()!=0){
            String indice= cbotipocita.getSelectedItem().toString();
            
        try {
            System.out.println("PRE");
            TipoCita tp =registrarCitaServicio.BuscarTipoCita(indice);
            cita.setM_TipoCita(tp);
            txtcosto.setText(String.format("%.2f",registrarCitaServicio.buscarTarifa(tp.getDescripcion())));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar monto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        }
        
    }//GEN-LAST:event_cbotipocitaActionPerformed
    private void guardarCita() throws Exception, HeadlessException {
        registrarCitaServicio.GuadarCita(cita);
        JOptionPane.showMessageDialog(this, "Se guardo la cita", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void capturarDatosDeCita() throws NumberFormatException {
        try{
        String sc=new String();
        sc=txthora.getText().trim();
        Date hour = new SimpleDateFormat("HH:mm").parse(sc);
        cita.setCodigo(txtcodigo.getText().trim());
        cita.setCosto(Double.parseDouble(txtcosto.getText().trim()));
        cita.setDescuento(Double.parseDouble(cbodescuento.getSelectedItem().toString()));

        cita.setObservacion(txtobservacion.getText().trim());
        cita.setHora(hour);
        
        cita.setFecha(cdfecha.getDate());
        
        cita.m_Paciente.setDNI(txtdnipaciente.getText());
        cita.m_Dentista.setCodigo(txtcodigodentista.getText());
        cita.m_TipoCita.setDescripcion("profilaxis");//cbotipocita.getSelectedItem().toString());
        
        //System.out.println(cita.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void activarBotonGuardarpaciente() {
        if (cita.getM_Paciente() != null && cita.getM_Paciente() != null) {
            btnguardar.setEnabled(true);
        } else {
            btnguardar.setEnabled(false);
        }
    }

    private void activarBotonGuardarDentista() {
        if (cita.getM_Dentista() != null && cita.getM_Dentista() != null) {
            btnguardar.setEnabled(true);
        } else {
            btnguardar.setEnabled(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscardentista;
    private javax.swing.JButton btnbuuscarpaciente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbodescuento;
    private javax.swing.JComboBox<String> cbotipocita;
    private com.toedter.calendar.JDateChooser cdfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigodentista;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtdnipaciente;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtnombredentista;
    private javax.swing.JTextField txtnombrepaciente;
    private javax.swing.JTextField txtobservacion;
    // End of variables declaration//GEN-END:variables

    private Date SimpleDateFormat(String hhmm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
