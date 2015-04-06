package com.utiltube.entities.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nonnull;

import com.technobitia.search.model.SocialProfile;
import com.utiltube.entities.service.SocialProfileService;

public class SocialProfileServiceImpl implements SocialProfileService {

    @Override
    public SocialProfile requestSocialProfileForString(@Nonnull String profileString) {
        checkNotNull(profileString);
        // TODO Auto-generated method stub
        return null;
    }

}
