/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlenton;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        UnicaInstancia unica = UnicaInstancia.obtenerInstancia();
        unica.mostrarMensaje(); // Salida: Soy la única instancia.
    }
}