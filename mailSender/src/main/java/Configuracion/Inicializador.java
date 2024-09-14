/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import Interfaz.EnviarCorreo;
import Persistencia.CorreoGmail;
import Persistencia.CorreoOutlook;

/**
 *
 * @author Gabriel
 */
public class Inicializador {

     String InicializarCorreo;

    public static EnviarCorreo InicializarCorreo(String tipoCorreo) throws Exception {
        if (tipoCorreo.equalsIgnoreCase("gmail")) {
            return new CorreoGmail();
        } else if (tipoCorreo.equalsIgnoreCase("outlook")) {
            return new CorreoOutlook();
        }
        throw new Exception("Tipo de correo no soportado: " + tipoCorreo);
    }
}
