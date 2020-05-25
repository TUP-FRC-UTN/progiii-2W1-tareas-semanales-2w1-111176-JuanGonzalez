package ejercicio1guia2;

import java.util.Scanner;

public class Ejercicio1_Guia2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del equipo: ");
        String equipo = sc.nextLine();
        
        System.out.print("Cantidad de jugadores: ");
        int cantidadJugadores = sc.nextInt();
        
        Equipo e = new Equipo(equipo, cantidadJugadores);
        
        for (int i = 0; i < cantidadJugadores; i++) 
        {
            System.out.print("Nombre jugador: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.print("Posición: ");
            int posicion = sc.nextInt();
            System.out.print("Número de casaca: ");
            int casaca = sc.nextInt();
            System.out.print("Partidos jugados: ");
            int partJugados = sc.nextInt();
            System.out.print("Estado físico: ");
            int estFisico = sc.nextInt();
            
            Jugador j = new Jugador(nombre, posicion, casaca, partJugados, estFisico);
            
            e.agregarJugador(j);
        }
        
        System.out.println("Cantidad de jugadores con menos de 10 partidos jugados: " + e.jugadoresConMenosPartidos());
        
        System.out.println("Jugador con más partidos jugados: " + e.jugadorConMasPartidos());
        
        System.out.println("Promedio estado físico del equipo: " + e.promedioEstadoFisico());
        
        System.out.print("Ingrese número de casaca para saber su estado físico: ");
        int casaca = sc.nextInt();
        System.out.println("El estado físico del jugador " + casaca + " es: " + e.identificarEstadoDeJugador(casaca));
        
        System.out.println("Promedio partidos jugados de arqueros:" + e.promedioPartidosArqueros());
        System.out.println("Promedio partidos jugados de defensores:" + e.promedioPartidosDefensores());
        System.out.println("Promedio partidos jugados de mediocampistas:" + e.promedioPartidosMediocampistas());
        System.out.println("Promedio  partidos jugados de delanteros:" + e.promedioPartidosDelanteros());
    }
}
