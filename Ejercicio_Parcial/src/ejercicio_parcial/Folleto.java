package ejercicio_parcial;

public class Folleto 
{
    private String fecha;
    private Oferta[] ofertas;

    public Folleto(String fecha, int cantidadOfertas) 
    {
        this.fecha = fecha;
        this.ofertas = new Oferta[cantidadOfertas];
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }
    
    public void agregarOferta(Oferta o)
    {
        for (int i = 0; i < ofertas.length; i++) 
        {
            if (ofertas[i] == null)
            {
                ofertas[i] = o;
                break;
            }
        }
    }
    
    public int articulosConVigencia()
    {
        int cantidadProductos = 0;
        for (int i = 0; i < ofertas.length; i++) 
        {
            if (ofertas[i] != null && ofertas[i].getVigencia() >= 5)
            {
                cantidadProductos++;
            }
        }
        return cantidadProductos;
    }
    
    public int totalStock()
    {
        int sumatoria = 0;
        for (int i = 0; i < ofertas.length; i++) 
        {
            if (ofertas[i] != null)
            {
                sumatoria += ofertas[i].getStock();
            }
        }
        return sumatoria;
    }
    
    public int productosConDescuentoSuperior20()
    {
        int productoConDescuento = 0;
        for (int i = 0; i < ofertas.length; i++) 
        {
            if (ofertas[i] != null && ofertas[i].getPrecioRegular() - ofertas[i].getPrecioOferta() >= 20)
            {
                productoConDescuento++;
            }
        }
        return productoConDescuento;
    }
    
    public int totalRecaudado(int idProducto)
    {
        int total = 0;
        for (int i = 0; i < ofertas.length; i++) 
        {
            if (ofertas[i] != null && ofertas[i].getIdProducto() == idProducto)
            {
                total += ofertas[i].getPrecioOferta()*ofertas[i].getStock();
            }
        }
        return total;
    }
}
