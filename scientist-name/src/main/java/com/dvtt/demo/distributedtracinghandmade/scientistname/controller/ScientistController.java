package com.dvtt.demo.distributedtracinghandmade.scientistname.controller;

import com.dvtt.demo.distributedtracinghandmade.scientistname.service.ScientistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linhtn on 1/2/2022.
 */
@RequestMapping("/api/v1/scientists")
@RestController
@AllArgsConstructor
public class ScientistController {
    private final ScientistService service;

    @GetMapping("/random")
    public String getName() {
        return service.getName();
    }
}
