/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import Modelo.Directivo;
import Modelo.Empleado;
import Modelo.Oficial;
import Modelo.Operario;
import Modelo.Tecnico;

/**
 *
 * @author ESTUDIANTES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado E1 = new Empleado("Hernan");
       Directivo D1 = new Directivo("Mario");
       Operario OP1 = new Operario("Alfonso");
       Oficial OF1 = new Oficial("Luis");
       Tecnico T1 = new Tecnico("Pablo");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);

    }
    
}
