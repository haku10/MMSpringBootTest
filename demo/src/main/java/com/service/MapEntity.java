package com.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MapEntity {
	private String uri;
	private String key;
}
