package model;

import java.util.logging.Logger;

/**
 * Limpieza de Oidos es un servicio que ofrece la peluqueria.
 */
public class LimpiezaOidos implements Servicio {
  Logger logger = Logger.getLogger(getClass().getName());

  @Override
    public void aplicarServicio() {
    logger.info("Limpieza de Oidos");

  }

  @Override
    public double calcularPrecio(Mascota mascota) {
    double base = 0;
    if (mascota instanceof Perro) {
      base = 700;
    } else if (mascota instanceof Gato) {
      base = 600;
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


