
package medicasoft.capa1_presentacion;
import medicasoft.Capa3_Dominio.Dentista;
import medicasoft.capa2_aplicacion.RegistrarDentistaServicio;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
        


public class ventana_Registrar_Dentista extends javax.swing.JFrame {

    private RegistrarDentistaServicio registrarDentistaServicio;
    private Dentista dentista;
    public ventana_Registrar_Dentista(java.awt.Frame parent, boolean modal) {
     
        initComponents();
        inicializarNuevoDentista();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("REGISTRAR DENTISTA");

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO:"));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE:"));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONO:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnguardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void inicializarNuevoDentista() {
        registrarDentistaServicio = new RegistrarDentistaServicio();
        dentista = new Dentista();
        txtcodigo.setText("");
        txtnombre.setText("");
        txttelefono.setText("");
        txtcodigo.requestFocus();
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            capturarDatosDeDentista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertenia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarDentista();
            inicializarNuevoDentista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertenia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnguardarActionPerformed
 private void guardarDentista() throws Exception {
        registrarDentistaServicio.GuardarDentista(dentista);
        JOptionPane.showMessageDialog(this, "Se guardaron los datos del dentista", "Información", JOptionPane.INFORMATION_MESSAGE);        
    }

    private void capturarDatosDeDentista() throws NumberFormatException {
        dentista.setCodigo(txtcodigo.getText().trim());
        dentista.setNombre(txtnombre.getText().trim());
        dentista.setTelefono(txttelefono.getText().trim());
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
