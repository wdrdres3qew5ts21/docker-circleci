/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.deploy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wdrdr
 */
@RestController
public class TesController {

    @GetMapping("/")
    public ResponseEntity<String> getTestMessage() {
        return new ResponseEntity("Hello World Docker !!!", HttpStatus.OK);
    }

}
