package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladorPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    public void guardar(Duenio duenio, Mascota mascota) {
        
       //Creacion Bd dueño
       duenioJpa.create(duenio);
       
       //Creacion Bd mascota
       mascotaJpa.create(mascota);
    }
}
