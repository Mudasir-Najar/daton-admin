package com.saras.admin.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.saras.admin.document.LogDocument;
import com.saras.admin.service.DocumentService;

@RestController
public class LogDocumentController {

	// autowire author LogDocument
	@Autowired
	DocumentService documentservice;

	// creating a get mapping that retrieves all the logdocument details from the
	// database
	@GetMapping("/document")
	private ResponseEntity<RestApiResponse<List<LogDocument>>> getAllDocument() {
		return ResponseEntity
				.ok(RestApiResponse.<List<LogDocument>>builder().data(documentservice.getAllDocument()).build());
	}

	// creating a mapping that retrieves the detail of specific author
	@GetMapping("/document/{document-id}")
	private ResponseEntity<RestApiResponse<LogDocument>> getDocument(@PathVariable("document-id") String documentId) {
		return ResponseEntity
				.ok(RestApiResponse.<LogDocument>builder().data(documentservice.getDocumentById(documentId)).build());
	}

	@GetMapping("/document/source-id/{source-id}")
	private ResponseEntity<RestApiResponse<LogDocument>> getDocumentBySourceId(@PathVariable("source-id") long sourceId) {
		return ResponseEntity
				.ok(RestApiResponse.<LogDocument>builder().data(documentservice.getDocumentBySourceId(sourceId)).build());
	}

	@GetMapping("/document/tableName/{tableName}")
	private ResponseEntity<RestApiResponse<LogDocument>>getDocumentBytableName(@PathVariable("tableName") String tableName) {
		return ResponseEntity
				.ok(RestApiResponse.<LogDocument>builder().data(documentservice.getDocumentBytableName(tableName)).build());
	}

	@GetMapping("/document/transactionid/{transactionid}")
	private ResponseEntity<RestApiResponse<LogDocument>>getDocumentBytransactionId(@PathVariable("transactionid") long transactionId) {
		return ResponseEntity
				.ok(RestApiResponse.<LogDocument>builder().data(documentservice.getDocumentBySourceId(transactionId)).build());
	}

	@GetMapping("/document/user-id/{user-id}")
	private ResponseEntity<RestApiResponse<LogDocument>>getDocumentByuserId(@PathVariable("user-id") long userId) {
		return ResponseEntity
				.ok(RestApiResponse.<LogDocument>builder().data(documentservice.getDocumentByuserId(userId)).build());
	}

}
