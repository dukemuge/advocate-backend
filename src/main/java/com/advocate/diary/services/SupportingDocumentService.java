package com.advocate.diary.services;

import com.advocate.diary.dtos.SupportingDocumentDto;

import java.util.List;

public interface SupportingDocumentService {
    // create
    SupportingDocumentDto createSupportingDocument(SupportingDocumentDto supportingDocumentDto);

    // update
    SupportingDocumentDto updateSupportingDocument(SupportingDocumentDto supportingDocumentDto,
                                                   Integer supportingDocumentId);

    // delete
    void deleteSupportingDocument(Integer supportingDocumentId);

    // get
    SupportingDocumentDto getSupportingDocument(Integer supportingDocumentId);

    // get All

    List<SupportingDocumentDto> getSupportingDocument();
}
