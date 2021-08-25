package br.com.topbrinformatica.controleacesso.controller;

import br.com.topbrinformatica.controleacesso.model.JornadaTrabalho;
import br.com.topbrinformatica.controleacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho postJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        System.out.println(jornadaTrabalho);
        return jornadaService.saveJornada(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaLista(){
        return jornadaService.readJornada();
    }
 /*   @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return jornadaService.readJornadaById(idJornada)
                .orElseThrow(() -> new Exception("Jornada não encontrada!"));

    }*/

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.readJornadaById(idJornada)
                .orElseThrow(() -> new Exception("Jornada não encontrada!")));

    }

    @PutMapping
    public JornadaTrabalho putJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public void deleteJornadaById(@PathVariable("idJornada") Long idJornada){
        jornadaService.deleteJornada(idJornada);
    }
}
