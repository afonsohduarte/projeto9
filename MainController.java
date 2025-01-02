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

        // Dados fictícios para os tratamentos
        switch (id) {
            case 1:
                treatmentDetails = "O Botox ajuda a reduzir rugas de expressão, proporcionando um visual rejuvenescido.";
                break;
            case 2:
                treatmentDetails = "O Ácido Hialurônico preenche rugas e hidrata a pele.";
                break;
            case 3:
                treatmentDetails = "A Harmonização Facial é ideal para equilibrar os traços do rosto.";
                break;
            case 4:
                treatmentDetails = "O Bio-Estimulador estimula a produção de colágeno naturalmente.";
                break;
            case 5:
                treatmentDetails = "O Peeling Químico promove a renovação celular para uma pele uniforme.";
                break;
            case 6:
                treatmentDetails = "Lemon Bottle é um tratamento eficaz para redução de gordura localizada.";
                break;
            case 7:
                treatmentDetails = "A Mesoterapia ajuda a revitalizar a pele através de microinjeções.";
                break;
            case 8:
                treatmentDetails = "Collagen Trifecta reforça a saúde da pele e estimula o colágeno.";
                break;
            case 9:
                treatmentDetails = "A Remoção de Ácido Hialurônico é feita com segurança e eficácia.";
                break;
            case 10:
                treatmentDetails = "Análises clínicas detalhadas para acompanhar sua saúde.";
                break;
            default:
                treatmentDetails = "Tratamento desconhecido.";
                break;
        }

        model.addAttribute("id", id);
        model.addAttribute("treatmentDetails", treatmentDetails);
        return "treatment";
    }
}
