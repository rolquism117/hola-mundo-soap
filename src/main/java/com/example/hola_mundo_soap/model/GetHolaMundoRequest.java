package com.example.hola_mundo_soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.ejemplo.com/holamundosoap")
public class GetHolaMundoRequest {

    private String nombre;

    @XmlElement(namespace = "http://www.ejemplo.com/holamundosoap")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
