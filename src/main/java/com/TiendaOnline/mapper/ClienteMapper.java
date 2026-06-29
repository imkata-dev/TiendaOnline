package com.TiendaOnline.mapper;

import com.TiendaOnline.dto.ClienteRequestDTO;
import com.TiendaOnline.dto.ClienteResponseDTO;
import com.TiendaOnline.model.Cliente;
public class ClienteMapper {


    public static Cliente toEntity(ClienteRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setCorreo(dto.getCorreo());
        cliente.setTelefono(dto.getTelefono());
        cliente.setDireccion(dto.getDireccion());


        return cliente;
    }

    public static ClienteResponseDTO toResponseDTO(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        ClienteResponseDTO dto = new ClienteResponseDTO();
        dto.setId(cliente.getId());
        dto.setNombre(cliente.getNombre());
        dto.setCorreo(cliente.getCorreo());

        return dto;
    }
}
