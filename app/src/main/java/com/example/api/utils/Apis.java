package com.example.api.utils;

public class Apis {

    public static final String URL_001="http://192.168.1.2:8080/personas/";

    public static com.example.api.utils.PersonaService getPersonaService(){
        return  Cliente.getClient(URL_001).create(com.example.api.utils.PersonaService.class);
    }
}
