package calderon.formula1.Champions.Formula.One.endpoint;

import calderon.formula1.Champions.Formula.One.repository.ChampionsRepository;
import champions_web_services.formula1.GetChampionF1Request;
import champions_web_services.formula1.GetChampionF1Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ChampionEndPoint {
    private static final String NAMESPACE_URI = "formula1.champions-web-services";

    private ChampionsRepository repository;

    @Autowired
    public ChampionEndPoint(ChampionsRepository repository) {
        this.repository = repository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getChampionF1Request")
    @ResponsePayload
    public GetChampionF1Response getChampion(@RequestPayload GetChampionF1Request request){
        GetChampionF1Response response = new GetChampionF1Response();
        response.setChampion(repository.getElCampeon(request.getNombre()));
        return response;
    }
}
