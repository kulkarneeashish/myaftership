package com.example.aftership.controller;


import com.example.aftership.request.ShipmentRequest;
import com.example.aftership.request.TrackingRequest;
import com.example.aftership.response.GetTrackingResponse;
import com.example.aftership.response.AfterShipShipmentTrackingResponse;
import com.example.aftership.response.ShipmentTrackingResponse;
import com.example.aftership.service.MapperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class GetTracking {

  private static final Logger log = LoggerFactory.getLogger(GetTracking.class);

  @Value("${aftership.api-key}")
  private String API_KEY;


  @Value("${aftership.url}")
  private String url;

  @Autowired
  MapperService mapperService;

  @Autowired
  RestTemplate restTemplate;

  @GetMapping(value = "/trackings",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Object> getTrackingInfo(
      @RequestBody(required = false) TrackingRequest trackingRequest) {

    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("aftership-api-key", API_KEY);
      headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
      headers.set(HttpHeaders.EXPECT, MediaType.APPLICATION_JSON_VALUE);

      UriComponentsBuilder builder;
      if(trackingRequest != null) {
         builder = UriComponentsBuilder
            .fromHttpUrl(url + "/trackings")
            .queryParam("page", trackingRequest.getPage())
            .queryParam("limit", trackingRequest.getPage())
            .queryParam("slug", trackingRequest.getSlug());

      }
      else {
         builder = UriComponentsBuilder
            .fromHttpUrl(url + "/trackings")
            .queryParam("page", 1)
            .queryParam("limit", 100);

      }
      HttpEntity<?> entity = new HttpEntity<>(headers);

      HttpEntity<GetTrackingResponse> response = restTemplate.exchange(
          builder.toUriString(),
          HttpMethod.GET,
          entity,
          GetTrackingResponse.class);

      ShipmentTrackingResponse shipmentTrackingResponse = mapperService.convertFromAfterShipResponse(response.getBody());
      return new ResponseEntity<>(shipmentTrackingResponse, HttpStatus.OK);
    } catch (Exception exception) {
      log.error("Unable to get the tracking information ", exception);
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PostMapping(value = "/create-tracking", produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Object> createTracking(@RequestBody ShipmentRequest shipmentRequest) {

    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("aftership-api-key", API_KEY);
      headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
      headers.set(HttpHeaders.EXPECT, MediaType.APPLICATION_JSON_VALUE);

      UriComponentsBuilder builder = UriComponentsBuilder
          .fromHttpUrl(url+ "/trackings");

      HttpEntity<?> entity = new HttpEntity<>(shipmentRequest, headers);

      HttpEntity<AfterShipShipmentTrackingResponse> response = restTemplate.exchange(
          builder.toUriString(),
          HttpMethod.POST,
          entity,
          AfterShipShipmentTrackingResponse.class);
      return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    } catch (Exception exception) {
      log.error("Unable to create the tracking information ", exception);
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

    }
  }

}
