/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import Interfaz.EnviarCorreo;

/**
 *
 * @author Equipo 3
 */
public class CambioServidor {
    //Atrbutos de la clase
      private String tipoCorreo;

      /**
       * Este metodo retorna la inicializacion de la clase
       * dependiendo del tipo correo
       * @return Tipo de Correo
       * @throws Exception 
       */
    public EnviarCorreo getTipoCorreo() throws Exception {
        return Inicializador.InicializarCorreo(tipoCorreo);
    }

    /**
     * Método que setea el tipo de correo 
     * @param tipoCorreo Tipo de correo
     */
    public void setTipoCorreo(String tipoCorreo) {
        this.tipoCorreo = tipoCorreo;
    }
    
  
}
