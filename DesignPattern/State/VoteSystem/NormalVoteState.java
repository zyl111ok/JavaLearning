import java.util.*;
public class NormalVoteState implements VoteState{
	@Override
	public void vote(String user,String voteItem,VoteManager voteManager){
		voteManager.getMapVote().put(user,voteItem);
		System.out.println("Í¶Æ±³É¹¦!");
	}

}