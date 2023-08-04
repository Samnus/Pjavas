/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jlopez
 */
public class Empleado extends Persona {
    private String empleado, puesto;

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

        @Override
    public void agregar (){
    System.out.println("Empleado: "+ getEmpleado());
    System.out.println("Puesto: "+ getPuesto());
    System.out.println("Nombre: "+ getNombre());
    System.out.println("Apellidos: "+ getApellidos());
    System.out.println("Direccion: "+ getDireccion());
    System.out.println("Telefono: "+ getTelefono());
    System.out.println("Fecha Nacimiento: "+ getFecha_nacimiento());
    }
    
}
