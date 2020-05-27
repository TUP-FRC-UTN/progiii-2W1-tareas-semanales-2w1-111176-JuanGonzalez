package ejercicio2_guia2;

import java.util.Scanner;

public class Ejercicio2_Guia2 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese cantidad de clientes: ");
        int cantidadClientes = sc.nextInt();
        
        Veterinaria v = new Veterinaria(cantidadClientes);
        
        System.out.println(" ");
        
        for (int i = 0; i < cantidadClientes; i++) 
        {
            System.out.print("Ingrese ID del cliente: ");
            int idCliente = sc.nextInt();
            
            System.out.print("Ingrese nombre del cliente: ");
            sc.nextLine();
            String nombreCliente = sc.nextLine();
            
            System.out.print("Ingrese años de antiguedad como cliente: ");
            int antiguedad = sc.nextInt();
            
            System.out.print("Ingrese nombre de la mascota: ");
            sc.nextLine();
            String nombreMascota = sc.nextLine();
            
            System.out.print("Ingrese edad de la mascota: ");
            int edad = sc.nextInt();
            
            Cliente c = new Cliente(idCliente, nombreCliente, antiguedad, nombreMascota, edad);
            
            v.agregarCliente(c);
        }
        System.out.println(" ");
        
        System.out.println("Cantidad de clientes: " + v.cantidadClientes());
        System.out.println(" ");
       
        System.out.println("Promedio edad de las mascotas: " + v.promedioEdadMascotas());
        System.out.println(" ");
        
        System.out.println("Cantidad de clientes con antiguedad mayor a 5 años: " + v.cantidadClientesAntiguos());
        System.out.println(" ");
    }
}
