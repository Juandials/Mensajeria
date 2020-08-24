/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Conexion.con;
import java.sql.*;
import javax.swing.JOptionPane;
import Controlador.Servicio;

/**
 *
 * @author Juan
 */
public class DAOServicio {
    private Servicio servicio;
    public DAOServicio(){
        servicio = new Servicio();
    }
    
    public void InsertarServicio(){
        String sql = "INSERT into servicio VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?);";
        //Script de inserción SQL, los signos de interrogación corresponden a
        //los valores de cada columna
        
        try {
            String sfecha []= servicio.getFechaDeInicio().split("/");
            int ifecha []= new int [sfecha.length];
            for (int i = 0 ; i < ifecha.length; i ++){
               ifecha[i] = Integer.valueOf(sfecha[i]);
            }
            Date fecha = new Date(ifecha[0], ifecha[1],ifecha[2]);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, servicio.getIdServicio());
            ps.setInt(2, servicio.getCantidadDeTrayectos());
            ps.setString(3, servicio.getTipoDeTransporte());
            ps.setString(4, servicio.getTipoIdaVuelta());
            ps.setDate(5, fecha);
            Time a = null;
            ps.setTime(6, a);//La hora si paila la verdad :0
            ps.setDouble(7, servicio.getComision());
            ps.setDouble(8, servicio.getCostoTotal());
            ps.setDouble(9, servicio.getCalificacion());
            ps.setInt(10, servicio.getCodigoPostal());
            ps.setString(11, servicio.getTipoDocumentoMensajero());
            ps.setInt(12, servicio.getNumeroDocumentoMensajero());
            ps.setString(13, servicio.getTipoDocumentoCliente());
            ps.setInt(14, servicio.getNumeroDocumentoCliente());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}
