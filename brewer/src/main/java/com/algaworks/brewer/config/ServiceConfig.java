package com.algaworks.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.algaworks.brewer.service.CadastroCervejaService;
/**
 * 
 * @author JGaray
 *
 */
import com.algaworks.brewer.storage.FotoStorage;
import com.algaworks.brewer.storage.local.FotoStorageLocal;

/**
 * 
 * @author JGaray
 *
 */
@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {

	@Bean
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}

}
