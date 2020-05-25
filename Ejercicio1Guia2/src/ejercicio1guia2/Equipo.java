package ejercicio1guia2;

class Equipo 
{
    private String nombre;
    private Jugador[] jugadores;

    public Equipo(String nombre, int cantidadJugadores) 
    {
        this.nombre = nombre;
        this.jugadores = new Jugador [cantidadJugadores];
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void agregarJugador(Jugador j)
    {
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] == null)
            {
                jugadores[i] = j;
                break;
            }
        }
    }
    
    public int jugadoresConMenosPartidos()
    {
        int cantJugadores = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getPartJugados() < 10)
            {
                cantJugadores ++;
            }
        }
        return cantJugadores;
    }
    
    public String jugadorConMasPartidos()
    {
        Jugador jugadorSolicitado = jugadores[0];
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadorSolicitado.getPartJugados() < jugadores[i].getPartJugados())
            {
                jugadorSolicitado = jugadores[i];
            }
        }
        return jugadorSolicitado.getNombre();
    }
    
    public double promedioEstadoFisico()
    {
        int cantJugadores = 0;
        int sumaEstadoFisico = 0;
        int promEstadoFisico = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null)
            {
                cantJugadores ++;
                sumaEstadoFisico += jugadores[i].getEstFisico();
                promEstadoFisico = sumaEstadoFisico/cantJugadores;
            }
        }
        return promEstadoFisico;
    }
    
    public int identificarEstadoDeJugador(int casaca)
    {
        int estadoFisico = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getCasaca() == casaca)
            {
                estadoFisico = jugadores[i].getEstFisico();
            }
        }
        return estadoFisico;
    }
    
    public double promedioPartidosArqueros()
    {
        int cantJugadores = 0;
        int sumaPartJugados = 0;
        int promedio = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getPosicion() == 1)
            {
                cantJugadores ++;
                sumaPartJugados += jugadores[i].getPartJugados();
                promedio = sumaPartJugados/cantJugadores;
            }
        }
        return promedio;
    }
    
    public double promedioPartidosDefensores()
    {
        int cantJugadores = 0;
        int sumaPartJugados = 0;
        int promedio = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getPosicion() == 2)
            {
                cantJugadores ++;
                sumaPartJugados += jugadores[i].getPartJugados();
                promedio = sumaPartJugados/cantJugadores;
            }
        }
        return promedio;
    }

    public double promedioPartidosMediocampistas()
    {
        int cantJugadores = 0;
        int sumaPartJugados = 0;
        int promedio = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getPosicion() == 3)
            {
                cantJugadores ++;
                sumaPartJugados += jugadores[i].getPartJugados();
                promedio = sumaPartJugados/cantJugadores;
            }
        }
        return promedio;
    }
    
    public double promedioPartidosDelanteros()
    {
        int cantJugadores = 0;
        int sumaPartJugados = 0;
        int promedio = 0;
        for (int i = 0; i < jugadores.length; i++) 
        {
            if (jugadores[i] != null && jugadores[i].getPosicion() == 4)
            {
                cantJugadores ++;
                sumaPartJugados += jugadores[i].getPartJugados();
                promedio = sumaPartJugados/cantJugadores;
            }
        }
        return promedio;
    }
    
    @Override
    public String toString() 
    {
        return " Equipo: " + nombre + " Jugadores: " + jugadores.toString();
    }
}
