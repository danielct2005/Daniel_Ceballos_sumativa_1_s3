# Daniel_Ceballos_sumativa_1_s3
Sistema de Gestión Básico - Salmontt

Este proyecto es una implementación básica en Java que modela la estructura de personas dentro de la empresa ficticia Salmontt, como parte de una actividad sumativa.
El objetivo es sentar las bases de un sistema de información interno, aplicando principios clave de la Programación Orientada a Objetos (OOP).

Propósito del Sistema

El propósito de este prototipo es resolver la problemática de desorganización de la información en Salmontt. Establece un modelo de dominio inicial que representa a las personas (como empleados) y sus datos asociados (como direcciones) de una manera estructurada, encapsulada y reutilizable.

Este modelo utiliza:

Encapsulamiento: Atributos privados con acceso mediante getters y setters.

Composición: La clase Persona tiene una Direccion, demostrando que un objeto está compuesto por otro.

Herencia: La clase Empleado es una Persona, extendiendo la funcionalidad base.

Estructura de Paquetes y Clases

El proyecto se organiza en los siguientes paquetes y clases:

com.salmontt.model

Direccion.java: Clase que representa una dirección física (calle, número, comuna, ciudad). Es utilizada para la composición.

Persona.java: Clase base que representa a un individuo general. Contiene atributos como RUT, nombre, apellido y un objeto Direccion.

Empleado.java: Clase derivada que extiende de Persona. Añade atributos específicos de un empleado, como idEmpleado, cargo y salario.

com.salmontt.app

Main.java: Clase principal que contiene el método main para ejecutar la aplicación. Se utiliza para crear instancias (objetos) de las clases del modelo y probar su funcionamiento imprimiendo sus datos en consola.

Instrucciones para Compilar y Ejecutar

Este proyecto está diseñado para ser compilado y ejecutado usando un IDE de Java como IntelliJ IDEA.

Clonar el Repositorio: Clona este repositorio en tu máquina local.

Abrir en IntelliJ IDEA: Abre la carpeta del proyecto con IntelliJ IDEA.

Localizar la Clase Principal: Navega en el explorador de proyectos hasta src/com/salmontt/app/Main.java.

Ejecutar: Haz clic derecho sobre el archivo Main.java y selecciona la opción "Run 'Main.main()'".

Salida Esperada

Al ejecutar la clase Main, deberías ver una salida en la consola similar a la siguiente, demostrando la correcta creación de los objetos y el funcionamiento de los métodos toString():

--- Sistema de Gestión Salmontt ---
Creando instancias del modelo...

--- Objeto Empleado 1 ---
Persona [
RUT: 21.775.516-6,
Nombre: Daniel Ceballos,
Dirección: Av. Juan Soler Manfredini #150, Puerto Montt, Puerto Montt
--- Empleado ---
ID Empleado: EMP-001,
Cargo: Gerente de Operaciones,
Salario: $3,500,000
]

--- Objeto Empleado 2 ---
Persona [
RUT: 18.987.654-K,
Nombre: Ana González,
Dirección: Pasaje Los Alerces #789, Alerce, Puerto Montt
--- Empleado ---
ID Empleado: EMP-002,
Cargo: Analista de Calidad,
Salario: $1,200,000
]

--- Objeto Persona (Visita) ---
Persona [
RUT: 12.345.678-9,
Nombre: Miguel Torres,
Dirección: Ruta 5 Sur #Km 1010, Frutillar, Frutillar
]

--- Prueba de getters ---
Cargo Empleado 1: Gerente de Operaciones
Ciudad Empleado 2: Puerto Montt

## Autor

* **Daniel Ceballos** - [danielct2005](https://github.com/danielct2005)