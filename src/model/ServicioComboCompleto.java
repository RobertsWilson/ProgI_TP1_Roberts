package model;

/**
 * Servicio combo completo toma los 3 servicios anteriosres para hacer uno solo.
 */
public class ServicioComboCompleto implements Servicio {
  private final Banio banio = new Banio();
  private final CortePelo cortePelo = new CortePelo();
  private final LimpiezaOidos limpiezaOidos = new LimpiezaOidos();

  @Override
    public void aplicarServicio() {
    banio.aplicarServicio();
    cortePelo.aplicarServicio();
    limpiezaOidos.aplicarServicio();

  }

  @Override
    public double calcularPrecio(Mascota mascota) {
    return banio.calcularPrecio(mascota) + cortePelo.calcularPrecio(mascota)
                + limpiezaOidos.calcularPrecio(mascota);
  }
}


