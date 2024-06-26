package com.togather.sensei.controllers.CampeonatoController;

import com.togather.sensei.DTO.campeonato.MedalhaDTO;
import com.togather.sensei.services.campeonatosService.BuscaMedalhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/campeonato")
public class BuscaMedalhaController {

    private final BuscaMedalhaService buscaMedalhaService;


    @GetMapping("/{atletaId}")
    public ResponseEntity<List<MedalhaDTO>> cadastraCampeonato(@PathVariable Long atletaId){
        List<MedalhaDTO> medalhas= buscaMedalhaService.buscaMedalhas(atletaId);
        return ResponseEntity.ok(medalhas);
    }
}
