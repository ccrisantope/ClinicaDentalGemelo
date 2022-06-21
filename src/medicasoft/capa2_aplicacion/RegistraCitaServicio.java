package medicasoft.capa2_aplicacion;

import medicasoft.Capa3_Dominio.Cita;
import medicasoft.Capa3_Dominio.Dentista;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.capa4_persistencia.AccesoDatosJDBC;
import medicasoft.capa4_persistencia.AccesoDatosJDBCPostgresSQL;
import medicasoft.capa4_persistencia.CitaPostgresSQL;
import medicasoft.capa4_persistencia.PacientePostgresSQL;
import medicasoft.capa4_persistencia.DentistaPostgresSQL;

/**
 * @author Lizeth
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */
public class RegistraCitaServicio {

    private AccesoDatosJDBC AccesoDatosJDBC;
    private CitaPostgresSQL CitaPostgresSQL;
    private DentistaPostgresSQL DentistaPostgresSQL;
    private PacientePostgresSQL PacientePostgresSQL;

    public RegistraCitaServicio() {
        AccesoDatosJDBC = new AccesoDatosJDBCPostgresSQL();
        PacientePostgresSQL = new PacientePostgresSQL(AccesoDatosJDBC);
        CitaPostgresSQL = new CitaPostgresSQL(AccesoDatosJDBC);
        DentistaPostgresSQL = new DentistaPostgresSQL(AccesoDatosJDBC);
    }

    public Cita BuscarCitaServicio(String codigo) throws Exception {
        AccesoDatosJDBC.abrirConexion();
        Cita cita = CitaPostgresSQL.buscar(codigo);
        AccesoDatosJDBC.cerrarConexion();
        return cita;
    }

    public Dentista BuscarDentista(String codigo) throws Exception {
        AccesoDatosJDBC.abrirConexion();
        Dentista dentista = DentistaPostgresSQL.buscar(codigo);
        AccesoDatosJDBC.cerrarConexion();
        return dentista;
    }

    public Paciente BuscarPaciente(String dni) throws Exception {
        AccesoDatosJDBC.abrirConexion();
        Paciente paciente = PacientePostgresSQL.buscar(dni);
        AccesoDatosJDBC.cerrarConexion();
        return paciente;
    }

    public void GuadarCita(Cita cita) throws Exception {
        Paciente paciente = cita.getM_Paciente();
        AccesoDatosJDBC.abrirConexion();
        //int totalDeCitas = CitaPostgresSQL.consultarTotalDeCitas(paciente);
        //if (!cita.permiteNuevaCita(totalDeCitas)) {
          //  throw new Exception("El total de citas llego al limite.");
        //}
        AccesoDatosJDBC.iniciarTransaccion();
        CitaPostgresSQL.guardar(cita);
        AccesoDatosJDBC.terminarTransaccion();
    }
     public void VerificarFecha(Cita fecha) throws Exception {
         
     }
}//end RegistraCitaServicio
