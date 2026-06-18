package service;

import model.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeDatos {

    //Crear lista que almacene objetos tipo "Producto"
    private ArrayList<Producto> listado = new ArrayList<>();

    //Metodo "experiencias" lee un archivo y carga los datos de la lista
    public void experiencias (String lugarLista){

        try {
            File lista = new File(lugarLista);
            Scanner leer = new Scanner(lista);

            //Recorrer el archivo linea por linea
            while (leer.hasNextLine()){
                String linea = leer.nextLine();
                //Separar los datos usando un ";"
                String[] partes = linea.split(";");
                if (partes.length == 5){
                    int valor = Integer.parseInt(partes[4]);
                    Encargado encarg = new Encargado(partes [0],partes [1]);
                    Producto produc = new Producto(partes [2], valor, partes[3], encarg);

                    //Agregar objeto a la lista
                    listado.add(produc);
                }
            }
            leer.close();

        } catch (Exception e) {
            System.out.println("Error en el archivo");
        }

    }
    //Metodo mostrarExperiencias muestra cada producto de la lista
    public void mostrarExperiencias() {
        listado.forEach(System.out::println);
    }

    //Metodo porExperiencia recorre la lista buscando productos con categoria "Aventura"
    public void porExperiencia (String experiencia) {
        for (Producto p : listado) {
            if (p.getCategoria().equalsIgnoreCase("Aventura")) {
                System.out.println("Experiencia: " + p.getNombre() + ", valor: $" + p.getValor());
            }
        }
    }

    //Metodo porValor recorre la lista buscando productos con una valor igual o menor a 20000
    public void porValor(){
        for (Producto p : listado){
            if (p.getValor() <= 20000){
                System.out.println("Experiencia: " + p.getNombre() +", valor: $" + p.getValor());
            }
        }
    }

    //Metodo porCargo recorre la lista filtrando las que tengas Encargado con cargo "Guia Especializado"
    public void porCargo (String cargo) {
        for (Producto p : listado) {
            Encargado en = p.getEncargado();
            if (en.getCargo().equalsIgnoreCase("Guia Especializado")) {
                System.out.println("Experiencia: " + p.getNombre() + ", Encargado/a: " + en.getNombre2());
            }
        }
    }

}
