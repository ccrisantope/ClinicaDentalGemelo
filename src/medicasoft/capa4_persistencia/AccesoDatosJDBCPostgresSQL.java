package medicasoft.capa4_persistencia;

import java.sql.DriverManager;
/**
 * @author Lizeth
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */
public class AccesoDatosJDBCPostgresSQL extends AccesoDatosJDBC {
@Override
    public void abrirConexion() throws Exception {
        try{
           Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/ClinicaDentalGemelo";
            conexion = DriverManager.getConnection(url, "postgres", "posgress");
        } catch (Exception e) {
            throw new Exception("Ocurrió un problema en la conexión con la base de datos.", e);
        }
    }

	
}//end AccesoDatosJDBCPostgresSQL