package member2;

public interface MemberService {
	public void add(Member member);
	public Member[] list();
	public Member[] searchName(String name);
	public Member[] searchGender(String gender);
	public Member detail(String userId);
	public int count();
	public int count(String name);
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
}
