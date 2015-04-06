package com.utiltube.entities.service;

import javax.annotation.Nonnull;

import com.technobitia.wikipedia.exceptions.WikipediaException;

public interface WikipediaService {
    String extractSideBarInformation(@Nonnull String url) throws WikipediaException;
}
