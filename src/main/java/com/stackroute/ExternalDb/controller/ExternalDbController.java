package com.stackroute.ExternalDb.controller;

import com.stackroute.ExternalDb.domain.Database;
import com.stackroute.ExternalDb.service.APIservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URL;


@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class ExternalDbController {

    private APIservice apiService;

    @Autowired
    public ExternalDbController(APIservice apiService) {
        this.apiService = apiService;
    }



    @GetMapping("data")
    public ResponseEntity<?> getAllData() {
        ResponseEntity responseEntity;
        try {
            URI url=URI.create("https://api.stackexchange.com/questions?order=desc&sort=activity&filter=default&site=stackoverflow");

            responseEntity = new ResponseEntity<Database>(apiService.getData(url), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
}







