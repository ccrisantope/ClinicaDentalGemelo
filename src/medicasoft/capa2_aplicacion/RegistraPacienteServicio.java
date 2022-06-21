package medicasoft.capa2_aplicacion;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.capa4_persistencia.AccesoDatosJDBC;
import medicasoft.capa4_persistencia.AccesoDatosJDBCPostgresSQL;
import medicasoft.capa4_persistencia.PacientePostgresSQL;
/**
 * @author Lizeth
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */


public class RegistraPacienteServicio {

    private AccesoDatosJDBC AccesoDatosJDBC;
    private PacientePostgresSQL PacientePostgresSQL;

    public RegistraPacienteServicio() {
        AccesoDatosJDBC = new AccesoDatosJDBCPostgresSQL();
        PacientePostgresSQL = new PacientePostgresSQL(AccesoDatosJDBC);
    }

    public void GuardarPaciente(Paciente paciente)throws Exception {
        if (!paciente.tieneDNIValido()) {
            throw new Exception("El DNI ingresado no es valido.");
        }
        AccesoDatosJDBC.abrirConexion();
        AccesoDatosJDBC.iniciarTransaccion();
        PacientePostgresSQL.guardar(paciente);
        AccesoDatosJDBC.terminarTransaccion();
    }
}//end RegistraPacienteServicio
