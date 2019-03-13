package com.stackroute.ExternalDb.service;

import com.stackroute.ExternalDb.domain.Database;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;

@Slf4j
@Service
public class APIServiceImpl implements APIservice, Serializable {

        @Autowired
        private RestTemplate restTemplate;


        @Override
        public Database getData(URI url) {
               String uri = "https://api.stackexchange.com/questions?order=desc&sort=activity&filter=default&site=stackoverflow";

//        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

////
//        Database database = restTemplate.getForObject(url, Database.class);
//                System.out.println(database);

//                ObjectMapper mapper = new ObjectMapper();
//                try {
//                        Database database1 = mapper.readValue(new URL("https://api.stackexchange.com/questions?order=desc&sort=activity&filter=default&site=stackoverflow"), Database.class);
//                        System.out.println(database1);
//
////        log.info("luck favoured");
//
////                ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
////                Gson gson = new GsonBuilder().create();
////                Database database1 = gson.fromJson(String.valueOf(responseEntity), Database.class);
////                System.out.println(database1);
//                        return database1;
//
//
//
//              }
////
//                restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
                ResponseEntity<?> database = this.restTemplate.getForEntity(uri, Database.class);
                System.out.println("fgdghjdf"+database.toString());
                return null;



//                RestTemplate restTemplate = new RestTemplate();
//                String result = restTemplate.getForObject(uri , String.class);
//                System.out.println(result);
//                return null;
        }

}




