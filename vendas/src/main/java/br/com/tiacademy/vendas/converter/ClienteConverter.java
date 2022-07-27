package br.com.tiacademy.vendas.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.vendas.core.crud.CrudConverter;
import br.com.tiacademy.vendas.domain.Cliente;
import br.com.tiacademy.vendas.dto.ClienteDTO;

@Component
public class ClienteConverter implements CrudConverter<Cliente, ClienteDTO> {
	@Override
	public ClienteDTO entidadeParaDto(Cliente entidade) {
		var dto = new ClienteDTO();
		dto.setId(entidade.getId());
		dto.setNome(entidade.getNome());
		
		return dto;
	}

	@Override
	public Cliente dtoParaEntidade(ClienteDTO dto) {
		var cliente = new Cliente();
		cliente.setId(dto.getId());
		cliente.setNome(dto.getNome());
		
		return cliente;
	}
}
