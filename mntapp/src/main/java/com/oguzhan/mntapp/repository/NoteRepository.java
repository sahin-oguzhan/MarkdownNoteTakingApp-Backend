package com.oguzhan.mntapp.repository;

import com.oguzhan.mntapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserId(Long userId);

    List<Note> findByUserIdAndTitleContainingOrContentContaining(Long userId,
                                                                 String titleKeyword,
                                                                 String contentKeyword);

    Optional<Note> findByIdAndUserId(Long id, Long userId);
}
