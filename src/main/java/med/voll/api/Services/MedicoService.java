package med.voll.api.Services;

import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medicos.DadosAtualizaMedicos;
import med.voll.api.Medicos.DadosMedicos;
import med.voll.api.Medicos.ListaDadosMedicos;
import med.voll.api.Medicos.Medicos;
import med.voll.api.Respositorio.MedicoRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private MedicoRespository repository;

    public MedicoService(MedicoRespository repository){
        this.repository = repository;
    }

    public void cadastraMedico(DadosMedicos dados){
        repository.save(new Medicos(dados));
    }


    public Page<ListaDadosMedicos> listaMedicos(Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao)
                .map(ListaDadosMedicos::new);
    }

    public void atualizaMedico(DadosAtualizaMedicos dados){
        var medico = repository.getReferenceById(dados.id());

        medico.atualizaInformacoes(dados);
    }

    //exclusão lógica
    public void excluirMedico(Long id){
        var medico = repository.getReferenceById(id);

        medico.excluir();
    }
}
