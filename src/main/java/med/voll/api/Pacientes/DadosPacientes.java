package med.voll.api.Pacientes;

import med.voll.api.Endereco.DadosEndereco;

public record DadosPacientes(String nome, String cpf, int idade, String email, String telefone, DadosEndereco endereco) {
}
