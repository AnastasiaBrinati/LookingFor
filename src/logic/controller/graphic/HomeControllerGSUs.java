package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import logic.controller.FilterController;
import logic.model.Sport;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.CourtUISUs;
import logic.view.desktop.EventUISUs;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;
import logic.view.desktop.UserProfileUI;

public class HomeControllerGSUs {

	private static HomeUISUs view;
	private static HomeControllerGSUs instance = null;

	private HomeControllerGSUs(HomeUISUs vista) {
		HomeControllerGSUs.view = vista;
	}

	public static synchronized  HomeControllerGSUs getInstance(HomeUISUs vista) {
		if (instance == null) {
			instance = new HomeControllerGSUs(vista);
			instance.assegnaGestori();
			setSports();
		}
		showHomepage();
		return instance;
	}

	private void assegnaGestori() {
		
		ActionListener gestoreExit = e -> {

				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
				
		};
		view.getExitButton().addActionListener(gestoreExit);
		

		
		ActionListener gestoreProfile = e -> {
			view.setVisible(false);
			UserProfileUI vista = new UserProfileUI();
			UserProfileControllerG.getInstance(vista);

		};
		view.getProfileButton().addActionListener(gestoreProfile);

		

		ActionListener gestoreSettings = e -> {
			view.setVisible(false);
			SettingsUISUs vista = new SettingsUISUs();
			SettingsControllerGSUs.getInstance(vista);

		};
		view.getSettingsButton().addActionListener(gestoreSettings);
		
		
		
		ActionListener gestoreFilters = e -> {
			
			FilterController filterController = FilterController.getInstance();
			try {
				int j=0;
				
				view.cleanHome();
				String sport = view.getSport();
				String itemType = view.getItemType();
				ArrayList<String> toDisplay = new ArrayList<String>();
				toDisplay = filterController.applyFilters(sport, itemType);
				
					for(int i=0; i<toDisplay.size()-1; i+=2){
						
						String name = toDisplay.get(i);
						String orgName = toDisplay.get(i+1);
						
					switch(itemType) {
					
					case "EVENT":
					
						view.displayElement(toDisplay.get(i), toDisplay.get(i+1),i/6, j%3).addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							EventUISUs eventUI = new EventUISUs();
							try {
							   EventSUsControllerG.getInstance(eventUI, name, orgName);
							   view.setVisible(false);
							} catch (Exception e1) {
																
							   e1.printStackTrace();
							}
						}
					
						});
						
					case "COURSE":
						
						view.displayElement(toDisplay.get(i), toDisplay.get(i+1),i/6, j%3).addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								CourseUISUs courseUI = new CourseUISUs();
								try {
								   CourseSUsControllerG.getInstance(courseUI, name, orgName);
								   view.setVisible(false);
								} catch (Exception e1) {
																	
								   e1.printStackTrace();
								}
							}
						
							});
						
					case "COURT":
							
						view.displayElement(toDisplay.get(i), toDisplay.get(i+1),i/6, j%3).addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								CourtUISUs courtUI = new CourtUISUs();
								try {
								   CourtSUsControllerG.getInstance(courtUI, name, orgName);
								   view.setVisible(false);
								} catch (Exception e1) {
																	
								   e1.printStackTrace();
								}
							}
						
							});
						
					
					}
					j++;
					
					}
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		};
		view.getFiltersButton().addActionListener(gestoreFilters);
		
		
	}
	
	private static void setSports() {
		
			ArrayList<String> sports = new ArrayList<String>();
			Sport[] listOfSports = Sport.values();
			for (Sport sport : listOfSports) {
				  sports.add(sport.toString());
			}
			
			view.setSportList(sports);

	}
	
	private static void showHomepage() {
		view.setVisible(true);
	}

}