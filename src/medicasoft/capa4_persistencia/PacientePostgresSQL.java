package medicasoft.capa4_persistencia;
import medicasoft.Capa3_Dominio.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PacientePostgresSQL {

 private AccesoDatosJDBC accesoDatosJDBC;

    public PacientePostgresSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }
     public void guardar(Paciente paciente) throws Exception {
        String insertSQL = "insert into paciente(dni,nombre,direccion,telefono,edad) values(?,?,?,?,?)";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, paciente.getDNI());
            sentencia.setString(2, paciente.getNombre());
            sentencia.setString(3, paciente.getDireccion());
            sentencia.setString(4, paciente.getTelefono());
            sentencia.setString(5, paciente.getEdad());
            sentencia.executeUpdate();
        }catch (Exception e) {
            throw new Exception("Error al intentar guardar el paciente.", e);
        }
    }
      public Paciente buscar(String dni) throws Exception {
        String consultaSQL = "select dni,nombre from paciente where dni = ?";
        PreparedStatement sentencia;        
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, dni);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Paciente paciente = new Paciente();
                paciente.setDNI(dni);
                paciente.setNombre(resultado.getString("nombre"));
                return paciente;
            }
            else {
                throw new Exception("No existe el paciente.");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar el paciente", e);
        }
    }
    
     
}//end PacientePostgresSQL