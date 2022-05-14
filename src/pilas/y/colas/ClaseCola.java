
package pilas.y.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class ClaseCola {
    
    int tam,primero,ultimo;
    int veCola[];
    
    public ClaseCola(int tam)
    {
        this.tam=tam;
        veCola=new int[tam];
        primero=-1;
        ultimo=-1;
    }
    

    public void Encolar(int dato) {
        if(ultimo<tam-1) {
            
            ultimo=ultimo+1;
        
            veCola[ultimo]= dato;
            
              if(ultimo==0){
                  primero=0; 
              }
                 
        } else {
            JOptionPane.showMessageDialog (null, "NO SE PUEDE ENCOLAR");
        } 
    }
    
    public int Desencolar(){
        
        int dato;
        
        dato=veCola[primero];
        if(primero==ultimo){
            primero=-1;
            ultimo=-1;
        } else {
          primero=primero+1;
        }
        return dato;
    }
    
 public boolean Vacio() {
     
        if (primero >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
  public String MostrarCola(){
      String salida = ""; 
      
      for (int i = primero; i <= ultimo; i++){
          
          salida = salida + veCola [i] + " | ";  
      }
      return salida; 
    }
  
  public int Tamaño(){
        return veCola.length;
    }
    
     public void VaciarCola(){
        primero=-1;
        ultimo=-1;
    }
          
}
