import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Configuration
@BindToRegistry("CamelProcessor")
public class CamelProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("Hello World from camel");
    }
}