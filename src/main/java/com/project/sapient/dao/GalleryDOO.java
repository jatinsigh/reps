package com.project.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.sapient.entity.Gallery;
import com.project.sapient.interfaces.IGalleryDao;
import com.project.sapient.utils.DbConnect;

public class GalleryDOO implements IGalleryDao {

	@Override
	public boolean insertNewImage(Gallery images) {
		// TODO Auto-generated method stub
		String sql = "insert into Gallery values(?,?,?)";

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, images.getImageId());
			ps.setString(2, images.getImageUrl());
			ps.setInt(3, images.getUserId());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Gallery> getAllImages() {
		String sql = "Select imageId,imageUrl,userId from Gallery";
		List<Gallery> images = new ArrayList<>();

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Gallery galleryImage = new Gallery();
				galleryImage.setImageId(rs.getInt(1));
				galleryImage.setImageUrl(rs.getString(2));
				galleryImage.setUserId(rs.getInt(3));
				images.add(galleryImage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return images;
	}
}
