package model;

import java.util.logging.Logger;

public class Perro extends Mascota {
  Logger logger = Logger.getLogger(getClass().getName());

  public Perro(String nombre, int edad, String raza, String comportamiento, String id) {
    super(nombre, edad, raza, comportamiento, id);
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
