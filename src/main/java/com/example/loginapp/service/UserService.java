package com.example.loginapp.service;

import com.example.loginapp.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Servicio que gestiona la autenticación de usuarios.
 * En una aplicación real, este servicio se conectaría a una base de datos.
 * Para este ejemplo, usamos un mapa en memoria para almacenar usuarios.
 */
@Service
public class UserService {

    // Base de datos simulada de usuarios
    private final Map<String, String> users = new HashMap<>();

    /**
     * Constructor que inicializa algunos usuarios de prueba.
     */
    public UserService() {
        // Agregamos algunos usuarios de prueba
        users.put("admin", "admin123");
        users.put("usuario", "password");
        users.put("test", "test123");
    }

    /**
     * Valida si las credenciales de un usuario son correctas.
     *
     * @param user El usuario con las credenciales a validar
     * @return true si las credenciales son válidas, false en caso contrario
     */
    public boolean validateUser(User user) {
        if (user == null || user.getUsername() == null || user.getPassword() == null) {
            return false;
        }

        // Verificar si el usuario existe y si la contraseña coincide
        String storedPassword = users.get(user.getUsername());
        return storedPassword != null && storedPassword.equals(user.getPassword());
    }
}