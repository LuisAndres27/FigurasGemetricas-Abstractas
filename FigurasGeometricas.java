/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis2
 */
public  class  FigurasGeometricas extends Volumetricas {
    
    public FigurasGeometricas (double base, double altura, double altura2, double altura3){
        
        super.base = base;
        super.altura = altura;
        super.altura2 = altura2;
        super.altura3 = altura3;
        
}

    @Override
    public double CalcularAreaCuadrado(double base, double altura) {
       return base * altura;   
    }

    @Override
    public double CalcularPerimetroDeCuadrado(double base, double altura, double altura2, double altura3) {
          return base * altura * altura2 * altura3; 
    }

    @Override
    public double CalcularArearTriangulo(double base, double altura) {
        return base * altura / 2 ; 
    }

    @Override
    public double CalcularPerimetroTriangulo(double altura, double base) {
       return 2 * altura + base ;
    }

    @Override
    public double VolumenCubo(double lado) {
       return lado * lado * lado ;
    }

    @Override
    public double VolumenEsfera(double radio) {
        return 4/3 * 3.14 * radio * radio * radio;
    }

    @Override
    public double VolumenCilindro(double radio) {
        return 3.14 * radio * radio * altura ;
    }
    
    

    
    
    
    
     
}
