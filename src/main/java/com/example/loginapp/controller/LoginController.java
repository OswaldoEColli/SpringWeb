package com.example.loginapp.controller;

import com.example.loginapp.model.User;
import com.example.loginapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador para manejar las operaciones relacionadas con el inicio de sesión.
 * Gestiona las peticiones GET y POST a la ruta "/inicio".
 */
@Controller
public class LoginController {

    private final UserService userService;

    /**
     * Constructor que inyecta el servicio de usuarios.
     *
     * @param userService Servicio para validar usuarios
     */
    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Maneja las peticiones GET a "/inicio".
     * Muestra el formulario de inicio de sesión.
     *
     * @param model El modelo para pasar datos a la vista
     * @return El nombre de la plantilla a mostrar
     */
    @GetMapping("/inicio")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    /**
     * Maneja las peticiones POST a "/inicio".
     * Procesa el envío del formulario de inicio de sesión.
     *
     * @param user El usuario con las credenciales enviadas
     * @param model El modelo para pasar datos a la vista
     * @return El nombre de la plantilla a mostrar
     */
    @PostMapping("/inicio")
    public String processLogin(@ModelAttribute User user, Model model) {
        if (userService.validateUser(user)) {
            // Si las credenciales son correctas, redirige a la página de bienvenida
            model.addAttribute("username", user.getUsername());
            return "welcome";
        } else {
            // Si las credenciales son incorrectas, vuelve al formulario con un mensaje de error
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
}