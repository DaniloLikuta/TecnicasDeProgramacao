package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.source.tree.ParenthesizedTree;

public class PanelGrid extends JPanel {
	
	BufferedImage backGround;
	ImageIcon imageC;
	String javaCellimages[]  = {"C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/C_ICON.png", "C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/C#_ICON.png"
			,"C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/C++_ICON.png", "C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/python_icon.png"};

	
	
	//"C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/C_ICON.png"

	public PanelGrid() {
		
		try {
			 backGround = ImageIO.read(new File("C:/Users/xc23x/OneDrive/Projects/JavaLar2/res/FundoEspaco2.png"));
			 imageC = new ImageIcon(javaCellimages[0]);
			 	
			
			
			 
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		this.setSize(300, 300);
		this.setLayout(new GridLayout(16, 16));
		
		int col = 16;
		int row = 16;
		JPanel panelHolder[][] = new JPanel[row][col];
		setLayout(new GridLayout(row, col));
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				JButton button = new JButton();
				
				
			

			   
			    panelHolder[i][j]  = new JPanel();
			    panelHolder[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(230, 249, 170)));
			    panelHolder[i][j].setLayout(new BorderLayout());
			    panelHolder[i][j].setOpaque(false);
			    
			    if(j == 3 && i == 4) {
					button.setBorderPainted(false);
					button.setContentAreaFilled(false);
					button.setFocusPainted(true);
					button.setOpaque(false);
					button.setIcon(imageC);
					panelHolder[i][j].add(button, BorderLayout.CENTER);
					
					
				}
               
                
                add(panelHolder[i][j]);
			   
	
			}
			
		}
		this.setPreferredSize(new Dimension(300, 300));
		
		
		
			
		
		
		
		
		

		this.setVisible(true);
		
		
	}
	protected void paintComponent( Graphics g) {
		super.paintComponents(g);
		g.drawImage(backGround, 0, 0, getWidth(), getHeight(), this);
		
		
	}
	public void atualize() {
		
		
		repaint();
	}
}
	

