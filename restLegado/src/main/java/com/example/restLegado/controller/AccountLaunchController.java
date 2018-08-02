package com.example.restLegado.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restLegado.response.ErrorResponse;

import br.com.legado.ExtractService;
import br.com.legado.entity.AccountLaunch;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "/account/launch", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountLaunchController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountLaunchController.class);
	
	@Autowired
	private ExtractService extractService;

	@GetMapping
	@ApiOperation(value = "verifica status da proposta", httpMethod = "GET", response = AccountLaunch.class)
	@RequestMapping(value = "/account/launch", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> returnAccountLaunch() {
		LOGGER.debug("##### Inicio #####");
		
		AccountLaunch account;
		try {
			LOGGER.debug("##### Chamada do servico #####");
			account = extractService.findAccountLaunch();
		} catch (IOException e) {
			LOGGER.debug("##### ERRO: " +e.getStackTrace()+" #####");
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("01-A","Erro Inesperado"), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		LOGGER.debug("##### Final #####");
		return new ResponseEntity<AccountLaunch>(account, HttpStatus.OK);
	}
	
}
