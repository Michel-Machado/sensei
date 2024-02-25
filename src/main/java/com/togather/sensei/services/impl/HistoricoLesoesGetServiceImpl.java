package com.togather.sensei.services.impl;

import com.togather.sensei.models.HistoricoLesoesModel;
import com.togather.sensei.repositories.HistoricoLesoesRepository;
import com.togather.sensei.services.HistoricoLesoesGetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoricoLesoesGetServiceImpl implements HistoricoLesoesGetService {
    private final HistoricoLesoesRepository historicoRepository;

    @Override
    public List<HistoricoLesoesModel> buscaHistoricoLesoes() {
        return historicoRepository.findAll();
    }
}