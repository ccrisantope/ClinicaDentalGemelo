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
        jCheckBox1 = new javax.swing.JCheckBox();
        txtDescuento = new javax.swing.JTextField();
        txtMontoTotal1 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRAR CITA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO:"));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 156, -1));

        txtcosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO:"));
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 156, -1));

        cbotipocita.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE CITA:"));
        cbotipocita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipocitaActionPerformed(evt);
            }
        });
        getContentPane().add(cbotipocita, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 156, -1));

        txtobservacion.setBorder(javax.swing.BorderFactory.createTitledBorder("OBSERVACION:"));
        getContentPane().add(txtobservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 519, 65));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));

        cdfecha.setBorder(javax.swing.BorderFactory.createTitledBorder("CALENDARIO:"));
        getContentPane().add(cdfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 136, -1));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbuuscarpaciente)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdnipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuuscarpaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombrepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 530, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        txthora.setBorder(javax.swing.BorderFactory.createTitledBorder("HORA:"));
        getContentPane().add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 118, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        txtDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCUENTO(%)"));
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, -1));

        txtMontoTotal1.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Total:"));
        getContentPane().add(txtMontoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 135, -1));

        setSize(new java.awt.Dimension(785, 700));
        setLocationRelativeTo(null);
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
        
        cbotipocita.setSelectedIndex(0);
        txtobservacion.setText("");
        txtdnipaciente.setText("");
        txtnombrepaciente.setText("");
        btnbuuscarpaciente.setEnabled(true);
        txtnombredentista.setText("");
        btnbuscardentista.setEnabled(true);
        txtDescuento.setText("0");
        txtDescuento.setEnabled(false);
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
            txtDescuento.setEnabled(true);
        else{
            txtDescuento.setText("0");
            txtDescuento.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed
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
        cita.setDescuento(Double.parseDouble(txtDescuento.getText()));

        cita.setObservacion(txtobservacion.getText().trim());
        cita.setHora(hour);
        
        cita.setFecha(cdfecha.getDate());
        
        cita.m_Paciente.setDNI(txtdnipaciente.getText());
        cita.m_Dentista.setCodigo(txtcodigodentista.getText());
        cita.m_TipoCita.setDescripcion(cbotipocita.getSelectedItem().toString());
        cita.calcularcostocitatotal();
        txtMontoTotal1.setText(String.format("%.2f", cita.getMontototal()));
        
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
    private javax.swing.JComboBox<String> cbotipocita;
    private com.toedter.calendar.JDateChooser cdfecha;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtMontoTotal1;
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
