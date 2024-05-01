package Service;

import modelVideo.VMVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class VideoService {
    @Autowired
    RestTemplate restTemplate;
    String baseuri = "https://api.vimeo.com";

    public VMVideo findAllVideo(String token, Integer id){

        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<VMVideo> request = new HttpEntity<>(null, headers);
        ResponseEntity<VMVideo> response = restTemplate
                .exchange(baseuri+"/video/"+id, HttpMethod.GET, request, VMVideo.class);
        return response.getBody();
    }

}
