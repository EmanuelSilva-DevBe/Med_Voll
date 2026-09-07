package med.voll.api.Medicos;

import med.voll.api.Endereco.DadosEndereco;

public record DadosMedicos(String nome, String email, String crm,
                           Especialidade especialidade, DadosEndereco endereco) {
}
