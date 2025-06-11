package model;

import java.util.Objects;
import java.util.logging.Logger;


public abstract class Mascota {

  Logger logger = Logger.getLogger(getClass().getName());

  protected String nombre;
  protected int edad;
  protected String raza;
  protected String comportamiento;
  protected final String id;

  protected Mascota(String nombre, int edad, String raza, String comportamiento, String id) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.id = id;
  }

  public String getID() {
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

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Mascota mascota = (Mascota) o;
    return edad == mascota.edad && Objects.equals(nombre, mascota.nombre) && Objects.equals(raza, mascota.raza) && Objects.equals(comportamiento, mascota.comportamiento) && Objects.equals(id, mascota.id);
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
    return "Mascota{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", raza='" + raza + '\'' +
            ", comportamiento='" + comportamiento + '\'' +
            ", ID='" + id + '\'' +
            '}';
  }
}
