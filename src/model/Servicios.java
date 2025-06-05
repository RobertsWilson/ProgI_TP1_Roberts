package model;

public class Servicios implements Servicio {

  private static int cantidadServicios = 1;
  private int id;
  private TipoServicio tipoServicio;
  private String descripcion;
  private double duracion;
  private int precio;

  public Servicios() {
  }

  public Servicios(TipoServicio tipoServicio, String descripcion, double duracion, int precio) {
    this.id = cantidadServicios++;
    this.tipoServicio = tipoServicio;
    this.descripcion = descripcion;
    this.duracion = duracion;
    this.precio = precio;
  }

  public static int getCantidadServicios() {
    return cantidadServicios;
  }

  public static void setCantidadServicios(int cantidadServicios) {
    Servicios.cantidadServicios = cantidadServicios;
  }

  public TipoServicio getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(TipoServicio tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getDuracion() {
    return duracion;
  }

  public void setDuracion(double duracion) {
    this.duracion = duracion;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public void aplicarServicio() {

  }

  @Override
  public double calcularPrecio() {
    return 0;
  }
}
