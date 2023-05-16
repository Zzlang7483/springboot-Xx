package com.zdz.controller;

import cn.hutool.core.lang.Dict;
import com.zdz.property.ApplicationProperty;
import com.zdz.property.DeveloperProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationPropertyController {

    private final DeveloperProperty developerProperty;
    private final ApplicationProperty applicationProperty;


    public ApplicationPropertyController(DeveloperProperty developerProperty, ApplicationProperty applicationProperty) {
        this.developerProperty = developerProperty;
        this.applicationProperty = applicationProperty;
    }

    @GetMapping("/property")
    public Dict index(){
        return  Dict.create().set("developerProperty",developerProperty).set("applicationProperty",applicationProperty);
    }
}
