package org.example;

import java.util.*;
/**Clase que nos permite almacenar contactos y trabajar con ellos*/
public class Agenda {
    //atributos
    private List<Contacto> contacts; // Lista de Contacto
/**constructor para añadir contactos a un array*/
    public Agenda() {
        this.contacts = new ArrayList<>();
    }
/**Este metodo nos permite añadir contactos a la lista*/
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
/**Metodo que nos permite quitar contactos del array*/
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
/**metodo que nos permite modificar el numero de un contacto*/
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }
/**metodo para mostrar los contactos*/
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}