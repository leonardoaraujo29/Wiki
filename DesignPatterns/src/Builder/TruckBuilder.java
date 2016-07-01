package Builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */
public class TruckBuilder extends VehicleBuilder {
 
    @Override
    public void buildPreco() {
        // Operação complexa. 
        vehicle.preco = 25000.00;
    }
 
    @Override
    public void buildDscMotor() {
        // Operação complexa.
        vehicle.dscMotor = "Fire Flex 1.0";
    }
 
    @Override
    public void buildAnoDeFabricacao() {
        // Operação complexa.
        vehicle.anoDeFabricacao = 2011;
    }
 
    @Override
    public void buildModelo() {
        // Operação complexa.
        vehicle.modelo = "Palio";
    }
}
