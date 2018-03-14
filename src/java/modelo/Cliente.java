/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Raul
 */
public class Cliente {
    private String nombre;
    private String usuario;
    private String contraseña;
    private boolean nuevo = false;
    final String fichero="clientes.txt";
    /**
     * @return the nombre
     */
    
    public Cliente(){
        
    }
    
    public boolean exist(){
        boolean exist=false;
        
        
        if(nuevo){
            this.registrar(true);
            exist = true;
        } else {
            
            exist = this.autenticar();
            
        }
        
        
     return exist;   
    }
    

    public boolean autenticar(){
     
        boolean aut =false;
        
        try{

        // Construye un BufferedReader
        BufferedReader bReader = new BufferedReader( new FileReader(new File(fichero)) );
        // Defino variables
        boolean eof = false;
        String lineaLeida = "";
        
        // Lee el archivoEntrada de forma eficiente e imprime los datos en pantalla
        while ( !eof )
        {

            lineaLeida =bReader.readLine();
 
            if( lineaLeida!=null ){            
                String[] cStr=lineaLeida.split("\\s+");
                if (this.usuario.equals(cStr[1])){
                    this.nombre=cStr[0];
                    this.contraseña=cStr[2];
                    aut = true;
                    break;
                }
                       
            
            // Imprime la linea en pantalla
                
            }else{
                eof =true;
            }
                
        }        

        // Cierra el FileReader
        bReader.close(); 
        

        
        } catch (Exception e){

        } finally {
                        return aut;
            }
    }
    
    public boolean autenticarBD(){
        
        
        
        return true;
    }
    
    public void registrar(boolean b) {
                 // Instancia un objeto File de salida
    try {         
        // Construye un BufferedWriter
       
        BufferedWriter bWriter = new BufferedWriter( new FileWriter(fichero,b) );
        
        // Escribe el archivo de salida a traves del BufferedWriter
        bWriter.newLine();
        bWriter.write(nombre+" "+usuario+" "+contraseña);

 
        
        // Cierra el BufferedWriter
            bWriter.close();

      //  System.out.println("Fichero "+f.getAbsolutePath()+" actualizado correctamente");
    }catch(IOException ex){
       System.err.print(ex.getMessage());
    }
} 
    
    
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the nuevo
     */
    public boolean isNuevo() {
        return nuevo;
    }

    /**
     * @param nuevo the nuevo to set
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    
}
