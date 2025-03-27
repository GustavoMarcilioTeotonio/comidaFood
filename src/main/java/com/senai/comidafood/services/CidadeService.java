package com.senai.comidafood.services;

import com.senai.comidafood.dtos.CidadeDTO;
import com.senai.comidafood.models.Cidade;
import com.senai.comidafood.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public CidadeDTO salvarCidade(CidadeDTO cidadeDTO) {
        Cidade cidade = converterCidadeDTOParaCidade(cidadeDTO);
        cidade = cidadeRepository.save(cidade);
        return converterCidadeParaCidadeDTO(cidade);
    }

    public CidadeDTO converterCidadeParaCidadeDTO(Cidade cidade) {
        CidadeDTO cidadeDTO = new CidadeDTO();
        cidadeDTO.setId(cidade.getId());
        cidadeDTO.setNome(cidade.getNome());
        cidadeDTO.setEstado(cidade.getEstado());
        return cidadeDTO;
    }


}
