package com.saras.admin.service;

import java.util.ArrayList;
import java.util.List;

import com.saras.admin.entity.Source;
import com.saras.admin.exception.AppException;
import com.saras.admin.exception.ResponseCodeEnum;
import com.saras.admin.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceService {

	@Autowired
	SourceRepository sourceRepository;

	public List<Source> getAllSource() {
		List<Source> Source = new ArrayList<Source>();
		sourceRepository.findAll().forEach(Source1 -> Source.add(Source1));
		return Source;
	}

	public Source getSourceByName(String name) {
		return sourceRepository.getSourceByName(name)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));

	}

	public Source getSourceByFrequency(String frequency) {
		return sourceRepository.getSourceByFrequency(frequency)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
	}

	public Source getSourceByHistory(String history) {
		return sourceRepository.getSourceByHistory(history)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
	}

	public void delete(long sourceid) {
		sourceRepository.deleteById(sourceid);

	}

	public Source getSourceById(long sourceId) {
		return sourceRepository.findById(sourceId)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
	}

	public void deleteSource(List<Long> ids) {
		sourceRepository.deleteAllById(ids);
	}

	public void pauseSource(long sourceId) {
		Source source = sourceRepository.findById(sourceId)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
		source.setStatus(4);
		sourceRepository.save(source);

	}

	public void pauseSources(List<Long> sourceIds) {
		List<Source> sources = sourceRepository.findBySourceIdIn(sourceIds);
		for (Source source : sources) {
			source.setStatus(4);
			sourceRepository.save(source);
		}
	}

	public void activateSource(long sourceId) {
		Source source = sourceRepository.findById(sourceId)
				.orElseThrow(() -> new AppException(ResponseCodeEnum.SOURCE_NOT_FOUND));
		source.setStatus(6);
		sourceRepository.save(source);

	}

	public void activateSources(List<Long> sourceIds) {
		List<Source> sources = sourceRepository.findBySourceIdIn(sourceIds);
		for (Source source : sources) {
			source.setStatus(6);
			sourceRepository.save(source);
		}
	}
}
