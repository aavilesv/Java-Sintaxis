
package prymatrices1;

import javax.swing.JOptionPane;

class Matriz
{
   //Atributos
   private int matriz[][]; 
   private int fila;
   private int columna;
   private int i=0;
   private int j=0;
   private int numero;

   public Matriz(){}
   
   public Matriz(int fila, int columna)
   {
       this.fila=fila;
       this.columna=columna;
       matriz=new int[fila][columna];
   }

   
   public boolean LlenarMatriz(){
          //Llenar la matriz con valores ingresados por teclado
       boolean bo = false;
       int nu=0;
        for(int f=0; f<matriz.length; f++)
        {//recorre las filas
            for(int c=0;c<matriz[f].length; c++)
            {//recorre 
             //
                do{
                    nu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores en la posición ["+f+"] ["+c+"]"));             
                    
              
                
                }while(Repetidos(matriz));
                matriz[f][c]=nu;
            }
        }
       return bo;
                
    }
   public String Presentar()
   {
       String cadena="";
       for(i=0;i<fila;i++)
       {
           for(j=0;j<columna;j++)
           {
               cadena+=" ["+matriz[i][j]+"] ";
           }
           cadena+="\n";
       }
       return cadena;
   }
   
    public boolean Repetidos(int matriz[][])
      {
        boolean t=false;
       for(int f=0; f<=fila; f++){//recorre las filas
            for(int c=0;c<=columna; c++){//recorre 
                if(matriz[f][c]==matriz[f][c]){
                    t=true;
                }
                
            }  
        }
        return t;
      }
   public String Buscar(int dato)
   {
       String mensaje="";
       boolean buscar=false;
       for(i=0;i<fila;i++)
       {
           for(j=0;j<columna;j++)
           {
               if(dato==matriz[i][j])
               {
                   mensaje+="\n¡Dato encontrado con éxito!\nFila:  "+(i+1)+"\nColumna:  "+(j+1);
                   buscar=true;
               }
           }
       }
       if(buscar==false)
       {mensaje="¡Dato no encontrado!";}
       
       return mensaje;
   }
   
   public boolean modificar(int i,int j, int numero)
   {
        if(i>-1&&i<matriz.length)
        {
            matriz[i][j] = numero;  
            return true;
        }
        else
        {
            return false;
        }
   }
   
    public boolean Eliminar(int i, int j, int numero) 
    { 
        for (i = 0; i < fila; i++) 
        {
            for (j = 0; j < columna; j++) 
            {
                if (matriz[i][j] == numero) 
                {        
                  while(i<fila)
                  {
                      if(j<columna-1)
                      {
                         matriz[i][j] = matriz[i][j+1];
                         j++;
                      }
                      else
                      {
                        if(i==fila-1&&j==columna-1)
                        {
                          matriz[i][j]=0;
                          break;
                        }
                        else
                        {
                          matriz[i][j] = matriz[i+1][0];
                          i++;
                          j=0;
                        }
                      }
                   }
                  break;
               
                }
                
            }}
       return true;
       
   }

    
}

