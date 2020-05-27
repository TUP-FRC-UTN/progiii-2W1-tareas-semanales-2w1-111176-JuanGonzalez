package ejercicio2_guia2;

public class Veterinaria 
{
    private Cliente[] clientes;

    public Veterinaria(int cantidadClientes)
    {
        this.clientes = new Cliente[cantidadClientes];
    }
    
    public void agregarCliente(Cliente c)
    {
        for (int i = 0; i < clientes.length; i++) 
        {
            if (clientes[i] == null)
            {
                clientes[i] = c;
                break;
            }
        }
    }
    
    public int cantidadClientes()
    {
        int contadorClientes = 0;
        
        for (int i = 0; i < clientes.length; i++) 
        {
            if (clientes[i] != null)
            {
                contadorClientes ++;
            }
        }
        return contadorClientes;
    }
    
    public double promedioEdadMascotas()
    {
        int contadorMascotas = 0;
        int sumaEdades = 0;
        int promedioEdad = 0;
        
        for (int i = 0; i < clientes.length; i++) 
        {
            if (clientes[i] != null)
            {
                contadorMascotas ++;
                sumaEdades += clientes[i].getEdadMascota();
            }
        }
        promedioEdad = sumaEdades/contadorMascotas;
        return promedioEdad;
    }
    
    public int cantidadClientesAntiguos()
    {
        int cantidadClientes = 0;
        
        for (int i = 0; i < clientes.length; i++) 
        {
            if (clientes[i] != null && clientes[i].getAntiguedad() >= 5)
            {
                cantidadClientes ++;
            }
        }
        return cantidadClientes;
    }
}
