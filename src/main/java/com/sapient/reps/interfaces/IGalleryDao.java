package com.sapient.reps.interfaces;

import java.util.List;

import com.sapient.reps.entity.Gallery;

public interface IGalleryDao {
	public boolean insertNewImage(Gallery user);

	public List<Gallery> getAllImages();
}
