import java.util.*;

public class SpiteVoteState implements VoteState{
	@Override
	public void vote(String user,String voteItem,VoteManager voteManager){
		if(voteManager.getMapVote().get(user)!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("你有恶意刷票行为，取消投票资格");
	}
}