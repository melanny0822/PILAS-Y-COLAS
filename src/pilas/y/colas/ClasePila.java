
package pilas.y.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class ClasePila {
    
    int tam,tope;
    int vecPila[];
    
    public ClasePila (int tam)
    {
        this.tam=tam;
        vecPila=new int[tam];
        tope = -1;
    }
    
    public boolean Vacia () {
        if (tope == -1)  {
            
            return false;
        } else  {
            return true;
        }
    }
    
    public void VaciarPila() {
        tope=-1;
    }
   
    public void Apilar(int dato)
    {
        if(tope<tam-1)
        {
            tope = tope + 1;
            vecPila[tope]=dato;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE APILAR");
        }
    }
    
    public int tamaño (){
        return vecPila.length;
    }
    
    public int Desapilar()
    {
        int dato;
        dato=vecPila[tope];
        tope=tope-1;
        return (dato);        
    }
    
    public String MostrarPila(){
        String salida = "";
        
        for (int i = tope; i >= 0; i--){
            salida = salida + vecPila [i] + " \n ";
            
        }
           
            return salida;
    }
}
