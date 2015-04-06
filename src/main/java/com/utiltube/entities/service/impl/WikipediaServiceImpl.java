package com.utiltube.entities.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nonnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technobitia.wikipedia.client.WikipediaClient;
import com.technobitia.wikipedia.exceptions.WikipediaException;
import com.technobitia.wikipedia.request.WikipediaRequest;
import com.utiltube.entities.service.WikipediaService;

@Service
public class WikipediaServiceImpl implements WikipediaService {
    
    @Autowired
    private WikipediaClient wikipediaClient;
    
    @Override
    public String extractSideBarInformation(@Nonnull String url) throws WikipediaException {
        checkNotNull(url);
        WikipediaRequest request = new WikipediaRequest.Builder(url)
                                                       .withRequestedType(WikipediaRequest.SIDEBAR_REQUEST_TYPE)
                                                       .build();
        String sidebarText = wikipediaClient.extractInformation(request);
        return sidebarText;
    }

}
