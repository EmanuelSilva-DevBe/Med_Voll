package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medicos.DadosAtualizaMedicos;
import med.voll.api.Medicos.DadosMedicos;
import med.voll.api.Medicos.ListaDadosMedicos;
import med.voll.api.Medicos.Medicos;
import med.voll.api.Respositorio.MedicoRespository;
import med.voll.api.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void cadastrar(@RequestBody @Valid DadosMedicos dados){
        service.cadastraMedico(dados);
    }

    @GetMapping()
    public Page<ListaDadosMedicos> listaMedicos(Pageable paginacao){
        return service.listaMedicos(paginacao);
    }

    //Aqui o id é enviado no corpo da requisição
    @PutMapping
    @Transactional
    public void atualizaCadastroMedico(@RequestBody @Valid DadosAtualizaMedicos dados){
        service.atualizaMedico(dados);
    }

    //Aqui o id é enviado no cabeçalho da URL
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        service.excluirMedico(id);
    }
}
