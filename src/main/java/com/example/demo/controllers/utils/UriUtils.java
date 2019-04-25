package com.example.demo.controllers.utils;

public class UriUtils {

    public static final String URI_SLASH = "/";
    
    public static final String URI_INDEX = "index";
    public static final String URI_DETAILS = "details";

    public static final String URI_DELETE = "delete";
    public static final String URI_UPDATE = "update";
    public static final String PATH_VARIABLE_ID = "{id}";
    
    public static final String URI_INDEX_PATH = URI_SLASH + URI_INDEX;
    public static final String URI_DETAILS_PATH = URI_SLASH + URI_DETAILS;
    public static final String URI_DETAILS_ID_PATH = URI_SLASH + URI_DETAILS + URI_SLASH + PATH_VARIABLE_ID;

    public static final String URI_DELETE_ID_PATH = URI_SLASH + URI_DELETE + URI_SLASH + PATH_VARIABLE_ID;
    public static final String URI_PURGE_PATH = URI_SLASH + URI_DELETE;
    public static final String EXTERNAL_PATH_VARIABLE_INDEX = PATH_VARIABLE_ID;
    public static final String EXTERNAL_PATH_VARIABLE_CLASS = "{navigationPath}";
    
    public static final String URI_EXTERNAL_INDEX_PATH = URI_SLASH + EXTERNAL_PATH_VARIABLE_CLASS + URI_SLASH + EXTERNAL_PATH_VARIABLE_INDEX;
    public static final String URI_UPDATE_ID_PATH = URI_SLASH + URI_UPDATE + URI_SLASH + PATH_VARIABLE_ID;
}
