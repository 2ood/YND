    import java.io.*;
    import java.util.*;

    class MakeTreeSet
    {
        public static void main(String[] args) 
        {
            FileInputStream wordBank = new FileInputStream("wordbank.txt");
            Set<Word> wordTree = new TreeSet<Word>();

            //System.out.println(makeWord(wordBank));

            //Word aa = makeWord(wordBank);
    
            //Word bb = makeWord(wordBank);
            //wordTree.add(aa);
            //wordTree.add(bb);

            while(wordBank.read()!=-1)
            {
                wordTree.add(makeWord(wordBank));
            }
            wordBank.close();

            System.out.println(wordTree);

            /*Iterator a = wordTree.iterator();

            while(a.hasNext())
            {
                System.out.println(a.next());
            }*/
        }

        public static Word makeWord(FileInputStream wordBank)
        {
            int category = Integer.parseInt(wordBank.read());
            String word = wordBank.read();
            int priority = Integer.parseInt(wordBank.read());
            return new Word(category, word, priority);
        }
    }