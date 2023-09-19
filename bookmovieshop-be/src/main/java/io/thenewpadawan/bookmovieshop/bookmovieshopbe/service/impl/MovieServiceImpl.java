package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.MovieService;

@Service
@Qualifier(value = "movieservicedefault")
// Qualifier serve a scegliere un'implementazione specifica nel caso di istanze multiple 
public class MovieServiceImpl implements MovieService {
	@Override
	public String test() {
		return "<html><body><h1>PAGINA HTML DI TEST</h1><p>Comunque questo era un test serio</p></body></html>";
		//return "Test movie eseguito con successo";
	}
}
