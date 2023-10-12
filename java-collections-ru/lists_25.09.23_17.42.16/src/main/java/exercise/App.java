package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public static boolean scrabble(String simbols,String word){

        simbols=simbols.toLowerCase();
        word=word.toLowerCase();
        List<String> Simbols=new ArrayList<String>(Arrays.asList(simbols.split("")));
        List<String>SimbolsInWord=new ArrayList<String>(Arrays.asList(word.split("")));
        List<String>Enumbra=new ArrayList<String>();
        for(int i=0;i<Simbols.size();i++){SimbolsInWord.remove(Simbols.get(i));}
        if(SimbolsInWord.isEmpty()){return true;}
        else{return false;}
        }
//END
