/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Jornada;
import static Modelo.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class DAOJornada {
    private Jornada jornada;
    
    public DAOJornada(){
        jornada = new Jornada();
    }
    public void InsertarJornada(){
    
        String sql = "INSERT into jornada VALUES (?, ?, ?, ?,?);";
        /*Script de inserción SQL, los signos de interrogación corresponden a
        los valores de cada columna
         */
        Conexion a = new Conexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, jornada.getDia());
            ps.setString(2, jornada.getTipoDocumento());
            ps.setInt(3, jornada.getNumeroDocumento());
            ps.setString(4, jornada.getHoraInicial());
            ps.setString(5, jornada.getHoraFinal());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            System.out.println("ok");
        }
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
    
}
