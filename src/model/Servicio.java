package model;

/**
 * Interfaz Servicio, sirve para heredar a las clases como baño, corte de pelo, etc.
 */
public interface Servicio {
  void aplicarServicio();

  double calcularPrecio(Mascota mascota);
}

