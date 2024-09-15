package com.mycompany.pruebahibernate;

import com.mycompany.pruebahibernate.logica.Controladora;
import com.mycompany.pruebahibernate.logica.Usuario;

public class Pruebahibernate {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Usuario usu = new Usuario (1, "Andre", "Perez", "3102456869");
           
        control.crearUsuario(usu);
    }
}
