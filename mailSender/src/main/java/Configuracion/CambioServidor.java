/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import Interfaz.EnviarCorreo;

/**
 *
 * @author Gabriel
 */
public class CambioServidor {
      private String tipoCorreo;

    public EnviarCorreo getTipoCorreo() throws Exception {
        return Inicializador.InicializarCorreo(tipoCorreo);
    }

    public void setTipoCorreo(String tipoCorreo) {
        this.tipoCorreo = tipoCorreo;
    }
    
  
}
