package member2;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		Member[] members = new Member[5];
		count =0;
	}
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}


	@Override
	public Member[] searchName(String name) {
		Member[] search = null;
		int searchcount = count(name);
		if(searchcount!=0) {
			for(int i=0;i<count;i++) {
				int j=0;
				if(name.equals(members[i].getName())) {
					search[j]=members[i];
					j++;
					if(searchcount==j) {
						break;
					}
							
				}
			}
		}
	
		return search;
	}


	@Override
	public Member[] searchGender(String gender) {
		Member[] genderCheck = null;
		int searchcount = count(gender);
		if(gender.equals("남성")) {
			for(int i=0;i<count;i++) {
				char a = '0';
				int j =0;
				a = members[i].getSsn().charAt(7);
				if(a==1||a==3) {
					genderCheck[j] = members[i];
					j++;
					if(searchcount==j) {
						break;
					}
				}
			}
			
		} else if(gender.equals("여성")) {
			for(int i=0;i<count;i++) {
				char a = '0';
				int j =0;
				a = members[i].getSsn().charAt(7);
				if(a==2||a==4) {
					genderCheck[j] = members[i];
					j++;
					if(searchcount==j) {
						break;
					}
				}
			}
			
		}else {
			for(int i=0;i<count;i++) {
				char a = '0';
				int j =0;
				a = members[i].getSsn().charAt(7);
				if(a==5||a==6) {
					genderCheck[j] = members[i];
					j++;
					if(searchcount==j) {
						break;
					}
				}
			}
			
		}
		
		return genderCheck;
	}


	@Override
	public Member detail(String userId) {
		Member detail = null;
		for(int i=0;i<count;i++) {
			if(userId.equals(members[i].getUserid())) {
				detail = new Member();
				detail = members[i];
				break;
			}
		}
		return detail;
	}


	@Override
	public int count() {
		return count;
	}


	@Override
	public int count(String name) {
		int nameCount=0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				nameCount++;
			}
		}
		
		return nameCount;
	}
	
	@Override
	public Member login(Member member) {
		Member log = null;
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassward().equals(members[i].getPassward())) {
				log = new Member();
				log = members[i];
				break;
			}
			
		}
		return log;
		
	}

	@Override
	public void update(Member member) {
		Member update = null;
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())){
				members[i].setPassward(member.getPassward());
				break;
				}
			}
	}


	@Override
	public void delete(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassward().equals(members[i].getPassward())) {
				members[i]=members[count-1];
				members[count-1] = null;
				count--;
			}
		}
	}
	
}