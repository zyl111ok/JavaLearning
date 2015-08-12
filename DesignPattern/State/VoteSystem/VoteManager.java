import java.util.*;

public class VoteManager{
	
	private VoteState state=null;

	private Map<String,String> mapVote=new HashMap<String,String>();

	private Map<String, Integer> mapVoteCount=new HashMap<String,Integer>();

	public Map<String,String> getMapVote(){
		return mapVote;
	}

	/**
	* 投票
	* @param user 投票人
	* @param voteItem 投票的选项
	*/
	public void vote(String user,String voteItem){
		//从记录中取出该用户已经投票的次数
		Integer oldVoteCount=mapVoteCount.get(user);

		if(oldVoteCount ==null){
			oldVoteCount=0;
		}
		//投票次数加一
		oldVoteCount +=1;
		mapVoteCount.put(user,oldVoteCount);

		//判断用户的投票状态
		if(oldVoteCount==1){
			state=new NormalVoteState();
		}
		else if(oldVoteCount>1 && oldVoteCount<5){
			state=new RepeatVoteState();
		}
		else if(oldVoteCount>=5 && oldVoteCount<8){
			state=new SpiteVoteState();
		}
		else if(oldVoteCount>8){
			state =new BlackVoteState();
		}

		state.vote(user,voteItem,this);
	}

} 