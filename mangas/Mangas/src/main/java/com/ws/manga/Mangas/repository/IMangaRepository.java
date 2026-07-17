package com.ws.manga.Mangas.repository;

import com.ws.manga.Mangas.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IMangaRepository  extends JpaRepository<Manga,Integer> {
}
