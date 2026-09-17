///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package ad.evaluacioninicial;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//
///**
// *
// * @author TuNombre
// */
//public class ProgramacionBasica {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        int[] numeros = {5, 3, 1, 0, 7};
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Posición " + i + ": " + numeros[i]);
//        }
//
//        System.out.println("\n" + "Al revés" + "\n");
//
//        for (int i = numeros.length - 1; i >= 0; i--) {
//            System.out.println("Posición " + i + ": " + numeros[i]);
//        }
//
//        System.out.println("\n\n");
//
//        ArrayList<Cliente> clientes = new ArrayList();
//
//        Cliente hyenita = new Cliente();
////        System.out.println(hyenita.getId_cliente() + " " + hyenita.getDireccion());
//
//        Cliente c1 = new Cliente(23, "Alejandro", "C/Hola", "698765432", LocalDate.of(2020, 5, 3), 10);
//        Cliente c2 = new Cliente(24, "Alejandro", "C/Hola", "698765432", LocalDate.of(2020, 5, 3), 10);
//        Cliente c3 = new Cliente(25, "Alejandro", "C/Hola", "698765432", LocalDate.of(2020, 5, 3), 10);
//
//        clientes.add(c1);
//        clientes.add(c2);
//        clientes.add(c3);
//        
//        for(int i = 0; i<1000;i++){
//            clientes.add(new Cliente(26 + i, "Manuel", "Calle de la Hiedra", "612345678", LocalDate.of(2000, 5, 3), 10));
//        }
//        System.out.println("Número de clientes: " + clientes.size());
//
////        hyenita.pedirDatos();
////
//        hyenita.guardarDatos();
//
//        hyenita.menu(clientes);
//
//    }
//
//}