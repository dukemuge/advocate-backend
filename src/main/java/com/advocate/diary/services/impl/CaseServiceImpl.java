package com.advocate.diary.services.impl;

import com.advocate.diary.dtos.CaseDto;
import com.advocate.diary.exceptions.ResourceNotFoundException;
import com.advocate.diary.models.Case;
import com.advocate.diary.models.Lawyer;
import com.advocate.diary.models.LegalService;
import com.advocate.diary.repositories.CaseRepository;
import com.advocate.diary.services.CaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CaseRepository  caseRepository;

    @Override
    public CaseDto createCase(CaseDto caseDto) {
        Case caseName = this.modelMapper.map(caseDto,Case.class);
        Case addedCase = this.caseRepository.save(caseName);
        return this.modelMapper.map(addedCase,CaseDto.class);
    }

    @Override
    public CaseDto updateCase(CaseDto caseDto, Long caseId) {
        Case cat = this.caseRepository.findById(caseId)
                .orElseThrow(() -> new ResourceNotFoundException("case ", "Case Id", caseId));
        cat.setCategoryTitle(categoryDto.getCategoryTitle());
        cat.setCategoryDescription(categoryDto.getCategoryDescription());




        return null;
    }

    @Override
    public void deleteCase(Long caseId) {
        Case cat = this.caseRepository.findById(caseId)
                .orElseThrow(() -> new ResourceNotFoundException("case ", "Case Id", caseId));
        this.caseRepository.delete(cat);

    }

    @Override
    public CaseDto getCase(Long caseId) {
        Case cat = this.caseRepository.findById(caseId)
                .orElseThrow(() -> new ResourceNotFoundException("case ", "Case Id", caseId));
        return this.modelMapper.map(cat,CaseDto.class);
    }

    @Override
    public List<CaseDto> getCases() {

        List<Case> cases = this.caseRepository.findAll();
        List<CaseDto> caseDtos = cases.stream().map((cat) -> this.modelMapper.map(cat, CaseDto.class))
                .collect(Collectors.toList());
        return caseDtos;
    }




}
