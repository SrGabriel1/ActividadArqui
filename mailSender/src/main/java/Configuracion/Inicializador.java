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
 * @author Equipo 3
 */
public class Inicializador {
    //Atributos de la clase
     String InicializarCorreo;

     /**
      * Metodo que ayuda para ignorar las mayusculas 
      * y minusculas al momento de especificar el tipo de correo
      * @param tipoCorreo Tipo de correo
      * @return Tipo de correo
      * @throws Exception Exception
      */
    public static EnviarCorreo InicializarCorreo(String tipoCorreo) throws Exception {
        if (tipoCorreo.equalsIgnoreCase("gmail")) {
            return new CorreoGmail();
        } else if (tipoCorreo.equalsIgnoreCase("outlook")) {
            return new CorreoOutlook();
        }
        throw new Exception("Tipo de correo no soportado: " + tipoCorreo);
    }
}
