package br.com.legado;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.legado.entity.AccountLaunch;

public interface ExtractService {

	public AccountLaunch findAccountLaunch() throws FileNotFoundException, IOException;

}
