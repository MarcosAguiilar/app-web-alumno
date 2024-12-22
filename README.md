# AppWebAlumnos

AppWebAlumnos es una aplicación web desarrollada con Spring Boot para gestionar información de alumnos y usuarios. Este proyecto incluye un backend con controladores, servicios y repositorios, además de vistas HTML para interactuar con la base de datos.

## Requisitos previos

Asegúrate de tener instalados los siguientes elementos antes de ejecutar la aplicación:

- **Java 17**
- **Maven 3.8 o superior**
- **Base de datos MySQL**

## Instalación

1. **Clona el repositorio**:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd app-web-alumno-main
   ```

2. **Configura la base de datos**:
   - Actualiza el archivo `src/main/resources/application.properties` con las credenciales de tu base de datos MySQL:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Cargar datos iniciales** (opcional):
   - Revisa el archivo `src/main/resources/import.sql` si deseas cargar datos iniciales.

4. **Compila y ejecuta el proyecto**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Características principales

- **Gestión de Alumnos**: 
  - Crear, listar y detallar alumnos.
- **Gestión de Usuarios**:
  - Funcionalidad para manejar usuarios.
- **Interfaz de usuario**:
  - Plantillas HTML alojadas en `src/main/resources/templates`.
- **Persistencia de datos**:
  - Repositorios usando JPA para interactuar con MySQL.

## Estructura del proyecto

```
app-web-alumno-main/
├── src/main/java/com/keepcoding/app/web/
│   ├── controller/   # Controladores
│   ├── entity/       # Entidades
│   ├── repository/   # Repositorios
│   ├── service/      # Interfaces de servicios
│   └── serviceImpl/  # Implementaciones de servicios
├── src/main/resources/
│   ├── templates/    # Plantillas HTML
│   ├── application.properties  # Configuración
│   └── import.sql    # Datos iniciales
└── pom.xml           # Configuración de Maven
```

## Contribución

Si deseas contribuir al proyecto:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tus cambios:
   ```bash
   git checkout -b mi-nueva-funcionalidad
   ```
3. Realiza tus cambios y haz un commit:
   ```bash
   git commit -m "Agrego una nueva funcionalidad"
   ```
4. Envía tus cambios al repositorio remoto:
   ```bash
   git push origin mi-nueva-funcionalidad
   ```
5. Abre un pull request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más información.

## Contacto

- Autor: Marcos Aguilar Lozano
- Email: marcosaguilar2001mal@gmail.com
- LinkedIn: https://www.linkedin.com/in/marcos-aguiilar-lozano/
