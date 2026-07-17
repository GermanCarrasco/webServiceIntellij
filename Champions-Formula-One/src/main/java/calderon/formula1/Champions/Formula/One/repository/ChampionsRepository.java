package calderon.formula1.Champions.Formula.One.repository;

import champions_web_services.formula1.Champion;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ChampionsRepository {
    private static final Map<String, Champion> campeon = new HashMap<>();

    @PostConstruct
    public void initdata(){
        Champion alonso = new Champion();
        alonso.setNombre("Fernando");
        alonso.setApellido("Alonso");
        alonso.setEquipoActual("Aston Martin");
        alonso.setPoles(22);
        alonso.setPodios(104);
        alonso.setVictorias(32);
        alonso.setCampeonatos(2);

        Champion hamilton = new Champion();
        hamilton.setNombre("Lewis");
        hamilton.setApellido("Hamilton");
        hamilton.setEquipoActual("Mercedes");
        hamilton.setPoles(103);
        hamilton.setPodios(195);
        hamilton.setVictorias(103);
        hamilton.setCampeonatos(7);

        campeon.put("Fernando",alonso);
        campeon.put("Lewis",hamilton);
    }

    public Champion getElCampeon(String nombre){
        return campeon.get(nombre);
    }

}
