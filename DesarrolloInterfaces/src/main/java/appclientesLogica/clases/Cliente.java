/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appclientesLogica.clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String provincia;
    private Date fechaAlta;
    private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    private String telefono;

    public Cliente(String nombre, String apellido, String provincia, Date fechaAlta, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProvincia() {
        return provincia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Metodo que devuelve el cliente en forma de Array
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = apellido;
        s[2] = telefono;
        //s[3] = fechaAlta.toString();
        s[3] = formato.format(fechaAlta);
        s[4] = provincia;
        return s;
    }
    
}
