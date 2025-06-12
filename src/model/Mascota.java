package model;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * Mascota clase abstracta que asigna metodos y atributos a las clases hijas(Perro / Gato).
 */
public abstract class Mascota {

  Logger logger = Logger.getLogger(getClass().getName());

  protected String nombre;
  protected int edad;
  protected String raza;
  protected String comportamiento;
  protected Tamanio tamanio;
  protected final String id;

  protected Mascota(String nombre, int edad, String raza, String comportamiento,
                    Tamanio tamanio, String id) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.tamanio = tamanio;
    this.id = id;
  }

  public String getid() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getComportamiento() {
    return comportamiento;
  }

  public void setComportamiento(String comportamiento) {
    this.comportamiento = comportamiento;
  }

  public Tamanio getTamanio() {
    return tamanio;
  }

  public void setTamanio(Tamanio tamanio) {
    this.tamanio = tamanio;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mascota mascota = (Mascota) o;
    return edad == mascota.edad && Objects.equals(nombre, mascota.nombre)
            && Objects.equals(raza, mascota.raza)
            && Objects.equals(comportamiento, mascota.comportamiento)
            && Objects.equals(id, mascota.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, edad, raza, comportamiento, id);
  }

  public void mostrarFicha() {
    logger.info(toString());
  }

  public abstract String tipoMascota();


  @Override
  public String toString() {
    return "Mascota{"
            +
            "nombre='"
            + nombre
            + '\''
            +
            ", edad="
            + edad
            +
            ", raza='"
            + raza + '\''
            +
            ", comportamiento='"
            + comportamiento + '\''
            +
            ", tamanio=" + tamanio
            +
            ", id='" + id + '\''
            +
            '}';
  }
}
