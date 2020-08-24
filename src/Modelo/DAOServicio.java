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

    public void InsertarServicio() {
        //Servicio servicio = new Servicio();
        String sql = "INSERT into servicio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        //Script de inserción SQL, los signos de interrogación corresponden a
        //los valores de cada columna
        Servicio servicio = new Servicio();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, servicio.getIdServicio());
            ps.setInt(2, servicio.getCantidadDeTrayectos());
            ps.setString(3, servicio.getTipoDeTransporte());
            ps.setString(4, servicio.getTipoIdaVuelta());
            ps.setString(4, servicio.getFechaDeInicio());
            ps.setString(5, servicio.getHoraDeInicio());
            ps.setInt(6, servicio.getComision());
            ps.setInt(7, servicio.getCostoTotal());
            ps.setInt(8, servicio.getCalificacion());
            ps.setInt(8, servicio.getCodigoPostalFK());
            ps.setString(8, servicio.getTipoDeDocumentoFK());
            ps.setInt(8, servicio.getNumeroDeDocumentoFK());
            ps.setString(8, servicio.getTipoDeDocumentoClienteFK());
            ps.setInt(8, servicio.getNumeroDeDocumentoClienteFK());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    /*
    int tipo de consulta es para saber que es (documento, fecha o numero de servicio
    y String consulta será el dato para realizar el select
     */
    public void ConsultarServicio(int tipoDeConsulta, String consulta) throws SQLException {
        /*Tipos de consulta
        1.Documento
        2.Numero de servicio
        3.Fecha
         */
        String sql;
        Servicio servicio = new Servicio();
        switch (tipoDeConsulta) {//Se escoge la consulta según el dato que recibe el parametro "int tipoDeConsulta"
            case 1:
                String documentoS = consulta;
                int documento = Integer.parseInt(documentoS);//Se realiza la conversión de tipos String -> Int
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where servicio.k_numero_documento_cliente=?;";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, documento);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    servicio.setIdServicio(rs.getInt("k_id_servicio"));
                    servicio.setCantidadDeTrayectos(rs.getInt("q_cantidad_trayectos"));
                    servicio.setTipoDeTransporte(rs.getString("n_tipo_transporte"));
                    servicio.setTipoIdaVuelta(rs.getString("i_tipo_ida_vuelta"));
                    servicio.setFechaDeInicio(rs.getString("f_inicio"));
                    servicio.setHoraDeInicio(rs.getString("o_hora_inicio"));
                    servicio.setComision(rs.getInt("q_comision"));
                    servicio.setCostoTotal(rs.getInt("v_costo_total"));
                    servicio.setCalificacion(rs.getInt("v_calificacion"));
                    servicio.setCodigoPostalFK(rs.getInt("k_codigo_postal"));
                    servicio.setTipoDeDocumentoFK(rs.getString("k_tipo_documento"));
                    servicio.setNumeroDeDocumentoFK(rs.getInt("k_numero_documento"));
                    servicio.setTipoDeDocumentoClienteFK(rs.getString("k_tipo_documento_cliente"));
                    servicio.setNumeroDeDocumentoClienteFK(rs.getInt("k_numero_documento_cliente"));
                }

                break;
            case 2:
                String numeroDeServicioS = consulta;
                int numeroDeServicio = Integer.parseInt(numeroDeServicioS);//Se realiza la conversión de tipos String -> Int
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where k_id_servicio=?;";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setInt(1, numeroDeServicio);
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    servicio.setIdServicio(rs1.getInt("k_id_servicio"));
                    servicio.setCantidadDeTrayectos(rs1.getInt("q_cantidad_trayectos"));
                    servicio.setTipoDeTransporte(rs1.getString("n_tipo_transporte"));
                    servicio.setTipoIdaVuelta(rs1.getString("i_tipo_ida_vuelta"));
                    servicio.setFechaDeInicio(rs1.getString("f_inicio"));
                    servicio.setHoraDeInicio(rs1.getString("o_hora_inicio"));
                    servicio.setComision(rs1.getInt("q_comision"));
                    servicio.setCostoTotal(rs1.getInt("v_costo_total"));
                    servicio.setCalificacion(rs1.getInt("v_calificacion"));
                    servicio.setCodigoPostalFK(rs1.getInt("k_codigo_postal"));
                    servicio.setTipoDeDocumentoFK(rs1.getString("k_tipo_documento"));
                    servicio.setNumeroDeDocumentoFK(rs1.getInt("k_numero_documento"));
                    servicio.setTipoDeDocumentoClienteFK(rs1.getString("k_tipo_documento_cliente"));
                    servicio.setNumeroDeDocumentoClienteFK(rs1.getInt("k_numero_documento_cliente"));
                }
                    break;
                case 3:
                sql = "SELECT k_id_servicio, q_cantidad_trayectos, n_tipo_transporte, "
                        + "i_tipo_ida_vuelta, f_inicio, o_hora_inicio, q_comision, v_costo_total, v_calificacion, "
                        + "k_codigo_postal, k_tipo_documento, k_numero_documento, k_tipo_documento_cliente, "
                        + "k_numero_documento_cliente where f_inicio=?;";
                PreparedStatement ps2 = con.prepareStatement(sql);
                ps2.setString(1, consulta);//Convertir a date!
                ResultSet rs2 = ps2.executeQuery();
                if(rs2.next()){
                   servicio.setIdServicio(rs2.getInt("k_id_servicio"));
                   servicio.setCantidadDeTrayectos(rs2.getInt("q_cantidad_trayectos"));
                   servicio.setTipoDeTransporte(rs2.getString("n_tipo_transporte"));
                   servicio.setTipoIdaVuelta(rs2.getString("i_tipo_ida_vuelta"));
                   servicio.setFechaDeInicio(rs2.getString("f_inicio"));
                   servicio.setHoraDeInicio(rs2.getString("o_hora_inicio"));
                   servicio.setComision(rs2.getInt("q_comision"));
                   servicio.setCostoTotal(rs2.getInt("v_costo_total"));
                   servicio.setCalificacion(rs2.getInt("v_calificacion"));
                   servicio.setCodigoPostalFK(rs2.getInt("k_codigo_postal"));
                   servicio.setTipoDeDocumentoFK(rs2.getString("k_tipo_documento"));
                   servicio.setNumeroDeDocumentoFK(rs2.getInt("k_numero_documento"));
                   servicio.setTipoDeDocumentoClienteFK(rs2.getString("k_tipo_documento_cliente"));
                   servicio.setNumeroDeDocumentoClienteFK(rs2.getInt("k_numero_documento_cliente")); 
                   break;
                }
                
        }
                
                
    }
        }

