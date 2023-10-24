package br.com.program.softv1.data.dto.v1;

import br.com.program.softv1.model.UserRole;

public record RegisterDTO(String nome, String email, String login, String password, UserRole role) {
}
