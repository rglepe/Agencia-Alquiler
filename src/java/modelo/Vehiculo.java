/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Raul
 * La clase Vehiculo se declara abstracta para "obligar" a sus subclases a que 
 * implementen el método avanzar() declarado como abstract.
 * Además, hacemos que herede del interfaz Motor, que contiene una colección de
 * de constantes
 */
public class Vehiculo{
    private String marca;
    private int velocidad;
    private int distancia;
    private String combustible;
    public static enum TipoVehiculo{TURISMO,FURGONETA,MOTO};
    private String tipoVehiculo;
    //Motor.Cilindrada cc = null;
    private Double tiempo;




    //Constructor de la clase para inicializar las variables de Vehiculo
    
    public Vehiculo(String marca){
        this.marca = marca;
        
    }
    
    public Vehiculo(){
        
    }
           
    //Métodos SETTERS Y GETTERS para acceder a variables cuando éstas se
    //declaran private
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }    
//    Motor.Cilindrada getCilindrada() {
//        return cc;
//    }
//
//    public void setCilindrada(Motor.Cilindrada ccValue) {
//        cc = ccValue;
//    }

     public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
}
