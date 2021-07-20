/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

import java.util.Date;


/**
 *
 * @author Usuario
 */
public class TV {
    
    private final int CANALMAX=100;
    private final int CANALMIN=2;
    private final int MAXIMO=100;
    private final int MINIMO=0;
    
    private boolean internet;
    private String nombreRed;//set
    private String contraseña;//set
    private boolean estado;
    private int canal;
    private int volumen;
    private boolean silenciado;
    private int brillo;
    private int contraste;
    private Date fecha;//set
    private Entradas entrada; 

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isInternet() {
        return internet;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isSilenciado() {
        return silenciado;
    }

    public int getBrillo() {
        return brillo;
    }

    public int getContraste() {
        return contraste;
    }

    public Date getFecha() {
        return fecha;
    }

    public Entradas getEntrada() {
        return entrada;
    }
    
    public void cambiarEntrada(Entradas entrada ){
        this.entrada=entrada;
    }
    
    public void encender(){
        this.estado=true;
    }
    public void apagar(){
        this.estado=false;
    }
    
    public void cambiarCanal(int canal){
        if (canal>=CANALMIN&&canal<=CANALMAX) {
            this.canal=canal;
        }
    }
    public void subirCanal(){
        if (this.canal==CANALMAX) {
            this.canal=CANALMIN;
        }else{
            this.canal++;
        }
    }
    public void bajarCanal(){
        if (this.canal==CANALMIN) {
            this.canal=CANALMAX;
        }else{
            this.canal--;
        }
    }
    public void subirVolumen(){
        if (this.volumen<MAXIMO) {
            this.volumen++;
        }
    }
    public void bajarVolumen(){
        if (this.volumen>MINIMO) {
            this.volumen--;
        }
    }
    public void subirBrillo(){
        if (this.brillo<MAXIMO) {
            this.brillo++;
        }
    }
    public void bajarBrillo(){
        if (this.brillo>MINIMO) {
            this.brillo--;
        }
    }
    public void subirContraste(){
        if (this.contraste<MAXIMO) {
            this.contraste++;
        }
    }
    public void bajarContraste(){
        if (this.contraste>MINIMO) {
            this.contraste--;
        }
    }
    public void activarSonido(){
        this.silenciado=false;
    }
    public void desactivarSonido(){
        this.silenciado=true;
    }

    public TV() {
        this.internet = false;
        this.nombreRed = "";
        this.contraseña = "";
        this.estado = false;
        this.canal = CANALMIN;
        this.volumen = 50;
        this.silenciado = false;
        this.brillo = 50;
        this.contraste = 50;
        this.fecha = new Date();
        this.entrada = Entradas.Cable;
    }
    
}
