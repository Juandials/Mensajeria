/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Juan
 */
public class Servicio {
    int idServicio;
    int cantidadDeTrayectos;
    String tipoDeTransporte;
    String tipoIdaVuelta;
    String fechaDeInicio;
    String horaDeInicio;
    int comision;
    int costoTotal;
    int calificacion;
    int codigoPostalFK;
    String tipoDeDocumentoFK;
    int numeroDeDocumentoFK;
    String tipoDeDocumentoClienteFK;
    int numeroDeDocumentoClienteFK;

    
    public String getTipoIdaVuelta() {
        return tipoIdaVuelta;
    }

    public void setTipoIdaVuelta(String tipoIdaVuelta) {
        this.tipoIdaVuelta = tipoIdaVuelta;
    }
    
    public int getCodigoPostalFK() {
        return codigoPostalFK;
    }

    public void setCodigoPostalFK(int codigoPostalFK) {
        this.codigoPostalFK = codigoPostalFK;
    }

    public String getTipoDeDocumentoFK() {
        return tipoDeDocumentoFK;
    }

    public void setTipoDeDocumentoFK(String tipoDeDocumentoFK) {
        this.tipoDeDocumentoFK = tipoDeDocumentoFK;
    }

    public int getNumeroDeDocumentoFK() {
        return numeroDeDocumentoFK;
    }

    public void setNumeroDeDocumentoFK(int numeroDeDocumentoFK) {
        this.numeroDeDocumentoFK = numeroDeDocumentoFK;
    }

    public String getTipoDeDocumentoClienteFK() {
        return tipoDeDocumentoClienteFK;
    }

    public void setTipoDeDocumentoClienteFK(String tipoDeDocumentoClienteFK) {
        this.tipoDeDocumentoClienteFK = tipoDeDocumentoClienteFK;
    }

    public int getNumeroDeDocumentoClienteFK() {
        return numeroDeDocumentoClienteFK;
    }

    public void setNumeroDeDocumentoClienteFK(int numeroDeDocumentoClienteFK) {
        this.numeroDeDocumentoClienteFK = numeroDeDocumentoClienteFK;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getCantidadDeTrayectos() {
        return cantidadDeTrayectos;
    }

    public void setCantidadDeTrayectos(int cantidadDeTrayectos) {
        this.cantidadDeTrayectos = cantidadDeTrayectos;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
