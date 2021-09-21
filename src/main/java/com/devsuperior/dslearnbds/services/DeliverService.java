package com.devsuperior.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        Deliver deliver = deliverRepository.getOne(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        deliverRepository.save(deliver);
    }
}
