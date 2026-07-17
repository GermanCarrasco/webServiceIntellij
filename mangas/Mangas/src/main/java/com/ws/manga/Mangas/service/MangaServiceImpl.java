package com.ws.manga.Mangas.service;

import com.ws.manga.Mangas.model.Manga;
import com.ws.manga.Mangas.repository.IMangaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MangaServiceImpl implements IMangaService{

    @Autowired
    private IMangaRepository mangaRepository;
    @Override
    public List<Manga> findAllManga() {
        return mangaRepository.findAll();
    }
}
