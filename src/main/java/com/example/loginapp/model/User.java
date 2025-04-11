package com.example.loginapp.model;

/**
 * Clase que representa un usuario en el sistema.
 * Contiene información básica como nombre de usuario y contraseña.
 */
public class User {
    private String username;
    private String password;

    /**
     * Constructor vacío necesario para algunos procesos de Spring.
     */
    public User() {
    }

    /**
     * Constructor con parámetros para crear un usuario con valores iniciales.
     *
     * @param username El nombre de usuario
     * @param password La contraseña del usuario
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param username El nombre de usuario a establecer
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password La contraseña a establecer
     */
    public void setPassword(String password) {
        this.password = password;
    }
}