package model;

/**
 * "Gato" representa una clase que hereda de la clase abstracta "Mascota".
 */
public class Gato extends Mascota {

  public Gato(String nombre, int edad, String raza, String comportamiento,
              Tamanio tamanio, String id) {
    super(nombre, edad, raza, comportamiento, tamanio, id);
  }

  @Override
  public void mostrarFicha() {
    logger.info("Ficha del Gato");
    super.mostrarFicha();

  }

  @Override
  public String tipoMascota() {
    return "Gato";
  }
}
