import java.util.*;

public class Word implements Comparable<Word>
{
    public String word; 
	public int category;
    
	public Word()
	{
		this(0,"");
	}
    
    public Word(String w)
    {
        this(-1,w);
    }

	public Word(int category, String w)
	{
		this.category = category;
		this.word = w;
	}
    public String getWord()
    {
        return word;
    }
    
    public int getCategory()
    {
        return category;
    }
    

	//alphabetical sorting 
	//override
	//alphabetical sorting 
	//override
	public int compareTo(Word a) 
	{
			return word.compareTo(a.word);
	}
    
    public int compareTo(Noun a)
    {
            if(word.compareTo(a.plWord)==0 || word.compareTo(a.word)==0) return 0;
			else return word.toString().compareTo(a.word);
    }
    
    public int compareTo(Verb a)
    {
        if((word.compareTo(a.s3Word)==0)||(word.compareTo(a.pWord)==0)
				||(word.compareTo(a.presentPWord)==0)||(word.compareTo(a.pastPWord)==0)
                ||word.compareTo(a.word)==0)
				return 0;
			else return word.compareTo(a.word);
    
    }
    
    
    

	public String toString()
	{
		return word;
	}
    
     public void learnWord(Word newWord,ArrayList<TreeSet<Word>> wordTree)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("I don't know the word "+newWord.getWord()+".");
        System.out.println("Is it a noun(0), or a verb(1), or neithe(2)?");
        
        int flag= sc.nextInt();
        switch(flag)
        {
            case 0 : {this.learnWord(new Noun(newWord.word),wordTree); break;}
            case 1 : {this.learnWord(new Verb(newWord.word),wordTree); break;}
			case 2 : {System.out.println("OK. I will ignore this."); break;}
            default : System.out.println("Pleas enter again");
        }
        
       // System.out.println("What is its partOfSpeech?");
        //System.out.println("noun:1, verb:2, adjective:3");
    }  
    
    public void learnWord(Noun newNoun,ArrayList<TreeSet<Word>> wordTree)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter its information by rule : ");
		System.out.println("(Category number) (singular) (plural) (priority)");

        String info=sc.nextLine();
        Noun what = new Noun(info.split(" "));
        wordTree.get(0).add(what);
        
    }
    
    public void learnWord(Verb newVerb, ArrayList<TreeSet<Word>> wordTree)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter its information by rule : ");
		System.out.println("(singular) (s3Word) (pWord) (presentPWord) (pastPWord)");

        String info=sc.nextLine();
        Verb what = new Verb(info.split(" "));
        wordTree.get(1).add(what);

    } 
    
    
}