package com.pintoneta.screenmatch.exception;

public class ErrorConvercionDuracionException extends RuntimeException{

    private String mensaje;

    public ErrorConvercionDuracionException(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
