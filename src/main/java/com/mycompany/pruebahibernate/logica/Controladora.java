package com.mycompany.pruebahibernate.logica;

import com.mycompany.pruebahibernate.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(Usuario usu) {
        controlPersis.crearUsurio (usu);
        
    }
}
