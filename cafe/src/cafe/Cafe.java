	package cafe;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.*;
	import java.util.HashMap;
	import java.util.Map;
	import com.google.zxing.BarcodeFormat;
	import com.google.zxing.EncodeHintType;
	import com.google.zxing.MultiFormatWriter; 
	import com.google.zxing.client.j2se.MatrixToImageWriter;
	import com.google.zxing.common.BitMatrix;
	import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
	import java.sql.*;
	import java.awt.image.BufferedImage;
	
	

	public class Cafe extends JFrame implements ActionListener {
		JLabel title,mname,name,mno,type,adds,res,tno;
		JTextField tname,tmno,tnof;
		JRadioButton veg,non;
		JCheckBox checkBox1;
		ButtonGroup gengp;
		JTextArea tadd;
		JButton sub,cancel,smoothie,coffee,icoffee,waff,panc,oatm,print;
	            int  f1, f2, f3, f4, f5, f6, value5, totalsmoothie, totalcoffee, totalicoffee, totalpanc, totalwaff, totaloatm, pay;
	            String value1, value3, value4, ord, p, strtbno;
	            int value2, valuetbno;
	                
	public Cafe()
	{
		setTitle("Cafe - Order Here!!");
		setBounds(100, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		title = new JLabel("Customer Order Details");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setBounds(300, 10, 500, 30);
		add(title);
		
		type = new JLabel("Order Type: ");
		type.setFont(new Font("Arial", Font.PLAIN, 20));
		type.setSize(100, 20);
		type.setBounds(300, 40, 500, 50);
		add(type);
	
		veg = new JRadioButton("Order");
		veg.setFont(new Font("Arial", Font.PLAIN, 15));
		veg.setSelected(true);
		veg.setSize(75, 20);
		veg.setBounds(450, 40, 80, 50);
		add(veg);
	
		non = new JRadioButton("Parcel");
		non.setFont(new Font("Arial", Font.PLAIN, 15));
		non.setSelected(false);
		non.setSize(80, 20);
		non.setBounds(550, 40, 150, 50);
		add(non);
		
		gengp = new ButtonGroup();
		gengp.add(veg);
		gengp.add(non);
		
		name = new JLabel("Customer name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setBounds(100, 110, 200, 30);
		add(name);
	
		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setBounds(250, 110, 200, 30);
		add(tname);
	
		mno = new JLabel("Mobile Number");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setBounds(100, 150, 200, 30);
		add(mno);
		mno.setVisible(false);
	            
	    tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setBounds(250, 150, 200, 30);
		add(tmno);
		tmno.setVisible(false);
	
		adds = new JLabel("Address");
		adds.setFont(new Font("Arial", Font.PLAIN, 20));
		adds.setSize(100, 20);
		adds.setBounds(100, 220, 100, 20);
		add(adds);
		adds.setVisible(false);
		
		tadd = new JTextArea();
	    tadd.setFont(new Font("Arial", Font.PLAIN, 15));
	    tadd.setSize(200, 75);
	    tadd.setBounds(250, 200, 230, 100);
		add(tadd);
		tadd.setVisible(false);
		
		tno = new JLabel("Table Number");
		tno.setFont(new Font("Arial", Font.PLAIN, 20));
		tno.setSize(100, 20);
		tno.setBounds(100, 150, 200, 30);
		add(tno);
	            
	    tnof = new JTextField();
		tnof.setFont(new Font("Arial", Font.PLAIN, 15));
		tnof.setSize(150, 20);
		tnof.setBounds(250, 150, 200, 30);
		add(tnof);
	
		mname = new JLabel("MENU");
		mname.setFont(new Font("Verdana", Font.PLAIN, 22));
		mname.setSize(100, 20);
		mname.setBounds(680,80,100,50);
		add(mname);
		
		mname = new JLabel("Beverages");
		mname.setFont(new Font("Arial", Font.PLAIN, 20));
		mname.setSize(100, 20);
		mname.setBounds(590,120,120,30);
		add(mname);
	            
		smoothie = new JButton("Smoothies");
		smoothie.setSize(100, 20);
		smoothie.setBounds(580, 160, 120, 30);
		smoothie.addActionListener(this);
		add(smoothie);
	
		coffee = new JButton("Coffee");
		coffee.setSize(100, 20);
		coffee.setBounds(580, 200, 120, 30);
		coffee.addActionListener(this);
		add(coffee);
	
		icoffee = new JButton("Iced Coffee");
		icoffee.setSize(100, 20);
		icoffee.setBounds(580, 240, 120, 30);
		icoffee.addActionListener(this);
		add(icoffee);
	
		JLabel l1 = new JLabel("Desserts");
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		l1.setSize(100, 20);
		l1.setBounds(750,120,120,30);
		add(l1);
	
		waff = new JButton("Waffles");
		waff.setSize(100, 20);
		waff.setBounds(730, 160, 120, 30);
		waff.addActionListener(this);
		add(waff);
	
		oatm = new JButton("Oatmeal");
		oatm.setSize(100, 20);
		oatm.setBounds(730, 200, 120, 30);
		oatm.addActionListener(this);
		add(oatm);
	
		panc = new JButton("Pancakes");
		panc.setSize(100, 20);
		panc.setBounds(730, 240, 120, 30);
		panc.addActionListener(this);
		add(panc);
	
		sub = new JButton("Submit");
		sub.setSize(100, 20);
		sub.setBounds(270, 400, 100, 50);
		sub.addActionListener(this);
		add(sub);
	
		cancel = new JButton("Cancel");
		cancel.setSize(100, 20);
		cancel.setBounds(390, 400, 100, 50);
		cancel.addActionListener(this);
		add(cancel);
	            
	    print = new JButton("Print Recipt");
		print.setSize(100, 20);
		print.setBounds(510, 400, 150, 50);
		print.addActionListener(this);
		add(print);
	
		setVisible(true);
	
		
	veg.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        tno.setVisible(true);
	        tnof.setVisible(true);
	        adds.setVisible(false);
	        tadd.setVisible(false);
	        mno.setVisible(false);
	        tmno.setVisible(false);
	    }
	});
	non.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	tno.setVisible(false);
	        tnof.setVisible(false);
	        adds.setVisible(true);
	        tadd.setVisible(true);
	        mno.setVisible(true);
	        tmno.setVisible(true);
	    }
	});
	}
	private String generateReceiptForTable(String tableNumber) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe", "root", "");

	        String query = "SELECT smoothies, coffee, icoffee, waffles, oatmeal, pancakes FROM myorder WHERE tbno = ? ORDER BY OID DESC LIMIT 1";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, tableNumber);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            int smoothies = resultSet.getInt("smoothies");
	            int coffee = resultSet.getInt("coffee");
	            int icoffee = resultSet.getInt("icoffee");
	            int waffles = resultSet.getInt("waffles");
	            int oatmeal = resultSet.getInt("oatmeal");
	            int pancakes = resultSet.getInt("pancakes");

	            StringBuilder receipt = new StringBuilder("*******************************************************************************");
	            receipt.append("\r\n"
	            		+ "                                               SIEScafe CATERING\n");
	            receipt.append("*******************************************************************************\n");
	            receipt.append("                                                  Table Number: ").append(tableNumber).append("\n");
	            receipt.append("*******************************************************************************\n");
	            receipt.append("Item\t\tQty\tRate\tAmount\n");

	            int rateSmoothies = 15;
	            int rateCoffee = 20;
	            int rateIcedCoffee = 35;
	            int rateWaffles = 70;
	            int rateOatmeal = 85;
	            int ratePancakes = 40;

	            int totalSmoothies = smoothies * rateSmoothies;
	            int totalCoffee = coffee * rateCoffee;
	            int totalIcedCoffee = icoffee * rateIcedCoffee;
	            int totalWaffles = waffles * rateWaffles;
	            int totalOatmeal = oatmeal * rateOatmeal;
	            int totalPancakes = pancakes * ratePancakes;

	            if (smoothies > 0) {
	                receipt.append("Smoothies\t\t").append(smoothies).append("\t").append(rateSmoothies).append("\t").append(totalSmoothies).append("\n");
	            }
	            if (coffee > 0) {
	                receipt.append("Coffee\t\t").append(coffee).append("\t").append(rateCoffee).append("\t").append(totalCoffee).append("\n");
	            }
	            if (icoffee > 0) {
	                receipt.append("Iced Coffee\t\t").append(icoffee).append("\t").append(rateIcedCoffee).append("\t").append(totalIcedCoffee).append("\n");
	            }
	            if (waffles > 0) {
	                receipt.append("Waffles\t\t").append(waffles).append("\t").append(rateWaffles).append("\t").append(totalWaffles).append("\n");
	            }
	            if (oatmeal > 0) {
	                receipt.append("Oatmeal\t\t").append(oatmeal).append("\t").append(rateOatmeal).append("\t").append(totalOatmeal).append("\n");
	            }
	            if (pancakes > 0) {
	                receipt.append("Pancakes\t\t").append(pancakes).append("\t").append(ratePancakes).append("\t").append(totalPancakes).append("\n");
	            }
	            int totalAmount = (smoothies * rateSmoothies) +
                        (coffee * rateCoffee) +
                        (icoffee * rateIcedCoffee) +
                        (waffles * rateWaffles) +
                        (oatmeal * rateOatmeal) +
                        (pancakes * ratePancakes);
	            receipt.append("*******************************************************************************\n");
	            receipt.append("\t\tTotal: " + totalAmount);
	            return receipt.toString();
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    } catch (ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }

	    return null;
	}
	private int calculateTotalAmountForTable(String tableNumber) {
	    int totalAmount = 0;
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe", "root", "");

	        String query = "SELECT smoothies, coffee, icoffee, waffles, oatmeal, pancakes FROM myorder WHERE tbno = ? ORDER BY OID DESC LIMIT 1";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, tableNumber);
	        ResultSet resultSet = statement.executeQuery();
	        int rateSmoothies = 15;
            int rateCoffee = 20;
            int rateIcedCoffee = 35;
            int rateWaffles = 70;
            int rateOatmeal = 85;
            int ratePancakes = 40;
            

	        if (resultSet.next()) {
	            int smoothies = resultSet.getInt("smoothies");
	            int coffee = resultSet.getInt("coffee");
	            int icoffee = resultSet.getInt("icoffee");
	            int waffles = resultSet.getInt("waffles");
	            int oatmeal = resultSet.getInt("oatmeal");
	            int pancakes = resultSet.getInt("pancakes");

	            totalAmount = (smoothies * rateSmoothies) +
	                         (coffee * rateCoffee) +
	                         (icoffee * rateIcedCoffee) +
	                         (waffles * rateWaffles) +
	                         (oatmeal * rateOatmeal) +
	                         (pancakes * ratePancakes);
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    } catch (ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }

	    return totalAmount;
	}
	
	private String generateGooglePayLink(int totalAmount) {
	    
	    String gPayLink = "upi://pay?pa=vedantbawkar@axl&cu=INR&pn=&am=" + totalAmount; 
	    return gPayLink;
	}
	

	public void actionPerformed(ActionEvent e)
	{       
			            
		if (e.getSource() == smoothie) {
			f1 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of Smoothie:","",JOptionPane.PLAIN_MESSAGE));
	             totalsmoothie = f1 * 15;
		}
	            
		if (e.getSource() == coffee) {
			f2 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of Coffee:","",JOptionPane.PLAIN_MESSAGE));
	             totalcoffee = f2 * 20;}
		if (e.getSource() == icoffee) {
			f3 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of ice Coffie:","",JOptionPane.PLAIN_MESSAGE));
	             totalicoffee = f3 * 35;
		}
		if (e.getSource() == waff) {
			f4 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of Waffles:","",JOptionPane.PLAIN_MESSAGE));
		 totalwaff = f4 * 70;
		 
	            }
		if (e.getSource() == oatm) {
			f5 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of Oatmeals:","",JOptionPane.PLAIN_MESSAGE));
	            totaloatm = f5 * 85;
	            }
		if (e.getSource() == panc) {
			f6 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of pancake plates:","",JOptionPane.PLAIN_MESSAGE));
	             totalpanc = f6   * 40;
		}
	            
		if (e.getSource() == sub) {
		    String orderType;
		    if (veg.isSelected()) {
		        orderType = "Order";
		        
		        String customerName = tname.getText();
		        String tableNumber = tnof.getText();
		        
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
	
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe", "root", "");
	
		            String checkQuery = "SELECT payment FROM myorder WHERE tbno = ? ORDER BY  OID DESC LIMIT 1";
		            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
		            checkStatement.setString(1, tableNumber);
		            ResultSet resultSet = checkStatement.executeQuery();
	
		            if (resultSet.next()) {
		                String paymentStatus = resultSet.getString("payment");
		                if ("paid".equals(paymentStatus)) {
		                    String insertQuery = "INSERT INTO myorder (name, tbno, od, payment, smoothies, coffee, icoffee, waffles, oatmeal, pancakes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		                    PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
		                    insertStatement.setString(1, customerName);
		                    insertStatement.setString(2, tableNumber);
		                    insertStatement.setString(3, orderType); 
		                    insertStatement.setString(4, "unpaid"); 
		                    insertStatement.setInt(5, f1); 
		                    insertStatement.setInt(6, f2); 
		                    insertStatement.setInt(7, f3); 
		                    insertStatement.setInt(8, f4); 
		                    insertStatement.setInt(9, f5); 
		                    insertStatement.setInt(10, f6);
		                    insertStatement.executeUpdate();
		                    f1 = 0;
		                    f2 = 0;
		                    f3 = 0;
		                    f4 = 0;
		                    f5 = 0;
		                    f6 = 0;
		                }else {
		                    String updateCustomerQuery = "UPDATE myorder SET smoothies = smoothies + ?, coffee = coffee + ?, icoffee = icoffee + ?, waffles = waffles + ?, oatmeal = oatmeal + ?, pancakes = pancakes + ? WHERE tbno = ? ORDER BY OID DESC LIMIT 1";
		                    PreparedStatement updateCustomerStatement = connection.prepareStatement(updateCustomerQuery);
		                    updateCustomerStatement.setInt(1, f1); 
		                    updateCustomerStatement.setInt(2, f2); 
		                    updateCustomerStatement.setInt(3, f3); 
		                    updateCustomerStatement.setInt(4, f4); 
		                    updateCustomerStatement.setInt(5, f5); 
		                    updateCustomerStatement.setInt(6, f6); 
		                    updateCustomerStatement.setString(7, tableNumber);
		                    updateCustomerStatement.executeUpdate();
		                    f1 = 0;
		                    f2 = 0;
		                    f3 = 0;
		                    f4 = 0;
		                    f5 = 0;
		                    f6 = 0;
		                }
	
		            } else {
		                
		                String insertQuery = "INSERT INTO myorder (name, tbno, od, payment, smoothies, coffee, icoffee, waffles, oatmeal, pancakes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	                    PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
	                    insertStatement.setString(1, customerName);
	                    insertStatement.setString(2, tableNumber);
	                    insertStatement.setString(3, orderType); 
	                    insertStatement.setString(4, "unpaid"); 
	                    insertStatement.setInt(5, f1); 
	                    insertStatement.setInt(6, f2); 
	                    insertStatement.setInt(7, f3); 
	                    insertStatement.setInt(8, f4); 
	                    insertStatement.setInt(9, f5); 
	                    insertStatement.setInt(10, f6); 
	                    insertStatement.executeUpdate();
	                    f1 = 0;
	                    f2 = 0;
	                    f3 = 0;
	                    f4 = 0;
	                    f5 = 0;
	                    f6 = 0;
		            }
	
		            connection.close();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        } catch (ClassNotFoundException ex) {
		            ex.printStackTrace();
		        }
		    } else {
		        orderType = "Parcel";
	
		        String customerName = tname.getText();
		        String mobileNumber = tmno.getText();
		        String address = tadd.getText();
	
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
	
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe", "root", "");
	
		            String insertQuery = "INSERT INTO myorder (name, contact, address, od, smoothies, coffee, icoffee, waffles, oatmeal, pancakes, payment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
		            insertStatement.setString(1, customerName);
		            insertStatement.setString(2, mobileNumber);
		            insertStatement.setString(3, address);
		            insertStatement.setString(4, orderType);
		            insertStatement.setInt(5, f1); 
	                insertStatement.setInt(6, f2); 
	                insertStatement.setInt(7, f3); 
	                insertStatement.setInt(8, f4); 
	                insertStatement.setInt(9, f5); 
	                insertStatement.setInt(10, f6);
	                insertStatement.setString(11, "Paid");

	                insertStatement.executeUpdate();
	                f1 = 0;
	                f2 = 0;
	                f3 = 0;
	                f4 = 0;
	                f5 = 0;
	                f6 = 0;
	
		            connection.close();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        } catch (ClassNotFoundException ex) {
		            ex.printStackTrace();
		        }
		    }
		    tname.setText("");
		    tmno.setText("");
		    tnof.setText("");
		    tadd.setText("");
		}
		    if(e.getSource() == cancel) {
			System.exit(0);
		    }
		    if (e.getSource() == print) {
		    
		        String tableNumber = JOptionPane.showInputDialog(this, "Enter Table Number:");
		        if (tableNumber != null && !tableNumber.isEmpty()) {
		            String receipt = generateReceiptForTable(tableNumber);
		            if (receipt != null) {
		            	JOptionPane.showMessageDialog(null,new JTextArea(receipt),"",JOptionPane.PLAIN_MESSAGE);

		                JPanel paymentPanel = new JPanel();
		                JRadioButton onlinePayment = new JRadioButton("Online Payment");
		                JRadioButton offlinePayment = new JRadioButton("Offline Payment");
		                ButtonGroup paymentGroup = new ButtonGroup();
		                paymentGroup.add(onlinePayment);
		                paymentGroup.add(offlinePayment);
		                ButtonGroup paymentStatus = new ButtonGroup();
		                JRadioButton Done = new JRadioButton("Payment Successfull");
		                JRadioButton NoDone = new JRadioButton("Payment Not Successfull");
		                paymentStatus.add(Done);
		                paymentStatus.add(NoDone);
		                JPanel confirmation = new JPanel();
		                confirmation.add(Done);
		                confirmation.add(NoDone);
		                paymentPanel.add(onlinePayment);
		                paymentPanel.add(offlinePayment);

		                int paymentChoice = JOptionPane.showConfirmDialog(this, paymentPanel, "Select Payment Method",
		                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		                
		                if (paymentChoice == JOptionPane.OK_OPTION) {
		                    if (onlinePayment.isSelected()) {
		                    	int totalAmount = calculateTotalAmountForTable(tableNumber);
		                        String gPayLink = generateGooglePayLink(totalAmount);
		                        try {
		                            String qrCodeData = gPayLink;
		                            String charset = "UTF-8";
		                            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
		                            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		                            BitMatrix matrix = new MultiFormatWriter().encode(
		                                    new String(qrCodeData.getBytes(charset), charset),
		                                    BarcodeFormat.QR_CODE, 200, 200, hintMap);

		                            BufferedImage image = MatrixToImageWriter.toBufferedImage(matrix);
		                            ImageIcon qrCodeIcon = new ImageIcon(image);

		                            JOptionPane.showMessageDialog(this, qrCodeIcon, "Scan QR Code for Google Pay", JOptionPane.INFORMATION_MESSAGE);

		                            int statuschoice = JOptionPane.showConfirmDialog(this, confirmation, "Select Payment Status", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		                            if(statuschoice == JOptionPane.OK_OPTION) {
		                            	if (Done.isSelected()) {
		                            		try{ 
		                                        Class.forName("com.mysql.cj.jdbc.Driver"); 
		                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe","root","");
		                                        Statement stmt=con.createStatement();
		                                        String sql = "UPDATE myorder SET payment = 'paid' WHERE tbno = ?";
		                                        PreparedStatement preparedStatement = con.prepareStatement(sql);
		                                        preparedStatement.setString(1, tableNumber);
		                                        preparedStatement.executeUpdate();
		                                        JOptionPane.showMessageDialog(this, "Payment Completed for table number " + tableNumber, "Thank you!!", JOptionPane.INFORMATION_MESSAGE);
		            		                    
		                                        }
		                                            catch(Exception ee){ 
		                                            System.out.println("Wrong Input");
		                                        }
		                            	}
		                            }
		                        } catch (Exception e1) {
		                            e1.printStackTrace();
		                        }
		                    } else if (offlinePayment.isSelected()) {
		                        // Create radio buttons for "Payment Successful" and "Payment Not Successful"
		                        JRadioButton paymentSuccessful = new JRadioButton("Payment Successful");
		                        JRadioButton paymentNotSuccessful = new JRadioButton("Payment Not Successful");
		                        
		                        // Create a button group for the radio buttons
		                        ButtonGroup paymentStatusGroup = new ButtonGroup();
		                        paymentStatusGroup.add(paymentSuccessful);
		                        paymentStatusGroup.add(paymentNotSuccessful);

		                        // Create a panel to hold the radio buttons
		                        JPanel paymentStatusPanel = new JPanel();
		                        paymentStatusPanel.add(paymentSuccessful);
		                        paymentStatusPanel.add(paymentNotSuccessful);

		                        int paymentChoice1 = JOptionPane.showOptionDialog(
		                            this,
		                            paymentStatusPanel,
		                            "Select Payment Status",
		                            JOptionPane.OK_CANCEL_OPTION,
		                            JOptionPane.QUESTION_MESSAGE,
		                            null,
		                            null,
		                            null
		                        );

		                        if (paymentChoice1 == JOptionPane.OK_OPTION) {
		                            if (paymentSuccessful.isSelected()) {
		                                
		                                    try {
		                                        Class.forName("com.mysql.cj.jdbc.Driver");
		                                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycafe", "root", "");
		                        
		                                        String updateQuery = "UPDATE myorder SET payment = 'paid' WHERE tbno = ?";
		                                        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		                                        
		                                        preparedStatement.setString(1, tableNumber);
		                                        
		                                        int rowsUpdated = preparedStatement.executeUpdate();
		                                        
		                                        if (rowsUpdated > 0) {
		                                            JOptionPane.showMessageDialog(this, "Payment Successfull for table number " + tableNumber);
		                                        } else {
		                                            JOptionPane.showMessageDialog(this, "Payment Not Successfull for table number " + tableNumber);
		                                        }
		                        
		                                        connection.close();
		                                    } catch (SQLException e1) {
		                                        e1.printStackTrace();
		                                    } catch (ClassNotFoundException e1) {
		                                        e1.printStackTrace();
		                                    }
		                                
		                            } else if (paymentNotSuccessful.isSelected()) {
		                                // Handle the case where payment is not successful
		                                JOptionPane.showMessageDialog(this, "Payment not successful.");
		                            }
		                        }
		                    }

	                        
		                    } else {
		                        JOptionPane.showMessageDialog(this, "Payment method not selected.", "Payment Method", JOptionPane.WARNING_MESSAGE);
		                    }
		                }
		            } else {
		                JOptionPane.showMessageDialog(this, "Table not found or no items ordered for Table " + tableNumber, "Receipt", JOptionPane.WARNING_MESSAGE);
		            }
		        }
	
	
		    }
		
		public static void main(String[] args) throws Exception
		{
			Cafe f = new Cafe();
   

	    }
	}