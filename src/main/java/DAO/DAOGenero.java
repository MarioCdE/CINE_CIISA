/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author mario
 */
public class DAOGenero {

    private String _VCH_NOMBRE_GENERO;

    public String getVCH_NOMBRE_GENERO() {
        return _VCH_NOMBRE_GENERO;
    }

    public void setVCH_NOMBRE_GENERO(String _VCH_NOMBRE_GENERO) {
        this._VCH_NOMBRE_GENERO = _VCH_NOMBRE_GENERO;
    }

    public Boolean ValidaSubida(String nom) {
        Boolean flag = true;
        if (!nom.isEmpty()) {
            setVCH_NOMBRE_GENERO(nom);
        } else {
            return false;
        }
        return flag;
    }

}