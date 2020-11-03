package ALumni;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Chat.Client;
import beanclasses.Bean;
import package1.Database;
import package1.EmailValidation;
import package1.Signin;
import beanclasses.RegBean;

public class Frontpage extends javax.swing.JFrame {

	public Frontpage() throws SQLException {
		initComponents();
		  Toolkit t=getToolkit();
	        Dimension size=t.getScreenSize();
	        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
	    
	}

	private void initComponents() {
	

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		
		profile_btn = new javax.swing.JButton();
		chat_btn = new javax.swing.JButton();
		job_btn = new javax.swing.JButton();
		search_btn = new javax.swing.JButton();
		logout_btn = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		pass_btn = new javax.swing.JButton();
		change_btn = new javax.swing.JButton();
		search = new javax.swing.JButton();
		desktop = new javax.swing.JDesktopPane();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		oldpass_txt = new javax.swing.JTextField();
		radio_alumni = new javax.swing.JRadioButton();
		radio_student = new javax.swing.JRadioButton();
		name_field = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		newpass_txt = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(23, 35, 51));
		jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jPanel1MouseDragged(evt);
			}
		});
		jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jPanel1MousePressed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(23, 35, 51));
		jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("X");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE));

		jPanel2.setBackground(new java.awt.Color(37, 115, 87));

		profile_btn.setBackground(new java.awt.Color(23, 35, 51));
		profile_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		profile_btn.setForeground(new java.awt.Color(255, 255, 255));
		profile_btn.setText("Profile");
		profile_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		profile_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					profile_btnActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		chat_btn.setBackground(new java.awt.Color(23, 35, 51));
		chat_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		chat_btn.setForeground(new java.awt.Color(255, 255, 255));
		chat_btn.setText("Group Chat");
		chat_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		chat_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					chat_btnActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		job_btn.setBackground(new java.awt.Color(23, 35, 51));
		job_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		job_btn.setForeground(new java.awt.Color(255, 255, 255));
		job_btn.setText("Post Job offers");
		job_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		job_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				job_btnActionPerformed(evt);
			}
		});

		search_btn.setBackground(new java.awt.Color(23, 35, 51));
		search_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		search_btn.setForeground(new java.awt.Color(255, 255, 255));
		search_btn.setText("Search");
		search_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		search_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				search_btnActionPerformed(evt);
			}
		});

		logout_btn.setBackground(new java.awt.Color(23, 35, 51));
		logout_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		logout_btn.setForeground(new java.awt.Color(255, 255, 255));
		logout_btn.setText("Logout");
		logout_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		logout_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logout_btnActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(240, 240, 240));
		jLabel1.setText("Alumni");

		jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(240, 240, 240));
		jLabel2.setText("DASHBOARD");

		pass_btn.setBackground(new java.awt.Color(23, 35, 51));
		pass_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		pass_btn.setForeground(new java.awt.Color(255, 255, 255));
		pass_btn.setText("Change Password");
		pass_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		pass_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					pass_btnActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(profile_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(job_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
				.addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(chat_btn, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(pass_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(60, 60, 60).addComponent(jLabel1))
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(64, 64, 64)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(60, 60, 60).addComponent(profile_btn).addGap(0, 0, 0).addComponent(chat_btn)
						.addGap(0, 0, 0).addComponent(job_btn).addGap(0, 0, 0).addComponent(search_btn).addGap(0, 0, 0)
						.addComponent(pass_btn).addGap(0, 0, 0).addComponent(logout_btn)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(44, 44, 44)));

		jLabel3.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(240, 240, 240));
		jLabel3.setText("DASHBOARD");

		desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
		desktop.setLayout(desktopLayout);
		desktopLayout.setHorizontalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout
						.createSequentialGroup().addGap(138, 138, 138).addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(141, Short.MAX_VALUE)));
		desktopLayout.setVerticalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(202, 202, 202)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(desktop)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, 0)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(desktop))));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	public void init_search() {
		res_label = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		res_label3 = new javax.swing.JLabel();
		res_label2 = new javax.swing.JLabel();

		   jLabel10.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
	        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
	        jLabel10.setText("Search Result");

	        res_label.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
	        res_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        res_label.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
Frame obj=new Frame();
	        		
	        		obj.name_field.setText(r2.getName());
	        		obj.contact_field.setText((String) r2.getPhone());
	        		obj.email_field.setText((String) r2.getEmail());
	        		obj.field_field.setText((String) r2.getField());
	        		obj.dep_field.setText((String) r2.getDep());
	        		obj.setVisible(true);
	            }

	        });

	        res_label3.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
	        res_label3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        res_label3.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                res_label3MouseClicked(evt);
	            }
	           
	        });

	        res_label2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
	        res_label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        res_label2.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	            	Frame obj=new Frame();
	        		
	        		obj.name_field.setText(r1.getName());
	        		obj.contact_field.setText((String) r1.getPhone());
	        		obj.email_field.setText((String) r1.getEmail());
	        		obj.field_field.setText((String) r1.getField());
	        		obj.dep_field.setText((String) r1.getDep());
	        		obj.setVisible(true);
	            }
	          
	        });

	        desktop.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
	        desktop.setLayer(res_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
	        desktop.setLayer(res_label3, javax.swing.JLayeredPane.DEFAULT_LAYER);
	        desktop.setLayer(res_label2, javax.swing.JLayeredPane.DEFAULT_LAYER);

	        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
	        desktop.setLayout(desktopLayout);
	        desktopLayout.setHorizontalGroup(
	            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(desktopLayout.createSequentialGroup()
	                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(desktopLayout.createSequentialGroup()
	                        .addGap(153, 153, 153)
	                        .addComponent(jLabel10))
	                    .addGroup(desktopLayout.createSequentialGroup()
	                        .addGap(53, 53, 53)
	                        .addComponent(res_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(desktopLayout.createSequentialGroup()
	                        .addGap(31, 31, 31)
	                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(res_label, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(res_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(92, Short.MAX_VALUE))
	        );
	        desktopLayout.setVerticalGroup(
	            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(desktopLayout.createSequentialGroup()
	                .addGap(53, 53, 53)
	                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(res_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(38, 38, 38)
	                .addComponent(res_label, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(res_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(39, 39, 39))
	        );

	}

	Bean r1=new Bean();
	Bean r2=new Bean();
	Bean r3=new Bean();
	
	protected void res_label3MouseClicked(MouseEvent evt) {
Frame obj=new Frame();
		
		obj.name_field.setText(r3.getName());
		obj.contact_field.setText((String) r3.getPhone());
		obj.email_field.setText((String) r3.getEmail());
		obj.field_field.setText((String) r3.getField());
		obj.dep_field.setText((String) r3.getDep());
		obj.setVisible(true);
		
	}


	public void init_profile() {
		desktop.removeAll();
		profile = new javax.swing.JLabel();
		profile1 = new javax.swing.JLabel();
		profile2 = new javax.swing.JLabel();
		profile3 = new javax.swing.JLabel();
		profile4 = new javax.swing.JLabel();
		profile5 = new javax.swing.JLabel();
		phone_txt = new javax.swing.JLabel();
		email_txt = new javax.swing.JLabel();
		job_txt = new javax.swing.JLabel();
		year_txt = new javax.swing.JLabel();
		name_txt = new javax.swing.JLabel();

		profile.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		profile.setForeground(new java.awt.Color(255, 255, 255));
		profile.setText("Phone No.");

		profile1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
		profile1.setForeground(new java.awt.Color(255, 255, 255));
		profile1.setText("MY PROFILE");

		profile2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		profile2.setForeground(new java.awt.Color(255, 255, 255));
		profile2.setText("Name");

		profile3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		profile3.setForeground(new java.awt.Color(255, 255, 255));
		profile3.setText("Email");

		profile4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		profile4.setForeground(new java.awt.Color(255, 255, 255));
		profile4.setText("Job Status");

		profile5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		profile5.setForeground(new java.awt.Color(255, 255, 255));
		profile5.setText("Year of Completion");

		phone_txt.setBackground(new java.awt.Color(255, 255, 255));
		phone_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

		email_txt.setBackground(new java.awt.Color(255, 255, 255));
		email_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

		job_txt.setBackground(new java.awt.Color(255, 255, 255));
		job_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

		year_txt.setBackground(new java.awt.Color(255, 255, 255));
		year_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

		name_txt.setBackground(new java.awt.Color(255, 255, 255));
		name_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

		desktop.setLayer(profile, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(profile1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(profile2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(profile3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(profile4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(profile5, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(phone_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(email_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(job_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(year_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(name_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
		desktop.setLayout(desktopLayout);
		desktopLayout.setHorizontalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(41, 41, 41)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(desktopLayout.createSequentialGroup()
										.addComponent(profile3, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 327,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(desktopLayout.createSequentialGroup()
										.addComponent(profile4, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(job_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 327,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(desktopLayout.createSequentialGroup().addComponent(profile5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 327,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout
										.createSequentialGroup()
										.addGroup(desktopLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(desktopLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(desktopLayout.createSequentialGroup()
														.addComponent(name_txt, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(9, 9, 9))
												.addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 327,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap())
				.addGroup(
						desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										desktopLayout.createSequentialGroup().addContainerGap(152, Short.MAX_VALUE)
												.addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 325,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(150, 150, 150))));
		desktopLayout.setVerticalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(176, 176, 176)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(phone_txt, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(desktopLayout.createSequentialGroup()
										.addComponent(profile3, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(profile4, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(desktopLayout.createSequentialGroup()
										.addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(job_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(profile5, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(desktopLayout.createSequentialGroup().addGap(42, 42, 42)
								.addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(417, Short.MAX_VALUE))));

	}

	public void init_change() {
		desktop.removeAll();
		jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Old Password");

		jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("New Password");

		change_btn.setBackground(new java.awt.Color(23, 35, 51));
		change_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		change_btn.setForeground(new java.awt.Color(255, 255, 255));
		change_btn.setText("Change");
		change_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		change_btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					change_btnActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(oldpass_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(newpass_txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(change_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
		desktop.setLayout(desktopLayout);
		desktopLayout.setHorizontalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(79, 79, 79)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel5).addComponent(oldpass_txt).addComponent(jLabel4)
								.addComponent(newpass_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
						.addContainerGap(174, Short.MAX_VALUE).addComponent(change_btn,
								javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(362, 362, 362)));
		desktopLayout.setVerticalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(123, 123, 123)
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(oldpass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(38, 38, 38)
						.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(newpass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53).addComponent(change_btn)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

	}

	int x, y, z;
	

	private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {
		int xx = evt.getXOnScreen();
		int yy = evt.getYOnScreen();
		this.setLocation(xx - x, yy - y);
	}

	private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {
		x = evt.getX();
		y = evt.getY(); // TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		System.exit(0);
	}

	private void profile_btnActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		init_profile();
		RegBean rg = new RegBean();
		rg.setEmail(Signin.email.getText().toLowerCase());
		Database db = new Database();
		db.alumni_profile(rg);
		name_txt.setText(rg.getName());
		phone_txt.setText(rg.getPhone());
		email_txt.setText(rg.getEmail());
		System.out.println(rg.getPlacement());
		if (rg.getPlacement().equalsIgnoreCase("INCAMPUS") || rg.getPlacement().equalsIgnoreCase("OFFCAMPUS")) {
			job_txt.setText("Placed at " + rg.getCompany());
		} else {
			job_txt.setText("Not Placed");
		}
		year_txt.setText(rg.getYear());
	}

	private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(new JFrame(),
				"Thanks For Logging in\n Redirecting to ALumni SignIn Screen........");
		new Signin().setVisible(true);
		dispose();
	}

	RegBean rg1 = new RegBean();

	private void change_btnActionPerformed(ActionEvent evt) throws SQLException {
		String oldpass = oldpass_txt.getText();
		String newpass = newpass_txt.getText();
		Database db = new Database();

		rg1.setEmail(Signin.email.getText());
		db.get_password(rg1);

		if (!(rg1.getPassword().equals(oldpass))) {
			JOptionPane.showMessageDialog(new JFrame(), "Password do not match");
		} else if (rg1.getPassword().equals(oldpass)) {
			rg1.setPassword(newpass);
			rg1.setEmail(Signin.email.getText());
			EmailValidation e = new EmailValidation();
			if (e.passisvalid(newpass)) {

				db.update_password(rg1);
				JOptionPane.showMessageDialog(new JFrame(), "Password changed");
				rg1.setPassword(newpass);
				oldpass_txt.setText(null);
				newpass_txt.setText(null);

			} else {
				JOptionPane.showMessageDialog(new JFrame(), "Password format not correct");
				oldpass_txt.setText("");
				newpass_txt.setText("");

			}
		}

	}

	private void chat_btnActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		RegBean rg = new RegBean();
		rg.setEmail(Signin.email.getText().toLowerCase());
		Database db = new Database();
		db.Name(rg);
new Client("Alumni_"+name_txt.getText());
new Client().setVisible(true);
this.setVisible(false);
	}

	private void job_btnActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {
		name_txt.setText(null);
		inint_search();
	
	}

	private void searchActionPerformed(ActionEvent evt) throws SQLException {
		init_search();
		
		desktop.removeAll();
	try {	Database db = new Database();
		RegBean rg = new RegBean();
		ArrayList<String[]> l = new ArrayList<>();
	
		rg.setName(name_field.getText());
		if (radio_alumni.isSelected()) {

			l = db.search_fun(rg, 1);

		} else if (radio_student.isSelected()) {
			l = db.search_fun(rg, 0);

		}
		 String [] arr1=null;
		 String arr[] = null;
		 String arr0[]=null;
		
		//System.out.println(l);
		
		  if (l.size() == 1) {
		  
		  arr0= l.get(0); res_label2.setText(arr0[0] + "   " + arr0[4]);
		  }
			
			  if(l.size()==2) { arr0= l.get(0); res_label2.setText(arr0[0] + "   " +
			  arr0[4]); arr1=l.get(1);
			  
			  res_label.setText(arr1[0]+"   "+ arr1[4]);
			  
			  } if(l.size()>2) { arr0= l.get(0); res_label2.setText(arr0[0] + "   " +
			  arr0[4]); arr1=l.get(1);
			  
			  res_label.setText(arr1[0]+"   "+ arr1[4]); arr=l.get(2);
			  
			  
			  res_label3.setText(arr[0]+"   "+ arr[4]);
			  
			  }
			  if(l.size()==0) { JOptionPane.showMessageDialog(new
			  JFrame(),"NO User Found Please try Again"); inint_search(); }
			
			  r2.setName(arr1[0]); r2.setPhone(arr1[1]); r2.setEmail(arr1[2]);
			  r2.setField(arr1[3]); r2.setDep(arr1[4]); r1.setName(arr0[0]);
			  r1.setPhone(arr0[1]); r1.setEmail(arr0[2]); r1.setField(arr0[3]);
			  r1.setDep(arr0[4]); r3.setName(arr[0]); r3.setPhone(arr[1]);
			  r3.setEmail(arr[2]); r3.setField(arr[3]); r3.setDep(arr[4]);
			 
	}
	catch(Exception e){
		
	}
		 
	}

	private void inint_search() {
		desktop.removeAll();
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_alumni);
		bg.add(radio_student);

		jLabel7.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("SEARCH BY NAME");

		search.setBackground(new java.awt.Color(23, 35, 51));
		search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		search.setForeground(new java.awt.Color(255, 255, 255));
		search.setText("Search");
		search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 115, 87), 2, true));
		search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					searchActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		radio_alumni.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
		radio_alumni.setText("Alumni Search");

		radio_student.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
		radio_student.setText("Student Search");

		jLabel8.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("SEARCH PANEL");

		desktop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(search, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(radio_alumni, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(radio_student, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(name_field, javax.swing.JLayeredPane.DEFAULT_LAYER);
		desktop.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
		desktop.setLayout(desktopLayout);
		desktopLayout.setHorizontalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup().addGap(81, 81, 81).addGroup(desktopLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 377,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 404,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(radio_alumni, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(radio_student, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
						.addContainerGap(142, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						desktopLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(260, 260, 260))
				.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(desktopLayout.createSequentialGroup().addGap(143, 143, 143)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 333,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(151, Short.MAX_VALUE))));
		desktopLayout.setVerticalGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(desktopLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(radio_alumni).addGap(18, 18, 18).addComponent(radio_student)
						.addGap(38, 38, 38).addComponent(search).addGap(106, 106, 106))
				.addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(desktopLayout.createSequentialGroup().addGap(43, 43, 43)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(438, Short.MAX_VALUE))));

	}

	private void pass_btnActionPerformed(ActionEvent evt) throws SQLException {
		init_change();
		oldpass_txt.setText(null);
		newpass_txt.setText(null);

	}

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new Frontpage().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton chat_btn;
	private javax.swing.JDesktopPane desktop;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField newpass_txt;
	private javax.swing.JTextField oldpass_txt;
	private javax.swing.JButton job_btn;
	private javax.swing.JButton logout_btn;
	private javax.swing.JButton profile_btn;

	private javax.swing.JButton search_btn;
	private javax.swing.JButton change_btn;
	private javax.swing.JButton pass_btn;
	public javax.swing.JLabel profile;
	public javax.swing.JLabel job_txt;
	public javax.swing.JLabel name_txt;
	public javax.swing.JLabel phone_txt;
	public javax.swing.JLabel email_txt;
	public javax.swing.JLabel profile1;
	public javax.swing.JLabel profile2;
	public javax.swing.JLabel profile3;
	public javax.swing.JLabel profile4;
	public javax.swing.JLabel profile5;
	private javax.swing.JRadioButton radio_alumni;
	private javax.swing.JRadioButton radio_student;
	private javax.swing.JButton search;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JTextField name_field;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel res_label;
	private javax.swing.JLabel res_label2;
	private javax.swing.JLabel res_label3;
	public javax.swing.JLabel year_txt;
	// End of variables declaration
}
