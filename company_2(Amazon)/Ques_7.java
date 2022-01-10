class Solution
{
    public String FirstNonRepeating(String stream)
    {
        StringBuilder sb = new StringBuilder();
        int isRepeated[] = new int[26];
        Deque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < stream.length(); i++) 
        {
          char ch = stream.charAt(i);

          if (isRepeated[ch - 97] == 0)
            queue.add(ch);

          isRepeated[ch - 97]++;

          while (!queue.isEmpty() && isRepeated[queue.peek() - 97] != 1)
            queue.poll();

          sb.append(queue.isEmpty() ? '#' : queue.peek());

        }
        return  sb.toString();
    }	
}
