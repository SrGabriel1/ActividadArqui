/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import Interfaz.EnviarCorreo;
import Persistencia.CorreoGmail;
import Persistencia.CorreoOutlook;
import Persistencia.CorreoProton;

/**
 *
 * @author Gabriel
 */
public class Inicializador {

    public EnviarCorreo InicializarCorreo(String tipoCorreo) {
        if (tipoCorreo.equalsIgnoreCase("gmail")) {
            return new CorreoGmail();
        } else if (tipoCorreo.equalsIgnoreCase("outlook")) {
            return new CorreoOutlook();
        } else if (tipoCorreo.equalsIgnoreCase("proton")) {
            return new CorreoProton();
        }
        throw new IllegalArgumentException("Tipo de correo no soportado: " + tipoCorreo);
    }
}
