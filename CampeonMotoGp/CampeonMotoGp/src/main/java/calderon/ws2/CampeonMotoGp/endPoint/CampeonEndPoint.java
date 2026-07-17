package calderon.ws2.CampeonMotoGp.endPoint;

import calderon.ws2.CampeonMotoGp.repository.CampeonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import calderon.ws.campeonmotogp_service.GetCampeonResponse;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import calderon.ws.campeonmotogp_service.GetCampeonRequest;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import calderon.ws.campeonmotogp_service.GetCampeonesResponse;

@Endpoint
public class CampeonEndPoint {
    private static final String NAMESPACE_URI = "http://ws.calderon/campeonMotoGp-service";

    private CampeonRepository campeonRepository;

    @Autowired
    public CampeonEndPoint(CampeonRepository campeonRepository){
        this.campeonRepository = campeonRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCampeonesRequest")
    @ResponsePayload
    public GetCampeonesResponse getCampeones(@RequestPayload calderon.ws.campeonmotogp_service.GetCampeonesRequest request){
        GetCampeonesResponse response = new GetCampeonesResponse();
        response.setCampeones(campeonRepository.findCampeones());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCampeonRequest")
    @ResponsePayload
    public GetCampeonResponse getCampeon(@RequestPayload GetCampeonRequest request){
        GetCampeonResponse response = new GetCampeonResponse();
        response.setCampeones(campeonRepository.findcampeon(request.getNombre()));
        return response;
    }
}
