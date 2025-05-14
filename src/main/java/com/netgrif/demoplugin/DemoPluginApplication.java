package com.netgrif.demoplugin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class},
        scanBasePackages = {"com.netgrif"}
)
@ComponentScan(
        basePackages = {"com.netgrif"}
)
@ConfigurationPropertiesScan("com.netgrif.plugin.core.properties")
public class DemoPluginApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DemoPluginApplication.class)
                .run(args);
    }
}
