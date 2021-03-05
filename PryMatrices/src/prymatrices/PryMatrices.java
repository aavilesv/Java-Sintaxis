
package prymatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Tania Abarca
 */
public class PryMatrices {

  
    public static void main(String[] args) {
        
        int opcion=0;
        int x;
        int y;
        int numero;
        int numeroM;
        
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de las filas: "));
         y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de las columnas: "));
         Matriz m=new Matriz(x,y);  
        do{
             opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"---------------Menú--------------"
               +"\n[1] Llenar Matriz"
               +"\n[2] Mostrar Matriz"
               +"\n[3] Buscar Elemento"
               +"\n[4] Modificar Elemento"
               +"\n[5] Eliminar Elemento"      
               +"\n[6] Salir"
               +"\nElija una opción:"));
              switch(opcion)
            {     
                case 1:
                     
                     m.llenarMatriz();              //voy a llenar la matriz
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,m.mostrarMatriz());     //aquimostramos la matriz        
                    break;
                case 3:
                    numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número a buscar "));
                   
                    m.buscar(numero); //verifica si el numero ya existe
                    
                    break;
                case 4:
                    numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número que desea modificar: "));
                    if(m.buscar(numero))
                    {
                        do{
                        
                        numeroM=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número que va colocar: "));
                        if(m.buscar(numeroM))
                        {
                           JOptionPane.showMessageDialog(null,"Ingrese el número que va colocar nuevamente");  
                        }
                       
                        }while(m.buscar(numeroM));
                         m.modificar(numero,numeroM);
                        JOptionPane.showMessageDialog(null,"El número se ha modificado");
                    }else
                    {
                        JOptionPane.showMessageDialog(null,"Vuelva a ingresar.."); 
                    }   
                    break; 
                case 5:
                    numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número que desea eliminar: "));
                    if( m.buscar(numero))
                    {
                        JOptionPane.showMessageDialog(null, "El número se encuentra en la matriz");
                        m.Eliminar();
                    }else{
                        JOptionPane.showMessageDialog(null, "El número no se encuentra en la matriz");
                    }
                    
                    break;
                    
                    default:
                   
                    break;  
            }
        }while(opcion!=6); 
    }
}