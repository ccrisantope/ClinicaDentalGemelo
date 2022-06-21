
package medicasoft.capa2_aplicacion;


import medicasoft.Capa3_Dominio.Dentista;
import medicasoft.capa4_persistencia.AccesoDatosJDBC;
import medicasoft.capa4_persistencia.AccesoDatosJDBCPostgresSQL;
import medicasoft.capa4_persistencia.DentistaPostgresSQL;

public class RegistrarDentistaServicio {

    private AccesoDatosJDBC AccesoDatosJDBC;
    private DentistaPostgresSQL DentistaPostgresSQL;

    public RegistrarDentistaServicio() {
        AccesoDatosJDBC = new AccesoDatosJDBCPostgresSQL();
        DentistaPostgresSQL = new DentistaPostgresSQL(AccesoDatosJDBC);
    }

    public void GuardarDentista(Dentista dentista)throws Exception {
        if (!dentista.tienecodigoValido()) {
            throw new Exception("El codigo ingresado no es valido.");
        }
        AccesoDatosJDBC.abrirConexion();
        AccesoDatosJDBC.iniciarTransaccion();
        DentistaPostgresSQL.guardar(dentista);
        AccesoDatosJDBC.terminarTransaccion();
    }
}//end RegistraPacienteServicio
