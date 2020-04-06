package com.algaworks.brewer.storage;

import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @author JGaray
 *
 */
public interface FotoStorage {

	public void salvarTemporariamente(MultipartFile[] files);
}
