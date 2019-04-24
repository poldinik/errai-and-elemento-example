package org.jboss.errai.ioc.client;

import elemental2.dom.File.FilePropertiesType;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__e_d_File_FilePropertiesType__quals__Universal extends Factory<FilePropertiesType> { public JsType_factory__e_d_File_FilePropertiesType__quals__Universal() {
    super(new FactoryHandleImpl(FilePropertiesType.class, "JsType_factory__e_d_File_FilePropertiesType__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { FilePropertiesType.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public FilePropertiesType createInstance(final ContextManager contextManager) {
    return (FilePropertiesType) WindowInjectionContextStorage.createOrGet().getBean("elemental2.dom.File$FilePropertiesType");
  }
}