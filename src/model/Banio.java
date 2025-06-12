package model;

import java.util.logging.Logger;

/**
 * Servicio Baño.
 */
public class Banio implements Servicio {
  Logger logger = Logger.getLogger(getClass().getName());

  @Override
  public void aplicarServicio() {
    logger.info("Baño");
  }

  @Override
  public double calcularPrecio(Mascota mascota) {
    double base = 0;
    if (mascota instanceof Perro) {
      base = 1500;
    } else if (mascota instanceof Gato) {
      base = 800;
    }
    switch (mascota.getTamanio()) {
      case PEQUENO -> base *= 1;
      case MEDIANO -> base *= 1.2;
      case GRANDE -> base *= 1.5;
      default -> base *= 1;
    }

    return base;
  }
}

