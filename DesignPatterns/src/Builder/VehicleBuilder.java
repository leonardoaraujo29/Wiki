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
public abstract class VehicleBuilder {
 
    protected VehicleProduct vehicle;
 
    public VehicleBuilder() {
        vehicle = new VehicleProduct();
    }
 
    public abstract void buildPreco();
 
    public abstract void buildDscMotor();
 
    public abstract void buildAnoDeFabricacao();
 
    public abstract void buildModelo();
 
    public VehicleProduct getVehicle() {
        return vehicle;
    }
}