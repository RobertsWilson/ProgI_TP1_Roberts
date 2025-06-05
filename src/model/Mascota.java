package model;

public abstract class Mascota {

  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private final String ID="";


  public Mascota() {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
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

  public String getID() {
    return ID;
  }

  public abstract void mostrarFicha();
  public abstract String tipoMascota();

}
