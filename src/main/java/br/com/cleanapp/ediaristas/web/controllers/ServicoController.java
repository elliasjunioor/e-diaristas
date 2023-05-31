package br.com.cleanapp.ediaristas.web.controllers;

import br.com.cleanapp.ediaristas.core.enums.Icone;
import br.com.cleanapp.ediaristas.core.models.Servico;
import br.com.cleanapp.ediaristas.core.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar(){
        var modelAndView = new ModelAndView("admin/servico/form");
        modelAndView.addObject("servico", new Servico());
        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public String newCadastro(Servico servico){
        servicoRepository.save(servico);
        return "redirect:/admin/servicos/cadastrar";
    }

    @ModelAttribute("icones")
    public Icone[] getIcones(){
        return Icone.values();
    }
}
