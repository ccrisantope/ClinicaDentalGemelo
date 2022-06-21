package medicasoft.Capa3_Dominio;



public class Dentista {

	private String codigo;
	private String Nombre;
        private String Telefono;
        
	public Cita m_Cita;

	public Dentista(){

	}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

  
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    public boolean tienecodigoValido(){
		return codigo.length()==4;
	}

}//end Dentista