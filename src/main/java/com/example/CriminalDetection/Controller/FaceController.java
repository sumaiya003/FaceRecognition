package com.example.CriminalDetection.Controller;

import com.example.CriminalDetection.Service.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FaceController {

    Logger logger = LoggerFactory.getLogger(FaceController.class);

    @Autowired
    private Services services;

    @PostMapping("/uploadImage")
    public ResponseEntity<String> upload(@RequestParam ("image") MultipartFile file){

        logger.info("File name:", file.getName());
        logger.info("File size:", file.getSize());
        logger.info("File type:", file.getContentType());

        logger.info("File Uploaded");
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
