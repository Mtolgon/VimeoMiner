package Service;


import modelVimeo.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class ChannelService {
    @Autowired
    RestTemplate restTemplate;
    String baseuri = "https://api.vimeo.com";


    public List<Channel> findAllChannels(String token){

        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<Channel[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Channel[]> response = restTemplate.exchange(baseuri+"/channels/", HttpMethod.GET, request, Channel[].class);
        return List.of(Objects.requireNonNull(response.getBody()));
    }

    public Channel findAllChannel(String token, Integer id){

        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<Channel> request = new HttpEntity<>(null, headers);
        ResponseEntity<Channel> response = restTemplate
                .exchange(baseuri+"/channels/"+id, HttpMethod.GET, request, Channel.class);
        return response.getBody();
    }

    public void createChannel(String token, Channel channel){
        HttpHeaders headers  = new HttpHeaders();
        headers.set("Authorization", "Bearer "+token);
        HttpEntity<Channel> request = new HttpEntity<>(channel, headers);
        ResponseEntity<Channel> response = restTemplate
                .exchange(baseuri+"/channels/", HttpMethod.POST, request, Channel.class);


    }




}
