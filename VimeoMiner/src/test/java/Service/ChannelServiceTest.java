package Service;

import modelVimeo.Channel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ChannelServiceTest {
    @Autowired
    ChannelService service;

    @Test
    @DisplayName("Get all channels")
    void findAllChannels() {
        List<Channel> channels = service.findAllChannels("0fa07374f9fb285dd2a22e1e629613ee");
        assertFalse(channels.isEmpty(), "the list is empty");
        System.out.println(channels);
    }

    @Test
    void findChannel() {
        Channel channel = service.findAllChannel("0fa07374f9fb285dd2a22e1e629613ee",1903256);
        System.out.println(channel
        );

    }

    @Test
    void createChannel() {
    }


}