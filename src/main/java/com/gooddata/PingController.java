package com.gooddata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nnm on 11/29/16.
 */
@RestController("/ping")
public class PingController {
    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Void> ping(@RequestHeader HttpHeaders headers) {
        log.info("Headers {}", headers);
        return ResponseEntity.ok().build();
    }
}