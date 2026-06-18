package model;

public class Producto {

    //Atributos
    private String nombre;
    private String categoria;
    private int valor;
    private Encargado encargado;

    //Constructores
    public Producto() {
    }

    public Producto(String nombre, int valor, String categoria, Encargado encargado) {
        this.nombre = nombre;
        this.valor = valor;
        this.categoria = categoria;
        this.encargado = encargado;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public Encargado getEncargado() {
        return encargado;
    }
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }


    //toString
    @Override
    public String toString() {
        return "Producto{" +
                "nombre ='" + nombre + '\'' +
                ", categoria ='" + categoria + '\'' +
                ", valor: $" + valor +
                ", encargado =" + encargado +
                '}';
    }

}