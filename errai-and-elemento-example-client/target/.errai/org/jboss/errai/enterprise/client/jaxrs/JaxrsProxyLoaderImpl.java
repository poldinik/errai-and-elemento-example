package org.jboss.errai.enterprise.client.jaxrs;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Response;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.common.client.framework.ProxyProvider;
import org.jboss.errai.common.client.framework.RemoteServiceProxyFactory;
import studio.volare.client.Service;

public class JaxrsProxyLoaderImpl implements JaxrsProxyLoader { public void loadProxies() {
    class studio_volare_client_ServiceImpl extends AbstractJaxrsProxy implements Service {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public studio_volare_client_ServiceImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public String echo() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("5185415ba171ea3a00704eed");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(Response response) {
            if (response.getStatusCode() == 204) {
              return null;
            } else {
              return String.valueOf(response.getText());
            }
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(Service.class, new ProxyProvider() {
      public Object getProxy() {
        return new studio_volare_client_ServiceImpl();
      }
    });
  }
}