package com.santiclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/treatment/{id}")
    public String getTreatment(@PathVariable("id") int id, Model model) {
        String treatmentDetails;

        // Dummy data - pode substituir pelos dados reais de um banco de dados
        if (id == 1) {
            treatmentDetails = "A Remoção de Ácido Hialurónico (AH) é feita de forma segura e eficaz.";
        } else if (id == 2) {
            treatmentDetails = "Realizamos análises completas para ajudar a melhorar a sua saúde.";
        } else {
            treatmentDetails = "Tratamento desconhecido.";
        }

        model.addAttribute("id", id);
        model.addAttribute("treatmentDetails", treatmentDetails);
        return "treatment";
    }
}
