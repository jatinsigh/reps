package com.project.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.sapient.entity.SocialLinks;
import com.project.sapient.interfaces.ISocialLinksDAO;
import com.project.sapient.utils.DbConnect;

public class SocialLinksDOO implements ISocialLinksDAO {

	@Override
	public boolean insertUrls(SocialLinks link) {
		// TODO Auto-generated method stub
		String sql = "insert into SocialLinks values(?,?,?,?,?)";

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, link.getLinkId());
			ps.setString(2, link.getFacebookUrl());
			ps.setString(3, link.getInstagramUrl());
			ps.setString(4, link.getTwitterUrl());
			ps.setInt(5, link.getUserId());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<SocialLinks> getAlLUrls() {
		// TODO Auto-generated method stub
		String sql = "Select linkId,facebookUrl,instagramUrl,twitterUrl,userId from Sociallinks";
		List<SocialLinks> links = new ArrayList<>();

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SocialLinks socialLink = new SocialLinks();
				socialLink.setLinkId(rs.getInt(1));
				socialLink.setFacebookUrl(rs.getString(2));
				socialLink.setInstagramUrl(rs.getString(3));
				socialLink.setTwitterUrl(rs.getString(4));
				links.add(socialLink);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return links;
	}

}
