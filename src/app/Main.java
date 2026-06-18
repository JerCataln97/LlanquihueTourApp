package app;

import service.GestionDeDatos;

public class Main {

    public static void main (String[] args){

        //Crear objeto "gestion" y cargar lista tours.txt desde su ubicacion
        GestionDeDatos gestion = new GestionDeDatos();
        gestion.experiencias("tours.txt");

        //Mostrar en pantalla todas las experiencias
        System.out.println("-- Todas las experiencias --");
        gestion.mostrarExperiencias();

        System.out.println();

        //Mostrar en pantalla todas las experiencias con categoria "Aventura"
        System.out.println("-- Experiencias de aventura --");
        System.out.println("------------------------------");
        gestion.porExperiencia("Aventura");


        System.out.println();

        //Mostrar en pantalla todas las experiencias menores o iguales a 20000
        System.out.println("-- Experiencias menores a $20000 --");
        System.out.println("-----------------------------------");
        gestion.porValor();

        System.out.println();

        //Mostrar en pantalla todas las experiencias con "Guia Especializado"
        System.out.println("-- Experiencias con guias especializados --");
        System.out.println("------------------------------");
        gestion.porCargo("Guia Especializado");
    }
}
