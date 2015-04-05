package com.utiltube.entities.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utiltube.entities.model.Entity;

@RestController
public class EntityController {

    @RequestMapping("/entities")
    public Entity index() {
        Entity entity = new Entity();
        entity.setName("Susan Cain");
        return entity;
    }
}
