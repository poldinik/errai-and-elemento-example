package org.jboss.errai.cdi;

import java.util.function.Function;
import javax.inject.Named;
import org.jboss.errai.common.client.util.AnnotationPropertyAccessorBuilder;
import org.jboss.errai.common.client.util.SharedAnnotationSerializer;
import org.jboss.errai.enterprise.client.cdi.EventQualifierSerializer;
import org.jboss.errai.ioc.client.api.ReplyTo;
import org.jboss.errai.ioc.client.api.ToSubject;

public class EventQualifierSerializerImpl extends EventQualifierSerializer { public EventQualifierSerializerImpl() {
    serializers.put("org.jboss.errai.ioc.client.api.ReplyTo", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((ReplyTo) anno).value());
      }
    }).build());
    serializers.put("org.jboss.errai.ioc.client.api.ToSubject", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((ToSubject) anno).value());
      }
    }).build());
    serializers.put("javax.inject.Named", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((Named) anno).value());
      }
    }).build());
  }

}