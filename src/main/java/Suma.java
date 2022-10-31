/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jbs
 */
public class Suma {
    
    /** Definir las variables atributos definidos en la clase **/
    private double n1;
    private double n2;
    private double res;

    public Suma(double num1, double num2) {
    n1=num1;
    n2=num2;
    res=n1 + n2; 
    }
    
    public double resultado(){
    return res;
    }
    
    public String tostring (){
    return n1 + "+" + n2 + "=" + res;
    }
  
}
