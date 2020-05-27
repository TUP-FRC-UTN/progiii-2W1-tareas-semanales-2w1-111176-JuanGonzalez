package ejercicio_parcial;

import java.util.Scanner;

public class Ejercicio_Parcial 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Fecha del folleto: ");
        String fecha = sc.nextLine();
        
        System.out.print("Cantidad de ofertas: ");
        int cantidadOfertas = sc.nextInt();
        
        Folleto f = new Folleto(fecha, cantidadOfertas);
        
        System.out.println("---------------------------------------");
        
        for (int i = 0; i < cantidadOfertas; i++) 
        {
            System.out.print("ID del producto: ");
            int idProducto = sc.nextInt();
            System.out.print("Nombre del producto: ");
            sc.nextLine();
            String nombreProducto = sc.nextLine();
            System.out.print("Precio regular: ");
            double precioRegular = sc.nextDouble();
            System.out.print("Precio oferta: ");
            double precioOferta = sc.nextDouble();
            System.out.print("Vigencia: ");
            int vigencia = sc.nextInt();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            
            Oferta o = new Oferta(idProducto, nombreProducto, precioRegular, precioOferta, vigencia, stock);
            f.agregarOferta(o);
        }
        System.out.println("---------------------------------------");
        System.out.println("Cantidad de ofertas con más de 5 días de vigencia: " + f.articulosConVigencia());
        System.out.println("---------------------------------------");
        System.out.println("Cantidad total de productos en stock: " + f.totalStock());
        System.out.println("---------------------------------------");
        System.out.println("Cantidad de ofertas con descuento superior a $20: " + f.productosConDescuentoSuperior20());
        System.out.println("---------------------------------------");
        System.out.print("Ingrese ID del producto que desea saber su recaudación total: ");
        int idProducto = sc.nextInt();
        
        System.out.println("Total recaudado por el producto " + idProducto + ": " + f.totalRecaudado(idProducto));
    }
}
