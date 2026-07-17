package calderon.ws2.CampeonMotoGp.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import calderon.ws.campeonmotogp_service.Campeones;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Component
public class CampeonRepository {
    private static final List<Campeones> campeones = new ArrayList<>();
    Campeones valentino = new Campeones();
    Campeones jorge = new Campeones();
    Campeones marc = new Campeones();
    Campeones joan = new Campeones();
    Campeones fabio = new Campeones();
    Campeones francesco = new Campeones();

    @PostConstruct
    public void initData(){

        valentino.setNombre("Valentino Rossi");
        valentino.setEdad(44);
        valentino.setEquipo("Yamaha, Honda, Ducati");
        valentino.setNumCampeonatos(9);
        valentino.setUltimoCampeonato(2009);
        campeones.add(valentino);


        jorge.setNombre("Jorge Lorenzo");
        jorge.setEdad(36);
        jorge.setEquipo("Yamaha, Honda, Ducati");
        jorge.setNumCampeonatos(5);
        jorge.setUltimoCampeonato(2015);
        campeones.add(jorge);


        marc.setNombre("Marc Marquez");
        marc.setEdad(30);
        marc.setEquipo("Honda");
        marc.setUltimoCampeonato(8);
        marc.setUltimoCampeonato(2019);
        campeones.add(marc);


        joan.setNombre("Joan Mir");
        joan.setEdad(25);
        joan.setEquipo("suzuki, Honda");
        joan.setNumCampeonatos(1);
        joan.setUltimoCampeonato(2020);
        campeones.add(joan);


        fabio.setNombre("Fabio Quartararo");
        fabio.setEdad(24);
        fabio.setEquipo("Yamaha");
        fabio.setNumCampeonatos(1);
        fabio.setUltimoCampeonato(2021);
        campeones.add(fabio);


        francesco.setNombre("Francesco Bagnaia");
        francesco.setEdad(26);
        francesco.setEquipo("Ducati");
        francesco.setNumCampeonatos(1);
        francesco.setUltimoCampeonato(2022);
        campeones.add(francesco);


    }

    public List<Campeones> findCampeones(){
//        Assert.notNull(nombre,"The name must not be null");
        return campeones;
    }

    public Campeones findcampeon(String nombre){
        Assert.notNull(nombre,"The name must not be null");
        return switch (nombre) {
            case "valentino" -> valentino;
            case "jorge" -> jorge;
            case "marc" -> marc;
            case "joan" -> joan;
            case "fabio" -> fabio;
            default -> francesco;
        };
    }
}
