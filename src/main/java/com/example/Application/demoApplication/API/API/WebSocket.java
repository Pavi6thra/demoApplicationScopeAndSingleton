package com.example.Application.demoApplication.API.API;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

//@Component
@Scope(value = "webSocket" ,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WebSocket {
}
