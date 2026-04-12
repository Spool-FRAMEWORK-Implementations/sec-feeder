package software.example.spool.sec.feeder;

import software.spool.core.adapter.otel.OTELConfig;
import software.spool.dsl.SpoolNodeDSL;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OTELConfig.init("feeder");
        SpoolNodeDSL.fromDescriptor("/Feeder.yaml");
    }
}
