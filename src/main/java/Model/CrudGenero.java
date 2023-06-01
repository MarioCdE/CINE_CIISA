/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DAOGenero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class CrudGenero {

    Conexion conexion = new Conexion();

    public String Create(Object obj) throws SQLException {

        DAOGenero genero = (DAOGenero) obj;
        Connection connection;
        PreparedStatement pst;
        String query = "INSERT INTO TBL_GENERO VALUES (?)";
        String respuesta;

        try {

            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUserdb(), conexion.getPassdb());

            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1,genero.getVCH_NOMBRE_GENERO());
            respuesta = Integer.toString(pst.executeUpdate());

        } catch (ClassNotFoundException | SQLException ex) {
            respuesta = ex.getMessage();
        }
        return respuesta;

    }
      
}