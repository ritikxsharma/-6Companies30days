class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
    	Node start = head;
		Node temp = head;
  		while(start != null)
		{	
			start = temp;
			for(int i = 0 ; i < M-1 && start != null; i++)
				start = start.next;

			if(start == null)
				return ;

			temp = start;
			for(int i = 0 ; i < N+1 && temp != null ; i++)
				temp = temp.next;
			
			start.next = temp;

		}
    }
}
