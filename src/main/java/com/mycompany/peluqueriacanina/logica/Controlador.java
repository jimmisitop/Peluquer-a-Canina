package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladorPersistencia;

public class Controlador {
    ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String comentarios, String alergias, String nombreDuenio, String telefono) {
    
        //Creacion de dueño y asignacion de valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setTelefono(telefono);
        
        //Creacion de mascota y asignacion de valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setComentarios(comentarios);
        mascota.setAlergias(alergias);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,mascota);
    }
}
