public interface VoteState{
	/**
	*处理状态对应的行为
	* @param user 投票人
	* @param voteItem 投票项
	* @param voteManager 投票上下文，用于回调数据
	*
	*/
	public void vote(String user,String voteItem,VoteManager voteManager);
}