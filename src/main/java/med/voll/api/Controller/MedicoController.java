package med.voll.api.Controller;

import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medicos.DadosMedicos;
import med.voll.api.Medicos.Medicos;
import med.voll.api.Respositorio.MedicoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRespository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosMedicos dados){
        repository.save(new Medicos(dados));
    }

}
