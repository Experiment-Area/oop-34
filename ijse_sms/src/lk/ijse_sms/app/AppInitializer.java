package lk.ijse_sms.app;

import com.spring_security.api.*;
import com.netflix.zuul.service.*;
import com.netflix.ribbon.api.*;

public class AppInitializer {

    SecurityFilterChain securityFilterChain;
    Decoder decoder;
    ApiGateway apiGateway;
    RouterService routerService;
    RibbonGateway ribbonGateway;
    RibbonService ribbonService;

}
