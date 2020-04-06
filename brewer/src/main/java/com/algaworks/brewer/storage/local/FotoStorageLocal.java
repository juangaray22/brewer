package com.algaworks.brewer.storage.local;

import static java.nio.file.FileSystems.getDefault;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.storage.FotoStorage;

/**
 * 
 * @author JGaray
 *
 */
public class FotoStorageLocal implements FotoStorage {

	private Path local;
	private Path localTemporario;

	private static final Logger logger = LoggerFactory.getLogger(FotoStorageLocal.class);

	public FotoStorageLocal() {
		this(getDefault().getPath(System.getenv("HOME"), ".brewerfotos"));
	}

	public FotoStorageLocal(Path path) {
		this.local = path;
		criarPastas();
	}

	private void criarPastas() {
		try {
			Files.createDirectories(this.local);
			this.localTemporario = getDefault().getPath(this.local.toString(), "temp");

			if (logger.isDebugEnabled()) {
				logger.debug("Pastas criadas para salvar fotos.");
				logger.debug("Pasta default: " + this.local.toAbsolutePath());
				logger.debug("Pasta temporaria:" + this.localTemporario.toAbsolutePath());
			}
		} catch (IOException e) {
			throw new RuntimeException("Erro na cricao pasta para salvar foto", e);
		}
	}

	@Override
	public void salvarTemporariamente(MultipartFile[] files) {
		System.out.println(">>> salvando a foto temporariamente");
	}

}
