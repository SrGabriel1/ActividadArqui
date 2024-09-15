/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Pruebas;

import Configuracion.CambioServidor;
import Configuracion.Inicializador;
import Interfaz.EnviarCorreo;
import Persistencia.CorreoGmail;

/**
 *
 * @author Gabriel
 */
public class MailSender {

    public static void main(String[] args) throws Exception {
//para que funcione el envio de correo ocupas tener activado el Acceso de aplicaciones menos seguras en la cuenta de envio
        CambioServidor c = new CambioServidor();
        c.setTipoCorreo("gmail");
        EnviarCorreo i = c.getTipoCorreo();
        i.enviarCorreo("haloalcantar@gmail.com", "", "diego.alcantar247122@potros.itson.edu.mx", "eres el mejor", "prueba");
    }
}
