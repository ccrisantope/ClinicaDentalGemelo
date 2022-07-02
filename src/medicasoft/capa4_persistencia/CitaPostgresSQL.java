package medicasoft.capa4_persistencia;

import java.sql.Date;
import java.sql.Time;
import medicasoft.Capa3_Dominio.Cita;
import medicasoft.Capa3_Dominio.Paciente;
import medicasoft.Capa3_Dominio.Dentista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;



public class CitaPostgresSQL {

    private AccesoDatosJDBC accesoDatosJDBC;

    public CitaPostgresSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }

    public void guardar(Cita cita) throws Exception {
        String insertSQL = "insert into cita(codigo,costo,descuento,fecha,observacion,tipocita,dnipaciente,codigodentista,hora,montototal) values(?,?,?,?,?,?,?,?,?,?)";
        
        Date fec= new Date(cita.getFecha().getTime());
        Time hora= new Time(cita.getHora().getTime());
        fec.toString();
        
        System.out.println(cita.toString());
        System.out.println(fec.toString());
        System.out.println(cita.toString());
        
        PreparedStatement sentencia;
        try {
            
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, cita.getCodigo());
            sentencia.setDouble(2, cita.getCosto());
            sentencia.setDouble(3, cita.getDescuento());
            sentencia.setDate(4, fec);
            sentencia.setString(5, cita.getObservacion());
            sentencia.setString(6, cita.m_TipoCita.getDescripcion());
            sentencia.setString(7, cita.m_Paciente.getDNI());
            sentencia.setString(8, cita.m_Dentista.getCodigo());
            
            System.out.println(sentencia.toString());
            sentencia.setTime(9,hora);
            sentencia.setDouble(10,cita.getMontototal());
            
            System.out.println(sentencia.toString());
            String word=sentencia.toString();
            sentencia.executeLargeUpdate();
            
            
        } catch (Exception e) {
            throw new Exception("Error al intentar guardar la cita.", e);
        }
    }
    
        public void listarHorario(JComboBox cboTipo, java.sql.Date fecha) throws Exception {
        
        String insertSQL = "select horasdisponibles from parametrohora except select hora from cita where cita.fecha= ? order by horasdisponibles";
        System.out.println("ListarHora");
        
        
        PreparedStatement sentencia;
        try {
            
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            
            sentencia.setDate(1,fecha);
            System.out.println(sentencia.toString());
            ResultSet resultado = sentencia.executeQuery();

            System.out.println(resultado.toString());
            cboTipo.addItem("Seleccione una opcion:");
            while (resultado.next()) {
                cboTipo.addItem(resultado.getString("horasdisponibles"));
            }
                //return tipoCita;
            
        } catch (Exception e) {
            throw new Exception("Error al intentar al listar horas disponibles", e);
        }
    }
    
    public int consultarTotalDeCitas(Date  fecha) throws Exception {
        String consultaSQL = "select count(cita) as total from cita where fecha = ?";
        PreparedStatement sentencia2;
        int totalDeCitas = 0;
        Date fec= new Date(fecha.getTime());
        try {
            sentencia2 = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia2.setDate(1, fec);
            System.out.println(sentencia2.toString());
            ResultSet resultado = sentencia2.executeQuery();
            
            if (resultado.next()) {
                System.out.println("Citas antes:" + totalDeCitas);
                totalDeCitas = resultado.getInt("total");
                
                System.out.println("Citas dia:" + totalDeCitas);
                
            }
            
        } catch (Exception e) {
            throw new Exception("Error al intentar consultar citas", e);
        }
        return totalDeCitas;
    }
    public Cita buscar(String codigo) throws Exception {
        String consultaSQL = "select codigo,costo, descuento,fecha, hora,observacion,tipocita" + "from cita where codigo = ?";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, codigo);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Cita cita = new Cita();
                cita.setCodigo(codigo);
                cita.setCosto(resultado.getDouble("costo"));
                cita.setFecha(resultado.getDate("Fecha"));
                cita.setHora(resultado.getTime("Hora"));
                cita.setObservacion(resultado.getString("observacion"));
                
                
                return cita;
            } else {
                throw new Exception("No existe la cita");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar la cita");
        }
    }
}//end CitaPostgresSQL
