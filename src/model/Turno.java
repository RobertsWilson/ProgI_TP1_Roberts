package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

public class Turno {
  Logger logger = Logger.getLogger(getClass().getName());

  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  LocalDate fecha;

  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha) {
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;
  }

  public void confirmarTurno(){
    logger.info("Turno confirmado para " + mascota.getNombre() + " con el servicio:");
    servicio.aplicarServicio();
  }
  public void mostrarDetalle(){
    logger.info(toString());
  }

  @Override
  public String toString() {
    return "Turno{" +
            "mascota=" + mascota +
            ", duenio=" + duenio +
            ", servicio=" + servicio +
            ", fecha=" + fecha +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Turno turno = (Turno) o;
    return Objects.equals(mascota, turno.mascota) && Objects.equals(duenio, turno.duenio) && Objects.equals(servicio, turno.servicio) && Objects.equals(fecha, turno.fecha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mascota, duenio, servicio, fecha);
  }
}
