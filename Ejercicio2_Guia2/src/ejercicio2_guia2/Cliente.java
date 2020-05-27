package ejercicio2_guia2;

public class Cliente
{
    private int idCliente;
    private String nombreCliente;
    private int antiguedad;
    private String nombreMascota;
    private int edadMascota;

    public Cliente(int idCliente, String nombreCliente, int antiguedad, String nombreMascota, int edadMascota) 
    {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    public int getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente) 
    {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() 
    {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) 
    {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() 
    {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) 
    {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() 
    {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) 
    {
        this.edadMascota = edadMascota;
    }
    
    @Override
    public String toString() 
    {
        return "ID cliente: " + idCliente + " Nombre de cliente: " + nombreCliente + " Antiguedad: " + antiguedad + 
                " Mascota: " + " Nombre de mascota: " + nombreMascota + " Edad de mascota: " + edadMascota;
    }
}
