package model;

import java.util.logging.Logger;

public class CortePelo implements Servicio{
    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void aplicarServicio() {
        logger.info("Aplicando Baño");

    }

    @Override
    public double calcularPrecio(Mascota mascota) {
        return mascota.tipoMascota().equals("Perro") ? 1500 : 1200;
    }
}


