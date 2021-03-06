/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerproyecto;

/**
 *
 * @author Carlos C
 */
public class Usuario {
    
    private String nombre;
    private String password;
    private String email;
    
    //Constructor vacio
    public Usuario(){
        
    }
    //constructor parametros
    public Usuario(String nombre, String password, String email){
        this.nombre = nombre;
        this.password = password;
        this.email  = email;
    }

    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Metodo nombre
    public boolean nombreUsuario(String nombre){
        if (nombre.length()>=6){
            return true;
        }else{
            return false;
        }
    }
    //Metodo contraseña correcta
    public boolean passwordtrue(String password){
        if(password.length() >= 8){
            if(password.matches(".*[A-Z].*")){
            }
            return true;
        }else{
            return false;
        }
        //tambien es posible con un "return email.matches(.*@.*) ? 0:1;"
    }
    //Metodo del email
    public boolean emailVerificado(String email){
        if(email.matches("[-\\w\\.]+@\\w+\\.\\w+")){
            return true;
        }else{
            return false;
        }
    }
}
