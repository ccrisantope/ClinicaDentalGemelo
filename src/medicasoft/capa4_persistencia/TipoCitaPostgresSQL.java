
package medicasoft.capa4_persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import medicasoft.Capa3_Dominio.TipoCita;


public class TipoCitaPostgresSQL {
    private AccesoDatosJDBC accesoDatosJDBC;

    public TipoCitaPostgresSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }

    public void guardar(TipoCita tipoCita) throws Exception {
        String insertSQL = "insert into tipoCita(descripcion,tarifa) values(?,?)";
        
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, tipoCita.getDescripcion());
            sentencia.setDouble(2, tipoCita.getTarifa());
            System.out.println(sentencia.toString());
            sentencia.executeUpdate();
            
        } catch (Exception e) {
            throw new Exception("Error al intentar guardar el tipoCita.", e);
        }
    }

    public TipoCita buscar(String descripcion) throws Exception {
        String consultaSQL = "select descripcion,tarifa from tipoCita where descripcion = ?";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, descripcion);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                TipoCita tipoCita = new TipoCita();

                tipoCita.setDescripcion(resultado.getString("descripcion"));
                tipoCita.setTarifa(resultado.getDouble("tarifa"));
                return tipoCita;
            } else {
                throw new Exception("No existe el tipoCita.");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar el tipoCita", e);
        }
    }
    public void listar(JComboBox cboTipo) throws Exception {
        String consultaSQL = "select descripcion from tipocita";
        System.out.println("Listar");
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            cboTipo.addItem("Seleccione una opcion:");
            while (resultado.next()) {
                cboTipo.addItem(resultado.getString("descripcion"));
            }
                //return tipoCita;
            
        } catch (Exception e) {
            throw new Exception("Error al intentar al listar el  tipo de Cita", e);
        }
    }
    public double buscarTarifa(String descripcion) throws Exception {
        String consultaSQL = "select tarifa from tipocita where descripcion = ?";
        double tarifa;
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, descripcion);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                tarifa=resultado.getDouble("tarifa");
                return tarifa;
            } else {
                throw new Exception("No existe el tipoCita.");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar el tipoCita", e);
        }
    }
       
    
}
