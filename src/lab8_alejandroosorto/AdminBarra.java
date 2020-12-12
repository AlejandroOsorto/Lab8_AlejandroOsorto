package lab8_alejandroosorto;

import javax.swing.JProgressBar;

/**
 *
 * @author Ale
 */
public class AdminBarra extends Thread
{
    private JProgressBar barra;
    private boolean avance;
    private boolean activo;

    public AdminBarra(JProgressBar barra)
    {
        this.barra = barra;
        avance = true;
        activo = true;
    }

    public boolean isAvance()
    {
        return avance;
    }

    public void setAvance(boolean avance)
    {
        this.avance = avance;
    }

    public boolean isActivo()
    {
        return activo;
    }

    public void setActivo(boolean activo)
    {
        this.activo = activo;
    }

    public JProgressBar getBarra()
    {
        return barra;
    }

    public void setBarra(JProgressBar barra)
    {
        this.barra = barra;
    }
    
    @Override
    public void run()
    {
        while (activo)
        {
            if (avance)
            {
                barra.setValue(barra.getValue() + 10);
                if (barra.getValue() == 100)
                {
                    activo = false;
                    
                }
            }
            
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {}
        }
    }
    
}
