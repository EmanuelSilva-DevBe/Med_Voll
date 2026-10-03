package med.voll.api.Pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.Endereco.DadosEndereco;

import java.awt.print.Pageable;

public record DadosPacientes(
        @NotBlank
        String nome,
        String cpf,
        @NotNull
        @Positive
        int idade,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @Valid
        DadosEndereco endereco) {

}
