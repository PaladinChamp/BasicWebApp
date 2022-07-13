package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Fabi S";
        } else if (query.contains("plus")){ // TODO extend the programm here
            int a = Integer.parseInt(query.substring(query.indexOf("is")+3,query.indexOf("plus")-1));
            int b = Integer.parseInt(query.substring(query.indexOf("plus")+5));
            return String.valueOf(a + b);
        }
        else if (query.contains("largest")){
            String[] arr = query.substring(query.indexOf("largest")+9).split(", ");
            int max = 0;
            for(int i = 0; i<arr.length;i++){
                max = Math.max(max, Integer.parseInt(arr[i]));
            }
            return String.valueOf(max);
        }
        else{
            return "";
        }
    }
}
