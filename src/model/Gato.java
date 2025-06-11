package model;

public class Gato extends Mascota{

  public Gato(String nombre, int edad, String raza, String comportamiento, String id) {
    super(nombre, edad, raza, comportamiento, id);
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
