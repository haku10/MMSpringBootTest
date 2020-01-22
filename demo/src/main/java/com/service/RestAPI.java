package com.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestAPI {
	public static void main(String[] a) {
		/** */
		String get_res = get();
		System.out.println(get_res);

	}

	public static String get() {
		String uri = "https://public.bitbank.cc";
		String Ticker = "/btc_jpy/ticker";
		uri = uri + Ticker;
		long unixtime = System.currentTimeMillis() / 1000L;
		Date date = new Date(unixtime * 1000);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		return response.toString();
	}

	public static String post() throws URISyntaxException {
		String uri = "https://public.bitbank.cc";
		String Ticker = "/btc_jpy/ticker";
		uri = uri + Ticker;
		URI url = new URI(uri);
		String ACCESS_KEY = "72f365bf-5075-409e-aba0-8d59bc86b474";
		String SECLET = "4d6e00f93de052ba60ae824d52d646347be86ffcca8b73d198102d4f791a595c";
		long unixtime = System.currentTimeMillis() / 1000L;
		Date date = new Date(unixtime * 1000);
		String ACCESS_NONCE = date.toString();
		Map<String, String> prams = new HashMap<String, String>();
		RequestEntity<String> request = RequestEntity
				.post(url)
				.header("", "")
				.body(SECLET);

		RestTemplate restTemplate2 = new RestTemplate();
		ResponseEntity<String> response = restTemplate2.exchange(request, String.class);
		return response.toString();
	}

}
