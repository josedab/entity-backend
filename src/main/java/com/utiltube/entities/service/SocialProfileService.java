package com.utiltube.entities.service;

import javax.annotation.Nonnull;

import com.technobitia.search.model.SocialProfile;

public interface SocialProfileService {
    SocialProfile requestSocialProfileForString(@Nonnull String profileString);
}
