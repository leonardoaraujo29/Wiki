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
public class MontadoraDirector {
    protected VehicleBuilder montadora;
 
    public MontadoraDirector(VehicleBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirVeículo() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
    }
 
    public VehicleProduct getVehicle() {
        return montadora.getVehicle();
    }
}