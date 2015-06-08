import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HitungGaji extends JFrame implements ActionListener 
{
	JLabel lblNIP = new JLabel("NIP");
	JLabel lblNama = new JLabel("Nama");
	JLabel lblJabatan = new JLabel("Jabatan");
	JLabel lblStatus = new JLabel("Status");
	JLabel lblJumlahAnak = new JLabel("Jumlah Anak");
	JLabel lblGajiKotor = new JLabel("Gaji Kotor");
	JLabel lblGajiBersih = new JLabel("Gaji Bersih");
	JLabel lblHasil = new JLabel("");
	
	JTextField txtNIP = new JTextField();
	JTextField txtNama = new JTextField();
	JTextField txtJumlahAnak = new JTextField();
	JTextField txtGajiKotor = new JTextField();
	JTextField txtGajiBersih = new JTextField();
	
	//JTextArea taHasil = new JTextArea();
	
	String jabatan[] = {"---Pilih---","Manager","Asisten Manager","Staff"};
	JComboBox cmbJabatan = new JComboBox(jabatan);
	
	ButtonGroup grup1 = new ButtonGroup();
	
	JRadioButton rbMenikah = new JRadioButton("Menikah");
	JRadioButton rbBelumMenikah = new JRadioButton("Belum Menikah");
	
	JButton btnOK = new JButton("OK");
	JButton btnClear = new JButton("Clear");
	JButton btnExit = new JButton("Exit");
	
	Container konten = new Container();
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	
	HitungGaji()
	{
		setTitle("Hitung Gaji");
		setSize(600,400);
		setLocation(d.width/2-getWidth()/2,d.height/2-getHeight()/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		konten = getContentPane();
		konten.setLayout(null);
		
		lblNIP.setBounds(10,10,90,30);
		lblNama.setBounds(10,50,90,30);	
		lblJabatan.setBounds(10,90,90,30);
		lblStatus.setBounds(10,130,90,30);
		lblJumlahAnak.setBounds(10,170,90,30);
		lblGajiKotor.setBounds(10,210,90,30);
		lblGajiBersih.setBounds(10,250,90,30);
		
		txtNIP.setBounds(100,10,125,30); 
		txtNama.setBounds(100,50,125,30);
		txtJumlahAnak.setBounds(100,170,30,30);
		txtGajiKotor.setBounds(100,210,125,30);
		txtGajiBersih.setBounds(100,250,125,30);
		
		cmbJabatan.setBounds(100,90,125,30);
		
		rbMenikah.setBounds(100,130,75,30);
		rbBelumMenikah.setBounds(180,130,115,30);
				
		btnOK.setBounds(10,290,70,30);
		btnClear.setBounds(90,290,70,30);
		btnExit.setBounds(170,290,70,30);
		
		//taHasil.setBounds(300,10,325,340);
		lblHasil.setBounds(300,10,325,340);
		
		konten.add(lblNIP);
		konten.add(lblNama);
		konten.add(lblJabatan);
		konten.add(lblStatus);
		konten.add(lblJumlahAnak);
		konten.add(lblGajiKotor);
		konten.add(lblGajiBersih);
		
		konten.add(txtNIP);
		konten.add(txtNama);
		konten.add(txtJumlahAnak);
		konten.add(txtGajiKotor);
		konten.add(txtGajiBersih);
		
		konten.add(cmbJabatan);
		
		konten.add(rbMenikah);
		konten.add(rbBelumMenikah);
		
		konten.add(btnOK);
		konten.add(btnClear);
		konten.add(btnExit);
		
		grup1.add(rbMenikah);
		grup1.add(rbBelumMenikah);
		
		//konten.add(taHasil);
		konten.add(lblHasil);
		
		//taHasil.disable();
		//txtJumlahAnak.disable();
		//taHasil.disable();
		txtGajiKotor.disable();
		txtGajiBersih.disable();
		
		rbMenikah.addActionListener(this);
		rbBelumMenikah.addActionListener(this);
		
		btnOK.addActionListener(this);
		btnClear.addActionListener(this);
		btnExit.addActionListener(this);

		show();
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		
        if(e.getSource()==btnOK)
		{
			String tampil;
			String nama_bagian="";
           	int gapok;
           	
			tampil = "NIP : " + txtNIP.getText();
			
			
			tampil += "\nNama : " + txtNama.getText();
			
			tampil += "\nBagian : "+nama_bagian;
			if (txtNIP.getText()=="A")
			{
				nama_bagian = "Accounting";
				gapok = 2000000;
			}
			else if (txtNIP.getText()=="S")
			{
				nama_bagian = "Security";
				gapok = 1750000;
			}
			else if (txtNIP.getText()=="G")
			{
				nama_bagian = "General";
				gapok = 1500000;
			}
			else
			{
				gapok = 0;
			}
			tampil += "\nJabatan : " + cmbJabatan.getSelectedItem();
			tampil += "\nStatus : ";
			if (rbMenikah.isSelected())
			{
				tampil += "Menikah";
			}
			else if (rbBelumMenikah.isSelected())
			{
				tampil += "Belum Menikah";
			}
			tampil += "\nGaji Kotor : " + txtGajiKotor.getText();
			tampil += "\nGaji Bersih : " + txtGajiBersih.getText();
			//taHasil.setText(tampil);
			lblHasil.setText(tampil);
			
		}
		
		else if (e.getSource()==btnClear)
		{
			txtNIP.setText("");
			txtNama.setText("");
			txtJumlahAnak.setText("");
			txtGajiKotor.setText("");
			txtGajiBersih.setText("");
			
			//taHasil.setText("");
			lblHasil.setText("");
			cmbJabatan.setSelectedIndex(0);
			grup1.clearSelection();
		}
		
		else if (e.getSource()==btnExit)
		{
			System.exit(0);
		}	
		
	}
	
	public static void main(String []args)
	{
		new HitungGaji();
	}	
}