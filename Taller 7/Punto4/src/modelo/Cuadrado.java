/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Cuadrado extends Cuadrilatero{

    public Cuadrado(float base, float altura) {
        super(base,altura);
    }

    public float calcularArea(){
        return super.getAltura()*super.getBase();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
