package ad.evaluacioninicial;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

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
    
    public void pedirDatos() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("ID: ");
        id_cliente = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.print("Dirección: ");
        direccion = teclado.nextLine();
        
        System.out.print("Teléfono: ");
        telefono = teclado.nextLine();
        
        
        System.out.print("Fecha de Nacimiento: ");
        String fecha = teclado.nextLine();

        try {  
            fechaNacimiento = LocalDate.parse(fecha);

        } catch (DateTimeParseException e) {

             String[] parametrosFecha = fecha.split("/");

            if (parametrosFecha.length == 3) {
                fechaNacimiento = LocalDate.of(
                  Integer.valueOf(parametrosFecha[2]),
                  Integer.valueOf(parametrosFecha[1]),
                  Integer.valueOf(parametrosFecha[0]));
            }
        }
        
        System.out.print("Puntuación: ");
        puntuacion = teclado.nextInt();
        teclado.nextLine();
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

    @Override
    public String toString() {
        System.out.println("Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", puntuacion=" + puntuacion + '}');
        return null;
    }

    public void guardarDatos() {
        try {
            FileWriter archivo = new FileWriter("cliente.txt", true);
            BufferedWriter bw = new BufferedWriter(archivo);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(this.toString() + "\n");
            pw.close();
            
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida");
        }
    }
    
    
    
    
    
    
}
