package medicasoft.capa4_persistencia;

import medicasoft.Capa3_Dominio.Dentista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Lizeth
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */
public class DentistaPostgresSQL {

    private AccesoDatosJDBC accesoDatosJDBC;

    public DentistaPostgresSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }

    public void guardar(Dentista dentista) throws Exception {
        String insertSQL = "insert into dentista(codigo,nombre,telefono) values(?,?,?)";
        
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, dentista.getCodigo());
            sentencia.setString(2, dentista.getNombre());
            sentencia.setString(3, dentista.getTelefono());
            System.out.println(sentencia.toString());
            sentencia.executeUpdate();
            
        } catch (Exception e) {
            throw new Exception("Error al intentar guardar el dentista.", e);
        }
    }

    public Dentista buscar(String codigo) throws Exception {
        String consultaSQL = "select codigo,nombre from dentista where codigo = ?";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, codigo);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Dentista dentista = new Dentista();
                dentista.setCodigo(codigo);
                dentista.setNombre(resultado.getString("nombre"));
                return dentista;
            } else {
                throw new Exception("No existe el dentista.");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar el dentista", e);
        }
    }

}//end DentistaPostgresSQL
