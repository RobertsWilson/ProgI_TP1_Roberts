package model;

import java.util.logging.Logger;

public class LimpiezaOidos implements Servicio{
    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void aplicarServicio() {
        logger.info("Aplicando Limpieza de Oidos");

    }

    @Override
    public double calcularPrecio(Mascota mascota) {
        return mascota.tipoMascota().equals("Perro") ? 700 : 600;
    }
}


