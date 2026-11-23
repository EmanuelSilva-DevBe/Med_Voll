package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.Usuarios.DadosAutenticacao;
import med.voll.api.Usuarios.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UsuariosController {

    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid DadosAutenticacao autenticacao) {

        var token = new UsernamePasswordAuthenticationToken("admin", "admin");

        var auth = manager.authenticate(token);
    }

}
