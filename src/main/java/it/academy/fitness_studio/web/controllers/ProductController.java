package it.academy.fitness_studio.web.controllers;


import it.academy.fitness_studio.core.dto.Pages;
import it.academy.fitness_studio.core.dto.product.ProductDTO;
import it.academy.fitness_studio.core.dto.product.ProductModel;
import it.academy.fitness_studio.core.dto.user.UserDTO;
import it.academy.fitness_studio.core.dto.user.UserModel;
import it.academy.fitness_studio.service.api.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    protected ResponseEntity<?> createProduct(@RequestBody ProductDTO product) {
        service.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    protected ResponseEntity<Pages<ProductModel>> getAll(
            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(name = "size", required = false, defaultValue = "20") Integer size) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.getPageProduct(page, size));
    }



    @RequestMapping(path = "/{uuid}/dt_update/{dt_update}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateProduct(@PathVariable("uuid") UUID uuid,
                                        @PathVariable("dt_update") Long dtUpdate,
                                        @RequestBody ProductDTO product) {
        Instant version = Instant.ofEpochMilli(dtUpdate);
        service.update(uuid, version, product);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}