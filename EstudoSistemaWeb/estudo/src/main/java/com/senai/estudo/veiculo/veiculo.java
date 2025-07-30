package com.senai.estudo.veiculo;

public class veiculo {

    private String marca;
    private String modelo;
    private String tipo;
    private int anoFabric;
    private float motor;
    private String tracao;
    
    public veiculo(String marca, String modelo, String tipo, int anoFabric, float motor, String tracao) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anoFabric = anoFabric;
        this.motor = motor;
        this.tracao = tracao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoFabric() {
        return anoFabric;
    }

    public void setAnoFabric(int anoFabric) {
        this.anoFabric = anoFabric;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    
}
