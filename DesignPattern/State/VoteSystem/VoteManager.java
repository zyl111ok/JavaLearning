import java.util.*;

public class VoteManager{
	
	private VoteState state=null;

	private Map<String,String> mapVote=new HashMap<String,String>();

	private Map<String, Integer> mapVoteCount=new HashMap<String,Integer>();

	public Map<String,String> getMapVote(){
		return mapVote;
	}

	/**
	* ͶƱ
	* @param user ͶƱ��
	* @param voteItem ͶƱ��ѡ��
	*/
	public void vote(String user,String voteItem){
		//�Ӽ�¼��ȡ�����û��Ѿ�ͶƱ�Ĵ���
		Integer oldVoteCount=mapVoteCount.get(user);

		if(oldVoteCount ==null){
			oldVoteCount=0;
		}
		//ͶƱ������һ
		oldVoteCount +=1;
		mapVoteCount.put(user,oldVoteCount);

		//�ж��û���ͶƱ״̬
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