package com.ayush.filters;

import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AppFilter implements GlobalFilter {
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
	
		System.out.println("#############################################");
		
		ServerHttpRequest request = exchange.getRequest();
		
		HttpHeaders headers = request.getHeaders();
		
		Set<String> headerNames = headers.headerNames();

		if(!headerNames.contains("secret"))
			throw new RuntimeException("Invalid Input");
		
		List<String> list = headers.get("secret");
		
		if(!list.contains("yam007"))
			throw new RuntimeException("Invalid Input");
		
		return chain.filter(exchange);
	}
	
}
