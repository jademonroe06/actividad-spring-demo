package es.fplumara.dam2.springdemo.services;

import org.springframework.stereotype.Service;

import es.fplumara.dam2.springdemo.config.ApiProperties;

@Service
public class ApiClientService {

  private final ApiProperties props;

  public ApiClientService(ApiProperties props) {
    this.props = props;
  }

  public String summary() {
    return "URL=" + props.getUrl() + ", timeoutMs=" + props.getTimeoutMs();
  }
}
