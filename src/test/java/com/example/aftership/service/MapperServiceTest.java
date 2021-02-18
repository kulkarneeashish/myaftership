package com.example.aftership.service;

import static org.mockito.Mockito.when;

import com.example.aftership.response.GetTrackingData;
import com.example.aftership.response.GetTrackingResponse;
import com.example.aftership.response.Tracking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MapperServiceTest {

  MapperService mapperService;

  @Mock
  GetTrackingResponse getTrackingResponse;

  @Mock
  GetTrackingData getTrackingData;

  @Mock
  Tracking tracking;

  @BeforeEach
  void setUp() {
    mapperService = new MapperService();

  }

  @Test
  void convertFromAfterShipResponse() {
    when(getTrackingResponse.getData()).thenReturn(getTrackingData);
   // when(getTrackingData.getTrackings()).thenReturn();
  }
}