/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controller;


import static spark.Spark.*;


/**
 *
 * @author fbenavides
 */
public class App {

    public static void main(String[] args) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/hello", (req, res) -> "Hello World");
    }
}
