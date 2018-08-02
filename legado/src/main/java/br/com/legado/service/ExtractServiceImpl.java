package br.com.legado.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import br.com.legado.ExtractService;
import br.com.legado.adapter.ExtractAdapter;
import br.com.legado.entity.AccountLaunch;

@Service
public class ExtractServiceImpl implements ExtractService{
	
	public AccountLaunch findAccountLaunch() throws FileNotFoundException, IOException {
		return ExtractAdapter.getInstance().convertJsonToObject();
	}
	
}
