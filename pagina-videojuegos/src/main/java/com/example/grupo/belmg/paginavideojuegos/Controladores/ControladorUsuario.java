package com.example.grupo.belmg.paginavideojuegos.Controladores;

import com.example.grupo.belmg.paginavideojuegos.Entidades.Usuario;
import com.example.grupo.belmg.paginavideojuegos.Servicios.ImplementacionServicioUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "gogames/v1/usuarios")
public class ControladorUsuario extends ImplementacionControladorBase<Usuario, ImplementacionServicioUsuario>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){

        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.find(filtro));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage()+"\"}"));
        }
    }


}
