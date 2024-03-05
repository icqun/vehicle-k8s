package at.htlleonding.vehicle.boundary;

import at.htlleonding.vehicle.control.VehicleRepository;
import at.htlleonding.vehicle.entity.Vehicle;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/vehicles")
public class VehicleResource {
    @Inject
    VehicleRepository vehicleRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response
                .ok(vehicleRepository.listAll())
                .build();
    }
}
