package carro.lexus.is.gr.mantenimiento.service;

import carro.lexus.is.gr.mantenimiento.model.LexusIs3502006;
import carro.lexus.is.gr.mantenimiento.repository.ILexusIs3502006Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LexusIs350ServiceImpl implements ILexusIs3502006Service{

    @Autowired
    private ILexusIs3502006Repository repository;

    @Override
    public List<LexusIs3502006> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<LexusIs3502006> findByCodigo(Integer codigo) {
        return repository.findById(codigo);
    }

    @Override
    public LexusIs3502006 save(LexusIs3502006 lexusIs3502006) {
        return repository.save(lexusIs3502006);
    }
}
