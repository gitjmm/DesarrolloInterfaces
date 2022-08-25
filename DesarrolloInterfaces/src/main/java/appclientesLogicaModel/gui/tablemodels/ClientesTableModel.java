/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appclientesLogicaModel.gui.tablemodels;

import appclientesLogicaModel.clases.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class ClientesTableModel extends AbstractTableModel{
    private ArrayList<Cliente> listaClientes;
    private String[] columnas = {"Nombre","Apellido","Telefono","FechaAlta","Provinicia"};
    
    public ClientesTableModel(ArrayList<Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: 
                return listaClientes.get(rowIndex).getNombre();
            case 1: 
                return listaClientes.get(rowIndex).getApellido();
            case 2: 
                return listaClientes.get(rowIndex).getTelefono();
            case 3: 
                return listaClientes.get(rowIndex).getFechaAlta();
            case 4: 
                return listaClientes.get(rowIndex).getProvincia();
        }
        return null;
    }
    @Override
    public String getColumnName(int column){
        return columnas[column];
    }
}
