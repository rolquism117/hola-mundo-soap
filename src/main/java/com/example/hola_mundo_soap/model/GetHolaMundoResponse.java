package com.example.hola_mundo_soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.ejemplo.com/holamundosoap")
public class GetHolaMundoResponse {

    private String mensaje;

    @XmlElement(namespace = "http://www.ejemplo.com/holamundosoap")
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
