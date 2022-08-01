package com.saras.admin.repository;

import java.util.List;
import java.util.Optional;

import com.saras.admin.entity.Source;
import org.springframework.data.repository.CrudRepository;

public interface SourceRepository extends CrudRepository<Source, Long> {

	Optional<Source> getSourceByFrequency(String frequency);

	Optional<Source> getSourceByHistory(String history);

	Optional<Source> getSourceByName(String name);

	List<Source> findBySourceIdIn(List<Long> sourceIds);
}
