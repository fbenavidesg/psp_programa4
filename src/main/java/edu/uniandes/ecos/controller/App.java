/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controller;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;

/**
 *
 * @author fbenavides
 */
public class App {

    public static void main(String[] args) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");
            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());
    }
}
