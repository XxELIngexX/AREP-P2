package com.noxvodia.arep.p2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noxvodia.arep.p2.functions.Binaria;
import com.noxvodia.arep.p2.functions.Lineal;

@RestController
public class Controller {

    @GetMapping("/lineal")
    public String getLineal(@RequestParam int[] list, @RequestParam int value) {
        System.out.println(list);
        int indexResp = Lineal.found(list, value);
        System.out.println(indexResp);
        String output;
        if (indexResp != -1) {
            output = "si existe en la posicion: " + indexResp;
        } else {
            output = "No existe dentro de la lista " + indexResp;

        }

        String a = list.toString();

        Map<String, Object> response = new HashMap<>();
        response.put("operacion", "Busqueda Lineal");
        response.put("lista:", list);
        response.put("valor a buscar:", value);
        response.put("Respuesta:", output);
        System.out.println(response);
        return "{ \"operation\": \"Lineal\"," + "\"input \":" + list + "," + "\"output:\"" + output + "}";
    }

    @GetMapping("/binaria")
    public String getBinary(@RequestParam int[] list, @RequestParam int value) {

        int indexResp = Binaria.binary(list, value);
        System.out.println(indexResp);
        String output;
        if (indexResp != -1) {
            output = "si existe en la posicion: " + indexResp;
        } else {
            output = "No existe dentro de la lista " + indexResp;

        }

        String a = list.toString();

        Map<String, Object> response = new HashMap<>();
        response.put("operacion", "Busqueda Binaria");
        response.put("lista:", list);
        response.put("valor a buscar:", value);
        response.put("Respuesta:", output);
        System.out.println(response);
        return "{ \"operation\": \"Binaria\"," + "\"input \":" + list + "," + "\"output:\"" + output + "}";
    }


}
