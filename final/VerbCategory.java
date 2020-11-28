import java.util.*; 

class VerbCategory
{
	public ArrayList<Verb> verbs;
	public ArrayList<SentenceStructure> relatedSS;
	public int relevance;
    public int nouncategory;
     
    public VerbCategory(int ncategory)
    {
        verbs=new ArrayList<Verb>();
        relatedSS=new ArrayList<SentenceStructure>();
        nouncategory=ncategory;
    }
    
     public VerbCategory(int ncategory, String verb1, String verb2, String verb3,int rele)
    {
        verbs=new ArrayList<Verb>();
        verbs.add(new Verb(verb1));
        verbs.add(new Verb(verb2));
        verbs.add(new Verb(verb3));
        relatedSS=new ArrayList<SentenceStructure>();
        nouncategory=ncategory;
        relevance=rele;
    }

	public String answer(NVCC nvc)
	{
		Random r = new Random ();
		SentenceStructure ss = relatedSS.get(r.nextInt(relatedSS.size()));       
        return ss.submit(nvc);
	}
    
    public boolean search(int size, Word what)
    {
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(verbs.get(i).word.equals(what.word)) 
            {
                flag=true;
                break;
            }
        }
        return flag;  
    }
    
}
