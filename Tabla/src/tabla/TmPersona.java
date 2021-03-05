/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class TmPersona implements TableModel {

    private List<Persona> personas;

    public TmPersona(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int i) {
        String titulo = null;
        switch (i) {
            case 0: {
                titulo = "ID";
                break;
            }
            case 1:
                titulo = "Nombre";

                break;
            case 2:
                titulo = "Apellido";

                break;

        }

        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return i1 != 0;

    }

    @Override
    public Object getValueAt(int i, int i1) {

        Persona p = personas.get(i);
        String valor = null;
        switch (i1) {
            case 0: {
                valor = p.getId();
                break;
            }
            case 1:
                valor = p.getNombre();

                break;
            case 2:
                valor = p.getApellido();

                break;

        }
        return valor;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
       /* Persona p = personas.get(i);

        switch (i1) {
            case 0: {
                p.setId(o.toString());
                break;
            }
            case 1:
p.setNombre(o.toString());
                break;
            case 2:
            p.setApellido(o.toString());

                break;

        }*/

    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
    }

}
