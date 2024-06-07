package org.example;

import java.util.ArrayList;
import java.util.List;
/** Clase que nos permite crear contactos */
class Contacto {
    private String name;
    private List<String> phones;
/**constructor de contactos con nombre y numero de telefono*/
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
/**metodo para obtener el nombre*/
    public String getName() {
        return this.name;
    }
/**metodo para mostrar el numero de telefono*/
    public List<String> getPhones() {
        return this.phones;
    }
}