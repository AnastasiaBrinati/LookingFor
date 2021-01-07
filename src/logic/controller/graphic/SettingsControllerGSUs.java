package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.ProfileBean;
import logic.controller.SettingsBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;


public class SettingsControllerGSUs {
	
	private static SettingsUISUs view;
	private static SettingsControllerGSUs instance = null;
	
	private SettingsControllerGSUs(SettingsUISUs settingsview) {
		view = settingsview;
	}
	
	public synchronized static SettingsControllerGSUs getInstance(SettingsUISUs view) {
		if(instance == null) {
			instance = new SettingsControllerGSUs(view);
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
		ProfileBean profileBean = new ProfileBean();
		ProfileBean.setCredentials(profileBean);
		String name = profileBean.getName();
		String surname = profileBean.getSurname();
		String username = profileBean.getUsername();
		String email = profileBean.getEmail();
		view.setCredentials(name, surname, username, email);
	}
	
	private static void assegnaGestori() {
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGSUs.getInstance(homeview);
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
		
		ActionListener gestoreCancel3 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				setCredentials();
			}

		};
		view.getCancelButton3().addActionListener(gestoreCancel3);
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG loginControllerG=LoginControllerG.getInstance(loginUI);
				
			}

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreCredentials = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setNamePanelVisible();
			}

		};
		view.getCredentialsButton().addActionListener(gestoreCredentials);
		
		
		ActionListener gestoreSecurity = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setEmailPanelVisible();
			}

		};
		view.getSecurityButton().addActionListener(gestoreSecurity);
		
		ActionListener gestorePassword = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setPasswordPanelVisible();
			}

		};
		view.getPasswordButton().addActionListener(gestorePassword);
		
		ActionListener gestoreSave = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				SettingsBean settingBean = new SettingsBean();
				settingBean.setUsername(view.getUsername());
				settingBean.setName(view.getName());
				settingBean.setSurname(view.getSurname());
				//exceptions
				try {
					SettingsBean.changeUCredentialsName(settingBean);
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
				SettingsBean settingBean = new SettingsBean();
				settingBean.setEmail(view.getEmail());
				settingBean.setPassword(view.getPassword());
				
				try {
					SettingsBean.changeUCredentialsEmail(settingBean);
					System.out.println("Changing credentials");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
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
				SettingsBean settingBean = new SettingsBean();
				settingBean.setNewPassword(view.getNewPassword());
				settingBean.setPassword(view.getOldPassword());
				
				try {
					SettingsBean.changeUCredentialsPassword(settingBean);
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
