package com.utiltube.entities.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.utiltube.entities.model.Entity;

@RestController
@RequestMapping(value = "/entity")
public class EntityController {

    @RequestMapping(value = "/discover/{entityName}", method = RequestMethod.GET)
    public Entity discoveerEntity(@PathVariable String entityName) {
        Entity entity = new Entity.Builder(entityName).build();
        return entity;
    }
}
