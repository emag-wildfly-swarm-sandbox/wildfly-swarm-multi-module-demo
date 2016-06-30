package wildflyswarm.mutlimodule;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class App {

  public static void main(String[] args) throws Exception {
    Container container = new Container(args);

    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addPackage(App.class.getPackage());
    // ClassNotFoundException will be thrown if you don't use addAllDependencies
    deployment.addAllDependencies();

    container.start().deploy(deployment);
  }

}
