package com.santiclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, 
                             @RequestParam String email, 
                             @RequestParam String message) {
        System.out.println("Formulário recebido:");
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mensagem: " + message);

        // Redireciona para uma página de confirmação (ou apenas retorna para o index)
        return "redirect:/";
    }
}
