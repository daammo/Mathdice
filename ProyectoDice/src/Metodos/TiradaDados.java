package Metodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class TiradaDados {
	

    public int GenerarAleatorioDadoSeis()
	    {
	        Random Aleatorio = new Random();
	        int DadoSeis;
	         
	        DadoSeis = Aleatorio.nextInt(6)+1;
	         
	        return DadoSeis;
	    }
	        
    public int GenerarAleatorioDadoTres()
		{
		    Random Aleatorio = new Random();
		    int DadoTres;
		         
		    DadoTres = Aleatorio.nextInt(3)+1;
		         
		    return DadoTres;	        
	    }
	 
	public void TirarDadoSeis()
        {
            int tiradaSeis;     
         
            tiradaSeis = GenerarAleatorioDadoSeis();
        
            JOptionPane.showInputDialog("Tirada","Has sacado un: "+tiradaSeis);
            //Esta segunda opci�n me parec�a mejor pero me salta un error que no he conseguido solventar
            //si le echas un vistazo y lo ves ser�a genial poder saber donde esta fallando
            //JOptionPane.showMessageDialog(null,"Has sacado un: "+tiradaSeis,"Tirada", tiradaSeis);
            
      
        }
	
	public void TirarDadoTres()
        {
           int tiradaTres;     
         
           tiradaTres = GenerarAleatorioDadoTres();
        
           JOptionPane.showMessageDialog(null,"Has sacado un: "+tiradaTres,"Tirada", tiradaTres);
      
        }
}
	

