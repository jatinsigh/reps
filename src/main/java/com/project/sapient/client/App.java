package com.project.sapient.client;

import com.project.sapient.dao.SocialLinksDOO;
import com.project.sapient.entity.SocialLinks;
import com.project.sapient.interfaces.ISocialLinksDAO;

public class App {

	public static void main(String[] args) {

		// UserRegister user = new UserRegister();
		/*
		 * user.setUserid(4); user.setUserName("Jatin");
		 * user.setEmailId("jat@gmail.com"); user.setPassword("hi@123");
		 */

		// IUserRegisterDAO dao = new UserRegisterDOO();
		
		// dao.insertUser(user);
	//	IUserProfileDAO dao = new UserProfileDOO();
		// String Email = "jat@gmail.com", pwd = "hi@123";
		
	// IGalleryDao dao = new GalleryDOO();
	ISocialLinksDAO dao = new SocialLinksDOO();
	for (SocialLinks u : dao.getAlLUrls()) {
			System.out.println(u);
		}
	}
}
