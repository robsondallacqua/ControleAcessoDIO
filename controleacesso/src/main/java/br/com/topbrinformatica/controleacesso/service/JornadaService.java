package br.com.topbrinformatica.controleacesso.service;

import br.com.topbrinformatica.controleacesso.model.JornadaTrabalho;
import br.com.topbrinformatica.controleacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }
    //CREATE
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    //READ
    public List<JornadaTrabalho> readJornada(){
        return jornadaRepository.findAll();
    }
    public Optional<JornadaTrabalho> readJornadaById(Long id){
        return jornadaRepository.findById(id);
    }
    //UPDATE
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    //DELETE
    public void deleteJornada(Long id){
        jornadaRepository.deleteById(id);
    }

}
