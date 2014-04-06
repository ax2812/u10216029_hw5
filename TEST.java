//package computer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.Scanner ;
public class TEST extends JFrame {
        //把該用東西叫出來
	private JPanel contentPane;
	private static JTextField textField;
	private static JButton a1 ;
	private static long num;     //結果 
	private static byte fc = 0 ; //等於鍵所判定動作類型
	private static long result;  //另一個儲存空間
	private static JButton a2;
	private static JButton a3;
	private static JButton a4;
	private static JButton a7;
	private static JButton a5;
	private static JButton a8;
	private static JButton a6;
	private static JButton a9;
	private static JButton a0;
	private static JButton eq;
	private static JButton cc;
	private static JButton ad;
	private static JButton mi;
	private static JButton bl;
	private static JButton tj;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//用Scanner 座輸入密碼 用for迴圈 if判定密碼正確
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < 1000000 ; i++ ){
		System.out.print("請輸入密碼\n");
		int ss = input.nextInt();
		if (ss == 0000){
			break;
		}
		else{
			System.out.print("密碼錯誤\n");
		}
			
		}
		
		//執行介面
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEST frame = new TEST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TEST() {
		//做出板面 按鈕
                setTitle("\u8A08\u7B97\u6A5F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		a1 = new JButton("1");
		a1.addActionListener(new Act() );	
		a1.setBounds(10, 52, 50, 52);
		contentPane.add(a1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 5, 155, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		a2 = new JButton("2");
		a2.setBounds(59, 52, 54, 52);
		contentPane.add(a2);
		a2.addActionListener(new Act() );	
		
		a3 = new JButton("3");
		a3.setBounds(111, 52, 54, 52);
		contentPane.add(a3);
		a3.addActionListener(new Act() );	
		
		a4 = new JButton("4");
		a4.setBounds(10, 103, 50, 54);
		contentPane.add(a4);
		a4.addActionListener(new Act() );	
		
		a7 = new JButton("7");
		a7.setBounds(10, 156, 50, 52);
		contentPane.add(a7);
		a7.addActionListener(new Act() );	
		
		a5 = new JButton("5");
		a5.setBounds(59, 103, 54, 54);
		contentPane.add(a5);
		a5.addActionListener(new Act() );	
		
		a8 = new JButton("8");
		a8.setBounds(59, 156, 54, 52);
		contentPane.add(a8);
		a8.addActionListener(new Act() );	
		
		a6 = new JButton("6");
		a6.setBounds(111, 103, 54, 54);
		contentPane.add(a6);
		a6.addActionListener(new Act() );	
		
		a9 = new JButton("9");
		a9.setBounds(111, 156, 54, 52);
		contentPane.add(a9);
		a9.addActionListener(new Act() );	
		
		a0 = new JButton("0");
		a0.setBounds(59, 204, 54, 52);
		contentPane.add(a0);
		a0.addActionListener(new Act() );	
		
		eq = new JButton("=");
		eq.setBounds(111, 204, 54, 52);
		contentPane.add(eq);
		eq.addActionListener(new Act() );	
		
		cc = new JButton("c");
		cc.setBounds(10, 204, 50, 52);
		contentPane.add(cc);
		cc.addActionListener(new Act() );	
		
		ad = new JButton("+");
		ad.setBounds(168, 52, 54, 52);
		contentPane.add(ad);
		ad.addActionListener(new Act() );	
		
		mi = new JButton("-");
		mi.setBounds(168, 103, 54, 54);
		contentPane.add(mi);
		mi.addActionListener(new Act() );	
		
		bl = new JButton("*");
		bl.setBounds(168, 156, 54, 52);
		contentPane.add(bl);
		bl.addActionListener(new Act() );	
		
		tj = new JButton("/");
		tj.setBounds(168, 208, 54, 48);
		contentPane.add(tj);
		tj.addActionListener(new Act() );		
		
	}

         //做出對應按鈕所作的指令
	public static class Act implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String a = null  ;
			
			JButton btn=(JButton) e.getSource(); //getSource判定按鈕
			if( btn == a1) {
				num *= 10 ;
				num += 1 ;
				a = ("" + num) ; 
				textField.setText(a); //顯示數字
			}
			if( btn == a2) {
				num *= 10 ;
				num += 2 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a3) {
				num *= 10 ;
				num += 3 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a4) {
				num *= 10 ;
				num += 4 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a5) {
				num *= 10 ;
				num += 5 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a6) {
				num *= 10 ;
				num += 6 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a7) {
				num *= 10 ;
				num += 7 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a8) {
				num *= 10 ;
				num += 8 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a9) {
				num *= 10 ;
				num += 9 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if( btn == a0) {
				num *= 10 ;
				num += 0 ;
				a = ("" + num) ; 
				textField.setText(a);
			}
			if(btn==cc){
				num = 0 ;
				fc = 0 ;
				result = 0 ;
				a = ("" + num) ; 
				textField.setText(a);
				}
			if(btn==ad){
				result = num ;
				fc = 1 ;
				num = 0;
				a = ("+");
				textField.setText(a);
			}
			if(btn==mi){
				result = num ;
				num = 0;
				fc = 2 ;
				a = ("-");
				textField.setText(a);
			}
			if(btn==bl){
				result = num ;
				num = 0;
				fc = 3 ;
				a = ("*");
				textField.setText(a);
			}
			if(btn==tj){
				result = num ;
				num = 0;
				fc = 4 ;
				a = ("/");
				textField.setText(a);
			}
			if(btn == eq){
                         //案等於劍 判定+-*/ 做出動作
				switch(fc){
				case 1:{
					result += num;
					num = result ;
					a = ("" + num) ; 
					textField.setText(a);
					break;
				}
				case 2:{
					result -= num;
					num = result ;
					a = ("" + num) ; 
					textField.setText(a);
					break;
				}
				case 3:{
					result *= num;
					num = result ;
					a = ("" + num) ; 
					textField.setText(a);
					break;
				}
				case 4:{
					result /= num;
					num = result ;
					a = ("" + num) ; 
					textField.setText(a);
					break;
				}
				
				
				
				} 
				
				
			}	
		}
		
		
	}
}
