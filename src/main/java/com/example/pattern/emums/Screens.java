package com.example.pattern.emums;

public enum Screens {
    LOGIN("login"), OVERVIEW("overview"), MENU("menu"),DETAIL("detail"),BEHEER("beheer") ,TOEVOEGEN("toevoegen");

    private final String fileName;

    public String getFileName() {return fileName;}


    private Screens(String fileName) {
        this.fileName = fileName;
    }
}
