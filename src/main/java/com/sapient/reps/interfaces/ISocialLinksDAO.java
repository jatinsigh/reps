package com.sapient.reps.interfaces;

import java.util.List;

import com.sapient.reps.entity.SocialLinks;

public interface ISocialLinksDAO {

	public boolean insertUrls(SocialLinks user);

	public List<SocialLinks> getAlLUrls();

}
