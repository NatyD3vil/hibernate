
package com.mycompany.pruebahibernate.persistencia;

import com.mycompany.pruebahibernate.logica.Usuario;

public class ControladoraPersistencia {

 UsuarioJpaController usuarioJPAPU = new UsuarioJpaController();   

    public void crearUsurio(Usuario usu) {
        usuarioJPAPU.create(usu);
    }

}
