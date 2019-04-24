package studio.volare.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("5185415ba171ea3a00704eed")
public interface Service {

    @GET
    String echo();
}
