package com.example.hola_mundo_soap.endpoint;

import com.example.hola_mundo_soap.model.GetHolaMundoRequest;
import com.example.hola_mundo_soap.model.GetHolaMundoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HolaMundoEndpoint {

    private static final String NAMESPACE_URI = "http://www.ejemplo.com/holamundosoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHolaMundoRequest")
    @ResponsePayload
    public GetHolaMundoResponse getHolaMundo(@RequestPayload GetHolaMundoRequest request) {
        GetHolaMundoResponse response = new GetHolaMundoResponse();
        response.setMensaje("Hola Mundo");

        return response;
    }
}
