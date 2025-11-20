package com.oguzhan.mntapp.repository;

import com.oguzhan.mntapp.entity.NoteVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteVersionRepository extends JpaRepository<NoteVersion, Long> {
    List<NoteVersion> findAllByNoteIdOrderByVersionTimestampDesc(Long noteId);
}
