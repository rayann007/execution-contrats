package com.leoni.execution.contrats.Repositories;

import com.leoni.execution.contrats.Models.ArchivageDocument;
import com.leoni.execution.contrats.Models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivageDocumentRepository extends JpaRepository<ArchivageDocument, Long> {
    boolean existsByDocument(Document document); // pour éviter l'archivage multiple
}
