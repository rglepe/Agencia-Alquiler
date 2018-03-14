/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Raul
 */
public class AlquilerVehiculo {
    Cliente cliente;
    Vehiculo vehiculo;
    Date fechaIni;
    Date fechaFin;
    
    public AlquilerVehiculo (Cliente c, Vehiculo v, Date pfIni, Date pfFin){
        this.cliente = c;
        this.vehiculo = v;
        this.fechaIni = pfIni;
        this.fechaFin = pfFin;
    }
    
    public boolean buscarVehiculo(Vehiculo v){
        boolean b =false;
         return b;
    }
    
}
