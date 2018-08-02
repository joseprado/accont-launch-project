package br.com.legado.adapter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.legado.entity.AccountLaunch;

public class ExtractAdapter {
	
	private static final String JSON_FILE = "/lancamento-conta-legado.json";
	private static final ExtractAdapter instance = new ExtractAdapter();
	
	public static ExtractAdapter getInstance() {
		return instance != null ? instance : new ExtractAdapter();
	}
	
	public AccountLaunch convertJsonToObject() throws FileNotFoundException, IOException {
		
        ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readValue(new FileReader(JSON_FILE), AccountLaunch.class);
	}

}
