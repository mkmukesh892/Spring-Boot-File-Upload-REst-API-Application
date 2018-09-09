package com.fileupload.rest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="file")
public class FileStorageProperties {
private String uploadDir;

public String getUploadDir() {
	return uploadDir;
}

public void setUploadDir(String uploadDir) {
	this.uploadDir = uploadDir;
}

public String getUploadDir1() {
	// TODO Auto-generated method stub
	return null;
}

}
