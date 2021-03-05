
package prymatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Tania Abarca
 */
public class Matriz {
    
    //ATRIBUTOS
   private int m[][];
   private int x;
   private int y;
    private int indicecoluma;
        private int indicefila;

    //CONSTRUCTOR
    
    public Matriz(int x,int y)
    {
        this.x=x;
        this.y=y;
        m=new int[this.x][this.y];    //definiendo el tamaño de la matriz
    this.indicecoluma=0;
    this.indicefila=0;
    }
    
   //---------------------------------------------------------------------------------------------------------
    //Metodo que llena una Matriz de numeros sin que se repitan
    public void llenarMatriz()  
    {
        int n;
        
        for(int i=0;i<this.x;i++)       //recorre las filas
        {
            for(int j=0;j<this.y;j++)     //recorre las columnas 
            {
                do{
                    n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese en la posición: "+"["+i+"]"+"["+j+"]")); 
                    if(NoRepetidos(n,i,j))
                    {
                        JOptionPane.showMessageDialog(null,"..ERROR.. El número esta repetido..\n Vuelva a ingresar..");               
                    }       
                }while(NoRepetidos(n,i,j));
                m[i][j]=n;  
            }   
        }   
    }
    
  //----------------------------------------------------------------------------------------------
    //metodo que muestra la matriz ingresada
    public String mostrarMatriz()
    {
        String cadena="   MATRIZ \n" ;
         for(int i=0;i<this.x;i++)       //recorre las filas
        {
            for(int j=0;j<this.y;j++){
                
                cadena+="["+m[i][j]+"]"+"   \t";
                }//fin 2do for
            cadena+="\n";
            
        }
      
      return cadena;
    }
   
 //---------------------------------------------------------------------------------------------------
    //metodo que me retorna verdadero si unnumero q se va a ingresar ya esta ingresado
    public boolean NoRepetidos(int n,int fil,int col)
    {
        for(int i=0;i<m.length;i++)      //fil=1   
        {
            for(int j=0;j<m[i].length;j++){   //fil=0;
                if(n==m[i][j])
                {
                    return true;         //si esta repetido retorna verdadero
                }   
            }
        }
        return false;    //caso en q no este repetido
    }
    //--------------------------------------------------------------------------------
    //metodo 
    public boolean buscar(int num)
    {
        int b=0;
        for(int i=0;i<this.x;i++)       //recorre las filas
        {
            for(int j=0;j<this.y;j++){    //recorre columnas
                
                if(num==m[i][j])
                {
                    indicecoluma=j;
                    indicefila=i;
                    b=1;
                    JOptionPane.showMessageDialog(null,"Número se encuentra en la fila "+(i+1)+" columna "+(j+1));
                    return true;    
                }
            }  
        }
        if(b==0)
        {
            JOptionPane.showMessageDialog(null,"el número: "+num+" no se encuentra registrado ");
        }
         return false;
    }
    //metodo que modifica un numero de la matriz
    public void modificar(int num,int modificar)
    {
    for(int i=0;i<this.x;i++)       //recorre las filas
        {
            for(int j=0;j<this.y;j++){    //recorre columnas
                
                if(num==m[i][j])
                {
                    m[i][j]=modificar;                  
                }
            }  
        }
    }
    public void Eliminar() {
   
        for (int i = indicecoluma; i < this.y; i++) {
            if (indicefila ==  this.x - 1) {
                if (i ==  this.y-1) {
                    m[indicefila][i] = 0;
                    break;
                } else {
                    m[indicefila][i] = m[indicefila][i + 1];

                }

            } else {
                if (i == this.y - 1) {
                    m[indicefila][i] = m[indicefila + 1][0];
                    indicefila = indicefila + 1;
                    i = -1;

                } else {

                    m[indicefila][i] = m[indicefila][i + 1];

                }

            }
        }
    }
}