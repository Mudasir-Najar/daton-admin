package com.saras.admin.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saras.admin.document.LogDocument;

//repository that extends logDocument
public interface DocumentRepository extends MongoRepository<LogDocument, String> {

	
	Optional<LogDocument> findBySourceId(long sourceId);

	Optional<LogDocument> findBytableName(String tableName);

	Optional<LogDocument> findByuserId(long userId);

}
