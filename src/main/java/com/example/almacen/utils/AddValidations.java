package com.example.almacen.utils;

import java.util.Map;

public class AddValidations {
    public static void addValidations(Map<String,String> wrongs,String nameUser,String quilates,String nameJewel,String ounces) {
            if (nameUser == null || nameUser.isBlank()) {
                wrongs.put("userNameBlank", "El nombre de usuario esta vacio");
            }
            if (quilates == null || quilates.isBlank()) {
                wrongs.put("quilatesBlank", "El tipo de quilate no esta seleccionado");
            }
            if (nameJewel == null || nameJewel.isBlank()) {
                wrongs.put("nameJewelBlank", "El tipo de joya no esta seleccionada");
            }
            if (ounces == null || ounces.isBlank()) {
                wrongs.put("ouncesBlank", "La cantidad de onzas esta sin seleccionar");
            }
            if (nameUser.matches("^[0-9]+([.][0-9]+)?$")) {
                wrongs.put("userNameNumber", "El nombre no puede contener numeros");
            }
            try {
                if (ounces.matches("^[a-zA-Z]*$") || Integer.parseInt(ounces) < 1 || Integer.parseInt(ounces) > 10000) {
                    wrongs.put("ouncesStringsExeedLimits", "la cantidad de onzas debe tener solo numeros enteros entre 1 y 10000");
                }
            }catch (NumberFormatException e){
                wrongs.put("ouncesStringsExeedLimits", "la cantidad de onzas debe tener solo numeros enteros entre 1 y 10000");
            }


    }
}
