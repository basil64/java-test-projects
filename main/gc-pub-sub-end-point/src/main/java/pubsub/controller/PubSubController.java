package pubsub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pubsub.Event;


@RestController
public class PubSubController {

  private final Logger  LOGGER = LoggerFactory.getLogger(this.getClass());

  @PutMapping("/events")
  public void putEvent(@RequestBody Event event) {
    LOGGER.info("Event received [{}]", event.getMessage());
  }
}
