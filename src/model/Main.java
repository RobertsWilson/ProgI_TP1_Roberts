package model;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args){

    Duenio juancito = new Duenio("Juancito", "12345678");
    Mascota lola = new Perro("Lola", 3, "Dogo", "Manza", "1");
    Mascota naranjo = new Gato("Naranjoso", 2, "Naranjo", "Agresivo", "2");

    juancito.agregarMascota(lola);
    juancito.agregarMascota(naranjo);

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