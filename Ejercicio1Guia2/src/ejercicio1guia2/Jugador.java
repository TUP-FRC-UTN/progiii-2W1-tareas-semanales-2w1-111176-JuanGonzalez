package ejercicio1guia2;

class Jugador 
{
    private String nombre;
    private int posicion;
    private int casaca;
    private int partJugados;
    private int estFisico;

    public Jugador(String nombre, int posicion, int casaca, int partJugados, int estFisico) 
    {
        this.nombre = nombre;
        this.posicion = posicion;
        this.casaca = casaca;
        this.partJugados = partJugados;
        this.estFisico = estFisico;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getPosicion() 
    {
        return posicion;
    }

    public void setPosicion(int posicion) 
    {
        this.posicion = posicion;
    }

    public int getCasaca() 
    {
        return casaca;
    }

    public void setCasaca(int casaca) 
    {
        this.casaca = casaca;
    }

    public int getPartJugados() 
    {
        return partJugados;
    }

    public void setPartJugados(int partJugados) 
    {
        this.partJugados = partJugados;
    }

    public int getEstFisico() 
    {
        return estFisico;
    }

    public void setEstFisico(int estFisico) 
    {
        this.estFisico = estFisico;
    }

    @Override
    public String toString() 
    {
        return "Nombre: " + nombre + " Posición: " + posicion + " Casaca: " + casaca + " Partidos jugados: " + 
                partJugados + " Estado físico: " + estFisico;
    }
    
    
}
