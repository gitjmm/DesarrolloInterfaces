/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appclientesLogicaModel.logica;

import appclientesLogicaModel.clases.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Jorge Martínez
 * Esta clase se va a encargar de las operaciones correspondietes: crear,borrar...
 */
public class LogicaNegocio {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
    
}
