import java.util.*;

public class SpiteVoteState implements VoteState{
	@Override
	public void vote(String user,String voteItem,VoteManager voteManager){
		if(voteManager.getMapVote().get(user)!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");
	}
}