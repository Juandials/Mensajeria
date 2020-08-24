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
        
    Servicio servicio = new Servicio();
    public void InsertarServicio(){
        //Servicio servicio = new Servicio();
        String sql = "INSERT into servicio VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        //Script de inserción SQL, los signos de interrogación corresponden a
        //los valores de cada columna
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, servicio.getIdServicio());
            ps.setInt(2, servicio.getCantidadDeTrayectos());
            ps.setString(3, servicio.getTipoDeTransporte());
            ps.setString(4, servicio.getFechaDeInicio());
            ps.setString(5, servicio.getHoraDeInicio());
            ps.setInt(6, servicio.getComision());
            ps.setInt(7, servicio.getCostoTotal());
            ps.setInt(8, servicio.getCalificacion());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }
    
    /*
    Un tipo de consulta para saber que es (documento, fecha o numero de servicio
    y la consulta que será el dato para realizar el select
    */
    public void ConsultarServicio(int tipoDeConsulta, String consulta) throws SQLException{
        /*Tipos de consulta
        1.Documento
        2.Numero de servicio
        3.Fecha
        */
        switch (tipoDeConsulta){
            case 1:
                String sql = "select servicio.k_id_servicio from servicio where k_id_servicio=?;";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, "consulta");
                
        }
                
                
    }
}
