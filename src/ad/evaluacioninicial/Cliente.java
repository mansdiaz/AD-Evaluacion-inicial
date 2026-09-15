package ad.evaluacioninicial;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author awakte
 */
public class Cliente {

    private int id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    private int puntuacion;
    
    public Cliente() {
        id_cliente = -100;
        nombre = "";
        direccion = "";
        telefono = "+34";
        fechaNacimiento = LocalDate.now();
        puntuacion = 0;
    }

    public Cliente(int id_cliente, String nombre, String direccion, String telefono, LocalDate fechaNacimiento, int puntuacion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre.trim();
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.puntuacion = puntuacion;
    }
    
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    

    
    
}
