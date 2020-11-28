import java.util.*;
class SentenceStructure{
    String[] SenStruct; // I 0 1
    int nounCatIndex;
    int verbCatIndex;
    
    public SentenceStructure(int noun, int verb, String sentence)
    {
        nounCatIndex = noun;
        verbCatIndex = verb;
        SenStruct = sentence.split("_");
    }
        
    public String submit(NVCC nvcc)
    {
        //String[] A= new String[SenStruct.length];
        
        /*for(int i=0;i<SenStruct.length;i++){
            A[i]=SenStruct[i];
        }*/
        
        Random r = new Random();
        
        for(int i=0;i<SenStruct.length;i++){
            
            SenStruct[i].trim();
            if(SenStruct[i].equals("0")){
               SenStruct[i] = nvcc.nv.noun.word; 
            }
                
            else if(SenStruct[i].equals("1")){
                SenStruct[i]=nvcc.nv.verb.word;
            }
                
            else if(SenStruct[i].equals("2")){
                Noun N= nvcc.nc.nouns.get(r.nextInt(nvcc.nc.nouns.size()));
                SenStruct[i]=N.getWord();
            }
            else if(SenStruct[i].equals("3")){
                Verb V= nvcc.vc.verbs.get(r.nextInt(nvcc.vc.verbs.size()));
                SenStruct[i]=V.getWord();
            }
                
        }
        
        String ans="";
        
        for(int i=0;i<SenStruct.length;i++){
            ans=ans+" "+SenStruct[i];
        }
        
        ans=ans+".";
        
        return ans.trim();   
        
    }
}