package com.netflix.zuul.util;

import com.netflix.zuul.service.*;
import com.netflix.ribbon.api.*;

public class TcpConfig {

    ApiGateway apiGateway;
    RouterService routerService;
    RibbonService ribbonService;
    RibbonGateway ribbonGateway;
}
