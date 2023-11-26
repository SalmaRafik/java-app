import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;

public class FormEtudiant {

	private JFrame frame;
	private JTextField matriculeTextField;
	private JTextField nomTextField;
	private JTextField dateTextField;
	private JComboBox villeComboBox;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private ArrayList<Etudiant> etudiantList =  new ArrayList<Etudiant>();
	private JRadioButton orPlusRadio;
	private JRadioButton orMinusRadio;
	private JRadioButton autreRadio;
	
	private JCheckBox transportCheckbox;
	private JCheckBox photocopieCheckbox;
	private JCheckBox logementCheckbox;
	private JCheckBox activiteSportiveCheckbox;
	
	private String matricule="0";
	private JButton modifierBtn;
	
    private void charger_table()
    {
    	
    	Object Data[][]=new Object[etudiantList.size()][6];
    	
    	for(int i=0;i<etudiantList.size();i++)
    	{
    		Data[i][0]=etudiantList.get(i).getMatricule();
    		Data[i][1]=etudiantList.get(i).getNom_prenom();
    		Data[i][2]=etudiantList.get(i).getDateNaissance();
    		Data[i][3]=etudiantList.get(i).getVillenatale();
    		Data[i][4]=etudiantList.get(i).getGroupesanguin();
    		Data[i][5]=etudiantList.get(i).getFraisScolarite();
    	}
    	table.setModel(new DefaultTableModel(
    			Data,
    			new String[] {
					"Matricule", "Nom & Prenom", "Date Naissance", "Ville Natale", "Groupe Sanguin", "Frais"
    			}
    		));
    }
    
