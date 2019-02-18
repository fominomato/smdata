/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smdata.datasetting.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author Andre
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST PARA CONSISTENCIA DE ENDEREÇO")
public class ConsistencyAddress {
 
    @ApiOperation(value="Metodo que aplica a consistencia de endereço")
    @RequestMapping(value = "/consistency/address", method = RequestMethod.POST)
    public String consistAddress() {
        return "custom";
    }
}
