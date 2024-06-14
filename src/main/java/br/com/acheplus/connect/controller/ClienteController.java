package br.com.acheplus.connect.controller;

import br.com.acheplus.connect.model.Client;
import br.com.acheplus.connect.service.ClienteService;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        return "/cadastro";
    }

    @PostMapping("/cadastro")
    @ModelAttribute("message")
    public String registerClient(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String cpf,
            @RequestParam String password
    ) {
        Client client = new Client(name, email, phone, cpf, password);
        clienteService.save(client);
        return "redirect:/cadastro";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "/dashboard";
    }
}
