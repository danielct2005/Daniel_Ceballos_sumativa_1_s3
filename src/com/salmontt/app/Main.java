package com.salmontt.app;

// Importamos las clases del paquete model
import com.salmontt.model.Direccion;
import com.salmontt.model.Empleado;
import com.salmontt.model.Persona;

/**
 * Clase principal para probar el modelo de dominio de Salmontt.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión Salmontt ---");
        System.out.println("Creando instancias del modelo...\n");

        // --- Instancia 1: Empleado 1 ---
        // 1. Creamos su dirección
        Direccion dirEmpleado1 = new Direccion("Av. Juan Soler Manfredini", "150", "Puerto Montt", "Puerto Montt");

        // 2. Creamos el empleado (que es una Persona y tiene una Direccion)
        Empleado empleado1 = new Empleado(
                "21.775.516-6",
                "Daniel",
                "Ceballos",
                dirEmpleado1,
                "EMP-001",
                "Gerente de Operaciones",
                3500000
        );

        // --- Instancia 2: Empleado 2 ---
        Direccion dirEmpleado2 = new Direccion("Pasaje Los Alerces", "789", "Alerce", "Puerto Montt");
        Empleado empleado2 = new Empleado(
                "18.987.654-K",
                "Ana",
                "González",
                dirEmpleado2,
                "EMP-002",
                "Analista de Calidad",
                1200000
        );

        // --- Instancia 3: Persona (Ej. un Proveedor o Visita, que no es Empleado) ---
        Direccion dirVisita = new Direccion("Ruta 5 Sur", "Km 1010", "Frutillar", "Frutillar");
        Persona visita1 = new Persona(
                "12.345.678-9",
                "Miguel",
                "Torres",
                dirVisita
        );

        // --- Paso 4: Mostrar los objetos por consola ---
        // Al usar System.out.println() sobre un objeto, se llama automáticamente a su método toString()

        System.out.println("--- Objeto Empleado 1 ---");
        System.out.println(empleado1);

        System.out.println("\n--- Objeto Empleado 2 ---");
        System.out.println(empleado2);

        System.out.println("\n--- Objeto Persona (Visita) ---");
        System.out.println(visita1);

        System.out.println("\n--- Prueba de getters ---");
        System.out.println("Cargo Empleado 1: " + empleado1.getCargo());
        System.out.println("Ciudad Empleado 2: " + empleado2.getDireccion().getCiudad());

    }
}