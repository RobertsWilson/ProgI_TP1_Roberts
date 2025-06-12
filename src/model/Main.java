package model;

import java.time.LocalDate;
import utils.LoggerConfig;

/**
 * Main.
 */
public class Main {

  /**
   *Peluqueria MascotaApp.
   */
  public static void main(String[] args) {
    LoggerConfig.configurarLogger();

    Duenio juancito = new Duenio("Juancito", "12345678");
    Mascota lola = new Perro("Lola", 3, "Dogo", "Manza", Tamanio.GRANDE, "1");
    Mascota naranjo = new Gato("Naranjoso", 2, "Naranjo", "Agresivo", Tamanio.MEDIANO, "2");
    Mascota toby = new Perro("Toby", 3, "Callejero", "Manzo", Tamanio.PEQUENO, "3");
    Mascota siames = new Gato("Siames", 3, "Callejero", "Agresivo", Tamanio.PEQUENO, "4");
    //Mascota toby2 = new Perro("otro toby", 3, "Callejero" , "Agresivo", Tamanio.PEQUENO, "5");

    juancito.agregarMascota(lola);
    juancito.agregarMascota(naranjo);
    juancito.agregarMascota(toby);
    juancito.agregarMascota(siames);
    //juancito.agregarMascota(toby2);
    //juancito.mostrarMascotas();


    Servicio banio = new Banio();
    Servicio combo = new ServicioComboCompleto();

    Turno turno1 = new Turno(lola, juancito, banio, LocalDate.now());
    Turno turno2 = new Turno(naranjo, juancito, combo, LocalDate.now().plusDays(1));

    turno1.confirmarTurno();
    turno1.mostrarDetalle();


    turno2.confirmarTurno();
    turno2.mostrarDetalle();


  }
}