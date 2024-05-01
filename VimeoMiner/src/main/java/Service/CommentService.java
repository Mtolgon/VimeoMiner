package Service;

import modelVideo.VMComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    RestTemplate restTemplate;
   
    String baseuri = "https://api.vimeo.com";
    public List<VMComment> findAllComments(String token, Integer videoId){
        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<VMComment[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<VMComment[]> response = restTemplate.exchange(baseuri+"/videos/"+videoId+"/comments", HttpMethod.GET, request, VMComment[].class);
        return List.of(response.getBody());
    }
    public VMComment findAllComment(String token, Integer id, Integer videoId){

        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<VMComment> request = new HttpEntity<>(null, headers);
        ResponseEntity<VMComment> response = restTemplate
                .exchange(baseuri+"/videos/"+videoId+"/comments"+id, HttpMethod.GET, request, VMComment.class);
        return response.getBody();
    }

}
