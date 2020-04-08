package com.algaworks.brewer.storage;

import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @author JGaray
 *
 */
public interface FotoStorage {

	public String salvarTemporariamente(MultipartFile[] files);
}
