package com.netgrif.demoplugin;

import com.netgrif.plugin.core.annotations.EntryPoint;
import com.netgrif.plugin.core.annotations.EntryPointMethod;


@EntryPoint(value = "demoPluginService")
public class DemoPluginService {

    @EntryPointMethod
    public String getMessage(String name) {
        return "Hello " + name + "!";
    }
}
