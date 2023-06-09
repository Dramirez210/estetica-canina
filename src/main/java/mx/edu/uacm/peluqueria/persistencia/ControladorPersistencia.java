
package mx.edu.uacm.peluqueria.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.edu.uacm.peluqueria.logica.Duenio;
import mx.edu.uacm.peluqueria.logica.Mascota;
import mx.edu.uacm.peluqueria.persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    
    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJPA.create(duenio);
        mascotaJPA.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJPA.findMascotaEntities();
    }

    public void borrarRegistro(int id, int idDuenio) {
        try {
            mascotaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            duenioJPA.destroy(idDuenio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerRegistro(int idMascota) {
        return mascotaJPA.findMascota(idMascota);
    }

    public void modificarMascota(Mascota mascotaModificar) {
        try {
            mascotaJPA.edit(mascotaModificar);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id) {
        return duenioJPA.findDuenio(id);
    }

    public void modificarDueno(Duenio dueno) {
        try {
            duenioJPA.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
