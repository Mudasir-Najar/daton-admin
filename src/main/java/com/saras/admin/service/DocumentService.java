package com.saras.admin.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saras.admin.document.LogDocument;
import com.saras.admin.entity.User;
import com.saras.admin.exception.AppException;
import com.saras.admin.exception.ResponseCodeEnum;
import com.saras.admin.repository.DocumentRepository;

@Service
public class DocumentService {

	@Autowired
	DocumentRepository documentRepository;

	public LogDocument getDocumentById(String documentId) {
		return documentRepository.findById(documentId).get();
	}

	public List<LogDocument> getAllDocument() {
		List<LogDocument> logdocument = new ArrayList<LogDocument>();
		documentRepository.findAll().forEach(logdocument1 -> logdocument.add(logdocument1));
		return logdocument;
	}

	public LogDocument getDocumentBySourceId(long sourceId) {
		return documentRepository.findBySourceId(sourceId)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
	}

	public LogDocument getDocumentBytableName(String tableName) {
		return documentRepository.findBytableName(tableName)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.TABLE_NOT_FOUND));
	}

	public LogDocument getDocumentByuserId(long userId) {
		return documentRepository.findByuserId(userId)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.USER_NOT_FOUND));
	}
}
