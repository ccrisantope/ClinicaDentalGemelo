package medicasoft.Capa3_Dominio;


/**
 * @author gesti
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */
public class Paciente {

	private String DNI;
	private String Nombre;
        private String Direccion;
        private String Telefono;
        private String Edad;
	public Cita m_Cita;

	public Paciente(){

	}

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  
    public String getDireccion() {
        return Direccion;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

   

    public Cita getM_Cita() {
        return m_Cita;
    }

    public void setM_Cita(Cita m_Cita) {
        this.m_Cita = m_Cita;
    }


	public boolean tieneDNIValido(){
		return DNI.length()==8;
	}
}//end Paciente