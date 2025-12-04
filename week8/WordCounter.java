package week8;

import java.util.HashMap;
import java.util.Map;

public class WordCounter
{
    private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

    private void addWord(String word)
    {

        if ( wordMap.containsKey(word) )
        {

            wordMap.put(word, wordMap.get(word) + 1);
        }
        else
        {

            wordMap.put(word, 1);
        }
    }

    public void addSentence(String sentence)
    {

        for(String word : sentence.split(" "))
        {

            addWord(word);
        }
    }

    public void outputResults()
    {

        for (String word : wordMap.keySet() )
        {

            System.out.println(word + " : " + wordMap.get(word));
        }
    }
}
