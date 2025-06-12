package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Representa un turno reservado para una mascota en la peluquería MascotApp.
 */

public class Turno {
  Logger logger = Logger.getLogger(getClass().getName());

  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  LocalDate fecha;

  /**
   * Constructor de la clase Turno.

   */
  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha) {
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;
  }

  public void confirmarTurno() {
    logger.info("Turno confirmado para " + mascota.getNombre() + " con el servicio:");
    servicio.aplicarServicio();
  }

  public void mostrarDetalle() {
    logger.info(this.toString());
  }

  @Override
  public String toString() {
    return "Turno{"
            +
            "mascota="
            + mascota.getNombre()
            +
            ", duenio="
            + duenio.getNombre()
            +
            ", servicio="
            + servicio.getClass().getSimpleName()
            +
            ", Precio del servicio="
            + servicio.calcularPrecio(mascota)
            +
            ", fecha="
            + fecha
            +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Turno turno = (Turno) o;
    return Objects.equals(mascota, turno.mascota) && Objects.equals(duenio, turno.duenio)
            && Objects.equals(servicio, turno.servicio) && Objects.equals(fecha, turno.fecha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mascota, duenio, servicio, fecha);
  }
}
