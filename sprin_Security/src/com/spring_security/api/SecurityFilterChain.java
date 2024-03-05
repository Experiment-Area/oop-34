package com.spring_security.api;

import com.spring_security.config.*;
import com.spring_security.util.*;

public class SecurityFilterChain {

    WebSecurityConfig webSecurityConfig;
    MethodSecurity methodSecurity;
    Intercepter intercepter;
    PostAuth postAuth;
}
