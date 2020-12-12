package lab8_alejandroosorto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Ale
 */
public class AdminHora implements Runnable
{
    private JLabel LAB_hora;

    public AdminHora(JLabel hora)
    {
        this.LAB_hora = hora;
    }
    
    
    @Override
    public void run()
    {
        
        while (true)
        {
            Date hora = new Date();
            DateFormat DF = new SimpleDateFormat("hh:mm:ss");
            LAB_hora.setText(DF.format(hora));
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException ex){}
        }
    }
}