    private void vider() 
	{
    	matriculeTextField.setText(null);
    	nomTextField.setText(null);
    	dateTextField.setText(null);
    	villeComboBox.setSelectedIndex(0);//aucune seléction des villes
    	orPlusRadio.setSelected(true);//déselectionner option nouriture
    	orMinusRadio.setSelected(false); //option non marié est selectionnée par défaut
    	autreRadio.setSelected(false);//déselectionner option déplacement
    	transportCheckbox.setSelected(false);
		photocopieCheckbox.setSelected(false);
		logementCheckbox.setSelected(false);
		activiteSportiveCheckbox.setSelected(false);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormEtudiant window = new FormEtudiant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormEtudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel matriculeNewLabel = new JLabel("Matricule");
		matriculeNewLabel.setForeground(new Color(255, 0, 128));
		matriculeNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		matriculeNewLabel.setBounds(39, 38, 104, 14);
		frame.getContentPane().add(matriculeNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom & Prenom");
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(39, 90, 104, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date de naissance");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 142, 104, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ville Natale");
		lblNewLabel_3.setForeground(new Color(255, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(39, 194, 104, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Groupe sanguin");
		lblNewLabel_4.setForeground(new Color(255, 0, 128));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(39, 246, 104, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Frais Scolarit\u00E9");
		lblNewLabel_5.setForeground(new Color(255, 0, 128));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(39, 298, 104, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setBounds(208, 35, 155, 20);
		frame.getContentPane().add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(208, 87, 155, 20);
		frame.getContentPane().add(nomTextField);
		nomTextField.setColumns(10);
		
		villeComboBox = new JComboBox();
		villeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Agadir", "Casablanca"}));
		villeComboBox.setBounds(208, 190, 155, 22);
		frame.getContentPane().add(villeComboBox);
		
		orPlusRadio = new JRadioButton("OR+");
		buttonGroup.add(orPlusRadio);
		orPlusRadio.setBounds(208, 242, 69, 23);
		frame.getContentPane().add(orPlusRadio);
		
		orMinusRadio = new JRadioButton("OR-");
		buttonGroup.add(orMinusRadio);
		orMinusRadio.setBounds(279, 242, 69, 23);
		frame.getContentPane().add(orMinusRadio);
		
		autreRadio = new JRadioButton("Autre");
		buttonGroup.add(autreRadio);
		autreRadio.setBounds(350, 242, 69, 23);
		frame.getContentPane().add(autreRadio);
		
		transportCheckbox = new JCheckBox("Transport");
		transportCheckbox.setBounds(208, 294, 155, 23);
		frame.getContentPane().add(transportCheckbox);
		
		photocopieCheckbox = new JCheckBox("Photocopie");
		photocopieCheckbox.setBounds(208, 320, 155, 23);
		frame.getContentPane().add(photocopieCheckbox);
		
		logementCheckbox = new JCheckBox("Logement");
		logementCheckbox.setBounds(208, 346, 155, 23);
		frame.getContentPane().add(logementCheckbox);
		
		activiteSportiveCheckbox = new JCheckBox("Activit\u00E9s Sportives");
		activiteSportiveCheckbox.setBounds(208, 372, 155, 23);
		frame.getContentPane().add(activiteSportiveCheckbox);
		
		dateTextField = new JTextField();
		dateTextField.setBounds(208, 139, 155, 20);
		frame.getContentPane().add(dateTextField);
		dateTextField.setColumns(10);
		
		JButton ajouterBtn = new JButton("Ajouter");
		ajouterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double frais=0;
				try
				{
				Etudiant etu=new Etudiant();
				
				if(matriculeTextField.getText().length()==0 && nomTextField.getText().length()==0)
				{
			         throw new Exception(); 
				}
				
				etu.setMatricule(matriculeTextField.getText());
				etu.setNom_prenom(nomTextField.getText());
				etu.setDateNaissance(dateTextField.getText());
				etu.setVillenatale(villeComboBox.getSelectedItem().toString());
				//traitement groupe sanguin
				if(orPlusRadio.isSelected()==true)
				   etu.setGroupesanguin("OR+")	;
				else if (orMinusRadio.isSelected()==true)
				   etu.setGroupesanguin("OR-")	;
				else
				   etu.setGroupesanguin("Autre")	;
			//traitement salaire
				
				if(transportCheckbox.isSelected()==true)
					{
					frais+=300;
					etu.setFraisTransport(true);
					}
				if(photocopieCheckbox.isSelected()==true)
					{
					frais+=200;
					etu.setFraisPhotocopie(true);
					}
				if(logementCheckbox.isSelected()==true)
					{
					frais+=700;
					etu.setFraisLogement(true);
					}
				if(activiteSportiveCheckbox.isSelected()==true)
					{
					frais+=200;
					etu.setFraisSport(true);
					}
				etu.setFraisScolarite(frais);
				//ajouter l'objet ch dans arraylist nlst_chauffeur
				etudiantList.add(etu);
				 vider();
				
				}catch(Exception ex) {JOptionPane.showMessageDialog(null, "Veuillez remplir toutes les informations");}
				charger_table();
			}

			
		});
		ajouterBtn.setBounds(535, 38, 89, 23);
		frame.getContentPane().add(ajouterBtn);
		
		JButton supprimerBtn = new JButton("Supprimer");
		supprimerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				try
				{
					String mat=JOptionPane.showInputDialog("Entrer le matricule de l'étudiant à supprimer: ");
					Iterator<Etudiant> it =etudiantList.iterator();
					boolean trouver=false;
					while(it.hasNext())
					{
						Etudiant etu=it.next();
						if(etu.getMatricule().equalsIgnoreCase(mat))
						{
							trouver=true;
							  if( JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer ce l'étudiant portant le matricule : "+mat,
								         "Confirmation", JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_OPTION)
						                {
							
								  etudiantList.remove(etu);
						                }
							 
														
							break;
						}
					}	
					
					if(trouver==false )
						   JOptionPane.showMessageDialog(null, "Ce Matricule "+mat+ " non enregistré dans la liste");
					
				}catch(Exception ex) {}
				
				charger_table();
				
				
			}
		});
		supprimerBtn.setBounds(535, 86, 89, 23);
		frame.getContentPane().add(supprimerBtn);
		
		JButton rechercheBtn = new JButton("Recherche");
		rechercheBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		try
		{
		 matricule=JOptionPane.showInputDialog("Entrer le matricule de l'étudiant : ");
		 etudiantList.forEach(p->{
			   if(p.getMatricule().equalsIgnoreCase(matricule))
			   {
				   matriculeTextField.setText(p.getMatricule());
				   nomTextField.setText(p.getNom_prenom());
				   dateTextField.setText(p.getDateNaissance());
				   villeComboBox.setSelectedItem(p.getVillenatale());
				   
				   if(p.getGroupesanguin()=="OR+")
					   orPlusRadio.setSelected(true);
				   else if(p.getGroupesanguin()=="OR-")
					   orMinusRadio.setSelected(true);
				   else 
					   autreRadio.setSelected(true);				   
				   
			    	transportCheckbox.setSelected(p.isFraisTransport());
					photocopieCheckbox.setSelected(p.isFraisPhotocopie());
					logementCheckbox.setSelected(p.isFraisLogement());
					activiteSportiveCheckbox.setSelected(p.isFraisSport());
					
				   modifierBtn.setEnabled(true);
				   
			   }
		     })	;		
					
					
				
		}catch (Exception err) {	}
				
				
				
				
			}
		});

		rechercheBtn.setBounds(535, 138, 89, 23);
		frame.getContentPane().add(rechercheBtn);
		
		modifierBtn = new JButton("Modifier");
		modifierBtn.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
					double frais=0;
			 		try
			 		{
			 			
			 			for(Etudiant etu:etudiantList)
			 			{
			 				if(etu.getMatricule().equalsIgnoreCase(matricule)) 
			 				{
			 					etudiantList.remove(etu)	;
			 				     break;
			 				}
			 			}
			 			
			 			/********************************************/
						Etudiant etu=new Etudiant();
						
						if(matriculeTextField.getText().length()==0 && nomTextField.getText().length()==0)
						{
					         throw new Exception(); 
						}
						
						etu.setMatricule(matriculeTextField.getText());
						etu.setNom_prenom(nomTextField.getText());
						etu.setDateNaissance(dateTextField.getText());
						etu.setVillenatale(villeComboBox.getSelectedItem().toString());
						//traitement groupe sanguin
						if(orPlusRadio.isSelected()==true)
						   etu.setGroupesanguin("OR+")	;
						else if (orMinusRadio.isSelected()==true)
						   etu.setGroupesanguin("OR-")	;
						else
						   etu.setGroupesanguin("Autre")	;
					//traitement salaire
						
						if(transportCheckbox.isSelected()==true)
							{
							frais+=300;
							}
						if(photocopieCheckbox.isSelected()==true)
							{
							frais+=200;
							}
						if(logementCheckbox.isSelected()==true)
							{
							frais+=700;
							}
						if(activiteSportiveCheckbox.isSelected()==true)
							{
							frais+=200;
							}
						etu.setFraisScolarite(frais);
						//ajouter l'objet ch dans arraylist nlst_chauffeur
						etudiantList.add(etu);
						 vider();
			 			
			 			
			 			
			 			/***********************************************************/		 				 		
			 			
			 		}		 			
			 		catch(Exception ex){}
			 		
			 		charger_table();
			 		modifierBtn.setEnabled(false);
			 		vider();
			 		
			 		
			 		
			 		
			 	}
			 });

		modifierBtn.setEnabled(false);
		modifierBtn.setBounds(535, 190, 89, 23);
		frame.getContentPane().add(modifierBtn);
		
		JButton quitterBtn = new JButton("Quitter");
		quitterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	 if(JOptionPane.showConfirmDialog(null, "Voulez-vous Quitter L'application",
			        "Confirmation", JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_OPTION)
	 {
		 System.exit(0);
	 }
				
				
				
				
			}
		});

		quitterBtn.setBounds(535, 242, 89, 23);
		frame.getContentPane().add(quitterBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 421, 585, 112);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				etudiantList.toArray()
			},
			new String[] {
				"Matricule", "Nom & Prenom", "Date Naissance", "Ville Natale", "Groupe Sanguin", "Frais"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}
}
