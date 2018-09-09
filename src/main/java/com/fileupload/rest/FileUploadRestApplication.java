package com.fileupload.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.fileupload.rest.model.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileUploadRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadRestApplication.class, args);
	}
}
