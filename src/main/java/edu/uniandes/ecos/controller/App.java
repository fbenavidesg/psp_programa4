/******************************************************************************/
/* Programa ID: PSP_TAREA4                                                    */
/* Autor: Fredy Benavides                                                     */
/* Fecha: 20/03/2017                                                          */
/* Descripcion: Programa realiza calculo de rangos por desviacion estandar    */
/*                                                                            */
/******************************************************************************/
package edu.uniandes.ecos.controller;

import edu.uniandes.ecos.model.ResultRanges;
import edu.uniandes.ecos.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
/**
 * Clase principal funciona como controllador frontal
 * @author fbenavides
 */
public class App {
    /**
     * Metodo de entrada de la aplicacion.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ControllerApp controllerApp = new ControllerApp();
        if (args.length == 0) {
            //web
            port(Integer.valueOf(System.getenv("PORT")));
                staticFileLocation("/public");
                get("/", (req, res) -> {
                    ResultRanges resultRanges = null;
                    String getData = req.queryParams("valores");
                    try {
                       if (getData == null){
                            resultRanges = controllerApp.execute("file", "");
                        }else{
                            resultRanges = controllerApp.execute("get",getData);  
                        } 
                    }catch (IOException ex) {
                        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Map<String, Object> attributes = new HashMap<>();
                    attributes.put("resultRanges", resultRanges);
                    return new ModelAndView(attributes, "index.ftl");
            }, new FreeMarkerEngine());
        }else{
            //console
            ResultRanges resultRanges = null;
            resultRanges = controllerApp.execute("file","");
            View view = new View();
            view.showResult(resultRanges);
        } 
    }
}
