package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.Medicos.DadosAtualizaMedicos;
import med.voll.api.Pacientes.DadosAtualizaPaciente;
import med.voll.api.Pacientes.DadosPacientes;
import med.voll.api.Pacientes.ListaDadosPacientes;
import med.voll.api.Pacientes.Paciente;
import med.voll.api.Services.PacienteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service){
        this.service = service;
    }

    @PostMapping
    public void cadastroPaciente(@RequestBody DadosPacientes dados){
        service.cadastroPaciente(dados);
    }

    @GetMapping
    public Page<ListaDadosPacientes> listarPaciente(@PageableDefault(size = 5, page = 0, sort = {"id"}) Pageable paginacao){

        return service.listarPacientes(paginacao);
    }

    @PutMapping()
    @Transactional
    public void atualiza(@RequestBody @Valid DadosAtualizaPaciente dados){
        service.atualizaDados(dados);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id){
        service.excluirPaciente(id);
    }
}
