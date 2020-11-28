import java.util.*;

class Noun extends Word
{
	int priority;
    String plWord;

	public Noun()
	{}

	public Noun(int category, String word, String plWord, int priority)
	{
		super(category,word);
		this.plWord = plWord;
        this.priority = priority;
	}
	 public Noun(String[] info)
    {
        super(info[1]);
		category=Integer.parseInt(info[0]);
        word=info[1];
        plWord=info[2];
		priority=Integer.parseInt(info[3]);
    }
    
    public Noun(String word)
	{
		super(word);
	}

}