/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicasoft.Capa3_Dominio;

import java.util.Objects;


public class TipoCita {
    
    private String descripcion;
    private double tarifa;
    private Cita m_Cita;
    public TipoCita() {
    }

    public TipoCita(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoCita( String descripcion, double tarifa) {
        
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

  
   
    public Cita getM_Cita() {
        return m_Cita;
    }

    public void setM_Cita(Cita m_Cita) {
        this.m_Cita = m_Cita;
    }
    


}
