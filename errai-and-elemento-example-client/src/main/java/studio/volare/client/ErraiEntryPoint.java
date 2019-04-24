package studio.volare.client;

import com.google.gwt.core.client.GWT;
import org.jboss.errai.common.client.api.Caller;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ErraiEntryPoint {

    @Inject
    Caller<Service> serviceCaller;

    @PostConstruct
    public void start() {

        GWT.log("testo");
        serviceCaller.call(o -> {
            GWT.log("echo is "+o);
        }).echo();

        GWT.log("startup");
    }
}
