package com.santiClinic.controller;

import com.santiClinic.model.Tratamento;
import com.santiClinic.service.TratamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TratamentoController {

    @Autowired
    private TratamentoService tratamentoService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tratamentos", tratamentoService.listarTratamentos());
        return "index";
    }

    @GetMapping("/tratamento/{id}")
    public String detalhesTratamento(@PathVariable Long id, Model model) {
        tratamentoService.buscarTratamentoPorId(id).ifPresent(tratamento -> model.addAttribute("tratamento", tratamento));
        return "tratamento";
    }

    @PostMapping("/contato")
    public String enviarContato(String nome, String email, String mensagem) {
        System.out.println("Contato recebido: " + nome + ", " + email + ", " + mensagem);
        return "redirect:/";
    }
}
