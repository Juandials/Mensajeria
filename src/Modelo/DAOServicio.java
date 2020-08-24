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
        String sql;
        PreparedStatement ps;
        switch (tipoDeConsulta){//Se escoge la consulta según el dato que recibe el parametro "int tipoDeConsulta"
            case 1:
                String documentoS = consulta;
                int documento = Integer.parseInt (documentoS);//Se realiza la conversión de tipos String -> Int
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where k_numero_documento_cliente=?;";
                ps = con.prepareStatement(sql);
                ps.setInt(1, documento);
                break;
            case 2:
                String numeroDeServicioS = consulta;
                int numeroDeServicio = Integer.parseInt (numeroDeServicioS);//Se realiza la conversión de tipos String -> Int
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where k_id_servicio=?;";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setInt(1, numeroDeServicio);
                break;
            case 3:
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where f_inicio=?;";
                PreparedStatement ps2 = con.prepareStatement(sql);
                ps2.setString(1, consulta);//Convertir a date!
                
        }
                
                
    }
}
