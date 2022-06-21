package medicasoft.Capa3_Dominio;

import java.util.Date;

/**
 * @author gesti
 * @version 1.0
 * @created 10-jun.-2022 22:36:38
 */
public class Cita {

    private String codigo;
    private double costo;
    private double descuento;
    private Date hora;
    private Date Fecha;
    private String observacion;
    private String tipodecita;
    
    public Paciente m_Paciente;
    public Dentista m_Dentista;

    public Cita() {

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

   

    public String getTipodecita() {
        return tipodecita;
    }

    public void setTipodecita(String tipodecita) {
        this.tipodecita = tipodecita;
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
     public double calcularMonto() {
        if(tipodecita.equalsIgnoreCase("Curación"))
            return costo=50;
        if(tipodecita.equalsIgnoreCase("Extracción"))
            return costo=40;
        if(tipodecita.equalsIgnoreCase("Profilaxis"))
            return costo=60;
        if(tipodecita.equalsIgnoreCase("Ortodoncia"))
            return costo=700;
        return 0;
    }
         public boolean permiteNuevaCita(int totalDeCitas) {
        //return totalDeCitas < numeroMaximoDeCitas;
        return true;
    }
   
}//end Cita
