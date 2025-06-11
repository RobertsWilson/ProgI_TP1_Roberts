package model;

public class ServicioComboCompleto implements Servicio{

    private Banio banio= new Banio();
    private CortePelo cortePelo = new CortePelo();
    private LimpiezaOidos limpiezaOidos = new LimpiezaOidos();

    @Override
    public void aplicarServicio() {
        banio.aplicarServicio();
        cortePelo.aplicarServicio();
        limpiezaOidos.aplicarServicio();

    }

    @Override
    public double calcularPrecio(Mascota mascota) {
        return banio.calcularPrecio(mascota) + cortePelo.calcularPrecio(mascota) + limpiezaOidos.calcularPrecio(mascota);
    }
}


