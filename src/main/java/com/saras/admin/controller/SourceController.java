package com.saras.admin.controller;

import java.util.List;

import com.saras.admin.entity.Source;
import com.saras.admin.service.SourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceController {

	@Autowired
	SourceService sourceService;

	@GetMapping("/source")
	private ResponseEntity<RestApiResponse<List<Source>>> getAllSource() {
		return ResponseEntity.ok(RestApiResponse.<List<Source>>builder().data(sourceService.getAllSource()).build());
	}

	@GetMapping("/source/{source-id}")
	private ResponseEntity<RestApiResponse<Source>> getSource(@PathVariable("source-id") long sourceId) {
		return ResponseEntity.ok(RestApiResponse.<Source>builder().data(sourceService.getSourceById(sourceId)).build());
	}

	@DeleteMapping("/source/{source-id}")
	private void deleteSource(@PathVariable("source-id") long sourceId) {
		sourceService.delete(sourceId);
	}

	@DeleteMapping("/source")
	private void deleteSources(@RequestParam("ids") List<Long> ids) {
		sourceService.deleteSource(ids);
	}

	@GetMapping("/source/pause/{source-id}")
	public void pauseSource(@PathVariable("source-id") long sourceId) {
		sourceService.pauseSource(sourceId);
	}

	@GetMapping("/source/pause-all/{source-ids}")
	private void pauseAllSources(@RequestParam("source-ids") List<Long> sourceIds) {
		sourceService.pauseSources(sourceIds);
	}

	@GetMapping("/source/activate/{source-id}")
	public void activateSource(@RequestParam("source-id") long sourceId) {
		sourceService.activateSource(sourceId);
	}

	@GetMapping("/source/activate-all")
	private void activateAllSources(@RequestParam("source-ids") List<Long> sourceIds) {
		sourceService.activateSources(sourceIds);
	}
}
