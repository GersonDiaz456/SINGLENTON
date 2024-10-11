/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlenton;

class UnicaInstancia {
    private static UnicaInstancia instancia;

    private UnicaInstancia() {}

    public static UnicaInstancia obtenerInstancia() {
        if (instancia == null) {
            instancia = new UnicaInstancia();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Soy la única instancia.");
    }
    
        
    }
