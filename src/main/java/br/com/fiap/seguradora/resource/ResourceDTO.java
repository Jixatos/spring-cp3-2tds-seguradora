package br.com.fiap.seguradora.resource;

import org.springframework.http.ResponseEntity;

public interface ResourceDTO<Request, Response> {

    //Também deve fazer o findAll() com Example

    ResponseEntity<Response> findById(Long id);

    ResponseEntity<Response> save(Request r);

}
