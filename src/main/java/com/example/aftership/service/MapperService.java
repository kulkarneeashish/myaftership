package com.example.aftership.service;

import com.example.aftership.response.GetTrackingResponse;
import com.example.aftership.response.ShipmentTrackingResponse;
import com.example.aftership.response.Tracking;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class MapperService {

  public ShipmentTrackingResponse convertFromAfterShipResponse(
      GetTrackingResponse afterShipShipmentTrackingResponse){

    if(afterShipShipmentTrackingResponse != null) {
      ShipmentTrackingResponse shipmentTrackingResponse = new ShipmentTrackingResponse();
      shipmentTrackingResponse
          .setCourierCode(afterShipShipmentTrackingResponse.getData().getSlug());
      shipmentTrackingResponse.setTrackingNumber(
          afterShipShipmentTrackingResponse.getData().getTrackings()
              .get(afterShipShipmentTrackingResponse.getData().getTrackings().size() - 1)
              .getTrackingNumber());
      Tracking lastCheckpointTracking = afterShipShipmentTrackingResponse.getData().getTrackings()
          .get(afterShipShipmentTrackingResponse.getData().getTrackings().size() - 1);
      if (lastCheckpointTracking.getCheckpoints().size() > 0){
        shipmentTrackingResponse.setDestination(lastCheckpointTracking.getCheckpoints()
            .get(lastCheckpointTracking.getCheckpoints().size() - 1).getLocation());
    }
      shipmentTrackingResponse.setId(afterShipShipmentTrackingResponse.getData().getTrackings().get(afterShipShipmentTrackingResponse.getData().getTrackings().size()-1).getId());
      shipmentTrackingResponse.setOrigin(
          Arrays.toString(afterShipShipmentTrackingResponse.getData().getOrigin().toArray()));
      return shipmentTrackingResponse;
    }
    return null;
  }

}
