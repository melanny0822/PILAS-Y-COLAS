
package pilas.y.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class PilasYColas {

    
    public static void main(String[] args) {
       
        int opc = 0,tam,dato;
         
       
            String menu = " MENU \n" +
                    
                    "ELIGE UNA OPCION \n"+
                    "1.Apilar\n" +
                    "2.Desapilar\n" +
                    "3.Vaciar pila\n" +
                    "4.Mostrar pila\n" +
                    "                            \n"+
                    "5.Encolar\n" +
                    "6.Desencolar\n" +
                    "7.Mostrar cola\n" +
                    "8.Vaciar cola\n" +
                    "                            \n"+
                    "9.Pasar pila a cola\n" +
                    "10.Pasar cola a pila\n" +
                    "                            \n"+
                    "0.Salir\n";
            
            tam = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO DE LA PILA Y LA COLA"));
     
            ClasePila Pl= new ClasePila(tam);
            ClaseCola Co= new ClaseCola(tam);
          
    do {
            try {

                opc = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opc) {
                    
                    case 1:

                        dato = Integer.parseInt(JOptionPane.showInputDialog("INGRSE EL DATO A APILAR"));

                        Pl.Apilar (dato);
                        break;
                        
                    case 2:

                        JOptionPane.showMessageDialog(null, "SE DESAPILO EL SIGUIENTE DATO: " + Pl.Desapilar());
                        break;
                    
                    case 3:
                        Pl.VaciarPila();
                        break;
                        
                    case 4:

                        if (Pl.Vacia() == false) {
                            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
                        } else {
                            JOptionPane.showMessageDialog(null, "LOS DATOS DE LA PILA SON:\n " + Pl.MostrarPila());
                        }

                        break;
                        
                    case 5:
                        dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DATO QUE DESEA DESENCOLAR"));
                        Co.Encolar(dato);
                        break;
                        
                    case 6:
                        JOptionPane.showMessageDialog(null, "Se desencolo el dato: " + Co.Desencolar());
                        break;
                        
                    case 7:
                        if (Co.Vacio() == false) {
                            JOptionPane.showMessageDialog(null, "LA COLA ESTA VACIA");
                        } else {
                            JOptionPane.showMessageDialog(null, "LOS DATOS DE LA COLA SON:\n " + Co.MostrarCola());
                        }

                        break;
                    
                    case 8:
                        Co.VaciarCola();
                        break;
                    case 9:

                        if (Pl.Vacia() == false) {
                            JOptionPane.showMessageDialog(null, "NO ES POSIBLE ENCOLAR");
                        } else {
                            Co.Encolar(Pl.Desapilar());
                            JOptionPane.showMessageDialog(null, "EL DATO FUE ENCOLADO");
                        }

                        break;

                    case 10:

                        if (Co.Vacio() == false) {
                            JOptionPane.showMessageDialog(null, "NO ES POSIBLE APILAR");
                        } else {
                            Pl.Apilar(Co.Desencolar());
                            JOptionPane.showMessageDialog(null, "EL DATO FUE APILADO");
                        }

                        break;

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "NO ES POSIBLE REALIZAR LA ACCIÓN");

            }

        } while (opc != 0 );

    }  
    }
    

