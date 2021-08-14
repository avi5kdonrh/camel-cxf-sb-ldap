package org.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BodyProc implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().removeHeaders("*");
        exchange.getIn().setBody("lsdfkjkl");
    }
}
