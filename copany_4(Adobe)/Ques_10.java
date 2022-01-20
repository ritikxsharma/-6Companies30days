class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String , Integer> hm  = new HashMap<String , Integer>();
        int count = 0 ;
	 	for(int i=0 ; i<arr.length ; i++)
	 	{
	 		int cnt = hm.getOrDefault(arr[i] , 0)+1;
	 		hm.put(arr[i] , cnt);
	 		// if(!hm.containsKey(arr[i]))
	 		// 	hm.put(arr[i] , 1 );
	 		// else
			// 	hm.put(arr[i] , hm.get(arr[i])+1);
 		}

	 	Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
	 	int max = 0;
	 	String w_name="";
	 	String [] winner = new String[2];
		while(itr.hasNext())
		{
	 		Map.Entry<String, Integer> entry = itr.next();
	 		String name = entry.getKey();
	 		int cnt = entry.getValue();
			if(max < cnt)
	 		{
	 			max = cnt;
	 			w_name = name;
	 		}

	 		else if(max==cnt)
	 		{
	 			if( name.compareTo(w_name) < 0)
	 				w_name = name;
	 		}
	 	}
	 	winner[0] = w_name;
	 	winner[1] = String.valueOf(max);
	 	return winner;
    }
}
