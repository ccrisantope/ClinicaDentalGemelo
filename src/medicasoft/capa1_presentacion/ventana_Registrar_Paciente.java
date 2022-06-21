
package medicasoft.capa1_presentacion;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.capa2_aplicacion.RegistraPacienteServicio;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import medicasoft.Capa3_Dominio.Cita;

public class ventana_Registrar_Paciente extends javax.swing.JFrame {

     private RegistraPacienteServicio registrarPacienteServicio;
    private Paciente paciente;
    public ventana_Registrar_Paciente(java.awt.Frame parent, boolean modal) {
        initComponents();
         setLocationRelativeTo(null); //.
        inicializarNuevoPaciente();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("REGISTRAR PACIENTE");

        txtdni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI:"));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONO:"));

        txtdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCION:"));

        txtedad.setBorder(javax.swing.BorderFactory.createTitledBorder("EDAD:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttelefono)
                        .addGap(155, 155, 155))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnguardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnguardar)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void inicializarNuevoPaciente() {
        registrarPacienteServicio = new RegistraPacienteServicio();
        paciente = new Paciente();
       
        txtdni.setText("");
        txtnombre.setText("");
         txtedad.setText("");
         txtdireccion.setText("");
         txttelefono.setText("");
         txtdni.requestFocus();
         
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      try {
            capturarDatosDePaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertenia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarPaciente();
            inicializarNuevoPaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertenia", JOptionPane.WARNING_MESSAGE);
        } 
        
    }//GEN-LAST:event_btnguardarActionPerformed
private void guardarPaciente() throws Exception {
        registrarPacienteServicio.GuardarPaciente(paciente);
        JOptionPane.showMessageDialog(this, "Se guardaron los datos del paciente", "Información", JOptionPane.INFORMATION_MESSAGE);        
    }

    private void capturarDatosDePaciente() throws NumberFormatException {
        paciente.setDNI(txtdni.getText().trim());
        paciente.setNombre(txtnombre.getText().trim());
        paciente.setDireccion(txtdireccion.getText().trim());
        paciente.setTelefono(txttelefono.getText().trim());
        paciente.setEdad(txtedad.getText().trim());
        
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
