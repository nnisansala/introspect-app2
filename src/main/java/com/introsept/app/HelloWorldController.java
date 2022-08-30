// Persistent Systems
//
// All Rights Reserved.
//
// This document or any part thereof may not, without the written
// consent of AePONA Limited, be copied, reprinted or reproduced in
// any material form including but not limited to photocopying,
// transcribing, transmitting or storing it in any medium or
// translating it into any language, in any form or by any means,
// be it electronic, mechanical, xerographic, optical,
// magnetic or otherwise.
//

package com.introsept.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/introspect/app2")
public class HelloWorldController {


    @GetMapping(value = "/hello")
    public ResponseEntity<Object> helloFromHost() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return new ResponseEntity<>("Hello app2 From " + inetAddress.getHostName() , HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (UnknownHostException e) {
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
