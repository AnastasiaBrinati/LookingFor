package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.SettingsOrgBean;
import logic.controller.SettingsSingleUserBean;
import logic.model.OrganizationBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUIOrg;


public class SettingsControllerGOrg {

	private static SettingsUIOrg view;
	private static SettingsControllerGOrg instance = null;
	
	private SettingsControllerGOrg(SettingsUIOrg settingsview) {
		view = settingsview;
	}
	
	public synchronized static SettingsControllerGOrg getInstance(SettingsUIOrg view) {
		if(instance == null) {
			instance = new SettingsControllerGOrg(view);
			assegnaGestori();
		}
		setCredentials();
		showSettingsView();
		return instance;
	}
	
	private static void showSettingsView() {
		view.setVisible(true);
	}
	
	private static void setCredentials() {
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String name = orgBean.getName();
		String email = orgBean.getEmail();
		view.setCredentials(name, email);
	}
	
	private static void assegnaGestori() {
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG loginControllerG=LoginControllerG.getInstance(loginUI);
				
			}

		};
		
		
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGOrg.getInstance(homeview);
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		ActionListener gestoreCancel = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				setCredentials();
			}

		};
		view.getCancelButton().addActionListener(gestoreCancel);
		
		ActionListener gestoreCancel2 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				setCredentials();
			}

		};
		view.getCancelButton2().addActionListener(gestoreCancel2);
		
		
		ActionListener gestoreName = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setNamePanelVisible();
			}

		};
		view.getNameButton().addActionListener(gestoreName);
		
		
		ActionListener gestoreEmail = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setEmailPanelVisible();
			}

		};
		view.getEmailButton().addActionListener(gestoreEmail);
		
		
		
		ActionListener gestoreSave = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setName(view.getName());
				
				try {
					SettingsOrgBean.changeName(settingBean);
					System.out.println("Changing credentials");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
				
			}

		};
		view.getSaveButton().addActionListener(gestoreSave);
		
		ActionListener gestoreSave2 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setEmail(view.getEmail());
				settingBean.setPassword(view.getPassword());

				try {
					SettingsOrgBean.changeEmail(settingBean);
					System.out.println("Changing credentials");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
				
			}

		};
		view.getSaveButton2().addActionListener(gestoreSave2);
		
		ActionListener gestoreSave3 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setNewPassword(view.getNewPassword());
				settingBean.setPassword(view.getOldPassword());

				try {
					SettingsOrgBean.changeEmail(settingBean);
					System.out.println("Changing credentials");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
				
			}

		};
		view.getSaveButton3().addActionListener(gestoreSave3);
	}
}
