package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    private CalculadorDescuentos calculador = new CalculadorDescuentos();

    @Test
    public void dado_valores_cuando_sonPositivos_entonces_valida(){
        double tarifa = CalculadorDescuentos.calculoTarifa(50,15,25);
        Assert.assertEquals(50,tarifa,0.01);
    }


    @Test
    public void dado_tarifaBase_cuando_esNegativo_entonces_lanzaExcepcion(){
        double tarifa = CalculadorDescuentos.calculoTarifa(-30,10,10);
        double tarifa_esperada = -30 * 0.95D;
        Assert.assertEquals(tarifa_esperada,tarifa,0.01);
    }
}
