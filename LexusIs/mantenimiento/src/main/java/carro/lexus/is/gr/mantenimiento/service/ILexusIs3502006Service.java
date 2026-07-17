package carro.lexus.is.gr.mantenimiento.service;

import carro.lexus.is.gr.mantenimiento.model.LexusIs3502006;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ILexusIs3502006Service {

     List<LexusIs3502006> findAll();

     Optional<LexusIs3502006> findByCodigo(Integer codigo);

     LexusIs3502006 save (LexusIs3502006 lexusIs3502006 );




}
