/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis2
 */
public abstract class Planas   {
    
    protected double base;
    protected double altura;
    protected double altura2;
    protected double altura3;
    public String nombre;
    
    public abstract double CalcularAreaCuadrado (double base, double altura);
    
    public abstract double CalcularPerimetroDeCuadrado (double base, double altura, double altura2, double altura3);
    
    public abstract double CalcularArearTriangulo (double base, double altura );
    
    public abstract double CalcularPerimetroTriangulo (double altura , double base);
    
}
    

