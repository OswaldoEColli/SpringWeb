# Login App - Aplicación Spring Boot de Autenticación Básica

Esta es una aplicación simple desarrollada con Spring Boot que implementa un sistema básico de autenticación.

## Características

* Formulario de inicio de sesión (usuario/contraseña) en la URL "/inicio" (GET)
* Procesamiento del formulario mediante POST a la misma URL ("/inicio")
* Página de bienvenida para inicios de sesión exitosos, mostrando el nombre del usuario
* Redirección al formulario con mensaje de error para intentos fallidos

## Tecnologías utilizadas

* Java 17
* Spring Boot 3.2.x
* Thymeleaf (motor de plantillas)
* HTML/CSS
* Maven (gestión de dependencias)

## Estructura del proyecto

```
src/main/java/com/example/loginapp/
├── controller/
│   └── LoginController.java    # Controlador para manejar las solicitudes HTTP
├── model/
│   └── User.java               # Modelo de datos para los usuarios
├── service/
│   └── UserService.java        # Servicio para validar credenciales
└── LoginAppApplication.java    # Clase principal de la aplicación

src/main/resources/
├── templates/
│   ├── login.html              # Plantilla del formulario de inicio de sesión
│   └── welcome.html            # Plantilla de la página de bienvenida
├── static/
│   └── css/
│       └── styles.css          # Estilos CSS para las plantillas
└── application.properties      # Configuración de la aplicación
```

## Requisitos previos

* JDK 17 o superior
* Maven 3.6.x o superior
* IntelliJ IDEA 2024 (recomendado, pero no obligatorio)

## Cómo ejecutar la aplicación

1. Clone este repositorio
2. Abra el proyecto en su IDE preferido (recomendado: IntelliJ IDEA)
3. Ejecute la clase `LoginAppApplication.java`
4. Abra un navegador y vaya a `http://localhost:8080/inicio`

## Credenciales de prueba

La aplicación incluye los siguientes usuarios predefinidos para pruebas:

| Usuario | Contraseña |
|---------|------------|
| admin   | admin123   |
| usuario | password   |
| test    | test123    |

## Documentación

La documentación del código está disponible en formato Javadoc. Para generar la documentación HTML:

1. Ejecute `mvn javadoc:javadoc` desde la línea de comandos
2. Abra `target/site/apidocs/index.html` en su navegador

## Licencia

Este proyecto es software libre y se distribuye bajo la licencia MIT.