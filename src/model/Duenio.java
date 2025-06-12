package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Representa un dueño en la peluqueria MascotasApp.
 */
public class Duenio {
  Logger logger = Logger.getLogger(getClass().getName());

  private String nombre;
  private String telefono;
  private List<Mascota> mascotas = new ArrayList<>();

  public Duenio(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  /**
   * Es una funcion para asignar mascotas a un dueño.
   */
  public void agregarMascota(Mascota m) {
    if (mascotas.size() < 4) {
      mascotas.add(m);
    } else {
      logger.info("No se pueden registrar más de 4 mascotas.");
    }
  }

  /**
   * Esto en un metodo para listar todas las mascotas de un dueño en particular.
   */
  public void mostrarMascotas() {
    for (Mascota m : mascotas) {
      m.mostrarFicha();
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public List<Mascota> getMascotas() {
    return mascotas;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duenio duenio = (Duenio) o;
    return Objects.equals(nombre, duenio.nombre) && Objects.equals(mascotas, duenio.mascotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, telefono, mascotas);
  }

  @Override
  public String toString() {
    return "Duenio{"
            +
            "nombre='" + nombre + '\''
            +
            ", telefono='" + telefono + '\''
            +
            ", mascotas=" + mascotas
            +
            '}';
  }
}

