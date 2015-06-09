import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HitungGaji extends JFrame implements ActionListener
{
	
	JLabel lblNIPIn = new JLabel("NIP");
	JTextField txtNIPIn = new JTextField();
	JLabel lblNama = new JLabel("Nama");
	JTextField txtNamaIn = new JTextField();
	JLabel lblJabatanIn = new JLabel("Jabatan");
	String jabatan[] = {"-Pilih-","Staff","Manager","Assisten Manager"};
	JComboBox cmbJabatan = new JComboBox(jabatan);
	JLabel lblStatusIn = new JLabel("Status");
	ButtonGroup grupStatus = new ButtonGroup();
	JRadioButton rbMenikah = new JRadioButton("Menikah");
	JRadioButton rbBelumMenikah = new JRadioButton("Belum Menikah");
	JLabel lblJumlahAnak = new JLabel("Jumlah Anak");
	JTextField txtJumlahAnak = new JTextField();
	JLabel lblGajiPokok = new JLabel("Gaji Pokok");
	JLabel lblGajiPokok1 = new JLabel("");
	JLabel lblPajak = new JLabel("Pajak");
	JLabel lblPajak1 = new JLabel("");
	
	JLabel lblNIPOut = new JLabel("NIP");
	JLabel txtNIPOut = new JLabel("");
	JLabel lblNamaOut = new JLabel("NAMA");
	JLabel txtNamaOut = new JLabel("");
	JLabel lblBagian = new JLabel("BAGIAN");
	JLabel txtBagian = new JLabel("");
	JLabel lblJabatanOut = new JLabel("JABATAN");
	JLabel txtJabatanOut = new JLabel("");
	JLabel lblStatusOut = new JLabel("STATUS");
	JLabel txtStatusOut = new JLabel("");
	JLabel lblGajiKotorOut = new JLabel("GAJI KOTOR");
	JLabel txtGajiKotorOut = new JLabel("");
	JLabel lblGajiBersihOut = new JLabel("GAJI BERSIH");
	JLabel txtGajiBersihOut = new JLabel("");
	
	JButton btnOK = new JButton("OK");
	JButton btnClear = new JButton("Clear");
	JButton btnExit = new JButton("Exit");
	
	Container konten = new Container();
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	HitungGaji()
	{
		setTitle("Hitung Gaji");
		setSize(650,400);
		setLocation(d.width/2-getWidth()/2,d.height/2-getHeight()/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		konten = getContentPane();
		konten.setLayout(null);
		lblNIPIn.setBounds(10,10,70,30);
		txtNIPIn.setBounds(115,10,80,30);
		lblNama.setBounds(10,50,70,30);
		txtNamaIn.setBounds(115,50,100,30);
		lblJabatanIn.setBounds(10,90,70,30);
		cmbJabatan.setBounds(115,90,70,30);
		lblStatusIn.setBounds(10,130,70,30);
		grupStatus.add(rbMenikah);
		grupStatus.add(rbBelumMenikah);
		rbMenikah.setBounds(115,130,80,30);
		rbBelumMenikah.setBounds(200,130,200,30);
		lblJumlahAnak.setBounds(10,170,90,30);
		txtJumlahAnak.setBounds(115,170,30,30);
		lblGajiPokok.setBounds(10,200,90,30);
		lblGajiPokok1.setBounds(115,200,90,30);
		lblPajak.setBounds(10,230,90,30);
		lblPajak1.setBounds(115,230,90,30);
		
		lblNIPOut.setBounds(400,10,90,30);
		txtNIPOut.setBounds(490,10,90,30);
		lblNamaOut.setBounds(400,50,90,30);
		txtNamaOut.setBounds(490,50,90,30);
		lblBagian.setBounds(400,90,90,30);
		txtBagian.setBounds(490,90,90,30);
		lblJabatanOut.setBounds(400,130,90,30);
		txtJabatanOut.setBounds(490,130,90,30);
		lblStatusOut.setBounds(400,170,90,30);
		txtStatusOut.setBounds(490,170,90,30);
		lblGajiKotorOut.setBounds(400,200,90,30);
		txtGajiKotorOut.setBounds(490,200,90,30);
		lblGajiBersihOut.setBounds(400,230,90,30);
		txtGajiBersihOut.setBounds(490,230,90,30);
		
		btnOK.setBounds(10,300,70,30);
		btnClear.setBounds(90,300,70,30);
		btnExit.setBounds(170,300,70,30);
	
		konten.add(lblNIPIn);
		konten.add(lblNama);
		konten.add(lblJabatanIn);
		konten.add(txtNIPIn);
		konten.add(txtNamaIn);
		konten.add(cmbJabatan);
		konten.add(lblStatusIn);
		konten.add(rbMenikah);
		konten.add(rbBelumMenikah);
		konten.add(lblJumlahAnak);
		konten.add(txtJumlahAnak);
		konten.add(lblGajiPokok);
		konten.add(lblGajiPokok1);
		konten.add(lblPajak);
		konten.add(lblPajak1);
		
		konten.add(lblNIPOut);
		konten.add(txtNIPOut);
		konten.add(lblNamaOut);
		konten.add(txtNamaOut);
		konten.add(lblBagian);
		konten.add(txtBagian);
		konten.add(lblJabatanOut);
		konten.add(txtJabatanOut);
		konten.add(lblStatusOut);
		konten.add(txtStatusOut);
		konten.add(lblGajiKotorOut);
		konten.add(txtGajiKotorOut);
		konten.add(lblGajiBersihOut);
		konten.add(txtGajiBersihOut);
		
		konten.add(btnOK);
		konten.add(btnClear);
		konten.add(btnExit);
		btnOK.addActionListener(this);
		btnClear.addActionListener(this);
		btnExit.addActionListener(this);
		rbMenikah.addActionListener(this);
		rbBelumMenikah.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnOK){
			try{
				int anak = 0;
				long gaji = 0;
				txtNIPOut.setText(txtNIPIn.getText());
				txtNamaOut.setText(txtNamaIn.getText());
				
				if(txtNIPIn.getText().charAt(0)=='A' || txtNIPIn.getText().charAt(0)=='a')
				{
					txtBagian.setText("Accounting");
					gaji = 2000000;
				}
				else if(txtNIPIn.getText().charAt(0)=='S' || txtNIPIn.getText().charAt(0)=='s')
				{
					txtBagian.setText("Security");
					gaji = 1750000;
				}
				else if(txtNIPIn.getText().charAt(0)=='G' || txtNIPIn.getText().charAt(0)=='g')
				{
					txtBagian.setText("General");
					gaji = 1500000;
				}
				else{
					txtBagian.setText("-");
				}
				long tunjanganstatus = 0;
				
				if(rbMenikah.isSelected())
				{
					anak = Integer.parseInt(txtJumlahAnak.getText());
					tunjanganstatus = 1000000;
					txtStatusOut.setText("Menikah");
				}
				
				if(rbBelumMenikah.isSelected())
				{
					anak = 0;
					tunjanganstatus = 500000;
					txtStatusOut.setText("Belum Menikah");
				}
				long tunjangananak = 0;
				
				if(anak<=3)
				{
					tunjangananak = anak * 200000;
				}
				else if(anak>=4)
				{
					tunjangananak = 1000000;
				}
				
				String posisi = cmbJabatan.getSelectedItem().toString();
				long tunjangan = 0;
				txtJabatanOut.setText(posisi);
				if(posisi == "Staff"){
					tunjangan = 1000000;
				}
				else if(posisi == "Ass Manajer")
				{
					tunjangan = 2000000;
				}
				else if(posisi == "Manajer")
				{
					tunjangan = 3000000;
				}
				else
				{
					tunjangan = 0;
				}
				long gajikotor = 0;
				gajikotor = gaji + tunjangan + tunjanganstatus + tunjangananak;
				long pajak = 0;
				
				if(gajikotor>=6000000)
				{
					pajak = gajikotor * 12 / 100;
				}
				else if(gajikotor>=4000000)
				{
					pajak = gajikotor * 8 / 100;
				}
				else if(gajikotor<4000000)
				{
					pajak = gajikotor * 4 / 100;
				}
				
				long gajibersih = 0;
				gajibersih = gajikotor - pajak;
				lblGajiPokok1.setText(String.valueOf(gaji));
				lblPajak1.setText(String.valueOf(pajak));
				txtGajiKotorOut.setText(String.valueOf(gajikotor));
				txtGajiBersihOut.setText(String.valueOf(gajibersih));
			}
			catch(Exception ee){
			}
		}
		if(e.getSource()==rbMenikah){
			txtJumlahAnak.enable();
		}
		if(e.getSource()==rbBelumMenikah){
			txtJumlahAnak.disable();
		}
		if(e.getSource()==btnClear){
			txtJumlahAnak.enable();
			txtNIPIn.setText("");
			txtNamaIn.setText("");
			txtJumlahAnak.setText("");
			lblGajiPokok1.setText("");
			lblPajak1.setText("");
			lblNIPOut.setText("");
			lblNamaOut.setText("");
			lblBagian.setText("");
			lblJabatanOut.setText("");
			lblStatusOut.setText("");
			lblGajiKotorOut.setText("");
			lblGajiBersihOut.setText("");
			cmbJabatan.setSelectedIndex(0);
			grupStatus.clearSelection();
		}
		if(e.getSource()==btnExit){
			System.exit(0);
		}
	}
	public static void main(String []args)
	{
		new HitungGaji();
	}
}