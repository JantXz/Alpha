/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_110321;

/**
 *
 * @author Ian_l
 */
public class Fruta {
    private String color;
    private float peso;
    private String sabor;
    private float costoKilo;
    private String mesTemporada;
    private float cantidadAzucar;
    
    public Fruta(String color, float peso, String sabor, float costoKilo, String mesTemporada, float cantidadAzucar) {
        this.color = color;
        this.peso = peso;
        this.sabor = sabor;
        this.costoKilo = costoKilo;
        this.mesTemporada = mesTemporada;
        this.cantidadAzucar = cantidadAzucar;
    }

    public Fruta() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getCostoKilo() {
        return costoKilo;
    }

    public void setCostoKilo(float costoKilo) {
        this.costoKilo = costoKilo;
    }

    public String getMesTemporada() {
        return mesTemporada;
    }

    public void setMesTemporada(String mesTemporada) {
        this.mesTemporada = mesTemporada;
    }

    public float getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(float cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
    
    
    public void comprar(float kilos){
        System.out.println("Compraste "+kilos+" kilos");
        
    }
}
