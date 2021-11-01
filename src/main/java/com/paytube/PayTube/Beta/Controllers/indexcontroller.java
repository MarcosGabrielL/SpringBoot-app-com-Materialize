/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytube.PayTube.Beta.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Marcos
 */
@Controller
public class indexcontroller {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
