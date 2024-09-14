/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Interfaz.EnviarCorreo;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author Gabriel
 */
public class CorreoOutlook implements EnviarCorreo {

    public CorreoOutlook() {
    }


    @Override
    public void enviarCorreo(String usuario,String contra,String destinatario, String mensaje, String asunto) throws Exception {
        //Esto es para conectarnos con el servidor de outlook
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.office365.com");
        propiedades.put("mail.smtp.port", "587");
        propiedades.put("mail.smtp.ssl.trust", "smtp.office365.com");
        propiedades.put("mail.smtp.ssl.protocols", "TLSv1.2");
        //Aqui se inicia sesion en el gmail
        Session sesion = Session.getInstance(propiedades, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, contra);
            }
        });
        //Aqui le envias el correo a la persona que quisiste
        Message correo = new MimeMessage(sesion);
        correo.setFrom(new InternetAddress(usuario));
        correo.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
        correo.setSubject(asunto);
        correo.setText(mensaje);
        Transport.send(correo);
        System.out.println("Correo enviado correctamente a: " + destinatario);
    }
}
