/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mario
 */
public class Conexion {

    private final String userdb;
    private final String passdb;
    private final String url;
    private final String driver;

    public Conexion() {
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.url = "jdbc:sqlserver://localhost\\DESKTOP-5IMR1C3:1433;databaseName=CINE_CIISA;trustservercertificate=true"; /* Cambiar por Servidor Personal*/
        this.userdb = "sa"; /*Cambiar por Usuario personal*/
        this.passdb = "12345";/*Cambiar por Contraseña Personal*/
    }

    public String getUserdb() {
        return userdb;
    }

    public String getPassdb() {
        return passdb;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

}