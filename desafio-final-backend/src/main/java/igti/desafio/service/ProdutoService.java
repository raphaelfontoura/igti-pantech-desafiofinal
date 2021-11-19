package igti.desafio.service;

import igti.desafio.dto.ProdutoDTO;
import igti.desafio.modelo.Produto;
import igti.desafio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAll() {
        List<Produto> listProdutos =  repository.findAll();
        return listProdutos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }
}
