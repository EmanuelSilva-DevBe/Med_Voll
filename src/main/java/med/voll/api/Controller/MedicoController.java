package med.voll.api.Controller;

import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medicos.DadosMedicos;
import med.voll.api.Medicos.ListaDadosMedicos;
import med.voll.api.Medicos.Medicos;
import med.voll.api.Respositorio.MedicoRespository;
import med.voll.api.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    private final MedicoService service;

    public MedicoController(MedicoService service){
        this.service = service;
    }


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosMedicos dados){
        service.cadastraMedico(dados);
    }

    @GetMapping()
    public List<ListaDadosMedicos> listaMedicos(){
        return service.listaMedicos();
    }

}
