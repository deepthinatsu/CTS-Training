package com.form;

import java.util.Collection;

import org.springframework.web.multipart.MultipartFile;

public class UploadItem {
 private String fileName;
 
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	private MultipartFile fileData;


	public MultipartFile getFileData() {
		return fileData;
	}
	public void setFileData(MultipartFile fileData) {
		this.fileData = fileData;
	}
	

}
