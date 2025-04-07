package com.iaugusto.inkscape.controller.docs;

import com.iaugusto.inkscape.model.dto.ClientDTO;
import com.iaugusto.inkscape.model.entities.Client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Usuários", description = "Endpoints para gerenciamento de usuários")
public interface ClientControllerDocs {

    @Operation(
            summary = "Cadastrar um novo usuário",
            description = "Cria um novo usuário no sistema",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "Usuário cadastrado com sucesso"
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Dados inválidos"
                    )
            }
    )
    ResponseEntity<Client> registerUser(ClientDTO dto);
}
