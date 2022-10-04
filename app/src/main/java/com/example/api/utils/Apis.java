package com.example.api.utils;

public class Apis {

    public static final String URL_001="http://172.17.7.24:8080/personas/";

    public static com.example.api.utils.PersonaService getPersonaService(){
        return  Cliente.getClient(URL_001).create(com.example.api.utils.PersonaService.class);
    }
}
