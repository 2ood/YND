import java.util.*;
class NounCategory
{
	public ArrayList<Noun> nouns;
	public ArrayList<VerbCategory> relatedVerbs;
    
    public NounCategory()
    {
        nouns = new ArrayList<Noun>();
        relatedVerbs = new ArrayList<VerbCategory>();
    }

	public String answer(NVCC nvc)
	{
		VerbCategory V = nvc.vc;
		return V.answer(nvc);
	}

	private VerbCategory find(Word keyVerb)
	{
		//keyVerb가 있는 VerbCategory를 찾아서 리턴 
       for(VerbCategory tmp : relatedVerbs)
       {
           if (tmp.search(tmp.verbs.size(),keyVerb) )
           {
               return tmp;
           }
       }
        return null;
	}
    
    public boolean relatedTo(Word keyVerb)
    {
        return (find(keyVerb)!=null);
    }
    
   public boolean search(int size, Word what)
    { 
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(nouns.get(i).toString().equals(what.toString())) 
            {
                flag=true;
                break;
            }
        }
        return flag;  
    }
}