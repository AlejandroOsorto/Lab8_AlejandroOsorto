package lab8_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Programa
{
    private String nombre;
    private int puntuacion;
    private int año;
    private String tipo;
    private String genero;

    public Programa()
    {
    }

    public Programa(String nombre, int puntuacion, int año, String tipo, String genero)
    {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.año = año;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getPuntuacion()
    {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion)
    {
        this.puntuacion = puntuacion;
    }

    public int getAño()
    {
        return año;
    }

    public void setAño(int año)
    {
        this.año = año;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    
    @Override
    public String toString()
    {
        return nombre + "/" + puntuacion + "/" + año + "/" + tipo + "/" + genero;
    }
}
