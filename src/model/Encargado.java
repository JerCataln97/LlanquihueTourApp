package model;

public class Encargado {

    //Atributos
    private String nombre2;
    private String cargo;

    //Constructores
    public Encargado() {
    }

    public Encargado(String nombre, String cargo) {
        this.nombre2 = nombre;
        this.cargo = cargo;
    }

    //Getters and Setters
    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //toString
    @Override
    public String toString() {
        return "Encargado{" +
                "nombre ='" + nombre2 + '\'' +
                ", cargo ='" + cargo + '\'' +
                '}';
    }
}
