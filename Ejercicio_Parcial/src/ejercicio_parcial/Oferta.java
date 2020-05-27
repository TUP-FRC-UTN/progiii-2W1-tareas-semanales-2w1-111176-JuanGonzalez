package ejercicio_parcial;

public class Oferta 
{
    private int idProducto;
    private String nombreProducto;
    private double precioRegular;
    private double precioOferta;
    private int vigencia;
    private int stock;

    public Oferta(int idProducto, String nombreProducto, double precioRegular, double precioOferta, int vigencia, int stock) 
    {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.vigencia = vigencia;
        this.stock = stock;
    }

    public int getIdProducto() 
    {
        return idProducto;
    }

    public void setIdProducto(int idProducto) 
    {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() 
    {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) 
    {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() 
    {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) 
    {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() 
    {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) 
    {
        this.precioOferta = precioOferta;
    }

    public int getVigencia() 
    {
        return vigencia;
    }

    public void setVigencia(int vigencia) 
    {
        this.vigencia = vigencia;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    @Override
    public String toString() 
    {
        return "ID producto: " + idProducto + " Nombre del producto: " + nombreProducto + " Precio regular: " + 
                precioRegular + " Precio oferta: " + precioOferta + " Vigencia: " + vigencia + " Stock: " + stock;
    }
}
