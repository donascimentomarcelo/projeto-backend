package br.com.projeto.services;

import br.com.projeto.dto.Dto;
import br.com.projeto.dto.FormDto;

public interface ProjetoService {

	Dto formatDto(FormDto form);

	void sendToEndpoint(Dto dto);

}
