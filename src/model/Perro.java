package model;

/**
 * Clase perro, una clase que hereda de Mascota.
 */
public class Perro extends Mascota {

  public Perro(String nombre, int edad, String raza, String comportamiento,
               Tamanio tamanio, String id) {
    super(nombre, edad, raza, comportamiento, tamanio, id);
  }

  @Override
  public void mostrarFicha() {
    logger.info("Ficha del Perro;");
    super.mostrarFicha();

  }

  @Override
  public String tipoMascota() {
    return "Perro";
  }
}
