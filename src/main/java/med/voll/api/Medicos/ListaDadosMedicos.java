package med.voll.api.Medicos;

public record ListaDadosMedicos(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {

    public ListaDadosMedicos (Medicos medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
