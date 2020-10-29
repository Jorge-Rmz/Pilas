
package pilamemoriadinamica;
import javax.swing.JOptionPane;

public class PilaPrincipal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = 0, elemento = 0;
        Pila pilita = new Pila();
        
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Empujar un elemento de la Pila"
                        + "\n2.-Sacar un elemento de la Pila"
                        + "\n3.-¿La Pila está Vacia?"
                        + "\n4.-¿Que elemento esta en la cima?"
                        + "\n5.-Tamaño de la pila"
                        + "\n6.-Limpiar toda la Pila"
                        + "\n7.-Salir"
                        + "\n\n¿Que desea Hacer?"));
                switch(opcion){
                    case 1:
                        elemento =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en la pila"));
                            pilita.empujar(elemento);
                        break;
                    case 2:
                        if(!pilita.estaVacia()){
                             JOptionPane.showMessageDialog(null, "El elemento obtenido es: " + pilita.sacar());
                        }else{
                             JOptionPane.showMessageDialog(null, "La pila esta Vacia" );
                        }
                        break;
                    case 3:
                        if(!pilita.estaVacia()){
                             JOptionPane.showMessageDialog(null, "La pila no esta Vacia" );
                        }else{
                             JOptionPane.showMessageDialog(null, "La pila esta Vacia" );
                        }
                        break;
                    case 4:
                        if(!pilita.estaVacia()){
                             JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: " + pilita.cima());
                        }else{
                             JOptionPane.showMessageDialog(null, "Pila vacia" );
                        }
                        break;
                    case 5:
                         JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + pilita.tamanoPila());
                        break;
                    case 6:
                        if(!pilita.estaVacia()){
                            pilita.LimpiarPila();
                            JOptionPane.showMessageDialog(null, "Proceso Terminado\nPila vacia.");
                        }else{
                            JOptionPane.showMessageDialog(null, "Pila vacia");
                        }    
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada" );
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no existente\nIntente Nuevamente");
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 7);
    }
    
}
