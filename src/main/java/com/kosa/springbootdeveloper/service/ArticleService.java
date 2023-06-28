package com.kosa.springbootdeveloper.service;

import com.kosa.springbootdeveloper.domain.Article;
import com.kosa.springbootdeveloper.dto.ArticleSaveRequestDto;
import com.kosa.springbootdeveloper.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article save(ArticleSaveRequestDto dto) {
        return articleRepository.save(dto.toEntity());
    }
}
