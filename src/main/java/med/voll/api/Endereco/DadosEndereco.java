package med.voll.api.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank

        String cep,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cidade,

        String uf,
        String numero,
        String complemento) {
}
