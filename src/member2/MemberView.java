package member2;

	import java.awt.Container;
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class MemberView extends JFrame implements ActionListener  {
		private static final long serialVersionUID = 1L;
	    private Container container; 
	    private JLabel title,nameLabel,useridLabel,passwordLabel,
	    				ssnLabel,addrLabel; 
	    private JTextField nameText, useridText, passwordText, ssnText,
	    					addrText; 
	    private JTextArea resultText; 
	    private JButton submitButton, listButton, loginButton,detailButton,nameButton,
	    				genderButton,countButton,updateButton,deleteButton; 
	    public MemberService memberService;
	    public MemberView() {
	    	 memberService = new MemberServiceImpl();
		}
	    public void open(){ 
	    	setTitle("Swing Exercise"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        container = getContentPane(); 
	        container.setLayout(null); 
	  
	        title = new JLabel("Swing Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        container.add(title); 
	  
	        nameLabel = new JLabel("Name"); 
	        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        nameLabel.setSize(100, 20); 
	        nameLabel.setLocation(100, 100); 
	        container.add(nameLabel); 
	  
	        nameText = new JTextField(); 
	        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        nameText.setSize(190, 20); 
	        nameText.setLocation(200, 100); 
	        container.add(nameText); 
	  
	        useridLabel = new JLabel("Userid"); 
	        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        useridLabel.setSize(100, 20); 
	        useridLabel.setLocation(100, 150); 
	        container.add(useridLabel); 
	  
	        useridText = new JTextField(); 
	        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        useridText.setSize(150, 20); 
	        useridText.setLocation(200, 150); 
	        container.add(useridText); 
	  
	        passwordLabel = new JLabel("Password"); 
	        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        passwordLabel.setSize(100, 20); 
	        passwordLabel.setLocation(100, 200); 
	        container.add(passwordLabel); 
	        
	        passwordText = new JTextField(); 
	        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        passwordText.setSize(150, 20); 
	        passwordText.setLocation(200, 200); 
	        container.add(passwordText);
	  
	        ssnLabel = new JLabel("SSN"); 
	        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        ssnLabel.setSize(100, 20); 
	        ssnLabel.setLocation(100, 250); 
	        container.add(ssnLabel); 
	        
	        ssnText = new JTextField(); 
	        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        ssnText.setSize(150, 20); 
	        ssnText.setLocation(200, 250); 
	        container.add(ssnText);
	  
	        addrLabel = new JLabel("Address"); 
	        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        addrLabel.setSize(100, 20); 
	        addrLabel.setLocation(100, 300); 
	        container.add(addrLabel); 
	        
	        addrText = new JTextField(); 
	        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        addrText.setSize(150, 20); 
	        addrText.setLocation(200, 300); 
	        container.add(addrText);
	        
	  
	        submitButton = new JButton("Submit"); 
	        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        submitButton.setSize(100, 20); 
	        submitButton.setLocation(100, 450);
	        submitButton.addActionListener(this);
	        container.add(submitButton); 
	  
	        listButton = new JButton("List"); 
	        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        listButton.setSize(100, 20); 
	        listButton.setLocation(300, 450);
	        listButton.addActionListener(this);
	        container.add(listButton); 
	        
	        loginButton = new JButton("login"); 
	        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        loginButton.setSize(100, 20); 
	        loginButton.setLocation(200, 450);
	        loginButton.addActionListener(this);
	        container.add(loginButton); 
	        
	        detailButton = new JButton("detail"); 
	        detailButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        detailButton.setSize(100, 20); 
	        detailButton.setLocation(100, 480);
	        detailButton.addActionListener(this);
	        container.add(detailButton); 
	        
	        nameButton = new JButton("name"); 
	        nameButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        nameButton.setSize(100, 20); 
	        nameButton.setLocation(200, 480);
	        nameButton.addActionListener(this);
	        container.add(nameButton); 
	        
	        genderButton = new JButton("gender"); 
	        genderButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        genderButton.setSize(100, 20); 
	        genderButton.setLocation(300, 480);
	        genderButton.addActionListener(this);
	        container.add(genderButton); 
	        
	        countButton = new JButton("count"); 
	        countButton.setFont(new Font("Arial", Font.PLAIN, 15)); //,countButton,updateButton,deleteButton;
	        countButton.setSize(100, 20); 
	        countButton.setLocation(100, 510);
	        countButton.addActionListener(this);
	        container.add(countButton); 
	        
	        updateButton = new JButton("update"); 
	        updateButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        updateButton.setSize(100, 20); 
	        updateButton.setLocation(200, 510);
	        updateButton.addActionListener(this);
	        container.add(updateButton); 
	        
	        deleteButton = new JButton("delete"); 
	        deleteButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        deleteButton.setSize(100, 20); 
	        deleteButton.setLocation(300, 510);
	        deleteButton.addActionListener(this);
	        container.add(deleteButton); 
	        
	        resultText = new JTextArea(); 
	        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
	        resultText.setSize(300, 400); 
	        resultText.setLocation(500, 100); 
	        resultText.setLineWrap(true); 
	        resultText.setEditable(false); 
	        container.add(resultText); 
	 
	        setVisible(true); 
	    }
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==submitButton) {
				nameText.setText("홍길동,유관순,이순신,신사임당,이도");
				useridText.setText("hong,you,lee,shin,leedo");
				passwordText.setText("1,1,1,1,1");
				ssnText.setText("900101-1,960101-2,980101-1,011010-5,020606-3");
				addrText.setText("서울,서울,서울,부산,부산");
				
				String[] names = nameText.getText().split(",");
				String[] userids = nameText.getText().split(",");
				String[] passwords = nameText.getText().split(",");
				String[] ssns = nameText.getText().split(",");
				String[] addrs = nameText.getText().split(",");
				Member[] members = new Member[5];
				
				for(int i=0;i<names.length;i++) {
					members[i] = new Member();
					members[i].setName(names[i]);  // 서버에 저장
					members[i].setUserid(userids[i]);
					members[i].setPassward(passwords[i]);
					members[i].setSsn(ssns[i]);
					members[i].setAddr(addrs[i]);
					memberService.add(members[i]);
				}
				
			} else if(e.getSource()==listButton) {
				Member[] members = memberService.list();
				String result = "";
				for(int i=0;i<members.length;i++) {
					result += members[i]+"\n";
				}
				nameText.setText("");   // Text에 set을 해라 ""로ㅜ
				useridText.setText("");
				passwordText.setText("");
				ssnText.setText("");
				addrText.setText("");
				resultText.setText(result);
				
				} else if(e.getSource()==loginButton) {
					Member member = new Member();
					member.setUserid(useridText.getText());
					member.setPassward(passwordText.getText());
					Member log = memberService.login(member);
					if(log!=null) {
						resultText.setText(log.toString());
					} else {
						resultText.setText("로그인실패");
					}
				} else if(e.getSource()==detailButton) {
					Member member = new Member();
					Member detail = memberService.detail(useridText.getText());
					
					
				} else if(e.getSource()==genderButton) {
					
						
					Member[] gender = memberService.searchGender(ssnText.getText());
					String genders ="";
					if(gender !=null) {
						for(int i=0;i<gender.length;i++) {
							genders += gender[i]+"\n";
						}
						resultText.setText(genders.toString());
						}
				}
			}
		}
		
	

