package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    private CalculadorDescuentos calculador = new CalculadorDescuentos();

    @Test
    public void dado_mayorEdadYDiasAntelacionMenorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(50,15,25);
        Assert.assertEquals(50,tarifa,0.01);
    }

    @Test
    public void dado_menorEdad_cuando_esValido_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,15,15);
        double tarifa_esperada = tarifaBase * 0.95D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }


    @Test
    public void dado_menorEdadYDiasAntelacionMayorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,30,15);
        double tarifa_esperada = tarifaBase * 0.8D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }

    @Test
    public void dado_menorEdadYDiasAntelacionMenorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,10,15);
        double tarifa_esperada = tarifaBase * 0.95D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }

    @Test
    public void dado_mayorEdadYDiasAntelacionMayorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,30,25);
        double tarifa_esperada = tarifaBase * 0.85D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }


    @Test
    public void dado_mayor65YDiasAntelacionMayorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,30,75);
        double tarifa_esperada = tarifaBase * 0.77D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }


    @Test
    public void dado_mayor65YDiasAntelacionMenorA20_cuando_diasAntelacionMayorA20_entonces_aplicaDescuento(){
        double tarifaBase = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase,7,75);
        double tarifa_esperada = tarifaBase * 0.92D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }

    
}
