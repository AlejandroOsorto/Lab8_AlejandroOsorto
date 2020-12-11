package lab8_alejandroosorto;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alejandro
 */
public class ClaudiList
{
    private String nombre;
    private ArrayList lista;
    private File archivo;

    public ClaudiList()
    {
    }

    public ClaudiList(String path)
    {
        archivo = new File(path);
    }

    public File getArchivo()
    {
        return archivo;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
    }
    
    

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<Programa> lista)
    {
        this.lista = lista;
    }
    
    @Override
    public String toString()
    {
        return nombre + ": " + lista;
    }
    
    public void EscribirArchivo()
    {
        JFileChooser FC = new JFileChooser();
        FC.setSelectedFile(new File(nombre));
        int seleccion = FC.showSaveDialog(null);
        

        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                File fichero = null;
                fichero = new File(FC.getSelectedFile().getPath() + ".txt");
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < lista.size(); i++)
                {
                    bw.write("" + lista.get(i)+"\n");
                }

                bw.flush();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            try
            {
                bw.close();
                fw.close();
            }
            catch (Exception e2)
            {
            }
        }
    }
    
    public void cargarArchivo()
    {
        Scanner leer = null;
        lista = new ArrayList();
        if (archivo.exists())
        {
            try
            {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext())
                {
                    lista.add(new Programa(leer.next(), leer.nextInt(), leer.nextInt(), leer.next(), leer.next()));
                }
            } 
            catch (Exception ex){}
            leer.close();
        }
    }
    
}
