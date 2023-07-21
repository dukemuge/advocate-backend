package com.advocate.diary.services;

import com.advocate.diary.dtos.CaseDto;

import java.util.List;

public interface CaseService {
    // create
    CaseDto createCase(CaseDto caseDto);

    // update
    CaseDto updateCase(CaseDto caseDto, Long caseId);

    // delete
    void deleteCase(Long caseId);

    // get
    CaseDto getCase(Long caseId);

    // get All

    List<CaseDto> getCases();
}
