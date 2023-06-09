
package mx.edu.uacm.peluqueria.logica;

import java.util.List;
import mx.edu.uacm.peluqueria.persistencia.ControladorPersistencia;

public class Controlador {
 
    ControladorPersistencia ctrl = new ControladorPersistencia();

    public void guardar(String nombreMascota, String raza,
            String color, String alergico, String atencionEspecial,
            String nombreDuenio, String celular, String observaciones) {

        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celular);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setAlergico(alergico);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setRaza(raza);
        mascota.setDuenio(duenio);
        
        ctrl.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return ctrl.traerMascotas();
    }

    public void borrarRegistro(int id, int idDuenio) {
        ctrl.borrarRegistro(id, idDuenio);
    }

    public Mascota traerRegistro(int idMascota) {
        return ctrl.traerRegistro(idMascota);
    }

    public void modificarMascota(Mascota mascotaModificar, String nombreMascota, 
            String raza, String color, String alergico, String atencionEspecial, 
            String nombreDuenio, String celular, String observaciones) {
        mascotaModificar.setNombre(nombreMascota);
        mascotaModificar.setRaza(raza);
        mascotaModificar.setColor(color);
        mascotaModificar.setAlergico(alergico);
        mascotaModificar.setAtencionEspecial(atencionEspecial);
        //mascotaModificar.setDuenio();
        mascotaModificar.setObservaciones(observaciones);
        
        ctrl.modificarMascota(mascotaModificar);
        
        Duenio dueno = this.buscarDuenio(mascotaModificar.getDuenio().getId());
        dueno.setNombre(nombreDuenio);
        dueno.setCelular(celular);
        
        this.modificarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(int id) {
        return ctrl.traerDuenio(id);
    }

    private void modificarDuenio(Duenio dueno) {
        ctrl.modificarDueno(dueno);
    }
  
}
