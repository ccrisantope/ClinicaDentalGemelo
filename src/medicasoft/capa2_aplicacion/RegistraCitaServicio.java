package medicasoft.capa2_aplicacion;

import medicasoft.Capa3_Dominio.Cita;
import medicasoft.Capa3_Dominio.Dentista;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.Capa3_Dominio.TipoCita;
import medicasoft.capa4_persistencia.AccesoDatosJDBC;
import medicasoft.capa4_persistencia.AccesoDatosJDBCPostgresSQL;
import medicasoft.capa4_persistencia.CitaPostgresSQL;
import medicasoft.capa4_persistencia.PacientePostgresSQL;
import medicasoft.capa4_persistencia.DentistaPostgresSQL;
import medicasoft.capa4_persistencia.TipoCitaPostgresSQL;
import javax.swing.*;

public class RegistraCitaServicio {

    private AccesoDatosJDBC AccesoDatosJDBC;
    private CitaPostgresSQL CitaPostgresSQL;
    private DentistaPostgresSQL DentistaPostgresSQL;
    private PacientePostgresSQL PacientePostgresSQL;
    private TipoCitaPostgresSQL TipoCitaPostgresSQL;

    public RegistraCitaServicio() {
        AccesoDatosJDBC = new AccesoDatosJDBCPostgresSQL();
        PacientePostgresSQL = new PacientePostgresSQL(AccesoDatosJDBC);
        CitaPostgresSQL = new CitaPostgresSQL(AccesoDatosJDBC);
        DentistaPostgresSQL = new DentistaPostgresSQL(AccesoDatosJDBC);
        TipoCitaPostgresSQL = new TipoCitaPostgresSQL(AccesoDatosJDBC);
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
    public TipoCita BuscarTipoCita(String descripcion) throws Exception {
        AccesoDatosJDBC.abrirConexion();
        TipoCita tipoCita = TipoCitaPostgresSQL.buscar(descripcion);
        AccesoDatosJDBC.cerrarConexion();
        return tipoCita;
    }
    public void listarTipoCita(JComboBox cboLista) throws Exception {
        System.out.println("PRE");
        AccesoDatosJDBC.abrirConexion();
        System.out.println("LLAMADO A TSLQ");
        TipoCitaPostgresSQL.listar(cboLista);
        System.out.println("POST");
        AccesoDatosJDBC.cerrarConexion();
        //return tipoCita;
    }
    
     public double buscarTarifa(String descripcion) throws Exception {
        System.out.println("PRE");
        AccesoDatosJDBC.abrirConexion();
        System.out.println("LLAMADO A TSLQ");
        double tarifa=TipoCitaPostgresSQL.buscarTarifa(descripcion);
        System.out.println("POST");
        AccesoDatosJDBC.cerrarConexion();
        return tarifa;
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
