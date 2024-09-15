/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Equipo 3
 */
public interface EnviarCorreo {
/**
 * Método que hace enviar el correo con sus parametros correspondientes
 * @param usuario Usuario
 * @param contra Contrasenia
 * @param destinatario Destinatario 
 * @param mensaje Mensaje
 * @param asunto Asunto
 * @throws Exception Exception
 */
    public void enviarCorreo(String usuario,String contra,String destinatario, String mensaje,String asunto)throws Exception;

}
