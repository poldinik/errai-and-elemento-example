Running

`mvn -Dmaven.tomcat.port=8080 tomcat7:run -pl *-server -am -Denv=dev`
`mvn gwt:codeserver -pl *-client -am`

Errore errai

` Loading Java files in studio.volare.App.
[INFO]    Tracing compile failure path for type 'org.jboss.errai.enterprise.client.jaxrs.api.PathSegmentImpl'
[INFO]       [ERROR] Errors in 'jar:file:/Users/loretto/.m2/repository/org/jboss/errai/errai-jaxrs-client/4.6.0.Final/errai-jaxrs-client-4.6.0.Final.jar!/org/jboss/errai/enterprise/client/jaxrs/api/PathSegmentImpl.java'
[INFO]          [ERROR] Line 30: No source code is available for type javax.ws.rs.core.MultivaluedMap<K,V>; did you forget to inherit a required module?
[INFO]          [ERROR] Line 29: No source code is available for type javax.ws.rs.core.PathSegment; did you forget to inherit a required module?
[INFO]    Tracing compile failure path for type 'org.jboss.errai.enterprise.client.jaxrs.api.MultivaluedMapImpl'
[INFO]       [ERROR] Errors in 'jar:file:/Users/loretto/.m2/repository/org/jboss/errai/errai-jaxrs-client/4.6.0.Final/errai-jaxrs-client-4.6.0.Final.jar!/org/jboss/errai/enterprise/client/jaxrs/api/MultivaluedMapImpl.java'
[INFO]          [ERROR] Line 33: No source code is available for type javax.ws.rs.core.MultivaluedMap<K,V>; did you forget to inherit a required module?
[INFO]    Module setup completed in 8859 ms`
