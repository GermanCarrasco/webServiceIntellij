package com.ws.manga.Mangas.service;

import com.ws.manga.Mangas.model.Manga;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMangaService {

    List<Manga> findAllManga();
}
