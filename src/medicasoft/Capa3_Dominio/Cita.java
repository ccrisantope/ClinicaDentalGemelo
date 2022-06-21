package medicasoft.Capa3_Dominio;

import java.util.Date;

public class Cita {

    private String codigo;
    private double costo;
    private double descuento;
    private Date hora;
    private Date Fecha;
    private String observacion;
    public Paciente m_Paciente;
    public Dentista m_Dentista;
    public TipoCita m_TipoCita; 
    public Cita() {

    }

    public Cita(String codigo, double costo, double descuento, Date hora, Date Fecha, String observacion,  Paciente m_Paciente, Dentista m_Dentista, TipoCita m_TipoCita) {
        this.codigo = codigo;
        this.costo = costo;
        this.descuento = descuento;
        this.hora = hora;
        this.Fecha = Fecha;
        this.observacion = observacion;
        this.m_Paciente = m_Paciente;
        this.m_Dentista = m_Dentista;
        this.m_TipoCita = m_TipoCita;
    }

  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

  
   

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

   

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

   

   
    public Paciente getM_Paciente() {
        return m_Paciente;
    }

    public void setM_Paciente(Paciente m_Paciente) {
        this.m_Paciente = m_Paciente;
    }

    public Dentista getM_Dentista() {
        return m_Dentista;
    }

    public void setM_Dentista(Dentista m_Dentista) {
        this.m_Dentista = m_Dentista;
    }

      public TipoCita getM_TipoCita() {
        return m_TipoCita;
    }

    public void setM_TipoCita(TipoCita m_TipoCita) {
        this.m_TipoCita = m_TipoCita;
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

  
    public double calcularcostocitatotal() {
       double costoTotalDeCita = (costo - descuento)  ;
        return costoTotalDeCita;
    }

    public boolean disponibilidaddehorario() {
        return false;
    }

    public double tieneDescuento() {
        return descuento/100;
    }

    public boolean Citaspermitidas() {
        return true;
        //falta
    }
   
         public boolean permiteNuevaCita(int totalDeCitas) {
        //return totalDeCitas < numeroMaximoDeCitas;
        return true;
    }

    
   
}//end Cita
