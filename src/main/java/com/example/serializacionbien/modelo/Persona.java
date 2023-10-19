package com.example.serializacionbien.modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String direccion;
    private String Dni;
    private int edad;

    public Persona(String nombre, String direccion, String dni, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        Dni = dni;
        this.edad = edad;
    }

    public void escribirPersona(){
        ArrayList<Persona> arrayList = new ArrayList<>();
        arrayList.add(this);
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\2dam\\IdeaProjects\\SerializacionBien\\src\\main\\resources\\personas.dat"))) {
            os.writeObject(arrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        };

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return Dni;
    }

    public int getEdad() {
        return edad;
    }
}
