import java.util.*;

public class NVCC
{
    public NV nv;
    public NounCategory nc;
    public VerbCategory vc;
    
    public NVCC() {} 
    
    
    public NVCC(Noun n, Verb v, NounCategory cn, VerbCategory cv )
    {
        nv = new NV(n, v);
        nc=cn;
        vc=cv; 
    }
    
    public String toString()
    {
        return nv.noun.word+" "+nv.verb.word+"";
    }
}