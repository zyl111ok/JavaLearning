import java.util.*;

public class BlackVoteState implements VoteState{
	@Override
	public void vote(String user,String voteItem,VoteManager voteManager){
		System.out.println("进入黑名单，禁止登陆！");
	}
}