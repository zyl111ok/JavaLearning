public interface VoteState{
	/**
	*����״̬��Ӧ����Ϊ
	* @param user ͶƱ��
	* @param voteItem ͶƱ��
	* @param voteManager ͶƱ�����ģ����ڻص�����
	*
	*/
	public void vote(String user,String voteItem,VoteManager voteManager);
}