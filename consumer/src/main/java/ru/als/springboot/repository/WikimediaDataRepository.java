package ru.als.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.als.springboot.model.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
