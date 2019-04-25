package com.example.demo.controllers.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappedRoutes {

    /** Constructeur privé */
    private MappedRoutes()
    {}
     
    /** Instance unique non préinitialisée */
    private static MappedRoutes INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static synchronized MappedRoutes getInstance()
    {
        if (INSTANCE == null)
        {   INSTANCE = new MappedRoutes();
        }
        return INSTANCE;
    }
    
    private Map<Class,List<String>> routes = new HashMap<Class,List<String>>();

    public Map<Class, List<String>> getRoutes() {
        return routes;
    }
}
