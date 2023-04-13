package click.henriquegibi.desmotivacional.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{id}")
public class Frases {
    
    private Logger LOGGER = LoggerFactory.getLogger(Frases.class);
    
    @GetMapping
    public String getFrase(@PathVariable int id)
    {
        String[] frases =
            {
                "Pare de achar que as coisas vão dar errado e comece a ter certeza.",
                "Não desista: tudo tem o momento certo para dar errado.",
                "Sem lutas, não há derrota!",
                "Lute como nunca. Perca como sempre.",
                "O caminho é longo, mas a derrota é certa.",
                "É só uma fase ruim, logo piora.",
                "O não você já tem, corra atrás da humilhação.",
                "Nenhum obstáculo é grande para quem desiste"
            };
        LOGGER.info("Frase recuperada: " + id);
        return frases[id];
    }
}