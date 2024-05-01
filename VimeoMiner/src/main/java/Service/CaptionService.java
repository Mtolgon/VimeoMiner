package Service;

import modelVideo.VMCaption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CaptionService {
    @Autowired
    RestTemplate restTemplate;
    String baseuri = "https://api.vimeo.com";
    public List<VMCaption> findAllCaptions(String token, Integer videoId){
        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<VMCaption[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<VMCaption[]> response = restTemplate.exchange(baseuri+"/videos/"+videoId+"/texttracks", HttpMethod.GET, request, VMCaption[].class);
        return List.of(response.getBody());
    }
    public VMCaption findAllCaption(String token, Integer id, Integer videoId){

        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<VMCaption> request = new HttpEntity<>(null, headers);
        ResponseEntity<VMCaption> response = restTemplate
                .exchange(baseuri+"/videos/"+videoId+"/texttracks"+id, HttpMethod.GET, request, VMCaption.class);
        return response.getBody();
    }
}
