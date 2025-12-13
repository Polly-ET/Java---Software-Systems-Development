package Weekly_Exercises.week2;

public class WordProcessor implements Counter
{

    private String text = "";


    String getText()
    {

        return text;
    }

    void setText(String text)
    {

        this.text = text;
    }

    @Override
    public int countWords(String sentence)
    {

        if ( sentence == null )	// use 'text' if null sentence given.
            sentence = text;

        // simple way to count words, may not be completely.
        return sentence.split(" ").length;
    }

    @Override
    public int countLetters(String sentence)
    {

        if ( sentence == null )	// use 'text' if null sentence given.
            sentence = text;

        int letters = 0;

        // iterate over each character in the sentence, and decide whether it is a letter or not.
        for (int i=0;i < sentence.length(); i++)
        {

            if ( Character.isLetter(sentence.charAt(i)) )
                letters++;
        }

        return letters;
    }

    @Override
    public int getLength(String sentence)
    {

        if ( sentence == null )	// use 'text' if null sentence given.
            sentence = text;

        return sentence.length();
    }

}