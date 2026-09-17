package ad.evaluacioninicial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
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

    Scanner sc = new Scanner(System.in);

    private Integer id_cliente;
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

        return "Cliente{"
                + "id_cliente=" + id_cliente
                + ", nombre=" + nombre
                + ", direccion=" + direccion
                + ", telefono=" + telefono
                + ", fechaNacimiento=" + fechaNacimiento
                + ", puntuacion=" + puntuacion
                + '}';
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

    public void menu(ArrayList<Cliente> clientes) {

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("0 - Salir");
            System.out.println("1 - Añadir cliente");
            System.out.println("2 - Mostrar cliente");
            System.out.println("3 - Eliminar cliente");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 0 -> {
                    System.out.println("Adiós");
                }

                case 1 -> {
                    Cliente c = new Cliente();
                    c.pedirDatos();
                    clientes.add(c);
                    c.guardarDatos();
                }

                case 2 -> {
                    System.out.println(clientes.toString().replace(", ", "\n\n"));
                }

                case 3 -> {

                    System.out.println("¿Que ID quieres eliminar?");

                    Integer id = sc.nextInt();
                    sc.nextLine();

//                    for (Cliente c : clientes) {
//                        System.out.println("Revisando cliente: " + c);
//                        if (c.getId_cliente() == id) {
//
//                            clientes.remove(c);
//                        }
//                    }

                    for (int i = 0; i < clientes.size(); i++) {

                        System.out.println("Revisando cliente: " + i);

                        if (clientes.get(i).getId_cliente() == id) {

                            clientes.remove(i);
                            break;
                        }
                    }
                }

                default -> {
                    System.out.println("Opción inválida");
                }
            }
        }
    }
}