# Actividad 1 - Tema 4: Introducción a Spring Boot - Configuración y Primeros Controladores

## Autor: Jiménez Mendoza Eduardo

##  Tecnologías Utilizadas
* **Java 17**
* **Spring Boot** (Spring Web)
* **Maven** (Gestión de dependencias)
* **Nginx** (Proxy reverso en el VPS)
* **Git y GitHub**

## Estructura de Controladores y Endpoints
El proyecto cuenta con al menos dos controladores propios que agrupan tres endpoints principales:

1. **`EjemploController.java`**
   * `GET /proyecto` -> Regresa el identificador del proyecto y autor.
2. **`DetallesController.java`**
   * `GET /materias` -> Regresa un listado simulado de materias de la carrera.
   * `GET /estado` -> Regresa un objeto JSON con el estado actual del servicio.

## Enlaces de Acceso y Pruebas

* **Proyecto en producción (VPS):**
  * Proyecto: `http://148.113.144.30:8100/proyecto`
  * Materias: `http://148.113.144.30:8100/misMaterias`
  * Estado: `http://148.113.144.30:8100/estado`

## Pruebas en bruno con los links de la vps


### 1. Endpoint /proyecto
![Prueba de proyecto](img/proyecto.png)

### 2. Endpoint /misMaterias
![Prueba de materias](img/estado.png)

### 3. Endpoint /estado
![Prueba de estado](img/misMaterias.png)